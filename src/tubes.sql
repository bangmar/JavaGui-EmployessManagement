-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2022 at 06:21 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes`
--

-- --------------------------------------------------------

--
-- Table structure for table `employess`
--

CREATE TABLE `employess` (
  `NIP` int(10) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `division` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `insurance` double DEFAULT NULL,
  `password` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employess`
--

INSERT INTO `employess` (`NIP`, `Name`, `division`, `address`, `insurance`, `password`) VALUES
(20102002, 'Laureta', 'AI Data', 'Pekalongan', 30000, 'lauret'),
(20102004, 'Andi Dwinata', 'PM', 'Pemalang', 150000, 'andi123'),
(20102018, 'Mario Silalahi', 'Front-end Dev', 'KarangCegak', 22000, 'mario123'),
(201020000, 'Irvan Silalahi', 'Lucy', 'Sumbang', 25000, 'irvanasu');

-- --------------------------------------------------------

--
-- Table structure for table `login_admin`
--

CREATE TABLE `login_admin` (
  `id` varchar(10) NOT NULL,
  `password` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_admin`
--

INSERT INTO `login_admin` (`id`, `password`) VALUES
('Admin', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `salarydata`
--

CREATE TABLE `salarydata` (
  `NIP` int(10) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Division` varchar(50) DEFAULT NULL,
  `MainSalary` varchar(50) DEFAULT NULL,
  `Allowance` varchar(50) DEFAULT NULL,
  `Overtime` varchar(50) DEFAULT NULL,
  `totalSalary` varchar(50) DEFAULT NULL,
  `DateCheck` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salarydata`
--

INSERT INTO `salarydata` (`NIP`, `Name`, `Division`, `MainSalary`, `Allowance`, `Overtime`, `totalSalary`, `DateCheck`) VALUES
(20102004, 'Andi Dwinata', 'PM', 'Rp.100000.0', 'Rp.50000.0', '2.0 Jam ', 'Rp.2000.0', '2022-07-27'),
(20102004, 'Andi Dwinata', 'PM', 'Rp.120000.0', 'Rp.50000.0', '4.0 Jam ', 'Rp.24000.0', '2022-07-27'),
(20102018, 'Mario Silalahi', 'Front-end Dev', 'Rp.150000.0', 'Rp.10000.0', '7.0 Jam ', 'Rp.145000.0', '2022-07-27'),
(20102018, 'Mario Silalahi', 'Front-end Dev', 'Rp.150000.0', 'Rp.50000.0', '7.0 Jam ', 'Rp.185000.0', '2022-07-28');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employess`
--
ALTER TABLE `employess`
  ADD PRIMARY KEY (`NIP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
