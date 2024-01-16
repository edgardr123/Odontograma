CREATE TABLE IF NOT EXISTS `pacientes` (
                             `id` int NOT NULL AUTO_INCREMENT,
                             `nombre` varchar(60) NOT NULL,
                             `apellidom` varchar(60) NOT NULL,
                             `apellidop` varchar(60) NOT NULL,
                             `email` varchar(60) NOT NULL,
                             `telefono` varchar(255) DEFAULT NULL,
                             `direccion` varchar(255) DEFAULT NULL,
                             `ciudad` varchar(255) DEFAULT NULL,
                             `codigo_postal` varchar(255) DEFAULT NULL,
                             `sexo` varchar(255) DEFAULT NULL,
                             `edad` int DEFAULT NULL,
                             `fecha_nacimiento` datetime(6) DEFAULT NULL,
                             `ocupacion` varchar(255) DEFAULT NULL,
                             `medicamentos` varchar(600) DEFAULT NULL,
                             `alergias` varchar(600) DEFAULT NULL,
                             `reacciones` varchar(600) DEFAULT NULL,
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `UK_a83ft0lfk8ltx47ve931qw2kq` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;