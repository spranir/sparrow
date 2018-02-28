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


-- Dumping database structure for spw_audit
CREATE DATABASE IF NOT EXISTS `spw_audit` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `spw_audit`;

-- Dumping structure for table spw_audit.command_audit
CREATE TABLE IF NOT EXISTS `command_audit` (
  `command_id` int(11) NOT NULL AUTO_INCREMENT,
  `instance_id` int(11) DEFAULT 0,
  `start` timestamp NULL DEFAULT current_timestamp(),
  `end` datetime DEFAULT NULL,
  `action_name` varchar(150) DEFAULT NULL,
  `process_name` varchar(150) DEFAULT NULL,
  `command_config` text DEFAULT NULL,
  `status` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`command_id`)
) ENGINE=InnoDB AUTO_INCREMENT=319 DEFAULT CHARSET=utf8;

-- Dumping data for table spw_audit.command_audit: ~99 rows (approximately)
DELETE FROM `command_audit`;
/*!40000 ALTER TABLE `command_audit` DISABLE KEYS */;
INSERT INTO `command_audit` (`command_id`, `instance_id`, `start`, `end`, `action_name`, `process_name`, `command_config`, `status`) VALUES
	(1, 1, '2017-09-05 12:45:45', NULL, 'create_demand_forecast', 'publish.demandforecast.process', NULL, 1),
	(2, 2, '2017-09-24 19:13:29', NULL, 'create-table', 'test.callprocess.process#1', NULL, 1),
	(3, 3, '2017-09-24 19:15:38', NULL, 'create-table', 'test.callprocess.process#1', NULL, 1),
	(4, 4, '2017-09-24 19:17:36', NULL, 'create-table', 'test.callprocess.process#1', NULL, 1),
	(5, 6, '2017-09-24 19:27:28', NULL, 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(6, 7, '2017-09-24 19:35:01', NULL, 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(7, 8, '2017-09-24 19:36:24', NULL, 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(8, 9, '2017-09-24 19:42:48', NULL, 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(9, 9, '2017-09-24 19:42:51', NULL, 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(10, 10, '2017-09-24 19:43:30', NULL, 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(11, 11, '2017-09-24 19:44:44', '2017-09-24 19:45:04', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(12, 11, '2017-09-24 19:45:16', '2017-09-24 19:46:09', 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(13, 12, '2017-09-24 19:45:35', '2017-09-24 19:45:40', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(14, 13, '2017-09-24 19:45:43', '2017-09-24 19:45:46', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(15, 14, '2017-09-24 19:45:48', '2017-09-24 19:46:06', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(16, 11, '2017-09-24 19:46:09', '2017-09-24 19:46:13', 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(17, 15, '2017-09-24 19:47:50', '2017-09-24 19:48:06', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(18, 15, '2017-09-24 19:48:06', '2017-09-24 20:08:04', 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(19, 16, '2017-09-24 19:48:12', '2017-09-24 19:49:14', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(20, 17, '2017-09-24 19:49:17', '2017-09-24 20:07:19', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(21, 18, '2017-09-24 20:07:22', '2017-09-24 20:08:01', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(22, 15, '2017-09-24 20:08:04', '2017-09-24 20:08:09', 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(23, 19, '2017-09-24 20:40:30', '2017-09-24 20:40:40', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(24, 19, '2017-09-24 20:40:40', NULL, 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(25, 20, '2017-09-24 20:41:24', '2017-09-24 20:41:56', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(26, 21, '2017-09-24 20:43:16', '2017-09-24 20:43:34', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(27, 21, '2017-09-24 20:43:34', NULL, 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(28, 22, '2017-09-24 20:52:18', '2017-09-24 20:54:57', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(29, 23, '2017-09-24 20:57:06', NULL, 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(30, 23, '2017-09-24 20:57:09', NULL, 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(31, 24, '2017-09-24 20:58:34', '2017-09-24 20:58:44', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(32, 24, '2017-09-24 20:58:44', '2017-09-24 20:59:37', 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(33, 25, '2017-09-24 20:58:54', '2017-09-24 20:58:58', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(34, 26, '2017-09-24 20:59:02', '2017-09-24 20:59:17', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(35, 27, '2017-09-24 20:59:27', '2017-09-24 20:59:31', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(36, 24, '2017-09-24 20:59:37', '2017-09-24 20:59:45', 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(37, 28, '2017-09-24 21:09:58', '2017-09-24 21:10:16', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(38, 28, '2017-09-24 21:10:16', '2017-09-24 21:10:17', 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(39, 29, '2017-09-24 21:10:16', '2017-09-24 21:10:17', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(40, 30, '2017-09-24 21:10:17', '2017-09-24 21:10:17', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(41, 31, '2017-09-24 21:10:17', '2017-09-24 21:10:17', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(42, 28, '2017-09-24 21:10:17', '2017-09-24 21:10:18', 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(43, 32, '2017-09-24 21:10:41', '2017-09-24 21:10:41', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(44, 32, '2017-09-24 21:10:42', '2017-09-24 21:10:43', 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(45, 33, '2017-09-24 21:10:42', '2017-09-24 21:10:42', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(46, 34, '2017-09-24 21:10:42', '2017-09-24 21:10:42', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(47, 35, '2017-09-24 21:10:42', '2017-09-24 21:10:42', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(48, 32, '2017-09-24 21:10:43', '2017-09-24 21:10:43', 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(49, 36, '2017-09-25 01:31:09', '2017-09-25 01:31:10', 'Transform->create-table', 'test.callprocess.process#1', NULL, 1),
	(50, 36, '2017-09-25 01:31:10', '2017-09-25 01:31:11', 'Callprocess->test-call-process', 'test.callprocess.process#1', NULL, 1),
	(51, 37, '2017-09-25 01:31:10', '2017-09-25 01:31:10', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(52, 38, '2017-09-25 01:31:10', '2017-09-25 01:31:11', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(53, 39, '2017-09-25 01:31:11', '2017-09-25 01:31:11', 'Transform->create-table', 'test.callprocess.target.process', NULL, 1),
	(54, 36, '2017-09-25 01:31:11', '2017-09-25 01:31:12', 'Transform->drop-table', 'test.callprocess.process#1', NULL, 1),
	(55, 41, '2017-09-29 14:22:15', NULL, 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(56, 42, '2017-09-29 14:25:36', '2017-09-29 14:25:56', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(57, 43, '2017-09-29 14:26:35', '2017-09-29 14:26:35', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(58, 44, '2017-09-29 14:33:14', '2017-09-29 14:33:14', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(59, 45, '2017-09-29 14:37:00', '2017-09-29 14:37:00', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(60, 46, '2017-09-29 14:37:58', '2017-09-29 14:37:58', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(61, 47, '2017-09-29 14:57:43', '2017-09-29 14:57:43', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(62, 48, '2017-09-29 14:58:41', '2017-09-29 14:58:41', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(63, 49, '2017-09-29 16:21:45', NULL, 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(64, 50, '2017-09-29 16:24:49', '2017-09-29 16:24:50', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(65, 50, '2017-09-29 16:24:50', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(66, 51, '2017-09-29 16:28:25', '2017-09-29 16:28:26', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(67, 51, '2017-09-29 16:28:26', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(68, 52, '2017-09-29 16:29:53', '2017-09-29 16:29:54', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(69, 52, '2017-09-29 16:29:54', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(70, 53, '2017-09-29 16:35:11', '2017-09-29 16:35:12', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(71, 53, '2017-09-29 16:35:12', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(72, 54, '2017-09-29 16:48:36', '2017-09-29 16:48:37', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(73, 54, '2017-09-29 16:48:37', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(74, 55, '2017-09-29 16:52:06', '2017-09-29 16:52:07', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(75, 55, '2017-09-29 16:52:07', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(76, 56, '2017-09-29 16:52:48', '2017-09-29 16:52:49', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(77, 56, '2017-09-29 16:52:49', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(78, 57, '2017-09-29 16:57:23', '2017-09-29 16:57:24', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(79, 57, '2017-09-29 16:57:24', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(80, 58, '2017-09-29 16:59:00', '2017-09-29 16:59:01', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(81, 58, '2017-09-29 16:59:01', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(82, 59, '2017-09-29 17:18:07', '2017-09-29 17:18:08', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(83, 59, '2017-09-29 17:18:08', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(84, 60, '2017-09-29 17:22:34', '2017-09-29 17:22:35', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(85, 60, '2017-09-29 17:22:35', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(86, 61, '2017-09-29 17:30:57', '2017-09-29 17:30:58', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(87, 61, '2017-09-29 17:30:58', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(88, 62, '2017-09-29 17:35:39', '2017-09-29 17:35:40', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(89, 62, '2017-09-29 17:35:40', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(90, 63, '2017-09-29 17:40:40', '2017-09-29 17:40:40', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(91, 63, '2017-09-29 17:40:41', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(92, 64, '2017-09-29 17:48:48', '2017-09-29 17:48:49', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(93, 64, '2017-09-29 17:48:49', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(94, 65, '2017-09-29 17:50:30', '2017-09-29 17:50:30', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(95, 65, '2017-09-29 17:50:31', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(96, 66, '2017-09-29 17:51:43', '2017-09-29 17:51:44', 'Transform->create-test-tables', 'test.rest.process#1', NULL, 1),
	(97, 66, '2017-09-29 17:51:44', NULL, 'Rest->lms-client', 'test.rest.process#1', NULL, 1),
	(98, 67, '2017-10-02 10:45:23', '2017-10-02 10:45:23', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1),
	(99, 68, '2017-10-02 16:47:03', '2017-10-02 16:47:04', 'Doozle->doozle-collection', 'test.doozle.process#1', NULL, 1);
/*!40000 ALTER TABLE `command_audit` ENABLE KEYS */;

-- Dumping structure for table spw_audit.instance_audit
CREATE TABLE IF NOT EXISTS `instance_audit` (
  `instance_id` int(11) NOT NULL AUTO_INCREMENT,
  `instance_name` varchar(150) NOT NULL DEFAULT '0',
  `mode` varchar(100) NOT NULL DEFAULT '0',
  `start` timestamp NOT NULL DEFAULT current_timestamp(),
  `end` datetime DEFAULT NULL,
  `hostname` varchar(50) DEFAULT NULL,
  `file` varchar(500) DEFAULT NULL,
  `status` smallint(6) DEFAULT NULL,
  `context_log` text DEFAULT NULL,
  `root_ref_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`instance_id`)
) ENGINE=InnoDB AUTO_INCREMENT=133 DEFAULT CHARSET=utf8;

-- Dumping data for table spw_audit.instance_audit: ~68 rows (approximately)
DELETE FROM `instance_audit`;
/*!40000 ALTER TABLE `instance_audit` DISABLE KEYS */;
INSERT INTO `instance_audit` (`instance_id`, `instance_name`, `mode`, `start`, `end`, `hostname`, `file`, `status`, `context_log`, `root_ref_id`) VALUES
	(1, 'publish.demandforecast.process', 'onethread', '2017-09-05 10:58:04', '2017-09-05 10:58:05', 'dev-machine', 'publish.demand.forecast.spw', NULL, NULL, NULL),
	(2, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:12:39', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(3, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:15:38', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(4, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:17:30', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(5, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:20:47', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(6, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:23:01', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(7, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:34:49', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(8, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:36:17', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(9, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:42:48', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(10, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:43:30', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(11, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:44:44', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(12, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 19:45:35', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(13, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 19:45:42', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(14, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 19:45:48', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(15, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 19:47:50', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(16, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 19:48:12', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(17, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 19:49:16', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(18, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 20:07:22', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(19, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 20:40:30', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(20, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 20:41:24', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(21, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 20:43:16', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(22, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 20:50:15', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', 1, NULL, NULL),
	(23, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 20:57:06', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', 1, NULL, NULL),
	(24, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 20:58:34', '2017-09-24 20:59:53', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', -1, 'NONE', NULL),
	(25, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 20:58:53', '2017-09-24 20:59:00', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(26, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 20:59:02', '2017-09-24 20:59:20', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(27, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 20:59:27', '2017-09-24 20:59:34', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(28, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 21:09:58', '2017-09-24 21:10:18', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', -1, 'NONE', NULL),
	(29, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 21:10:16', '2017-09-24 21:10:17', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(30, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 21:10:17', '2017-09-24 21:10:17', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(31, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 21:10:17', '2017-09-24 21:10:17', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(32, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-24 21:10:41', '2017-09-24 21:10:43', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', -1, 'NONE', NULL),
	(33, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 21:10:42', '2017-09-24 21:10:42', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(34, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 21:10:42', '2017-09-24 21:10:42', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(35, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-24 21:10:42', '2017-09-24 21:10:42', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(36, 'test.callprocess.process#1', 'org.etl.process.onethread', '2017-09-25 01:31:09', '2017-09-25 01:31:12', '127.0.1.1', '/mnt/f/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.process.spw', -1, 'NONE', NULL),
	(37, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-25 01:31:10', '2017-09-25 01:31:10', '127.0.1.1', '/mnt/f/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(38, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-25 01:31:10', '2017-09-25 01:31:11', '127.0.1.1', '/mnt/f/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(39, 'test.callprocess.target.process', 'org.etl.process.onethread', '2017-09-25 01:31:11', '2017-09-25 01:31:11', '127.0.1.1', '/mnt/f/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.callprocess.target.process.spw', -1, 'NONE', NULL),
	(40, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:19:29', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', 1, NULL, NULL),
	(41, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:22:15', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', 1, NULL, NULL),
	(42, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:25:36', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', 1, NULL, NULL),
	(43, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:26:35', '2017-09-29 14:26:35', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL),
	(44, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:33:14', '2017-09-29 14:33:14', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL),
	(45, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:37:00', '2017-09-29 14:37:00', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL),
	(46, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:37:58', '2017-09-29 14:37:58', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL),
	(47, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:57:43', '2017-09-29 14:57:43', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL),
	(48, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-09-29 14:58:40', '2017-09-29 14:58:41', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL),
	(49, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:21:44', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(50, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:24:49', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(51, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:28:25', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(52, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:29:53', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(53, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:35:11', '2017-09-29 16:38:36', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', -1, 'java.sql.SQLException: Before start of result set\r\n	at com.mysql.jdbc.SQLError.createSQLException(SQLError.java:964)\r\n	at com.mysql.jdbc.SQLError.createSQLException(SQLError.java:897)\r\n	at com.mysql.jdbc.SQLError.createSQLException(SQLError.java:886)\r\n	at com.mysql.jdbc.SQLError.createSQLException(SQLError.java:860)\r\n	at com.mysql.jdbc.ResultSetImpl.checkRowPos(ResultSetImpl.java:790)\r\n	at com.mysql.jdbc.ResultSetImpl.getStringInternal(ResultSetImpl.java:5212)\r\n	at com.mysql.jdbc.ResultSetImpl.getString(ResultSetImpl.java:5135)\r\n	at org.etl.process.onethread.RestAction$$anonfun$execute$1.apply(RestAction.scala:49)\r\n	at org.etl.process.onethread.RestAction$$anonfun$execute$1.apply(RestAction.scala:47)\r\n	at scala.collection.immutable.Range.foreach(Range.scala:160)\r\n	at org.etl.process.onethread.RestAction.execute(RestAction.scala:47)\r\n	at org.etl.process.onethread.UniThreadProcessRuntime.executeChain(UniThreadProcessRuntime.scala:53)\r\n	at org.etl.process.onethread.UniThreadProcessRuntime.execute(UniThreadProcessRuntime.scala:24)\r\n	at org.etl.server.ProcessExecutor$.execute(ProcessExecutor.scala:24)\r\n	at org.etl.dsl.singlethread.RestTest.runProcess(RestAction.scala:16)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n	at java.lang.reflect.Method.invoke(Unknown Source)\r\n	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:44)\r\n	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:15)\r\n	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:41)\r\n	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:20)\r\n	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:263)\r\n	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:69)\r\n	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:48)\r\n	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\r\n	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\r\n	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\r\n	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\r\n	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\r\n	at org.junit.runners.ParentRunner.run(ParentRunner.java:292)\r\n	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n', NULL),
	(54, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:48:36', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(55, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:52:06', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(56, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:52:48', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(57, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:57:23', '2017-09-29 17:06:16', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', -1, 'java.lang.NullPointerException\r\n	at org.etl.process.onethread.RestAction.execute(RestAction.scala:55)\r\n	at org.etl.process.onethread.UniThreadProcessRuntime.executeChain(UniThreadProcessRuntime.scala:53)\r\n	at org.etl.process.onethread.UniThreadProcessRuntime.execute(UniThreadProcessRuntime.scala:24)\r\n	at org.etl.server.ProcessExecutor$.execute(ProcessExecutor.scala:24)\r\n	at org.etl.dsl.singlethread.RestTest.runProcess(RestAction.scala:16)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n	at java.lang.reflect.Method.invoke(Unknown Source)\r\n	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:44)\r\n	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:15)\r\n	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:41)\r\n	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:20)\r\n	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:263)\r\n	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:69)\r\n	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:48)\r\n	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\r\n	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\r\n	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\r\n	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\r\n	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\r\n	at org.junit.runners.ParentRunner.run(ParentRunner.java:292)\r\n	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n', NULL),
	(58, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 16:59:00', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(59, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:18:07', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(60, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:22:34', '2017-09-29 17:24:27', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', -1, 'java.lang.ClassCastException: org.eclipse.emf.ecore.util.EObjectContainmentEList cannot be cast to org.eclipse.emf.ecore.util.EDataTypeEList\r\n	at org.etl.command.CommandProxy$$anon$1.invoke(CommandProxy.scala:19)\r\n	at com.sun.proxy.$Proxy24.getParts(Unknown Source)\r\n	at org.etl.process.onethread.RestAction.execute(RestAction.scala:69)\r\n	at org.etl.process.onethread.UniThreadProcessRuntime.executeChain(UniThreadProcessRuntime.scala:53)\r\n	at org.etl.process.onethread.UniThreadProcessRuntime.execute(UniThreadProcessRuntime.scala:24)\r\n	at org.etl.server.ProcessExecutor$.execute(ProcessExecutor.scala:24)\r\n	at org.etl.dsl.singlethread.RestTest.runProcess(RestAction.scala:16)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n	at java.lang.reflect.Method.invoke(Unknown Source)\r\n	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:44)\r\n	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:15)\r\n	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:41)\r\n	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:20)\r\n	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:263)\r\n	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:69)\r\n	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:48)\r\n	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\r\n	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\r\n	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\r\n	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\r\n	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\r\n	at org.junit.runners.ParentRunner.run(ParentRunner.java:292)\r\n	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n', NULL),
	(61, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:30:57', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(62, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:35:39', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(63, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:40:40', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(64, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:48:48', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(65, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:50:29', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(66, 'test.rest.process#1', 'org.etl.process.onethread', '2017-09-29 17:51:43', NULL, '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.rest.process.spw', 1, NULL, NULL),
	(67, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-10-02 10:45:22', '2017-10-02 10:45:23', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL),
	(68, 'test.doozle.process#1', 'org.etl.process.onethread', '2017-10-02 16:47:03', '2017-10-02 16:47:04', '169.254.174.71', '/F:/Workspace/slush-1/sparrow/sparrow-server/target/classes/root/test.doozle.process.spw', -1, 'NONE', NULL);
/*!40000 ALTER TABLE `instance_audit` ENABLE KEYS */;

-- Dumping structure for table spw_audit.statement_audit
CREATE TABLE IF NOT EXISTS `statement_audit` (
  `statement_id` int(11) NOT NULL AUTO_INCREMENT,
  `action_id` int(11) DEFAULT 0,
  `action_name` varchar(50) DEFAULT '0',
  `process_name` varchar(50) DEFAULT '0',
  `start` timestamp NULL DEFAULT current_timestamp(),
  `end` datetime DEFAULT NULL,
  `rows_written` int(11) DEFAULT NULL,
  `statement_config` text DEFAULT NULL,
  `rows_read` int(11) DEFAULT NULL,
  `status` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`statement_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table spw_audit.statement_audit: ~0 rows (approximately)
DELETE FROM `statement_audit`;
/*!40000 ALTER TABLE `statement_audit` DISABLE KEYS */;
INSERT INTO `statement_audit` (`statement_id`, `action_id`, `action_name`, `process_name`, `start`, `end`, `rows_written`, `statement_config`, `rows_read`, `status`) VALUES
	(1, 1, 'publish.event.google', 'publish.demandforecast.process', '2017-09-05 13:09:05', '2017-09-05 13:09:06', 300, 'a', 400, 1);
/*!40000 ALTER TABLE `statement_audit` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
