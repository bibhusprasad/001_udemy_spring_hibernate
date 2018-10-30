-- 1st go inside Local Instance MYSQL
-- then run below command

CREATE USER 'crm'@'localhost' IDENTIFIED BY 'crm';
GRANT ALL PRIVILEGES ON * . * TO 'crm'@'localhost';

-- then go to come
-- add a new connection 
-- here username and password is crmdemo
-- than click on newly connection connection

-- then create database schema
CREATE DATABASE  IF NOT EXISTS `web_customer_tracker` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `web_customer_tracker`;

-- create login details table

DROP TABLE IF EXISTS `login_details`;

CREATE TABLE `login_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `hints` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;



