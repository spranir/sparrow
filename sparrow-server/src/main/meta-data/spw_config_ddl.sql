CREATE TABLE `spw_common_config` (
  `variable` varchar(150) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8



CREATE TABLE `spw_instance_config` (
  `instance` varchar(150) DEFAULT NULL,
  `process` varchar(150) DEFAULT NULL,
  `variable` varchar(150) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `spw_process_config` (
  `process` varchar(150) DEFAULT NULL,
  `variable` varchar(150) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8

ALTER TABLE `spw_common_config`
	ADD COLUMN `active` ENUM('Y','N') NULL AFTER `value`;

ALTER TABLE `spw_instance_config`
	ADD COLUMN `active` ENUM('Y','N') NULL DEFAULT NULL AFTER `value`;	

ALTER TABLE `spw_process_config`
	ADD COLUMN `active` ENUM('Y','N') NULL DEFAULT NULL AFTER `value`;	