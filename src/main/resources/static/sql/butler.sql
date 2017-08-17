/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : butler

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-08-17 11:49:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shop_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cart_goods
-- ----------------------------
DROP TABLE IF EXISTS `cart_goods`;
CREATE TABLE `cart_goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `dealer_price` decimal(19,2) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `lease_in_price` decimal(19,2) DEFAULT NULL,
  `lease_out_price` decimal(19,2) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `num` int(11) NOT NULL,
  `order_by` int(11) NOT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `sale_price` decimal(19,2) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `wash_in_price` decimal(19,2) DEFAULT NULL,
  `wash_out_price` decimal(19,2) DEFAULT NULL,
  `cart_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2a2urkh56c7k2r1f5fqlmhb7v` (`cart_id`),
  CONSTRAINT `FK2a2urkh56c7k2r1f5fqlmhb7v` FOREIGN KEY (`cart_id`) REFERENCES `cart` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for coin_add
-- ----------------------------
DROP TABLE IF EXISTS `coin_add`;
CREATE TABLE `coin_add` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shop_id` bigint(20) NOT NULL,
  `coin` decimal(20,0) DEFAULT '0',
  `name` char(20) NOT NULL,
  `time` datetime(6) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `coin_add_shop_id_shop_id` (`shop_id`),
  CONSTRAINT `coin_add_shop_id_shop_id` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for coin_reduce
-- ----------------------------
DROP TABLE IF EXISTS `coin_reduce`;
CREATE TABLE `coin_reduce` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shop_id` bigint(20) NOT NULL,
  `coin` decimal(20,0) DEFAULT '0',
  `name` char(20) NOT NULL,
  `time` datetime(6) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `coin_add_shop_id_shop_id` (`shop_id`),
  CONSTRAINT `coin_reduce_shop_id_shop_id` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for discount
-- ----------------------------
DROP TABLE IF EXISTS `discount`;
CREATE TABLE `discount` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kinds` int(10) NOT NULL,
  `discount` float(4,2) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for factory
-- ----------------------------
DROP TABLE IF EXISTS `factory`;
CREATE TABLE `factory` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` char(11) NOT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for factory_goods
-- ----------------------------
DROP TABLE IF EXISTS `factory_goods`;
CREATE TABLE `factory_goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `dealer_price` decimal(19,2) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `lease_in_price` decimal(19,2) DEFAULT NULL,
  `lease_out_price` decimal(19,2) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `num` int(11) NOT NULL,
  `order_by` int(11) NOT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `sale_price` decimal(19,2) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `wash_in_price` decimal(19,2) DEFAULT NULL,
  `wash_out_price` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for factory_goods_r
