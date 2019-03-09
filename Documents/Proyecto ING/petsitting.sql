-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 07-03-2019 a las 01:24:50
-- Versión del servidor: 5.1.53
-- Versión de PHP: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `petsitting`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `control`
--

CREATE TABLE IF NOT EXISTS `control` (
  `id_control` int(9) NOT NULL AUTO_INCREMENT,
  `cantidad_alimento` double(9,2) DEFAULT NULL,
  `cada_hora` int(2) DEFAULT NULL,
  `cantidad_veces` int(2) DEFAULT NULL,
  PRIMARY KEY (`id_control`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `control`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE IF NOT EXISTS `mascota` (
  `id_mascota` int(9) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `edad` int(2) DEFAULT NULL,
  `peso` double(9,2) DEFAULT NULL,
  `fecha_creacion` time DEFAULT NULL,
  `tipo_masc` int(9) DEFAULT NULL,
  `id_usuario` int(9) DEFAULT NULL,
  `id_control` int(9) DEFAULT NULL,
  PRIMARY KEY (`id_mascota`),
  KEY `tipo_masc` (`tipo_masc`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_control` (`id_control`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `mascota`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE IF NOT EXISTS `tipo` (
  `id_tipo` int(9) NOT NULL AUTO_INCREMENT,
  `tipo_mascota` varchar(100) NOT NULL,
  `raza` varchar(200) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tipo`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(9) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `ap_pat` varchar(200) NOT NULL,
  `ap_mat` varchar(200) NOT NULL,
  `numero_celular` varchar(10) DEFAULT NULL,
  `usuario` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `numero_celular` (`numero_celular`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `usuario`
--


--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`tipo_masc`) REFERENCES `tipo` (`id_tipo`) ON UPDATE CASCADE,
  ADD CONSTRAINT `mascota_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON UPDATE CASCADE,
  ADD CONSTRAINT `mascota_ibfk_3` FOREIGN KEY (`id_control`) REFERENCES `control` (`id_control`) ON UPDATE CASCADE;
