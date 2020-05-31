/*
Navicat MySQL Data Transfer

Source Server         : data86-peng
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-05-31 20:19:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `departments`
-- ----------------------------
DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `departmentId` int(10) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `departmentName` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `address` varchar(20) DEFAULT NULL COMMENT '部门区域',
  `doctorsNum` int(5) DEFAULT NULL COMMENT '部门医生数量',
  `hospital_id` varchar(20) DEFAULT NULL COMMENT '所属医院id',
  PRIMARY KEY (`departmentId`),
  KEY `depart_hospital` (`hospital_id`),
  CONSTRAINT `depart_hospital` FOREIGN KEY (`hospital_id`) REFERENCES `hospitals` (`hospitalId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of departments
-- ----------------------------
INSERT INTO `departments` VALUES ('1', '内科', '门诊大楼三楼', '66', 'DDSS6660001');
INSERT INTO `departments` VALUES ('2', '外科', '门诊大楼四楼', '45', 'DDSS6660001');
INSERT INTO `departments` VALUES ('3', '儿科', 'F楼', '23', 'DDSS6660001');
INSERT INTO `departments` VALUES ('4', '急诊科', '急诊楼', '34', 'DDSS6660001');
INSERT INTO `departments` VALUES ('5', '理疗科', 'F楼', '47', 'DDSS6660001');
INSERT INTO `departments` VALUES ('6', '重症监护室', 'E楼', '27', 'DDSS6660001');
INSERT INTO `departments` VALUES ('7', '肿瘤科', 'E楼', '56', 'DDSS6660001');

-- ----------------------------
-- Table structure for `doctorlevel`
-- ----------------------------
DROP TABLE IF EXISTS `doctorlevel`;
CREATE TABLE `doctorlevel` (
  `level` varchar(20) NOT NULL COMMENT '医生等级',
  PRIMARY KEY (`level`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医生等级';

-- ----------------------------
-- Records of doctorlevel
-- ----------------------------
INSERT INTO `doctorlevel` VALUES ('主任医师');
INSERT INTO `doctorlevel` VALUES ('副主任医师');
INSERT INTO `doctorlevel` VALUES ('实习医师');
INSERT INTO `doctorlevel` VALUES ('普通医师');
INSERT INTO `doctorlevel` VALUES ('高级医师');

-- ----------------------------
-- Table structure for `doctors`
-- ----------------------------
DROP TABLE IF EXISTS `doctors`;
CREATE TABLE `doctors` (
  `doctorId` varchar(20) NOT NULL COMMENT '医生编号',
  `doctor` varchar(30) DEFAULT NULL COMMENT '医生姓名',
  `workAge` int(3) DEFAULT NULL COMMENT '从业年龄',
  `level` varchar(10) DEFAULT NULL COMMENT '医生等级,如主任医师',
  `beGoodAt` varchar(50) DEFAULT NULL COMMENT '擅长领域',
  `office_id` int(10) DEFAULT NULL COMMENT '所属科室id',
  `hospital_id` varchar(18) DEFAULT NULL COMMENT '所属医院id',
  PRIMARY KEY (`doctorId`),
  KEY `doctor_office` (`office_id`),
  KEY `doctor_hosp` (`hospital_id`),
  KEY `beGoodAt` (`beGoodAt`),
  KEY `doctors_level` (`level`),
  CONSTRAINT `doctors_level` FOREIGN KEY (`level`) REFERENCES `doctorlevel` (`level`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `doctor_hosp` FOREIGN KEY (`hospital_id`) REFERENCES `hospitals` (`hospitalId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `doctor_office` FOREIGN KEY (`office_id`) REFERENCES `offices` (`officeId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctors
-- ----------------------------
INSERT INTO `doctors` VALUES ('SSD000113', '王医生', '13', '副主任医师', '呼吸系统常见病', '12', 'DDSS6660001');
INSERT INTO `doctors` VALUES ('SSD000224', '贾医生', '24', '主任医师', '呼吸系统疑难杂症', '12', 'DDSS6660001');
INSERT INTO `doctors` VALUES ('SST000278', '李医生', '5', '普通医师', '呼吸系统常见病', '12', 'DDSS6660001');

-- ----------------------------
-- Table structure for `hospitals`
-- ----------------------------
DROP TABLE IF EXISTS `hospitals`;
CREATE TABLE `hospitals` (
  `hospitalId` varchar(20) NOT NULL DEFAULT '' COMMENT '医院编号',
  `hospitalName` varchar(50) DEFAULT NULL COMMENT '医院名称',
  `hospitalType` varchar(20) DEFAULT NULL COMMENT '医院类型',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `rank` varchar(20) DEFAULT NULL COMMENT '等级',
  `consultTele` int(30) DEFAULT NULL COMMENT '咨询电话',
  `property` varchar(20) DEFAULT NULL COMMENT '医院性质,公立或私立',
  PRIMARY KEY (`hospitalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospitals
-- ----------------------------
INSERT INTO `hospitals` VALUES ('DDSS6660001', '江滨医院', '综合医院', '镇江', '三级甲等', '888666000', '公立');
INSERT INTO `hospitals` VALUES ('DDTT8888992', '九龙医院', '专科医院', '苏州', '三级甲等', '888666001', '私立');

-- ----------------------------
-- Table structure for `offices`
-- ----------------------------
DROP TABLE IF EXISTS `offices`;
CREATE TABLE `offices` (
  `officeId` int(5) NOT NULL AUTO_INCREMENT COMMENT '科室id',
  `officeName` varchar(10) DEFAULT NULL COMMENT '科室名称',
  `leader` varchar(20) DEFAULT NULL COMMENT '科室带头人',
  `doctors` int(5) DEFAULT NULL COMMENT '医生数量',
  `speciality` varchar(50) DEFAULT NULL COMMENT '专业从事,技术特色',
  `grade` varchar(10) DEFAULT NULL COMMENT '科室等级',
  `officeTele` int(30) DEFAULT NULL COMMENT '科室电话',
  `department_id` int(20) DEFAULT NULL COMMENT '所属部门id',
  `hospital_id` varchar(20) DEFAULT NULL COMMENT '所属医院id',
  PRIMARY KEY (`officeId`),
  KEY `office_department` (`department_id`),
  KEY `office_hospital` (`hospital_id`),
  CONSTRAINT `office_department` FOREIGN KEY (`department_id`) REFERENCES `departments` (`departmentId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `office_hospital` FOREIGN KEY (`hospital_id`) REFERENCES `hospitals` (`hospitalId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of offices
-- ----------------------------
INSERT INTO `offices` VALUES ('11', '心内科', '张三', '8', '救治急性心肌梗死', '省级重点专科', '233445567', '1', 'DDSS6660001');
INSERT INTO `offices` VALUES ('12', '呼吸内科', '李四', '6', '呼吸衰竭和重症肺炎的抢救', '市级重点专科', '233445566', '1', 'DDSS6660001');

-- ----------------------------
-- Table structure for `patients`
-- ----------------------------
DROP TABLE IF EXISTS `patients`;
CREATE TABLE `patients` (
  `patientId` varchar(20) NOT NULL DEFAULT '' COMMENT '病人身份证号',
  `patient` varchar(25) DEFAULT NULL COMMENT '病人名称',
  `illness` varchar(50) DEFAULT NULL COMMENT '疾病描述',
  `doctor_id` varchar(25) DEFAULT NULL COMMENT '就诊医生name',
  `visitTime_date` date DEFAULT NULL COMMENT '预约日期',
  `visitTime_time` varchar(30) DEFAULT NULL COMMENT '预约时间',
  `office_id` int(20) DEFAULT NULL,
  `hospital_id` varchar(20) DEFAULT NULL COMMENT '就诊医院id',
  PRIMARY KEY (`patientId`),
  KEY `patient_doctor` (`doctor_id`),
  KEY `patient_hosp` (`hospital_id`),
  KEY `patient_office` (`office_id`),
  KEY `patient_visitTime` (`visitTime_date`,`visitTime_time`),
  CONSTRAINT `patient_doctor` FOREIGN KEY (`doctor_id`) REFERENCES `doctors` (`doctorId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `patient_hosp` FOREIGN KEY (`hospital_id`) REFERENCES `hospitals` (`hospitalId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `patient_office` FOREIGN KEY (`office_id`) REFERENCES `offices` (`officeId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `patient_visitTime` FOREIGN KEY (`visitTime_date`, `visitTime_time`) REFERENCES `visittime` (`date`, `time`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='病人及挂号表';

-- ----------------------------
-- Records of patients
-- ----------------------------
INSERT INTO `patients` VALUES ('TD000601', '张某', '支气管炎', 'SSD000224', '2020-06-01', '9:00am', '12', 'DDSS6660001');
INSERT INTO `patients` VALUES ('TD000602', '李某', '咳嗽', 'SSD000113', '2020-06-02', '8:00am', '12', 'DDSS6660001');
INSERT INTO `patients` VALUES ('TD000603', '宋某', '嗓子痛', 'SST000278', '2020-06-01', '8:00am', '12', 'DDSS6660001');
INSERT INTO `patients` VALUES ('TD000604', '小明', '呼吸肺炎', 'SST000278', '2020-06-02', '8:00am', '12', 'DDSS6660001');

-- ----------------------------
-- Table structure for `visittime`
-- ----------------------------
DROP TABLE IF EXISTS `visittime`;
CREATE TABLE `visittime` (
  `date` date NOT NULL COMMENT '出诊日期',
  `time` varchar(30) NOT NULL DEFAULT '00:00:00' COMMENT '出诊时间',
  `doctor_Id` varchar(20) DEFAULT NULL COMMENT '出诊医生id',
  `doctors` varchar(50) DEFAULT NULL COMMENT '出诊医生',
  `office_id` int(10) DEFAULT NULL COMMENT '科室id',
  PRIMARY KEY (`date`,`time`),
  KEY `visittime_office` (`office_id`),
  KEY `visittime_doctor` (`doctor_Id`),
  CONSTRAINT `visittime_doctor` FOREIGN KEY (`doctor_Id`) REFERENCES `doctors` (`doctorId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `visittime_office` FOREIGN KEY (`office_id`) REFERENCES `doctors` (`office_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医生出诊时间表';

-- ----------------------------
-- Records of visittime
-- ----------------------------
INSERT INTO `visittime` VALUES ('2020-06-01', '8:00am', 'SSD000113', '王医生', '12');
INSERT INTO `visittime` VALUES ('2020-06-01', '9:00am', 'SSD000113', '王医生', '12');
INSERT INTO `visittime` VALUES ('2020-06-02', '8:00am', 'SST000278', '李医生', '12');
