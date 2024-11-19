/*!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19  Distrib 10.11.8-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: train
-- ------------------------------------------------------
-- Server version	10.11.8-MariaDB-0ubuntu0.24.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ProjectUsers`
--

DROP TABLE IF EXISTS `ProjectUsers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ProjectUsers` (
  `project_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`project_id`,`user_id`),
  KEY `fk_user_id` (`user_id`),
  CONSTRAINT `fk_project_id` FOREIGN KEY (`project_id`) REFERENCES `Projects` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `Users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ProjectUsers`
--

/*!40000 ALTER TABLE `ProjectUsers` DISABLE KEYS */;
INSERT INTO `ProjectUsers` VALUES
(1,1),
(1,2),
(2,3),
(2,4),
(3,5),
(3,6),
(4,7),
(4,8),
(5,9),
(5,10),
(6,11),
(6,12),
(7,13),
(7,14),
(8,15),
(8,16),
(9,17),
(9,18),
(10,19),
(10,20);
/*!40000 ALTER TABLE `ProjectUsers` ENABLE KEYS */;

--
-- Table structure for table `Projects`
--

DROP TABLE IF EXISTS `Projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Projects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `tenant_id` int(11) DEFAULT NULL,
  `received_date` date DEFAULT NULL,
  `evaluation_start_date` date DEFAULT NULL,
  `evaluation_end_date` date DEFAULT NULL,
  `project_overview` text DEFAULT NULL,
  `team_location` varchar(50) DEFAULT NULL,
  `valuer` varchar(50) DEFAULT NULL,
  `reviewer` varchar(50) DEFAULT NULL,
  `tech_reviewer` varchar(50) DEFAULT NULL,
  `approver` varchar(50) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `type` text DEFAULT NULL,
  `version` varchar(50) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `evaluation_amount` decimal(15,2) DEFAULT NULL,
  `remarks` text DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tenant_id` (`tenant_id`),
  CONSTRAINT `projects_ibfk_1` FOREIGN KEY (`tenant_id`) REFERENCES `Tenants` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Projects`
--

/*!40000 ALTER TABLE `Projects` DISABLE KEYS */;
INSERT INTO `Projects` VALUES
(1,'Project1',1,'2024-01-01','2024-01-10','2024-01-20','Overview1','Location1','Valuer1','Reviewer1','TechReviewer1','Approver1',1,'Type1','V1.0',10,1000.00,'Remarks1'),
(2,'Project2',2,'2024-02-01','2024-02-10','2024-02-20','Overview2','Location2','Valuer2','Reviewer2','TechReviewer2','Approver2',1,'Type2','V1.1',15,1500.00,'Remarks2'),
(3,'Project3',3,'2024-03-01','2024-03-10','2024-03-20','Overview3','Location3','Valuer3','Reviewer3','TechReviewer3','Approver3',1,'Type3','V1.2',20,2000.00,'Remarks3'),
(4,'Project4',4,'2024-04-01','2024-04-10','2024-04-20','Overview4','Location4','Valuer4','Reviewer4','TechReviewer4','Approver4',1,'Type4','V1.3',25,2500.00,'Remarks4'),
(5,'Project5',5,'2024-05-01','2024-05-10','2024-05-20','Overview5','Location5','Valuer5','Reviewer5','TechReviewer5','Approver5',1,'Type5','V1.4',30,3000.00,'Remarks5'),
(6,'Project6',6,'2024-06-01','2024-06-10','2024-06-20','Overview6','Location6','Valuer6','Reviewer6','TechReviewer6','Approver6',1,'Type6','V1.5',35,3500.00,'Remarks6'),
(7,'Project7',7,'2024-07-01','2024-07-10','2024-07-20','Overview7','Location7','Valuer7','Reviewer7','TechReviewer7','Approver7',1,'Type7','V1.6',40,4000.00,'Remarks7'),
(8,'Project8',8,'2024-08-01','2024-08-10','2024-08-20','Overview8','Location8','Valuer8','Reviewer8','TechReviewer8','Approver8',1,'Type8','V1.7',45,4500.00,'Remarks8'),
(9,'Project9',9,'2024-09-01','2024-09-10','2024-09-20','Overview9','Location9','Valuer9','Reviewer9','TechReviewer9','Approver9',1,'Type9','V1.8',50,5000.00,'Remarks9'),
(10,'Project10',10,'2024-10-01','2024-10-10','2024-10-20','Overview10','Location10','Valuer10','Reviewer10','TechReviewer10','Approver10',1,'Type10','V1.9',55,5500.00,'Remarks10'),
(11,'Project11',11,'2024-11-01','2024-11-10','2024-11-20','Overview11','Location11','Valuer11','Reviewer11','TechReviewer11','Approver11',1,'Type11','V2.0',60,6000.00,'Remarks11'),
(12,'Project12',12,'2024-12-01','2024-12-10','2024-12-20','Overview12','Location12','Valuer12','Reviewer12','TechReviewer12','Approver12',1,'Type12','V2.1',65,6500.00,'Remarks12'),
(13,'Project13',13,'2024-01-15','2024-01-20','2024-02-01','Overview13','Location13','Valuer13','Reviewer13','TechReviewer13','Approver13',1,'Type13','V2.2',70,7000.00,'Remarks13'),
(14,'Project14',14,'2024-02-15','2024-02-20','2024-03-01','Overview14','Location14','Valuer14','Reviewer14','TechReviewer14','Approver14',1,'Type14','V2.3',75,7500.00,'Remarks14'),
(15,'Project15',15,'2024-03-15','2024-03-20','2024-04-01','Overview15','Location15','Valuer15','Reviewer15','TechReviewer15','Approver15',1,'Type15','V2.4',80,8000.00,'Remarks15'),
(16,'Project16',16,'2024-04-15','2024-04-20','2024-05-01','Overview16','Location16','Valuer16','Reviewer16','TechReviewer16','Approver16',1,'Type16','V2.5',85,8500.00,'Remarks16'),
(17,'Project17',17,'2024-05-15','2024-05-20','2024-06-01','Overview17','Location17','Valuer17','Reviewer17','TechReviewer17','Approver17',1,'Type17','V2.6',90,9000.00,'Remarks17'),
(18,'Project18',18,'2024-06-15','2024-06-20','2024-07-01','Overview18','Location18','Valuer18','Reviewer18','TechReviewer18','Approver18',1,'Type18','V2.7',95,9500.00,'Remarks18');
/*!40000 ALTER TABLE `Projects` ENABLE KEYS */;

--
-- Table structure for table `Tenants`
--

DROP TABLE IF EXISTS `Tenants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tenants` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `contact_name` varchar(255) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `communication_address` text DEFAULT NULL,
  `postal_code` varchar(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `role` int(11) DEFAULT NULL CHECK (`role` = 1),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tenants`