-- ----------------------------
DROP TABLE IF EXISTS `factory_goods_r`;
CREATE TABLE `factory_goods_r` (
  `id` bigint(20) NOT NULL,
  `factory_id` bigint(20) NOT NULL,
  `goods_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `factory_goods_r_factory_id_factory_id` (`factory_id`),
  KEY `factory_goods_r_goods_id_goods_id` (`goods_id`),
  CONSTRAINT `factory_goods_r_factory_id_factory_id` FOREIGN KEY (`factory_id`) REFERENCES `factory` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `factory_goods_r_goods_id_goods_id` FOREIGN KEY (`goods_id`) REFERENCES `factory_goods` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for lease_goods_r
-- ----------------------------
DROP TABLE IF EXISTS `lease_goods_r`;
CREATE TABLE `lease_goods_r` (
  `id` bigint(20) NOT NULL,
  `goods_id` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `order_id_lease_order_id` (`order_id`),
  KEY `lease_goods_id_shop_goods_r_id` (`goods_id`),
  CONSTRAINT `lease_goods_id_shop_goods_r_id` FOREIGN KEY (`goods_id`) REFERENCES `shop_goods_r` (`goods_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_id_lease_order_id` FOREIGN KEY (`order_id`) REFERENCES `order_lease` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for logistics
-- ----------------------------
DROP TABLE IF EXISTS `logistics`;
CREATE TABLE `logistics` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` char(11) NOT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_lease
-- ----------------------------
DROP TABLE IF EXISTS `order_lease`;
CREATE TABLE `order_lease` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NOT NULL,
  `account` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `shop_id` bigint(20) DEFAULT NULL,
  `floor` int(11) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `num` int(11) NOT NULL,
  `money` decimal(19,2) DEFAULT NULL,
  `pay_time` datetime DEFAULT NULL,
  `assign_flag` int(11) NOT NULL,
  `assign_time` datetime DEFAULT NULL,
  `factory_send_flag` int(11) NOT NULL,
  `factory_send_time` datetime DEFAULT NULL,
  `logistics_receive_flag` int(11) NOT NULL,
  `logistics_receive_time` datetime DEFAULT NULL,
  `logistics_send_flag` int(11) NOT NULL,
  `logistics_send_time` datetime DEFAULT NULL,
  `hotel_receive_flag` int(11) NOT NULL,
  `hotel_receive_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `lease_shop_id` (`shop_id`),
  CONSTRAINT `lease_shop_id` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_wash
-- ----------------------------
DROP TABLE IF EXISTS `order_wash`;
CREATE TABLE `order_wash` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `assign_flag` int(11) NOT NULL,
  `assign_time` datetime(6) DEFAULT NULL,
  `create_time` datetime(6) DEFAULT NULL,
  `factory_receive_flag` int(11) NOT NULL,
  `factory_receive_time` datetime(6) DEFAULT NULL,
  `hotel_send_flag` int(11) NOT NULL,
  `hotel_send_time` datetime(6) DEFAULT NULL,
  `logistics_receive_flag` int(11) NOT NULL,
  `logistics_receive_time` datetime(6) DEFAULT NULL,
  `logistics_send_flag` int(11) NOT NULL,
  `logistics_send_time` datetime(6) DEFAULT NULL,
  `money` decimal(19,2) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `num` int(11) NOT NULL,
  `order_id` varchar(255) DEFAULT NULL,
  `pay_time` datetime(6) DEFAULT NULL,
  `shop_id` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for route
-- ----------------------------
DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `logistics_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `route_logistics_id` (`logistics_id`),
  CONSTRAINT `route_logistics_id` FOREIGN KEY (`logistics_id`) REFERENCES `logistics` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` char(11) NOT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `coin` decimal(20,0) DEFAULT '0',
  `discount_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `discount_id_discount_id` (`discount_id`),
  CONSTRAINT `discount_id_discount_id` FOREIGN KEY (`discount_id`) REFERENCES `discount` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shop_factory_logistics_r
-- ----------------------------
DROP TABLE IF EXISTS `shop_factory_logistics_r`;
CREATE TABLE `shop_factory_logistics_r` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shop_id` bigint(20) NOT NULL,
  `factory_id` bigint(20) NOT NULL,
  `logistics_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `shop_id_shop_id` (`shop_id`),
  KEY `factory_id_factory_id` (`factory_id`),
  KEY `logistics_id_logistics_id` (`logistics_id`),
  CONSTRAINT `factory_id_factory_id` FOREIGN KEY (`factory_id`) REFERENCES `factory` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `logistics_id_logistics_id` FOREIGN KEY (`logistics_id`) REFERENCES `logistics` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `shop_id_shop_id` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shop_goods
-- ----------------------------
DROP TABLE IF EXISTS `shop_goods`;
CREATE TABLE `shop_goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) NOT NULL,
  `warehouse_id` tinyint(1) NOT NULL DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `dealer_price` decimal(19,2) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `lease_in_price` decimal(19,2) DEFAULT NULL,
  `lease_out_price` decimal(19,2) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `num` int(11) NOT NULL,
  `order_by` int(11) NOT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `sale_price` decimal(19,2) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `wash_in_price` decimal(19,2) DEFAULT NULL,
  `wash_out_price` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `shop_goods_code_factory_goods_code` (`code`),
  KEY `shop_goods_warehorse_id_warehouse_id` (`warehouse_id`),
  CONSTRAINT `shop_goods_code_factory_goods_code` FOREIGN KEY (`code`) REFERENCES `factory_goods` (`code`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `shop_goods_warehorse_id_warehouse_id` FOREIGN KEY (`warehouse_id`) REFERENCES `warehouse` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shop_goods_r
-- ----------------------------
DROP TABLE IF EXISTS `shop_goods_r`;
CREATE TABLE `shop_goods_r` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goods_id` bigint(20) NOT NULL,
  `shop_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `goods_shop_id` (`shop_id`),
  KEY `shop_goods_r_goods_id_shop_goods_id` (`goods_id`),
  CONSTRAINT `goods_shop_id` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `shop_goods_r_goods_id_shop_goods_id` FOREIGN KEY (`goods_id`) REFERENCES `shop_goods` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role_id` int(11) NOT NULL,
  `store_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_shop_id` (`store_id`),
  KEY `user_role_id_role_id` (`role_id`),
  CONSTRAINT `user_role_id_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `id` tinyint(1) NOT NULL AUTO_INCREMENT,
  `warehouse` varchar(10) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wash_goods_r
-- ----------------------------
DROP TABLE IF EXISTS `wash_goods_r`;
CREATE TABLE `wash_goods_r` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  `goods_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `wash_goods_id_shop_goods_r_id` (`goods_id`),
  KEY `order_id_wash_order_id` (`order_id`),
  CONSTRAINT `order_id_wash_order_id` FOREIGN KEY (`order_id`) REFERENCES `order_wash` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `wash_goods_id_shop_goods_r_id` FOREIGN KEY (`goods_id`) REFERENCES `shop_goods_r` (`goods_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
