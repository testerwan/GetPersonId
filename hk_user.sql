/*
 Navicat Premium Data Transfer

 Source Server         : Localhost
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : utf-8

 Date: 06/12/2019 00:15:18 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `hk_user`
-- ----------------------------
DROP TABLE IF EXISTS `hk_user`;
CREATE TABLE `hk_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '香港身份证ID',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `created_time` datetime DEFAULT NULL COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11834 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
