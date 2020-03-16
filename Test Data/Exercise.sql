/*
SQLyog Trial v13.1.5  (64 bit)
MySQL - 10.4.10-MariaDB : Database - exercise
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`exercise` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `exercise`;

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_price` int(11) NOT NULL,
  `item_description` varchar(100) NOT NULL,
  `item_brand` varchar(100) NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

/*Data for the table `items` */

insert  into `items`(`item_id`,`item_price`,`item_description`,`item_brand`) values 
(1,34,'Rice','Falcon'),
(2,58,'Wheat','Fortune'),
(3,60,'Flour','Nirapara'),
(4,45,'Semolina','Vedaka'),
(5,80,'Biriyani Rice','Fortune'),
(6,78,'Dhall','Maharaja'),
(7,58,'Orid Dhall','Maharaja'),
(8,25,'Tea','Tetley'),
(9,65,'Coffee','Nescafe'),
(10,37,'Raw Rice','Torisca'),
(11,43,'Book','Classmates'),
(12,10,'Pen','Lexi'),
(13,5,'Pencil','Nataraj'),
(14,100,'Instrument Box','Nataraj'),
(15,750,'Bag','Diesel'),
(16,40,'Sugar','Cane Sugar'),
(17,30,'Bottle','Dasani'),
(18,1000,'Jeans','LP'),
(19,500,'Shirt','Linen'),
(20,1600,'Shoe','Woodland');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
