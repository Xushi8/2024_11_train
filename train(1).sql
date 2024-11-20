/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 80300
 Source Host           : localhost:3306
 Source Schema         : train

 Target Server Type    : MySQL
 Target Server Version : 80300
 File Encoding         : 65001

 Date: 20/11/2024 13:14:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for audits
-- ----------------------------
DROP TABLE IF EXISTS `audits`;
CREATE TABLE `audits`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `project_id` int NULL DEFAULT NULL,
  `basic_info` tinyint NULL DEFAULT NULL,
  `conclusion` tinyint NULL DEFAULT NULL,
  `method` tinyint NULL DEFAULT NULL,
  `status` tinyint NULL DEFAULT NULL,
  `suggestions` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of audits
-- ----------------------------

-- ----------------------------
-- Table structure for function_point
-- ----------------------------
DROP TABLE IF EXISTS `function_point`;
CREATE TABLE `function_point`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '历史数据id',
  `project_id` bigint NOT NULL COMMENT '对应项目id',
  `subsystem_id` bigint NOT NULL COMMENT '所属子系统id',
  `if_delete` int NOT NULL DEFAULT 0 COMMENT '是否删除：0=未删除，1=已删除',
  `delete_time` datetime NULL DEFAULT NULL COMMENT '删除时间：如果删除时间超过3个月，自动清理',
  `module` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '所属模块名',
  `name` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '功能点名',
  `description` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '功能点描述',
  `category` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '分类',
  `ufp` int NULL DEFAULT 0 COMMENT '对应ufp',
  `complexity` int NULL DEFAULT NULL COMMENT '复杂度：1=低，2=中，3=高',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10000 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '功能点' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of function_point
-- ----------------------------

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '查询历史id',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '项目名',
  `user_id` bigint NOT NULL COMMENT '对应用户id',
  `if_delete` int NOT NULL DEFAULT 0 COMMENT '是否删除：0=未删除，1=已删除',
  `delete_time` datetime NULL DEFAULT NULL COMMENT '删除时间：如果删除时间超过3个月，自动清理',
  `ilf` int NULL DEFAULT 0 COMMENT '内部逻辑文件',
  `eif` int NULL DEFAULT 0 COMMENT '外部接口文件',
  `ei` int NULL DEFAULT 0 COMMENT '外部输入',
  `eo` int NULL DEFAULT 0 COMMENT '外部输出',
  `eq` int NULL DEFAULT 0 COMMENT '外部查询',
  `gsc_dc` int NULL DEFAULT 0 COMMENT '数据通信',
  `gsc_ddp` int NULL DEFAULT 0 COMMENT '分布式数据处理',
  `gsc_p` int NULL DEFAULT 0 COMMENT '性能',
  `gsc_huc` int NULL DEFAULT 0 COMMENT '重度配置',
  `gsc_tr` int NULL DEFAULT 0 COMMENT '处理速率',
  `gsc_ode` int NULL DEFAULT 0 COMMENT '在线数据输入',
  `gsc_eue` int NULL DEFAULT 0 COMMENT '最终用户使用效率',
  `gsc_ou` int NULL DEFAULT 0 COMMENT '在线升级',
  `gsc_cp` int NULL DEFAULT 0 COMMENT '复杂处理',
  `gsc_r` int NULL DEFAULT 0 COMMENT '可重用性',
  `gsc_ie` int NULL DEFAULT 0 COMMENT '易安装性',
  `gsc_oe` int NULL DEFAULT 0 COMMENT '易操作性',
  `gsc_ms` int NULL DEFAULT 0 COMMENT '多场所',
  `gsc_fc` int NULL DEFAULT 0 COMMENT '支持变更',
  `di_sum` int NULL DEFAULT 0 COMMENT '综合系统特征',
  `vaf` float NULL DEFAULT 0 COMMENT '调整系数值',
  `cf` float NULL DEFAULT 0 COMMENT '规模变更调整因子',
  `stage` int NULL DEFAULT 0 COMMENT '状态：1=项目立项，2=项目招标，3=项目早期，4=项目中期，5=项目完成',
  `method` int NULL DEFAULT 0 COMMENT '方法：1=dfp，2=s',
  `ufp` float NULL DEFAULT 0 COMMENT '未调整功能点数',
  `dfp` float NULL DEFAULT 0 COMMENT '调整后功能点数（通用系统调整因子法）',
  `s` float NULL DEFAULT 0 COMMENT '调整后功能点数（需求变更调整因子法）',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10000 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '项目分析' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of project
