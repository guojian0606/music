# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.22)
# Database: music
# Generation Time: 2020-11-07 11:38:42 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table customer
# ------------------------------------------------------------

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `phone_number` varchar(20) NOT NULL DEFAULT '' COMMENT '手机号',
  `birthday` date NOT NULL COMMENT '生日',
  `gender` tinyint(2) NOT NULL COMMENT '性别',
  `nick_name` varchar(20) NOT NULL DEFAULT '' COMMENT '昵称',
  `avatar` varchar(200) NOT NULL DEFAULT '' COMMENT '头像',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;

INSERT INTO `customer` (`id`, `phone_number`, `birthday`, `gender`, `nick_name`, `avatar`, `create_time`, `login_time`)
VALUES
	(1,'17600891908','2000-01-01',1,'小学生','123','2020-11-06 11:43:14','2020-11-06 11:43:14');

/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table customer_thrid_login
# ------------------------------------------------------------

DROP TABLE IF EXISTS `customer_thrid_login`;

CREATE TABLE `customer_thrid_login` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `open_id` varchar(50) NOT NULL DEFAULT '' COMMENT '第三方登录标识',
  `type` tinyint(2) NOT NULL COMMENT '第三方类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `customer_thrid_login` WRITE;
/*!40000 ALTER TABLE `customer_thrid_login` DISABLE KEYS */;

INSERT INTO `customer_thrid_login` (`id`, `open_id`, `type`)
VALUES
	(1,'1',0);

/*!40000 ALTER TABLE `customer_thrid_login` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table exercise
# ------------------------------------------------------------

DROP TABLE IF EXISTS `exercise`;

CREATE TABLE `exercise` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customer_id` bigint(20) NOT NULL COMMENT '练习人',
  `music_id` bigint(20) NOT NULL COMMENT '练习音乐',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '练习时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table favorite
# ------------------------------------------------------------

DROP TABLE IF EXISTS `favorite`;

CREATE TABLE `favorite` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customer_id` bigint(20) NOT NULL COMMENT '搜藏人',
  `music_id` bigint(20) NOT NULL COMMENT '音乐',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '搜藏时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table feedback
# ------------------------------------------------------------

DROP TABLE IF EXISTS `feedback`;

CREATE TABLE `feedback` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customer_id` bigint(20) NOT NULL COMMENT '反馈人',
  `content` text NOT NULL COMMENT '反馈内容',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '反馈时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table music
# ------------------------------------------------------------

DROP TABLE IF EXISTS `music`;

CREATE TABLE `music` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '名称',
  `description` varchar(200) NOT NULL DEFAULT '' COMMENT '简介',
  `cover` varchar(200) NOT NULL DEFAULT '' COMMENT '封面',
  `profile` text NOT NULL COMMENT '背景介绍',
  `musician_id` bigint(20) NOT NULL COMMENT '音乐家主键',
  `music_socre` varchar(200) NOT NULL DEFAULT '' COMMENT '乐谱',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table musician
# ------------------------------------------------------------

DROP TABLE IF EXISTS `musician`;

CREATE TABLE `musician` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `chinese_name` varchar(10) NOT NULL DEFAULT '' COMMENT '中文名',
  `english_name` varchar(50) NOT NULL DEFAULT '' COMMENT '英文名',
  `avatar` varchar(200) NOT NULL DEFAULT '' COMMENT '头像',
  `profile` text NOT NULL COMMENT '人物简介',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
