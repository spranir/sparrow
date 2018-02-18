-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.2.7-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for spw_config
CREATE DATABASE IF NOT EXISTS `spw_config` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `spw_config`;

-- Dumping structure for table spw_config.config_audit
CREATE TABLE IF NOT EXISTS `config_audit` (
  `config_type` varchar(50) DEFAULT NULL,
  `variable` varchar(150) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL,
  `process` varchar(500) DEFAULT NULL,
  `instance` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table spw_config.config_audit: ~1 rows (approximately)
DELETE FROM `config_audit`;
/*!40000 ALTER TABLE `config_audit` DISABLE KEYS */;
INSERT INTO `config_audit` (`config_type`, `variable`, `value`, `process`, `instance`) VALUES
	('rdms', NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `config_audit` ENABLE KEYS */;

-- Dumping structure for table spw_config.spw_common_config
CREATE TABLE IF NOT EXISTS `spw_common_config` (
  `variable` varchar(150) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL,
  `active` enum('Y','N') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table spw_config.spw_common_config: ~4 rows (approximately)
DELETE FROM `spw_common_config`;
/*!40000 ALTER TABLE `spw_common_config` DISABLE KEYS */;
INSERT INTO `spw_common_config` (`variable`, `value`, `active`) VALUES
	('basepath', 'root', 'Y'),
	('runmode', 'single', 'Y'),
	('audit', 'audit/bonsai-audit', 'Y'),
	('json.storagepath', 'C:/Program Files/MariaDB 10.2/data/chimera_lms', 'Y');
/*!40000 ALTER TABLE `spw_common_config` ENABLE KEYS */;

-- Dumping structure for table spw_config.spw_instance_config
CREATE TABLE IF NOT EXISTS `spw_instance_config` (
  `instance` varchar(150) DEFAULT NULL,
  `process` varchar(150) DEFAULT NULL,
  `variable` varchar(150) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL,
  `active` enum('Y','N') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table spw_config.spw_instance_config: ~4 rows (approximately)
DELETE FROM `spw_instance_config`;
/*!40000 ALTER TABLE `spw_instance_config` DISABLE KEYS */;
INSERT INTO `spw_instance_config` (`instance`, `process`, `variable`, `value`, `active`) VALUES
	('test.callprocess.process#1', 'test.callprocess.process', 'lms', 'oltp/chimera_lms', 'Y'),
	('test.rest.process#1', 'test.rest.process', 'lms', 'oltp/chimera-lms', 'Y'),
	('test.doozle.process#1', 'test.doozle.process', 'lms', 'oltp/chimera_lms', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'runfbcl', 'false', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'accesstoken', 'EAAEhaBeKXKcBAK4jOdwlra5PyORaqGZC1lYgXeiAAZAnaplLqtBnMtn8BUjlrKaphTJSnUeErhaXfndpm06ILZCx1xaSFBz4zZCcXWyCcUsJKh6pjtRO7A67pT0yBPxlf6RRPccWKDh2c87JdYnGVuCxHsnllZA5AuQG7wexL7QZDZD', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'secret-key', '632b2b7e5a1d1a86348aa3ec73606cfd', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'user-id', '1385910988364458', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'campaign-id-list', '6080044414357', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'sor-db', 'oltp/bonsai', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'gaccountid', 'bonsai@bonsai-crm-under-tissow-org.iam.gserviceaccount.com', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'gprivatekey', '8debeae0d4910282754c67cadb177287d3ed8d86', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'p12filepath', 'auth/bonsai-crm-under-tissow-org-8debeae0d491.p12', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'gcloud-project-name', 'bonsai-crm-under-tissow-org', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'impersonated-user', 'junomeadmin@tissow.com', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'calendarid', 'junomeadmin@tissow.com', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'runcontact', 'false', 'Y'),
	('bonsai.leadingestion.process#1', 'bonsai.leadingestion.process', 'runcalendar', 'true', 'Y');
/*!40000 ALTER TABLE `spw_instance_config` ENABLE KEYS */;

-- Dumping structure for table spw_config.spw_process_config
CREATE TABLE IF NOT EXISTS `spw_process_config` (
  `process` varchar(150) DEFAULT NULL,
  `variable` varchar(150) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL,
  `active` enum('Y','N') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table spw_config.spw_process_config: ~4 rows (approximately)
DELETE FROM `spw_process_config`;
/*!40000 ALTER TABLE `spw_process_config` DISABLE KEYS */;
INSERT INTO `spw_process_config` (`process`, `variable`, `value`, `active`) VALUES
	('test.callprocess.process', 'filepath', 'test.callprocess.process.spw', 'Y'),
	('test.doozle.process', 'filepath', 'test.doozle.process.spw', 'Y'),
	('test.rest.process', 'filepath', 'test.rest.process.spw', 'Y'),
	('bonsai.leadingestion.process', 'filepath', 'bonsai.leadingestion.process.spw', 'Y');
/*!40000 ALTER TABLE `spw_process_config` ENABLE KEYS */;

-- Dumping structure for table spw_config.spw_resource_config
CREATE TABLE IF NOT EXISTS `spw_resource_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `config_type` varchar(50) DEFAULT NULL,
  `config_name` varchar(50) DEFAULT NULL,
  `auth_info` varchar(1000) DEFAULT NULL,
  `resource_url` varchar(1000) DEFAULT NULL,
  `active` enum('Y','N') DEFAULT NULL,
  `created_date` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table spw_config.spw_resource_config: ~2 rows (approximately)
DELETE FROM `spw_resource_config`;
/*!40000 ALTER TABLE `spw_resource_config` DISABLE KEYS */;
INSERT INTO `spw_resource_config` (`id`, `config_type`, `config_name`, `auth_info`, `resource_url`, `active`, `created_date`) VALUES
	(1, '1', 'oltp/bonsai', '{ "user": "root", "password": "password"}', 'jdbc:mysql://localhost:3306/bonsai_crm?useUnicode=true&characterEncoding=utf8&dumpQueriesOnException=true', 'Y', '2018-02-14 03:08:28'),
	(2, '1', 'audit/bonsai-audit', '{ "user": "root", "password": "password"}', 'jdbc:mysql://localhost:3306/spw_audit?useUnicode=true&characterEncoding=utf8&dumpQueriesOnException=true', 'Y', '2018-02-06 20:42:36');
/*!40000 ALTER TABLE `spw_resource_config` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
