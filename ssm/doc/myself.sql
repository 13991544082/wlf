/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.46 : Database - myself
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`myself` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `myself`;

/*Table structure for table `clazz` */

DROP TABLE IF EXISTS `clazz`;

CREATE TABLE `clazz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) NOT NULL,
  `cycle` varchar(10) NOT NULL,
  `tid1` int(11) DEFAULT NULL,
  `tid2` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_tid1` (`tid1`),
  KEY `fk_tid2` (`tid2`),
  CONSTRAINT `fk_tid2` FOREIGN KEY (`tid2`) REFERENCES `teacher` (`id`),
  CONSTRAINT `fk_tid1` FOREIGN KEY (`tid1`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `clazz` */

insert  into `clazz`(`id`,`cname`,`cycle`,`tid1`,`tid2`) values (1,'KJ181201','6月',1,2),(2,'KJ181002','6月',1,3),(3,'KJ180701','6月',1,3);

/*Table structure for table `stuinfo` */

DROP TABLE IF EXISTS `stuinfo`;

CREATE TABLE `stuinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) NOT NULL,
  `sex` varchar(4) NOT NULL,
  `birthday` date DEFAULT NULL,
  `Gschool` varchar(30) DEFAULT NULL,
  `major` varchar(30) DEFAULT NULL,
  `phone` varchar(11) NOT NULL,
  `wechat` varchar(30) DEFAULT NULL,
  `GDate` date NOT NULL,
  `addr` varchar(30) DEFAULT NULL,
  `classId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_clazzId` (`classId`),
  CONSTRAINT `fk_clazzId` FOREIGN KEY (`classId`) REFERENCES `clazz` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `stuinfo` */

insert  into `stuinfo`(`id`,`sname`,`sex`,`birthday`,`Gschool`,`major`,`phone`,`wechat`,`GDate`,`addr`,`classId`) values (1,'张麻子','男','1996-10-11','山东蓝翔技术学院','挖掘机','18288865423','18288865423','2019-04-04','西安吉祥村2号小胡同',2),(2,'李四','男','1997-12-12','河南新东方烹饪学院','厨师','13712345666','13712345666','2019-04-04','西安西八里村3号小胡同',1),(3,'asao','女','2019-04-26','西安交通大学','计算机科学与技术','13678922133','13678922133','2019-04-26','西安吉祥村3号胡同',1),(4,'asao2','男','2019-04-26','西安空军工程大学','飞行员','13678922134','13678922134','2019-04-26','西安吉祥村6号胡同',1),(5,'amei','女','2019-04-26','西安女子学院','整容','13678922135','13678922135','2019-04-26','西安吉祥村1号胡同',2),(6,'agou','男','1993-08-08','西北政法大学','律师','13678922199','13678922199','2017-07-07','西安吉祥村2号胡同',3);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(20) NOT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `subject` varchar(20) DEFAULT NULL,
  `status` int(3) NOT NULL,
  `remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`id`,`tname`,`phone`,`subject`,`status`,`remark`) values (1,'老路','18792996878','java',1,'授课老师'),(2,'老黄','18612345689','java',2,'就业老师'),(3,'郭静','18145566771','java',2,'就业老师');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `userAccount` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `status` int(3) DEFAULT NULL,
  `remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`userAccount`,`pwd`,`status`,`remark`) values (1,'王菲','wang123456','123456',1,'在职');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
