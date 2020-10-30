/*
 Navicat Premium Data Transfer

 Source Server         : Test
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : TestFC

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 30/10/2020 15:54:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for TestFC_Table
-- ----------------------------
DROP TABLE IF EXISTS `TestFC_Table`;
CREATE TABLE `TestFC_Table` (
  `Index` int(11) NOT NULL AUTO_INCREMENT,
  `item` char(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `value` char(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `date` char(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `time` char(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  UNIQUE KEY `Index` (`Index`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of TestFC_Table
-- ----------------------------
BEGIN;
INSERT INTO `TestFC_Table` VALUES (1, 'test', 'testfc', '20201030', '121011');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
