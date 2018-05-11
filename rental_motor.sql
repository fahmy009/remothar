-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10 Jun 2017 pada 13.13
-- Versi Server: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rental_motor`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_motor`
--

CREATE TABLE `tb_motor` (
  `Id_Motor` int(10) NOT NULL,
  `merek` varchar(15) NOT NULL,
  `type` varchar(10) NOT NULL,
  `tahun` int(4) NOT NULL,
  `nopol` varchar(9) NOT NULL,
  `harga` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_motor`
--

INSERT INTO `tb_motor` (`Id_Motor`, `merek`, `type`, `tahun`, `nopol`, `harga`) VALUES
(1, 'yamaha', 'supra', 2007, 'p9027hh', 90000),
(6, 'zusuki', 'FU', 2007, 'm9074of', 94000),
(8, 'yamaha', 'vega z', 2009, 'p9027od', 70000),
(9, 'honda', 'astrea', 2000, 'n9027kl', 49000),
(13, 'honda', 'astrea', 2007, 'P4907NH', 74000),
(14, 'yamaha', 'vega', 2009, 'P902KH', 90000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjam`
--

CREATE TABLE `tb_peminjam` (
  `Id_Peminjaman` int(10) NOT NULL,
  `Id_Motor` int(10) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(15) NOT NULL,
  `No_Tlp` int(14) NOT NULL,
  `No_KTP` varchar(15) NOT NULL,
  `Merek` varchar(25) NOT NULL,
  `Type` varchar(25) NOT NULL,
  `NoPol` varchar(25) NOT NULL,
  `Tanggal_Pinjam` date NOT NULL,
  `Tanggal_Kembali` date NOT NULL,
  `Lama` int(11) NOT NULL,
  `Harga` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_peminjam`
--

INSERT INTO `tb_peminjam` (`Id_Peminjaman`, `Id_Motor`, `Nama`, `Alamat`, `No_Tlp`, `No_KTP`, `Merek`, `Type`, `NoPol`, `Tanggal_Pinjam`, `Tanggal_Kembali`, `Lama`, `Harga`) VALUES
(17, 9, 'Gavin', 'Jember', 4909204, '274092470', 'honda', 'astrea', 'n9027kl', '2017-06-05', '2017-06-08', 3, 147000),
(15, 1, 'Muhtar', 'Jember', 9090724, '094272409', 'yamaha', 'supra', 'p9027hh', '2017-06-05', '2017-06-16', 11, 990000),
(16, 8, 'Alif', 'Jember', 9090909, '94704709', 'yamaha', 'vega z', 'p9027od', '2017-06-01', '2017-06-06', 5, 350000),
(18, 14, 'Ilham', 'jember', 2097409, '2904702740', 'yamaha', 'vega', 'P902KH', '2017-06-05', '2017-06-08', 3, 270000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `Id_Transaksi` int(10) NOT NULL,
  `Peminjam` varchar(20) NOT NULL,
  `NoPol` varchar(9) NOT NULL,
  `Harga` int(10) NOT NULL,
  `Tgl_Pinjam` date NOT NULL,
  `Tgl_Kembali` date NOT NULL,
  `Lama` int(3) NOT NULL,
  `Total_Harga` int(10) NOT NULL,
  `Denda` int(6) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `Id_User` int(11) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`Id_User`, `Nama`, `Username`, `Password`, `Status`) VALUES
(1, 'Muhtar', 'admin', 'admin', 'Admin'),
(5, 'Haris', 'Haris22', 'qwerty', 'Pegawai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_motor`
--
ALTER TABLE `tb_motor`
  ADD PRIMARY KEY (`Id_Motor`);

--
-- Indexes for table `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  ADD PRIMARY KEY (`Id_Peminjaman`),
  ADD UNIQUE KEY `Id_Motor` (`Id_Motor`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`Id_Transaksi`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`Id_User`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_motor`
--
ALTER TABLE `tb_motor`
  MODIFY `Id_Motor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  MODIFY `Id_Peminjaman` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `Id_Transaksi` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `Id_User` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
