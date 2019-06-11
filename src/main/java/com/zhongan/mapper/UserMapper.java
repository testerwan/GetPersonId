package com.zhongan.mapper;

import com.zhongan.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {


    @Select("select * from hk_user where idNo=#{idNo}")
    User findUserByIdNo(String idNo);

    @Insert("INSERT INTO hk_user(idNo,name,created_time) VALUES(#{idNo}, #{name}, #{created_time})")
    void insert(User user);
}
