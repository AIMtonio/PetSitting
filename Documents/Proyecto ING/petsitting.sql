-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 17-03-2019 a las 01:45:02
-- Versión del servidor: 5.7.19
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `petsitting`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `control`
--

DROP TABLE IF EXISTS `control`;
CREATE TABLE IF NOT EXISTS `control` (
  `id_control` int(9) NOT NULL AUTO_INCREMENT,
  `cantidad_alimento` double(9,2) DEFAULT NULL,
  `cada_hora` int(2) DEFAULT NULL,
  `cantidad_veces` int(2) DEFAULT NULL,
  PRIMARY KEY (`id_control`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

DROP TABLE IF EXISTS `mascota`;
CREATE TABLE IF NOT EXISTS `mascota` (
  `id_mascota` int(9) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `edad` int(2) DEFAULT NULL,
  `peso` double(9,2) DEFAULT NULL,
  `raza` varchar(200) NOT NULL,
  `fecha_creacion` time DEFAULT NULL,
  `tipo_masc` varchar(200) NOT NULL,
  `id_usuario` int(9) DEFAULT NULL,
  `id_control` int(9) DEFAULT NULL,
  PRIMARY KEY (`id_mascota`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_control` (`id_control`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

DROP TABLE IF EXISTS `tipo`;
CREATE TABLE IF NOT EXISTS `tipo` (
  `id_tipo` int(9) NOT NULL AUTO_INCREMENT,
  `tipo_mascota` varchar(100) NOT NULL,
  `raza` varchar(200) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`id_tipo`, `tipo_mascota`, `raza`) VALUES
(1, 'Perro', 'Labrador'),
(2, 'Perro', 'Pugs'),
(3, 'Perro', 'Bulldog Inglés'),
(4, 'Perro', 'Bulldog Francés'),
(5, 'Perro', 'Schnauzer'),
(6, 'Perro', 'Beagle'),
(7, 'Perro', 'Husky Siberiano'),
(8, 'Perro', 'Pastor Alemán'),
(9, 'Perro', 'Chihuahua'),
(10, 'Perro', 'Pitbull'),
(11, 'Perro', 'Golden Retriever'),
(12, 'Perro', 'Dalmata'),
(13, 'Perro', 'Boxer'),
(14, 'Perro', 'Cocker Spaniel'),
(15, 'Perro', 'Weimaraner'),
(16, 'Perro', 'Braco Aleman'),
(17, 'Perro', 'Gran Danes'),
(18, 'Perro', 'Criollo(Cruza)'),
(19, 'Perro', 'Poodle'),
(20, 'Perro', 'Rottweiler'),
(21, 'Perro', 'Cocker'),
(22, 'Perro', 'Dóberman'),
(23, 'Perro', 'Bull Terrier'),
(24, 'Perro', 'French Poodle'),
(25, 'Perro', 'Otro'),
(26, 'Gato', 'Abyssinian'),
(27, 'Gato', 'American Bobtail'),
(28, 'Gato', 'American Curl'),
(29, 'Gato', 'American Shorthair'),
(30, 'Gato', 'American Wirehair'),
(31, 'Gato', 'Balinese-Javanese'),
(32, 'Gato', 'Bengal'),
(33, 'Gato', 'Birman'),
(34, 'Gato', 'Bombay'),
(35, 'Gato', 'British'),
(36, 'Gato', 'Burmese'),
(37, 'Gato', 'Chartreux'),
(38, 'Gato', 'Cornish Rex'),
(39, 'Gato', 'Devon Rex'),
(40, 'Gato', 'Korat'),
(41, 'Gato', 'Laperm'),
(42, 'Gato', 'Maine Coon'),
(43, 'Gato', 'Manx'),
(44, 'Gato', 'Ocicat'),
(45, 'Gato', 'Oriental'),
(46, 'Gato', 'Savannah'),
(47, 'Gato', 'Siberian'),
(48, 'Gato', 'Toyger'),
(49, 'Gato', 'Tonkinese'),
(50, 'Gato', 'Cruza'),
(51, 'Gato', 'Otro'),
(52, 'Conejo', 'Netherland Dwarf'),
(53, 'Conejo', 'Conejo Enano(Polish)'),
(54, 'Conejo', 'Dutch Small'),
(55, 'Conejo', 'Conejo cabeza de léon'),
(56, 'Conejo', 'Belier(Conejo de orejas caídas)'),
(57, 'Conejo', 'Conejo angora inglés'),
(58, 'Conejo', 'Conejo común'),
(59, 'Conejo', 'Otro'),
(60, 'Roedor', 'Rata gris'),
(61, 'Roedor', 'Rata negra'),
(62, 'Roedor', 'Cavia porcellus(Cuyo)'),
(63, 'Roedor', 'Degú'),
(64, 'Roedor', 'Hámster Dorado'),
(65, 'Roedor', 'Hámster Ruso'),
(66, 'Roedor', 'Hámster Enano'),
(67, 'Roedor', 'Chinchilla de cola larga'),
(68, 'Roedor', 'Cricetulus Griseus(Hámster Chino)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(9) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `apellidos` varchar(200) NOT NULL,
  `numero_celular` varchar(10) DEFAULT NULL,
  `usuario` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `numero_celular` (`numero_celular`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON UPDATE CASCADE,
  ADD CONSTRAINT `mascota_ibfk_2` FOREIGN KEY (`id_control`) REFERENCES `control` (`id_control`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
