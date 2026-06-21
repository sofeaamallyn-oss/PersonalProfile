-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2026 at 04:59 PM
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
-- Database: `studentprofilesdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

CREATE TABLE `profile` (
  `studentID` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `programme` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `hobbies` varchar(255) NOT NULL,
  `introduction` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `profile`
--

INSERT INTO `profile` (`studentID`, `name`, `programme`, `email`, `hobbies`, `introduction`) VALUES
('202437654', 'IAN WILDAN', 'CDCS266', 'ianwildan@gmail.com', 'do coding', 'Hello i am Ian Wildan'),
('2024406767', 'SYAHRAIN HAZWANI ', 'CDCS266', 'saren@gmail.com', 'playing badminton', 'I love badminton'),
('2024414505', 'NUR AFIQAH SYAZA BINTI FAZIL', 'CDCS266', 'afiqahsyaza@gmail.com', 'teaching', 'Hello, I am Afiqah'),
('2024414507', 'NUR AIMI NAZIHAH BINTI FAZIL', 'CDCS266', 'aiminazihah@gmail.com', 'Cooking', 'Hello, I am Aimi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`studentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
