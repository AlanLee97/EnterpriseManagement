/*
 Navicat Premium Data Transfer

 Source Server         : liyun
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : uml_enterprise_management

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 31/10/2019 22:05:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin`  (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `admin_username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员帐号',
  `admin_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `admin_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `admin_age` int(3) NOT NULL COMMENT '年龄',
  `admin_sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `admin_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_class
-- ----------------------------
DROP TABLE IF EXISTS `t_class`;
CREATE TABLE `t_class`  (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `class_num` int(16) NOT NULL COMMENT '分类编号',
  `class_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer`  (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `cust_username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户帐号',
  `cust_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `cust_bu_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司名称',
  `cust_bu_address` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司地址',
  `cust_bu_introduction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司简介',
  `cust_bu_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司电话',
  `cust_email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户邮箱',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_num` int(16) NOT NULL COMMENT '订单编号',
  `oder_time` datetime(0) NOT NULL COMMENT '下单时间',
  `order_state` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
  `pay_time` datetime(0) NOT NULL COMMENT '付款时间',
  `user_id` int(16) NOT NULL COMMENT '用户id',
  `customer_id` int(16) NOT NULL COMMENT '客户id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `f_key1`(`user_id`) USING BTREE,
  INDEX `f_key2`(`customer_id`) USING BTREE,
  CONSTRAINT `f_key1` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `f_key2` FOREIGN KEY (`customer_id`) REFERENCES `t_customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product`  (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `product_num` int(16) NOT NULL COMMENT '商品编号',
  `product_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `product_price` decimal(10, 2) NOT NULL COMMENT '商品价格',
  `product_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品图片',
  `product_number` int(10) NOT NULL COMMENT '商品数量',
  `class_id` int(16) NOT NULL COMMENT '商品类型',
  `customer_id` int(16) NOT NULL COMMENT '客户id',
  `product_introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品详情',
  `product_date` datetime(0) NOT NULL COMMENT '上架时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `f_key3`(`class_id`) USING BTREE,
  INDEX `f_key4`(`customer_id`) USING BTREE,
  CONSTRAINT `f_key3` FOREIGN KEY (`class_id`) REFERENCES `t_class` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `f_key4` FOREIGN KEY (`customer_id`) REFERENCES `t_customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_robot
-- ----------------------------
DROP TABLE IF EXISTS `t_robot`;
CREATE TABLE `t_robot`  (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '机器人id',
  `robot_num` int(16) NOT NULL COMMENT '机器人编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帐号名',
  `user_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `user_bu_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司名称',
  `user_bu_address` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司地址',
  `user_bu_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司电话',
  `user_email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户邮箱',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