--

/*!40000 ALTER TABLE `Tenants` DISABLE KEYS */;
INSERT INTO `Tenants` VALUES
(1,'Tenant1','tenantpassword1','Contact1','1234567890','Address1','10001','tenant1@example.com',1),
(2,'Tenant2','tenantpassword2','Contact2','1234567891','Address2','10002','tenant2@example.com',1),
(3,'Tenant3','tenantpassword3','Contact3','1234567892','Address3','10003','tenant3@example.com',1),
(4,'Tenant4','tenantpassword4','Contact4','1234567893','Address4','10004','tenant4@example.com',1),
(5,'Tenant5','tenantpassword5','Contact5','1234567894','Address5','10005','tenant5@example.com',1),
(6,'Tenant6','tenantpassword6','Contact6','1234567895','Address6','10006','tenant6@example.com',1),
(7,'Tenant7','tenantpassword7','Contact7','1234567896','Address7','10007','tenant7@example.com',1),
(8,'Tenant8','tenantpassword8','Contact8','1234567897','Address8','10008','tenant8@example.com',1),
(9,'Tenant9','tenantpassword9','Contact9','1234567898','Address9','10009','tenant9@example.com',1),
(10,'Tenant10','tenantpassword10','Contact10','1234567899','Address10','10010','tenant10@example.com',1),
(11,'Tenant11','tenantpassword11','Contact11','1234567800','Address11','10011','tenant11@example.com',1),
(12,'Tenant12','tenantpassword12','Contact12','1234567801','Address12','10012','tenant12@example.com',1),
(13,'Tenant13','tenantpassword13','Contact13','1234567802','Address13','10013','tenant13@example.com',1),
(14,'Tenant14','tenantpassword14','Contact14','1234567803','Address14','10014','tenant14@example.com',1),
(15,'Tenant15','tenantpassword15','Contact15','1234567804','Address15','10015','tenant15@example.com',1),
(16,'Tenant16','tenantpassword16','Contact16','1234567805','Address16','10016','tenant16@example.com',1),
(17,'Tenant17','tenantpassword17','Contact17','1234567806','Address17','10017','tenant17@example.com',1),
(18,'Tenant18','tenantpassword18','Contact18','1234567807','Address18','10018','tenant18@example.com',1),
(19,'Tenant19','tenantpassword19','Contact19','1234567808','Address19','10019','tenant19@example.com',1),
(20,'Tenant20','tenantpassword20','Contact20','1234567809','Address20','10020','tenant20@example.com',1);
/*!40000 ALTER TABLE `Tenants` ENABLE KEYS */;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` int(11) DEFAULT NULL CHECK (`role` in (2,3)),
  `tenant_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES
(1,'User1','password1',2,'Tenant1'),
(2,'User2','password2',3,'Tenant1'),
(3,'User3','password3',2,'Tenant2'),
(4,'User4','password4',3,'Tenant2'),
(5,'User5','password5',2,'Tenant3'),
(6,'User6','password6',3,'Tenant3'),
(7,'User7','password7',2,'Tenant4'),
(8,'User8','password8',3,'Tenant4'),
(9,'User9','password9',2,'Tenant1'),
(10,'User10','password10',3,'Tenant2'),
(11,'User11','password11',2,'Tenant3'),
(12,'User12','password12',3,'Tenant4'),
(13,'User13','password13',2,'Tenant1'),
(14,'User14','password14',3,'Tenant2'),
(15,'User15','password15',2,'Tenant3'),
(16,'User16','password16',3,'Tenant4'),
(17,'User17','password17',2,'Tenant1'),
(18,'User18','password18',3,'Tenant2'),
(19,'User19','password19',2,'Tenant3'),
(20,'User20','password20',3,'Tenant4');
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;

--
-- Dumping routines for database 'train'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-19 15:41:32
