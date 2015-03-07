SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `Rummy` ;
CREATE SCHEMA IF NOT EXISTS `Rummy` ;
USE `Rummy` ;

-- -----------------------------------------------------
-- Table `Rummy`.`USER_ROLES`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`USER_ROLES` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`USER_ROLES` (
  `USER_ID` BIGINT NOT NULL ,
  `GRANTED_ROLE` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`USER_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Rummy`.`USER_ACCOUNTS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`USER_ACCOUNTS` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`USER_ACCOUNTS` (
  `USER_ID` BIGINT NOT NULL AUTO_INCREMENT ,
  `EMAIL_ADDR` VARCHAR(100) NOT NULL ,
  `NICK_NAME` VARCHAR(45) NOT NULL ,
  `PASSWORD` VARCHAR(100) NOT NULL ,
  `ENABLED` TINYINT(1) NOT NULL ,
  `CREATED_DATE` DATETIME NOT NULL ,
  PRIMARY KEY (`USER_ID`, `EMAIL_ADDR`) ,
  UNIQUE INDEX `EMAIL_ADDR_UNIQUE` (`EMAIL_ADDR` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Rummy`.`RUMMY_STATS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`RUMMY_STATS` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`RUMMY_STATS` (
  `USER_ID` BIGINT NOT NULL ,
  `CASH` DOUBLE NOT NULL ,
  `RATING` CHAR(5) NULL ,
  `WIN_PERCENT` INT NULL ,
  PRIMARY KEY (`USER_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Rummy`.`USER_AUDIT`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`USER_AUDIT` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`USER_AUDIT` (
  `NICKNAME` VARCHAR(45) NOT NULL ,
  `LAST_LOGGEDIN_DATE` DATETIME NULL ,
  `LOG_INSTANCE_ID` BIGINT NOT NULL AUTO_INCREMENT ,
  `LAST_LOGGEDOUT_DATE` DATETIME NULL ,
  PRIMARY KEY (`LOG_INSTANCE_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Rummy`.`GAME_PLAYERS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`GAME_PLAYERS` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`GAME_PLAYERS` (
  `GAME_INSTANCE_ID` VARCHAR(45) NOT NULL ,
  `NUM_OF_PLAYERS` INT NULL ,
  `PLAYER1_IDN` BIGINT NULL ,
  `PLAYER2_IDN` BIGINT NULL ,
  `PLAYER3_IDN` BIGINT NULL ,
  `PLAYER4_IDN` BIGINT NULL ,
  `PLAYER5_IDN` BIGINT NULL ,
  `PLAYER6_IDN` BIGINT NULL ,
  `PLAYER7_IDN` BIGINT NULL ,
  `PLAYER8_IDN` BIGINT NULL ,
  PRIMARY KEY (`GAME_INSTANCE_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Rummy`.`GAME_ROUND_RESULTS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`GAME_ROUND_RESULTS` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`GAME_ROUND_RESULTS` (
  `GAME_ROUND_ID` VARCHAR(20) NOT NULL ,
  `GAME_INSTANCE_ID` VARCHAR(45) NOT NULL ,
  `NICK_NAME` VARCHAR(45) NOT NULL ,
  `POINTS` INT NULL ,
  `CASH` DOUBLE NULL ,
  `HAS_WON` TINYINT(1) NULL ,
  PRIMARY KEY (`GAME_ROUND_ID`, `GAME_INSTANCE_ID`, `NICK_NAME`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Rummy`.`GAME_ROUND`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`GAME_ROUND` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`GAME_ROUND` (
  `GAME_ROUND_ID` VARCHAR(20) NOT NULL ,
  `GAME_INSTANCE_ID` VARCHAR(45) NOT NULL ,
  `STATUS` VARCHAR(35) NULL ,
  `CREATED_DATE` DATETIME NULL ,
  `COMPLETED_DATE` DATETIME NULL ,
  PRIMARY KEY (`GAME_ROUND_ID`, `GAME_INSTANCE_ID`) ,
  INDEX `FK_GAME_RESULTS_idx` (`GAME_ROUND_ID` ASC) ,
  CONSTRAINT `FK_GAME_RESULTS`
    FOREIGN KEY (`GAME_ROUND_ID` )
    REFERENCES `Rummy`.`GAME_ROUND_RESULTS` (`GAME_ROUND_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Rummy`.`GAME`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Rummy`.`GAME` ;

CREATE  TABLE IF NOT EXISTS `Rummy`.`GAME` (
  `GAME_INSTANCE_ID` VARCHAR(45) NOT NULL ,
  `GAME_LOBBY` VARCHAR(45) NOT NULL ,
  `GAME_TYPE` VARCHAR(45) NOT NULL ,
  `HOSTED_BY` VARCHAR(45) NOT NULL ,
  `CREATED_DATE` DATETIME NOT NULL ,
  `IS_ACTIVE` TINYINT(1) NULL ,
  `CANCELLED_DATE` DATETIME NULL ,
  `COMPLETED_DATE` DATETIME NULL ,
  `POINTS_BASED` TINYINT(1) NULL ,
  `PERCARD_BASED` TINYINT(1) NULL ,
  PRIMARY KEY (`GAME_INSTANCE_ID`))
ENGINE = InnoDB;

USE `Rummy` ;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO rummy;
DROP USER rummy;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'rummy' IDENTIFIED BY 'P3ecost1';

GRANT ALL ON `Rummy`.* TO 'rummy';
GRANT SELECT ON TABLE `Rummy`.* TO 'rummy';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `Rummy`.* TO 'rummy';
GRANT SELECT, INSERT, TRIGGER ON TABLE `Rummy`.* TO 'rummy';
-- GRANT EXECUTE ON ROUTINE `Rummy`.* TO 'rummy';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
