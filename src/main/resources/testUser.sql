/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.1.55-community 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `user_t` (
	`id` int (11),
	`user_name` varchar (120),
	`password` varchar (765),
	`age` int (4)
); 
insert into `user_t` (`id`, `user_name`, `password`, `age`) values('1','测试','sfasgfaf','24');
