-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Servidor: mysql
-- Tiempo de generación: 25-03-2025 a las 11:48:32
-- Versión del servidor: 9.2.0
-- Versión de PHP: 8.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `libreria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `codlib` int NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `autor` varchar(100) NOT NULL,
  `paginas` smallint NOT NULL,
  `argumento` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`codlib`, `isbn`, `titulo`, `autor`, `paginas`, `argumento`) VALUES
(1, '167884920-0', 'velit eu est congue', 'Lowe Scowen', 267, 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.\r\n\r\nDuis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.\r\n\r\nIn sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.'),
(2, '764853420-7', 'a ipsum integer a', 'Mellicent Dooney', 155, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.\r\n\r\nDuis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.'),
(3, '020108271-3', 'ipsum aliquam non mauris', 'Briana Ianni', 166, 'Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.\r\n\r\nAenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.'),
(4, '708838315-2', 'elit ac nulla sed', 'Urbain Rabbet', 133, 'Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.\r\n\r\nMauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.\r\n\r\nNullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.'),
(5, '991159185-9', 'libero non mattis pulvinar', 'Darwin Mitchelhill', 388, 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.\r\n\r\nQuisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.\r\n\r\nVestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.'),
(6, '599849239-0', 'sit amet diam in', 'Saundra Stenet', 424, 'In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.'),
(7, '475746762-1', 'maecenas pulvinar lobortis est', 'Shana Gwinnel', 160, NULL),
(8, '726625476-0', 'curae duis faucibus accumsan', 'Kaitlin Ubanks', 98, 'Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.'),
(9, '954583950-3', 'sed tristique in tempus', 'Yevette Youles', 484, 'Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.\r\n\r\nDonec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.'),
(10, '733370531-5', 'lectus vestibulum quam sapien', 'Mamie Karolczyk', 425, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\r\n\r\nEtiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.'),
(11, '887971426-0', 'nulla suspendisse potenti cras', 'Heddie Lock', 381, NULL),
(12, '055408086-9', 'felis ut at dolor', 'Ives Batten', 350, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.\r\n\r\nPhasellus in felis. Donec semper sapien a libero. Nam dui.\r\n\r\nProin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.'),
(13, '776198560-X', 'sit amet consectetuer adipiscing', 'Raoul Barkworth', 245, 'In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.'),
(14, '100841848-X', 'interdum eu tincidunt in', 'Carlie Sams', 189, NULL),
(15, '163577968-5', 'vestibulum ante ipsum primis', 'Justus Rembrant', 444, 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.\r\n\r\nMorbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.\r\n\r\nFusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.'),
(16, '467249103-X', 'lacinia nisi venenatis tristique', 'Emmery Casaccio', 127, 'Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.\r\n\r\nCum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\r\n\r\nEtiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.'),
(17, '965572787-4', 'sapien quis libero nullam', 'Erhard O\'Halligan', 486, 'Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.\r\n\r\nMauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.'),
(18, '086329738-2', 'amet nulla quisque arcu', 'Blayne Gendrich', 185, 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.\r\n\r\nMorbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.\r\n\r\nFusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.'),
(19, '247136390-3', 'ipsum primis in faucibus', 'Claretta Folder', 264, 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.\r\n\r\nInteger ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.\r\n\r\nNam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.'),
(20, '824218374-0', 'et magnis dis parturient', 'Leanna Pedycan', 245, 'Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem.\r\n\r\nFusce consequat. Nulla nisl. Nunc nisl.'),
(21, '328818885-6', 'consequat varius integer ac', 'Kellie Ilyas', 70, 'Phasellus in felis. Donec semper sapien a libero. Nam dui.\r\n\r\nProin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.\r\n\r\nInteger ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.'),
(22, '979044354-4', 'congue risus semper porta', 'Alvie Aiers', 223, 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.'),
(23, '135156869-8', 'neque vestibulum eget vulputate', 'Babb Pietasch', 156, NULL),
(24, '163011084-1', 'mattis pulvinar nulla pede', 'Neill Sillis', 97, 'In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.\r\n\r\nSuspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.'),
(25, '040421016-3', 'morbi sem mauris laoreet', 'Arluene Brundill', 328, NULL),
(26, '251511280-3', 'lacinia nisi venenatis tristique', 'Edmon Torrijos', 123, 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.'),
(27, '954067286-4', 'quam sollicitudin vitae consectetuer', 'Cyrille Bool', 202, NULL),
(28, '826267943-1', 'maecenas tristique est et', 'Mag Gabbatt', 106, 'Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.\r\n\r\nMaecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat.'),
(29, '507966904-7', 'fusce consequat nulla nisl', 'Tris Isaak', 331, 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.\r\n\r\nNullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.'),
(30, '750913411-0', 'magnis dis parturient montes', 'Kassie Gillani', 223, 'In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.\r\n\r\nAliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.'),
(31, '697494188-9', 'nulla tellus in sagittis', 'Kitti Duffer', 372, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum.\r\n\r\nIn hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.\r\n\r\nAliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.'),
(32, '518061921-1', 'at vulputate vitae nisl', 'Bartholomeus Keyho', 261, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\r\n\r\nEtiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.'),
(33, '642982270-2', 'turpis eget elit sodales', 'Marcie Godon', 487, 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.'),
(34, '045217894-0', 'est donec odio justo', 'Guthrie Featherby', 469, 'In congue. Etiam justo. Etiam pretium iaculis justo.'),
(35, '960721969-4', 'rhoncus aliquet pulvinar sed', 'Rayner Flicker', 443, NULL),
(36, '720308547-3', 'in lacus curabitur at', 'Thorndike Gregoire', 461, 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.\r\n\r\nPellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.'),
(37, '419619591-1', 'nonummy integer non velit', 'Thorpe Raysdale', 147, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.'),
(38, '660332174-2', 'parturient montes nascetur ridiculus', 'Corena Tollet', 260, 'Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.\r\n\r\nVestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.\r\n\r\nIn congue. Etiam justo. Etiam pretium iaculis justo.'),
(39, '678879627-0', 'lectus pellentesque at nulla', 'Frans McKay', 248, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.\r\n\r\nDuis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.'),
(40, '285918168-7', 'suscipit ligula in lacus', 'Fenelia Staniford', 472, 'In congue. Etiam justo. Etiam pretium iaculis justo.\r\n\r\nIn hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.\r\n\r\nNulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.'),
(41, '424057521-4', 'erat curabitur gravida nisi', 'Westbrook Wilby', 94, NULL),
(42, '540707294-7', 'vitae quam suspendisse potenti', 'Joshia Dorian', 438, 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\r\n\r\nProin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.\r\n\r\nAenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.'),
(43, '296919071-0', 'vestibulum sed magna at', 'Meris Gerling', 364, 'Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.\r\n\r\nDonec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.\r\n\r\nDuis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
(44, '162462945-8', 'condimentum id luctus nec', 'Gannie Coning', 466, NULL),
(45, '860476801-7', 'rutrum nulla tellus in', 'Morton Gynni', 158, 'In congue. Etiam justo. Etiam pretium iaculis justo.\r\n\r\nIn hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.\r\n\r\nNulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.'),
(46, '149377551-0', 'in lectus pellentesque at', 'Rennie Frogley', 429, 'Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat.\r\n\r\nCurabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.\r\n\r\nInteger tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.'),
(47, '099303761-5', 'venenatis tristique fusce congue', 'Theresina Rossborough', 144, 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.'),
(48, '026320588-6', 'mi in porttitor pede', 'Nathanil Elderton', 142, 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.\r\n\r\nNullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.'),
(49, '445866813-7', 'tempor convallis nulla neque', 'Hastings McCord', 201, 'In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.\r\n\r\nNulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.\r\n\r\nCras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque.'),
(50, '633928197-4', 'pharetra magna vestibulum aliquet', 'Benni Haburne', 279, 'Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `codusu` int NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(33) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codusu`, `email`, `password`, `nombre`, `apellidos`, `foto`) VALUES
(1, 'nacho@libreria.com', '12345678', 'Ignacio', 'López Calderón', NULL),
(2, 'migue@liberia.com', '12345678', 'Miguel Ángel', 'Postigo Bernal', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_libro`
--

CREATE TABLE `usuario_libro` (
  `codUL` int NOT NULL,
  `codusu` int NOT NULL,
  `codlib` int NOT NULL,
  `nota` tinyint NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `usuario_libro`
--

INSERT INTO `usuario_libro` (`codUL`, `codusu`, `codlib`, `nota`, `fecha_inicio`, `fecha_fin`) VALUES
(1, 1, 5, 9, '2025-03-01', '2025-03-02');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`codlib`),
  ADD UNIQUE KEY `unique_isbn` (`isbn`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codusu`);

--
-- Indices de la tabla `usuario_libro`
--
ALTER TABLE `usuario_libro`
  ADD PRIMARY KEY (`codUL`),
  ADD KEY `fk_usuario_libro_libro` (`codlib`),
  ADD KEY `fk_usuario_libro_usuario` (`codusu`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `codlib` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codusu` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario_libro`
--
ALTER TABLE `usuario_libro`
  MODIFY `codUL` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario_libro`
--
ALTER TABLE `usuario_libro`
  ADD CONSTRAINT `fk_usuario_libro_libro` FOREIGN KEY (`codlib`) REFERENCES `libro` (`codlib`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_usuario_libro_usuario` FOREIGN KEY (`codusu`) REFERENCES `usuario` (`codusu`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
