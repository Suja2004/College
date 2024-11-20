-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2024 at 03:51 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(10) NOT NULL,
  `password` varchar(500) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `college` varchar(500) NOT NULL,
  `phone` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `password`, `mail`, `name`, `college`, `phone`) VALUES
(1, 'ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad', 'sujan@gmail.com', 'sujan kumar k', 'Shri Madhwa Vadiraja Institute of Technology and Management,Bantakal', '7829079853'),
(2, '323188a30857f74bf00b910ef73a6f784b7f9f9dbb41c65ad0a6ea9c2e188650', 'shrianth@gmail.com', 'shrikanth', 'Sahyadri College of Engineering and Management, Mangalore', '9865568765'),
(3, '1b452b865544ce3446aa4fed65ebb6a2d6c8256b67c5135ac6ff4fcfb194d49d', 'vishwas@gmail.com', 'vishwas', 'Siddaganga Institute of Technology, Tumkur', '8689876567');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `no.` int(11) NOT NULL,
  `clgid` int(50) NOT NULL,
  `tid` int(50) NOT NULL,
  `date` date NOT NULL,
  `bname` varchar(100) NOT NULL,
  `sem` int(50) NOT NULL,
  `sname` varchar(100) NOT NULL,
  `usn` varchar(100) NOT NULL,
  `stdname` varchar(100) NOT NULL,
  `attres` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`no.`, `clgid`, `tid`, `date`, `bname`, `sem`, `sname`, `usn`, `stdname`, `attres`) VALUES
