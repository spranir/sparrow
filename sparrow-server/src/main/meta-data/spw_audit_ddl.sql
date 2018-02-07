CREATE TABLE `instance_audit` (
  `instance_id` int(11) NOT NULL AUTO_INCREMENT,
  `instance_name` varchar(150) NOT NULL DEFAULT '0',
  `mode` varchar(20) NOT NULL DEFAULT '0',
  `start` timestamp NOT NULL DEFAULT current_timestamp(),
  `end` datetime DEFAULT NULL,
  `hostname` varchar(50) DEFAULT NULL,
  `file` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`instance_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8

CREATE TABLE `command_audit` (
  `command_id` int(11) NOT NULL AUTO_INCREMENT,
  `instance_id` int(11) DEFAULT 0,
  `start` timestamp NULL DEFAULT current_timestamp(),
  `end` datetime DEFAULT NULL,
  `action_name` varchar(150) DEFAULT NULL,
  `process_name` varchar(150) DEFAULT NULL,
  `command_config` text DEFAULT NULL,
  PRIMARY KEY (`command_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `statement_audit` (
  `statement_id` int(11) NOT NULL AUTO_INCREMENT,
  `action_id` int(11) DEFAULT 0,
  `action_name` varchar(50) DEFAULT '0',
  `process_name` varchar(50) DEFAULT '0',
  `start` timestamp NULL DEFAULT current_timestamp(),
  `end` datetime DEFAULT NULL,
  `rows_written` int(11) DEFAULT NULL,
  `statement_config` text DEFAULT NULL,
  `rows_read` int(11) DEFAULT NULL,
  PRIMARY KEY (`statement_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

ALTER TABLE `command_audit`
	ADD COLUMN `status` SMALLINT NULL AFTER `command_config`;
ALTER TABLE `instance_audit`
	ADD COLUMN `status` SMALLINT NULL AFTER `file`;
ALTER TABLE `statement_audit`
	ADD COLUMN `status` SMALLINT NULL DEFAULT NULL AFTER `rows_read`;	