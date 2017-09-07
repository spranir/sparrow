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

CREATE TABLE `config_audit` (
	`config_type` VARCHAR(50) NULL,
	`variable` VARCHAR(150) NULL,
	`value` VARCHAR(500) NULL,
	`process` VARCHAR(500) NULL,
	`instance` VARCHAR(500) NULL
)COLLATE='utf8_general_ci' ENGINE=InnoDB;

CREATE TABLE `resource_config` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`config_type` VARCHAR(50) NULL,
	`config_name` VARCHAR(50) NULL,
	`auth_info` VARCHAR(1000) NULL,
	`resource_url` VARCHAR(1000) NULL,
	`active` VARCHAR(1000) NULL,
	`created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	 PRIMARY KEY (id)
)COLLATE='utf8_general_ci' ENGINE=InnoDB;	
RENAME TABLE `resource_config` TO `spw_resource_config`;
ALTER TABLE `spw_resource_config`
	CHANGE COLUMN `active` `active` ENUM('Y','N') NULL DEFAULT NULL AFTER `resource_url`;