(0, 1, 1, '2024-02-17', 'CSE', 3, 'C', '4MW22CS164', 'Sujan Kumar K', 'Present'),
(1, 1, 1, '2024-02-17', 'CSE', 3, 'C', '4MW22CS165', 'Sujan', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `attrec`
--

CREATE TABLE `attrec` (
  `no.` int(11) NOT NULL,
  `clgid` int(11) NOT NULL,
  `tid` int(11) NOT NULL,
  `branch` varchar(50) NOT NULL,
  `semester` int(10) NOT NULL,
  `section` varchar(10) NOT NULL,
  `usn` varchar(50) NOT NULL,
  `stdname` varchar(100) NOT NULL,
  `classcount` int(100) NOT NULL DEFAULT 0,
  `attper` float NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attrec`
--

INSERT INTO `attrec` (`no.`, `clgid`, `tid`, `branch`, `semester`, `section`, `usn`, `stdname`, `classcount`, `attper`) VALUES
(1, 1, 1, 'CSE', 3, 'C', '4MW22CS164', 'Sujan Kumar K', 4, 100),
(2, 1, 1, 'CSE', 3, 'C', '4MW22CS165', 'Sujan', 2, 66.667);

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `no.` int(11) NOT NULL,
  `clgid` int(100) NOT NULL,
  `tid` int(100) NOT NULL,
  `sem` int(10) NOT NULL,
  `sec` varchar(10) NOT NULL,
  `sub` varchar(100) NOT NULL,
  `totcls` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`no.`, `clgid`, `tid`, `sem`, `sec`, `sub`, `totcls`) VALUES
(1, 1, 1, 3, 'C', 'Mathematics-I for CSE Stream ', 3),
(2, 1, 1, 1, 'C', 'Principles of Programming Using C', 0),
(3, 1, 1, 3, 'C', 'Applied Physics for CSE stream', 3);

-- --------------------------------------------------------

--
-- Table structure for table `college`
--

CREATE TABLE `college` (
  `clgid` int(50) NOT NULL,
  `clgname` varchar(100) NOT NULL,
  `clgcode` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `college`
--

INSERT INTO `college` (`clgid`, `clgname`, `clgcode`, `location`, `phone`) VALUES
(1, 'Shri Madhwa Vadiraja Institute of Technology and Management,Bantakal', 'MW', 'Bantakal', '08204294005'),
(2, 'Acharya Institute of Technology, Bangalore', 'AY', 'Bangalore', '08028396011'),
(3, 'Sahyadri College of Engineering and Management, Mangalore', 'SF', 'Mangalore', '08242277222'),
(4, 'R.V. College of Engineering, Bangalore ', 'RV', 'Bangalore', '08028600184'),
(5, 'Siddaganga Institute of Technology, Tumkur', 'SI', 'Tumkur', '08162214000');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `no` int(11) NOT NULL,
  `crcd` varchar(100) NOT NULL,
  `crs` varchar(100) NOT NULL,
  `crd` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`no`, `crcd`, `crs`, `crd`) VALUES
(2, 'BPHYS102', 'Applied Physics for CSE stream', 4),
(3, 'BPOPS103', 'Principles of Programming Using C', 3),
(4, 'BCS301', 'Mathematics for Computer Science ', 4),
(5, 'BCS302', 'Digital Design & Computer  Organization ', 3),
(6, 'BCS303', 'Operating Systems ', 4),
(7, 'BCS304', 'Data Structures and Applications', 3),
(8, 'BCS306A', 'Object Oriented Programming with Java ', 3),
(9, 'BCS358D', 'Data Visualization with Python ', 1),
(10, 'BCSL305', 'Data Structures Lab ', 1),
(11, 'BCS403', 'Database Management Systems', 4),
(12, 'BCS456C', 'UI/UX (Lab) ', 1);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `clgid` int(50) NOT NULL,
  `stdid` int(10) NOT NULL,
  `USN` varchar(100) NOT NULL,
  `stdmail` varchar(50) NOT NULL,
  `stdpassword` varchar(500) NOT NULL,
  `stdname` varchar(50) NOT NULL,
  `stdbranch` varchar(10) NOT NULL,
  `stdsection` varchar(10) NOT NULL,
  `father` varchar(50) NOT NULL,
  `mother` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `phone` varchar(200) NOT NULL,
  `sem` int(10) NOT NULL,
  `gender` enum('Male','Female') NOT NULL,
  `siPath` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`clgid`, `stdid`, `USN`, `stdmail`, `stdpassword`, `stdname`, `stdbranch`, `stdsection`, `father`, `mother`, `dob`, `phone`, `sem`, `gender`, `siPath`) VALUES
(1, 22, '4MW22CS164', 'suja2004@gmail.com', '4642ce5a71a6c7f5e83d2130df64eb5178f58a78ff276f8d3d2100edd5e6332a', 'Sujan Kumar K', 'CSE', 'C', 'Prabhakara ', 'Sharada', '2004-12-01', '7829079853', 3, 'Male', 'C:\\Users\\Suja\\Desktop\\portfolio-website-template-main\\assets\\images\\Watashi.jpeg'),
(1, 23, '4MW22CS165', 'suja@gmail.com', '29feb5ee3d513fd06ba6df2cb4a1a37eb5b23e45bfed36792f62a4c981207b94', 'Sujan', 'CSE', 'C', 'dsfgh', 'srdtfg', '2004-12-23', '9098778766', 3, 'Male', 'C:\\Users\\Suja\\Desktop\\portfolio-website-template-main\\assets\\images\\Watashi.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `super`
--

CREATE TABLE `super` (
  `sid` int(10) NOT NULL,
  `username` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `super`
--

INSERT INTO `super` (`sid`, `username`, `pass`) VALUES
(1, '2c8e106a849b01a4b2c8508dd4bbc7397c4c9a0838aa052455cf02d7b2444338', '73d1b1b1bc1dabfb97f216d897b7968e44b06457920f00f2dc6c1ed3be25ad4c');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `uid` int(11) NOT NULL,
  `clgid` int(50) NOT NULL,
  `id` int(50) NOT NULL,
  `password` varchar(500) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `mail` varchar(50) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `name` varchar(50) NOT NULL,
  `branch` varchar(10) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `ipath` varchar(1000) DEFAULT NULL,
  `avpath` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`uid`, `clgid`, `id`, `password`, `mail`, `name`, `branch`, `phone`, `ipath`, `avpath`) VALUES
(1, 1, 1, '39a1996ecc02ce3fb18f2ead7bc415560b834c5c06dbf38babf7709680c78b95', 'sujan@gmail.com', 'sujan', 'CSE', '7829079853', '', 'C:\\Users\\Suja\\Documents\\portfolio-website-template-main\\assets\\images\\Watashi.jpeg'),
(2, 3, 2, '486ba2bbe1189bea5839862d45386f643d4b4a7c37b3de594df505ef0610d708', 'shrikanth@gmail.com', 'shrikanth', 'CSE', '9876565644', '', ''),
(3, 5, 3, '1b452b865544ce3446aa4fed65ebb6a2d6c8256b67c5135ac6ff4fcfb194d49d', 'vishwas@gmail.com', 'vishwas', 'ECE', '9876787646', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`no.`);

--
-- Indexes for table `attrec`
--
ALTER TABLE `attrec`
  ADD PRIMARY KEY (`no.`);

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`no.`);

--
-- Indexes for table `college`
--
ALTER TABLE `college`
  ADD PRIMARY KEY (`clgid`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`stdid`);

--
-- Indexes for table `super`
--
ALTER TABLE `super`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `no.` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `attrec`
--
ALTER TABLE `attrec`
  MODIFY `no.` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `classes`
--
ALTER TABLE `classes`
  MODIFY `no.` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `college`
--
ALTER TABLE `college`
  MODIFY `clgid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `stdid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `super`
--
ALTER TABLE `super`
  MODIFY `sid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
