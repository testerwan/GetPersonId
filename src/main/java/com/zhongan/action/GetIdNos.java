package com.zhongan.action;

import com.zhongan.entity.User;
import com.zhongan.service.UserService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.util.Date;

@Configuration
@EnableScheduling// 启用定时任务
public class GetIdNos {

    @Autowired
    private UserService userService;

    @Scheduled(cron = "0/5 * * * * ?")// 每10秒执行一次 抓取网页的身份证信息保存到数据库
    public void scheduler() throws Exception {
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String time = dateFormat.format(new Date());

        String url = "https://hk.51240.com/";
        Document document = Jsoup.connect(url).get();
        Elements trElements = document.getElementsByTag("table").get(3).getElementsByTag("tr");
        for (int i = 1; i < trElements.size(); i++) {
            Elements tds = trElements.get(i).getElementsByTag("td");
            String name = tds.get(0).text();
            String idNo = tds.get(1).text();
            User user = userService.findUserByIdNo(idNo);
            if (StringUtils.isEmpty(user)) {
                userService.insert(new User(idNo, name, time));
            }
        }

    }
}