-- ----------------------------

-- ----------------------------
-- Table structure for project_para
-- ----------------------------
DROP TABLE IF EXISTS `project_para`;
CREATE TABLE `project_para`  (
  `projectId` int NOT NULL,
  `SF1` double NULL DEFAULT NULL,
  `SF2` double NULL DEFAULT NULL,
  `SF3` double NULL DEFAULT NULL,
  `SF4` double NULL DEFAULT NULL,
  `RF1` double NULL DEFAULT NULL,
  `RF2` double NULL DEFAULT NULL,
  `RF3` double NULL DEFAULT NULL,
  PRIMARY KEY (`projectId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of project_para
-- ----------------------------

-- ----------------------------
-- Table structure for project_workload
-- ----------------------------
DROP TABLE IF EXISTS `project_workload`;
CREATE TABLE `project_workload`  (
  `projectId` int NOT NULL,
  `projectName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `AE` double NULL DEFAULT NULL,
  `P` double NULL DEFAULT NULL,
  `SWF` double NULL DEFAULT NULL,
  `RDF` double NULL DEFAULT NULL,
  `PDR` double NULL DEFAULT NULL,
  `sysId` int NOT NULL,
  `sysName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sysId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of project_workload
-- ----------------------------

-- ----------------------------
-- Table structure for projects
-- ----------------------------
DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenant_id` int NULL DEFAULT NULL,
  `received_date` date NULL DEFAULT NULL,
  `evaluation_start_date` date NULL DEFAULT NULL,
  `evaluation_end_date` date NULL DEFAULT NULL,
  `project_overview` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  `team_location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `valuer` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `reviewer` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `tech_reviewer` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `approver` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `state` int NULL DEFAULT NULL,
  `type` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  `version` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `quantity` int NULL DEFAULT NULL,
  `evaluation_amount` decimal(15, 2) NULL DEFAULT NULL,
  `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `tenant_id`(`tenant_id` ASC) USING BTREE,
  CONSTRAINT `fk_projects_tenant_id` FOREIGN KEY (`tenant_id`) REFERENCES `tenants` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of projects
-- ----------------------------
INSERT INTO `projects` VALUES (1, 'Project1', 1, '2024-01-01', '2024-01-10', '2024-01-20', 'Overview1', 'Location1', 'Valuer1', 'Reviewer1', 'TechReviewer1', 'Approver1', 1, 'Type1', 'V1.0', 10, 1000.00, 'Remarks1');
INSERT INTO `projects` VALUES (2, 'Project2', 2, '2024-02-01', '2024-02-10', '2024-02-20', 'Overview2', 'Location2', 'Valuer2', 'Reviewer2', 'TechReviewer2', 'Approver2', 1, 'Type2', 'V1.1', 15, 1500.00, 'Remarks2');
INSERT INTO `projects` VALUES (3, 'Project3', 3, '2024-03-01', '2024-03-10', '2024-03-20', 'Overview3', 'Location3', 'Valuer3', 'Reviewer3', 'TechReviewer3', 'Approver3', 1, 'Type3', 'V1.2', 20, 2000.00, 'Remarks3');
INSERT INTO `projects` VALUES (4, 'Project4', 4, '2024-04-01', '2024-04-10', '2024-04-20', 'Overview4', 'Location4', 'Valuer4', 'Reviewer4', 'TechReviewer4', 'Approver4', 1, 'Type4', 'V1.3', 25, 2500.00, 'Remarks4');
INSERT INTO `projects` VALUES (5, 'Project5', 5, '2024-05-01', '2024-05-10', '2024-05-20', 'Overview5', 'Location5', 'Valuer5', 'Reviewer5', 'TechReviewer5', 'Approver5', 1, 'Type5', 'V1.4', 30, 3000.00, 'Remarks5');
INSERT INTO `projects` VALUES (6, 'Project6', 6, '2024-06-01', '2024-06-10', '2024-06-20', 'Overview6', 'Location6', 'Valuer6', 'Reviewer6', 'TechReviewer6', 'Approver6', 1, 'Type6', 'V1.5', 35, 3500.00, 'Remarks6');
INSERT INTO `projects` VALUES (7, 'Project7', 7, '2024-07-01', '2024-07-10', '2024-07-20', 'Overview7', 'Location7', 'Valuer7', 'Reviewer7', 'TechReviewer7', 'Approver7', 1, 'Type7', 'V1.6', 40, 4000.00, 'Remarks7');
INSERT INTO `projects` VALUES (8, 'Project8', 8, '2024-08-01', '2024-08-10', '2024-08-20', 'Overview8', 'Location8', 'Valuer8', 'Reviewer8', 'TechReviewer8', 'Approver8', 1, 'Type8', 'V1.7', 45, 4500.00, 'Remarks8');
INSERT INTO `projects` VALUES (9, 'Project9', 9, '2024-09-01', '2024-09-10', '2024-09-20', 'Overview9', 'Location9', 'Valuer9', 'Reviewer9', 'TechReviewer9', 'Approver9', 1, 'Type9', 'V1.8', 50, 5000.00, 'Remarks9');
INSERT INTO `projects` VALUES (10, 'Project10', 10, '2024-10-01', '2024-10-10', '2024-10-20', 'Overview10', 'Location10', 'Valuer10', 'Reviewer10', 'TechReviewer10', 'Approver10', 1, 'Type10', 'V1.9', 55, 5500.00, 'Remarks10');
INSERT INTO `projects` VALUES (11, 'Project11', 11, '2024-11-01', '2024-11-10', '2024-11-20', 'Overview11', 'Location11', 'Valuer11', 'Reviewer11', 'TechReviewer11', 'Approver11', 1, 'Type11', 'V2.0', 60, 6000.00, 'Remarks11');
INSERT INTO `projects` VALUES (12, 'Project12', 12, '2024-12-01', '2024-12-10', '2024-12-20', 'Overview12', 'Location12', 'Valuer12', 'Reviewer12', 'TechReviewer12', 'Approver12', 1, 'Type12', 'V2.1', 65, 6500.00, 'Remarks12');
INSERT INTO `projects` VALUES (13, 'Project13', 13, '2024-01-15', '2024-01-20', '2024-02-01', 'Overview13', 'Location13', 'Valuer13', 'Reviewer13', 'TechReviewer13', 'Approver13', 1, 'Type13', 'V2.2', 70, 7000.00, 'Remarks13');
INSERT INTO `projects` VALUES (14, 'Project14', 14, '2024-02-15', '2024-02-20', '2024-03-01', 'Overview14', 'Location14', 'Valuer14', 'Reviewer14', 'TechReviewer14', 'Approver14', 1, 'Type14', 'V2.3', 75, 7500.00, 'Remarks14');
INSERT INTO `projects` VALUES (15, 'Project15', 15, '2024-03-15', '2024-03-20', '2024-04-01', 'Overview15', 'Location15', 'Valuer15', 'Reviewer15', 'TechReviewer15', 'Approver15', 1, 'Type15', 'V2.4', 80, 8000.00, 'Remarks15');
INSERT INTO `projects` VALUES (16, 'Project16', 16, '2024-04-15', '2024-04-20', '2024-05-01', 'Overview16', 'Location16', 'Valuer16', 'Reviewer16', 'TechReviewer16', 'Approver16', 1, 'Type16', 'V2.5', 85, 8500.00, 'Remarks16');
INSERT INTO `projects` VALUES (17, 'Project17', 17, '2024-05-15', '2024-05-20', '2024-06-01', 'Overview17', 'Location17', 'Valuer17', 'Reviewer17', 'TechReviewer17', 'Approver17', 1, 'Type17', 'V2.6', 90, 9000.00, 'Remarks17');
INSERT INTO `projects` VALUES (18, 'Project18', 18, '2024-06-15', '2024-06-20', '2024-07-01', 'Overview18', 'Location18', 'Valuer18', 'Reviewer18', 'TechReviewer18', 'Approver18', 1, 'Type18', 'V2.7', 95, 9500.00, 'Remarks18');

-- ----------------------------
-- Table structure for projectusers
-- ----------------------------
DROP TABLE IF EXISTS `projectusers`;
CREATE TABLE `projectusers`  (
  `project_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`project_id`, `user_id`) USING BTREE,
  INDEX `fk_user_id`(`user_id` ASC) USING BTREE,
  CONSTRAINT `fk_projectusers_project_id` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `fk_projectusers_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of projectusers
-- ----------------------------
INSERT INTO `projectusers` VALUES (1, 1);
INSERT INTO `projectusers` VALUES (1, 2);
INSERT INTO `projectusers` VALUES (2, 3);
INSERT INTO `projectusers` VALUES (2, 4);
INSERT INTO `projectusers` VALUES (3, 5);
INSERT INTO `projectusers` VALUES (3, 6);
INSERT INTO `projectusers` VALUES (4, 7);
INSERT INTO `projectusers` VALUES (4, 8);
INSERT INTO `projectusers` VALUES (5, 9);
INSERT INTO `projectusers` VALUES (5, 10);
INSERT INTO `projectusers` VALUES (6, 11);
INSERT INTO `projectusers` VALUES (6, 12);
INSERT INTO `projectusers` VALUES (7, 13);
INSERT INTO `projectusers` VALUES (7, 14);
INSERT INTO `projectusers` VALUES (8, 15);
INSERT INTO `projectusers` VALUES (8, 16);
INSERT INTO `projectusers` VALUES (9, 17);
INSERT INTO `projectusers` VALUES (9, 18);
INSERT INTO `projectusers` VALUES (10, 19);
INSERT INTO `projectusers` VALUES (10, 20);

-- ----------------------------
-- Table structure for subsystem
-- ----------------------------
DROP TABLE IF EXISTS `subsystem`;
CREATE TABLE `subsystem`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '子系统id',
  `project_id` bigint NOT NULL COMMENT '所属项目id',
  `name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '子系统名',
  `if_delete` int NOT NULL DEFAULT 0 COMMENT '是否删除：0=未删除，1=已删除',
  `delete_time` datetime NULL DEFAULT NULL COMMENT '删除时间：如果删除时间超过3个月，自动清理',
  `ufp` int NULL DEFAULT 0 COMMENT '未调整功能点数',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10000 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '子系统' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of subsystem
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `if_delete` int NOT NULL DEFAULT 0 COMMENT '是否删除：0=未删除，1=已删除',
  `role` int NOT NULL DEFAULT 1 COMMENT '角色：0=管理员，1=用户',
  `status` int NOT NULL DEFAULT 1 COMMENT '账号状态：0=停用，1=正常',
  `avatar` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '头像路径',
  `gender` int NULL DEFAULT 0 COMMENT '性别：0=未知，1=男，2=女',
  `age` int NULL DEFAULT '-1' COMMENT '年龄',
  `telephone` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '-(1)' COMMENT '电话号码',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '电子邮箱地址',
  `last_login_time` datetime NULL DEFAULT NULL COMMENT '最后一次登录时间',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '最后一次修改时间',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10001 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (10000, 'Admin', '$2a$10$.aQ6lx8vZSeY7xmWASqUq.L/2v2CZQdtxPVVigJkcCPAHyM5y2i2G', 0, 0, 1, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tenants
-- ----------------------------
DROP TABLE IF EXISTS `tenants`;
CREATE TABLE `tenants`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `contact_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `communication_address` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  `postal_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `role` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  CONSTRAINT `tenants_chk_1` CHECK (`role` = 1)
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tenants
-- ----------------------------
INSERT INTO `tenants` VALUES (1, 'Tenant1', 'tenantpassword1', 'Contact1', '1234567890', 'Address1', '10001', 'tenant1@example.com', 1);
INSERT INTO `tenants` VALUES (2, 'Tenant2', 'tenantpassword2', 'Contact2', '1234567891', 'Address2', '10002', 'tenant2@example.com', 1);
INSERT INTO `tenants` VALUES (3, 'Tenant3', 'tenantpassword3', 'Contact3', '1234567892', 'Address3', '10003', 'tenant3@example.com', 1);
INSERT INTO `tenants` VALUES (4, 'Tenant4', 'tenantpassword4', 'Contact4', '1234567893', 'Address4', '10004', 'tenant4@example.com', 1);
INSERT INTO `tenants` VALUES (5, 'Tenant5', 'tenantpassword5', 'Contact5', '1234567894', 'Address5', '10005', 'tenant5@example.com', 1);
INSERT INTO `tenants` VALUES (6, 'Tenant6', 'tenantpassword6', 'Contact6', '1234567895', 'Address6', '10006', 'tenant6@example.com', 1);
INSERT INTO `tenants` VALUES (7, 'Tenant7', 'tenantpassword7', 'Contact7', '1234567896', 'Address7', '10007', 'tenant7@example.com', 1);
INSERT INTO `tenants` VALUES (8, 'Tenant8', 'tenantpassword8', 'Contact8', '1234567897', 'Address8', '10008', 'tenant8@example.com', 1);
INSERT INTO `tenants` VALUES (9, 'Tenant9', 'tenantpassword9', 'Contact9', '1234567898', 'Address9', '10009', 'tenant9@example.com', 1);
INSERT INTO `tenants` VALUES (10, 'Tenant10', 'tenantpassword10', 'Contact10', '1234567899', 'Address10', '10010', 'tenant10@example.com', 1);
INSERT INTO `tenants` VALUES (11, 'Tenant11', 'tenantpassword11', 'Contact11', '1234567800', 'Address11', '10011', 'tenant11@example.com', 1);
INSERT INTO `tenants` VALUES (12, 'Tenant12', 'tenantpassword12', 'Contact12', '1234567801', 'Address12', '10012', 'tenant12@example.com', 1);
INSERT INTO `tenants` VALUES (13, 'Tenant13', 'tenantpassword13', 'Contact13', '1234567802', 'Address13', '10013', 'tenant13@example.com', 1);
INSERT INTO `tenants` VALUES (14, 'Tenant14', 'tenantpassword14', 'Contact14', '1234567803', 'Address14', '10014', 'tenant14@example.com', 1);
INSERT INTO `tenants` VALUES (15, 'Tenant15', 'tenantpassword15', 'Contact15', '1234567804', 'Address15', '10015', 'tenant15@example.com', 1);
INSERT INTO `tenants` VALUES (16, 'Tenant16', 'tenantpassword16', 'Contact16', '1234567805', 'Address16', '10016', 'tenant16@example.com', 1);
INSERT INTO `tenants` VALUES (17, 'Tenant17', 'tenantpassword17', 'Contact17', '1234567806', 'Address17', '10017', 'tenant17@example.com', 1);
INSERT INTO `tenants` VALUES (18, 'Tenant18', 'tenantpassword18', 'Contact18', '1234567807', 'Address18', '10018', 'tenant18@example.com', 1);
INSERT INTO `tenants` VALUES (19, 'Tenant19', 'tenantpassword19', 'Contact19', '1234567808', 'Address19', '10019', 'tenant19@example.com', 1);
INSERT INTO `tenants` VALUES (20, 'Tenant20', 'tenantpassword20', 'Contact20', '1234567809', 'Address20', '10020', 'tenant20@example.com', 1);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `role` int NULL DEFAULT NULL,
  `tenant_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  CONSTRAINT `users_chk_1` CHECK (`role` in (2,3))
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'User1', 'password1', 2, 'Tenant1');
INSERT INTO `users` VALUES (2, 'User2', 'password2', 3, 'Tenant1');
INSERT INTO `users` VALUES (3, 'User3', 'password3', 2, 'Tenant2');
INSERT INTO `users` VALUES (4, 'User4', 'password4', 3, 'Tenant2');
INSERT INTO `users` VALUES (5, 'User5', 'password5', 2, 'Tenant3');
INSERT INTO `users` VALUES (6, 'User6', 'password6', 3, 'Tenant3');
INSERT INTO `users` VALUES (7, 'User7', 'password7', 2, 'Tenant4');
INSERT INTO `users` VALUES (8, 'User8', 'password8', 3, 'Tenant4');
INSERT INTO `users` VALUES (9, 'User9', 'password9', 2, 'Tenant1');
INSERT INTO `users` VALUES (10, 'User10', 'password10', 3, 'Tenant2');
INSERT INTO `users` VALUES (11, 'User11', 'password11', 2, 'Tenant3');
INSERT INTO `users` VALUES (12, 'User12', 'password12', 3, 'Tenant4');
INSERT INTO `users` VALUES (13, 'User13', 'password13', 2, 'Tenant1');
INSERT INTO `users` VALUES (14, 'User14', 'password14', 3, 'Tenant2');
INSERT INTO `users` VALUES (15, 'User15', 'password15', 2, 'Tenant3');
INSERT INTO `users` VALUES (16, 'User16', 'password16', 3, 'Tenant4');
INSERT INTO `users` VALUES (17, 'User17', 'password17', 2, 'Tenant1');
INSERT INTO `users` VALUES (18, 'User18', 'password18', 3, 'Tenant2');
INSERT INTO `users` VALUES (19, 'User19', 'password19', 2, 'Tenant3');
INSERT INTO `users` VALUES (20, 'User20', 'password20', 3, 'Tenant4');

SET FOREIGN_KEY_CHECKS = 1;
