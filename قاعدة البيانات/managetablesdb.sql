-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 20 أكتوبر 2023 الساعة 21:14
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `managetablesdb`
--

-- --------------------------------------------------------

--
-- بنية الجدول `classrooms`
--

CREATE TABLE IF NOT EXISTS `classrooms` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `class_capacity` int(11) DEFAULT NULL,
  `class_location` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `class_active` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=7 ;

--
-- إرجاع أو استيراد بيانات الجدول `classrooms`
--

INSERT INTO `classrooms` (`class_id`, `class_name`, `class_capacity`, `class_location`, `class_active`) VALUES
(1, 'قاعة 505', 45, 'الحاسبات الدور 5', 'متاحة'),
(2, 'قاعة 501', 70, 'الحاسبات الدور 5', 'متاحة'),
(3, 'القاعة 404', 500, 'الحاسبات الدور 4', 'متاحة'),
(4, 'معمل الامن السيبراني', 30, 'الحاسبات الدور 4', 'مشغولة'),
(5, 'معمل 501', 20, 'الحاسبات الدور 4', 'متاحة'),
(6, 'قاعة 503', 45, 'الحاسبات الدور 5', 'مشغولة');

-- --------------------------------------------------------

--
-- بنية الجدول `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `major_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`course_id`),
  KEY `major_id` (`major_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=26 ;

--
-- إرجاع أو استيراد بيانات الجدول `courses`
--

INSERT INTO `courses` (`course_id`, `course_name`, `major_id`) VALUES
(4, 'إدارة مشاريع', 0),
(5, 'مقدمة الى قواعد البيانات', 0),
(6, 'برمجة الحاسوب', 0),
(7, 'البرمجة الموحهه بالكائنات', 0),
(8, 'البرمجة وحل المسائل', 0),
(10, 'اساسيات تقنية المعلومات', 1),
(11, 'رياضيات', 0),
(12, 'الاحصاء والاحتمالات', 0),
(13, 'الجبرالخطي', 0),
(22, 'تطوير تطبيقات الاجهزة النقالة', 0),
(23, 'اللغة العربية', 0),
(25, 'الثقافة الاسلامية', 0);

-- --------------------------------------------------------

--
-- بنية الجدول `departments`
--

CREATE TABLE IF NOT EXISTS `departments` (
  `dep_id` int(11) NOT NULL AUTO_INCREMENT,
  `dep_name` varchar(255) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`dep_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- إرجاع أو استيراد بيانات الجدول `departments`
--

INSERT INTO `departments` (`dep_id`, `dep_name`) VALUES
(0, 'ALL'),
(1, 'IT'),
(2, 'CS'),
(3, 'IS');

-- --------------------------------------------------------

--
-- بنية الجدول `events`
--

CREATE TABLE IF NOT EXISTS `events` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_type` varchar(255) NOT NULL,
  `change_table` varchar(255) DEFAULT NULL,
  `change_before` varchar(255) DEFAULT NULL,
  `change_after` varchar(255) DEFAULT NULL,
  `event_time` datetime NOT NULL,
  `user_name` varchar(35) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- بنية الجدول `majors`
--

CREATE TABLE IF NOT EXISTS `majors` (
  `major_id` int(11) NOT NULL AUTO_INCREMENT,
  `major_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `level` int(11) DEFAULT NULL,
  `num_students` int(11) DEFAULT NULL,
  `dep_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`major_id`),
  KEY `dep_id` (`dep_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=10 ;

--
-- إرجاع أو استيراد بيانات الجدول `majors`
--

INSERT INTO `majors` (`major_id`, `major_name`, `level`, `num_students`, `dep_id`) VALUES
(0, 'ALL', 3, 300, 0),
(1, 'IT', 1, 40, 1),
(2, 'BIT', 1, 45, 1),
(3, 'CS', 1, 33, 2),
(4, 'IS', 1, 26, 3),
(5, 'BIT', 1, 19, 1),
(6, 'BIT', 2, 22, 1),
(7, 'الامن السيبراني', 30, 0, 2),
(8, 'الجرافكس', 24, 0, 1),
(9, 'IT', 33, 0, 1);

-- --------------------------------------------------------

--
-- بنية الجدول `schedules`
--

CREATE TABLE IF NOT EXISTS `schedules` (
  `table_id` int(11) NOT NULL,
  `table_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `majorId` int(11) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `teacherId` int(11) DEFAULT NULL,
  `classroomId` int(11) DEFAULT NULL,
  `day` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `startTime` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `endTime` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`table_id`),
  KEY `teacherId` (`teacherId`),
  KEY `classroomId` (`classroomId`),
  KEY `courseId` (`courseId`),
  KEY `majorId` (`majorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- إرجاع أو استيراد بيانات الجدول `schedules`
--

INSERT INTO `schedules` (`table_id`, `table_name`, `majorId`, `level`, `courseId`, `teacherId`, `classroomId`, `day`, `startTime`, `endTime`) VALUES
(7, 'IT', 1, 2, 7, 3, 1, 'mon', '10:00:00', '12:00:00'),
(8, 'تقنية1', 9, 1, 8, 6, 3, 'الأربعاء', '10:00', '12:00'),
(9, 'IT', 1, 1, 6, 2, 1, 'الإثنين', '12:00', '02:00'),
(10, 'تقنية', 0, 1, 4, 2, 1, 'السبت', '8:00', '10:00');

-- --------------------------------------------------------

--
-- بنية الجدول `teachers`
--

CREATE TABLE IF NOT EXISTS `teachers` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `teacher_email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `teacher_phone` int(30) DEFAULT NULL,
  `teacher_active` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=9 ;

--
-- إرجاع أو استيراد بيانات الجدول `teachers`
--

INSERT INTO `teachers` (`teacher_id`, `teacher_name`, `teacher_email`, `teacher_phone`, `teacher_active`) VALUES
(2, 'أحمد فؤاد', 'Ahmad@gmail.com', 71111277, 'متوفر'),
(3, 'وداد السروري', 'wadad@gmail.com', 77777777, 'متوفر'),
(4, 'فكري الشيبة', 'fffff@gmail.com', 77878767, 'متوفر'),
(5, 'نسيبة مقطري', 'nnnn@gmail.com', 77678678, 'متوفر'),
(6, 'محمد السوطي', 'mohammed@gmail.com', 77777677, 'متوفر'),
(8, 'بلال الفهيدي', 'blal@gmail.com', 77776767, 'مشغول');

-- --------------------------------------------------------

--
-- بنية الجدول `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `canView` tinyint(1) DEFAULT NULL,
  `canEdit` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- إرجاع أو استيراد بيانات الجدول `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `email`, `canView`, `canEdit`) VALUES
(1, 'safwan', 'safwan123', 'safwan@gmail.com', 1, 1);

--
-- قيود الجداول المحفوظة
--

--
-- القيود للجدول `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `courses_ibfk_1` FOREIGN KEY (`major_id`) REFERENCES `majors` (`major_id`);

--
-- القيود للجدول `events`
--
ALTER TABLE `events`
  ADD CONSTRAINT `events_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

--
-- القيود للجدول `majors`
--
ALTER TABLE `majors`
  ADD CONSTRAINT `majors_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `departments` (`dep_id`);

--
-- القيود للجدول `schedules`
--
ALTER TABLE `schedules`
  ADD CONSTRAINT `schedules_ibfk_1` FOREIGN KEY (`teacherId`) REFERENCES `teachers` (`teacher_id`),
  ADD CONSTRAINT `schedules_ibfk_2` FOREIGN KEY (`classroomId`) REFERENCES `classrooms` (`class_id`),
  ADD CONSTRAINT `schedules_ibfk_3` FOREIGN KEY (`courseId`) REFERENCES `courses` (`course_id`),
  ADD CONSTRAINT `schedules_ibfk_4` FOREIGN KEY (`majorId`) REFERENCES `majors` (`major_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
