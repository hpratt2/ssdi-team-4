-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: winevaultdb
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `wines`
--

DROP TABLE IF EXISTS `wines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wines` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `variety` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `country` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `avgrating` double(5,2) DEFAULT NULL,
  `price_low` double(6,2) DEFAULT NULL,
  `price_high` double(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wines`
--

LOCK TABLES `wines` WRITE;
/*!40000 ALTER TABLE `wines` DISABLE KEYS */;
INSERT INTO `wines` VALUES (1,'White Blend','Italy',87.00,NULL,NULL),(2,'Portuguese Red','Portugal',87.00,15.00,15.00),(3,'Pinot Gris','US',87.33,14.00,27.00),(4,'Pinot Noir',NULL,86.29,13.00,69.00),(5,'Tempranillo-Merlot',NULL,87.00,15.00,15.00),(6,'Frappato',NULL,87.00,16.00,16.00),(7,'GewÃ¼rztraminer',NULL,87.00,24.00,30.00),(8,'Cabernet Sauvignon',NULL,86.40,19.00,100.00),(9,'Nerello Mascalese',NULL,87.00,NULL,NULL),(10,'Chardonnay',NULL,86.00,12.00,24.00),(11,'Malbec',NULL,86.67,13.00,55.00),(12,'Tempranillo Blend',NULL,87.00,28.00,28.00),(13,'Merlot',NULL,86.33,9.00,55.00),(14,'Nero d\'Avola',NULL,87.00,10.00,35.00),(15,'Red Blend',NULL,87.00,12.00,23.00),(16,'Chenin Blanc',NULL,86.00,16.00,16.00),(17,'Gamay',NULL,86.80,NULL,NULL),(18,'Viognier-Chardonnay',NULL,86.00,15.00,15.00),(19,'Petit Verdot',NULL,85.00,22.00,22.00),(20,'Bordeaux-style White Blend',NULL,85.00,15.00,15.00),(21,'Sangiovese',NULL,87.00,17.00,30.00),(22,'Cabernet Franc',NULL,86.00,25.00,25.00),(23,'Champagne Blend',NULL,86.00,55.00,58.00),(24,'Sauvignon Blanc',NULL,86.00,26.00,26.00),(25,'Bordeaux-style Red Blend',NULL,86.67,46.00,75.00),(26,'Aglianico',NULL,86.00,32.00,32.00),(27,'Petite Sirah',NULL,86.00,55.00,55.00),(28,'Touriga Nacional',NULL,86.00,NULL,NULL),(29,'CarmenÃ¨re',NULL,86.00,12.00,12.00),(30,'AlbariÃ±o',NULL,86.00,16.00,20.00),(31,'Petit Manseng',NULL,86.00,11.00,11.00),(32,'RosÃ©',NULL,86.00,20.00,20.00),(33,'Zinfandel',NULL,86.00,24.00,24.00),(34,'Vernaccia',NULL,86.00,29.00,29.00),(35,'Rosato',NULL,88.00,19.00,19.00),(36,'Meritage',NULL,88.00,55.00,55.00),(37,'GrÃ¼ner Veltliner',NULL,88.00,12.00,12.00),(38,'Viognier',NULL,88.00,22.00,22.00);
/*!40000 ALTER TABLE `wines` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-27 21:37:52
