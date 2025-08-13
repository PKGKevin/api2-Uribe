-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-08-2025 a las 19:12:28
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `heroesbasedata`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personajes`
--

CREATE TABLE `personajes` (
  `cantidad_vida` int(11) DEFAULT NULL,
  `fecha_creacion` date DEFAULT NULL,
  `id` int(11) NOT NULL,
  `poder_ataque` int(11) DEFAULT NULL,
  `poder_defensa` int(11) DEFAULT NULL,
  `fotografia` varchar(255) DEFAULT NULL,
  `heroe_villano` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `villano` varchar(255) DEFAULT NULL,
  `vivo_muerto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personajes`
--

INSERT INTO `personajes` (`cantidad_vida`, `fecha_creacion`, `id`, `poder_ataque`, `poder_defensa`, `fotografia`, `heroe_villano`, `nombre`, `villano`, `vivo_muerto`) VALUES
(22, '2025-08-07', 1, 33, 2, 'none', 'Villano', 'Johan', 'Villano', 'Muerto'),
(2000, '2025-08-07', 2, 1112, 222, 'none', 'Heroe', 'yuyu', 'Heroe', 'Vivo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personajes`
--
ALTER TABLE `personajes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personajes`
--
ALTER TABLE `personajes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
