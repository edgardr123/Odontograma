CREATE TABLE IF NOT EXISTS `pacientes_odontograma` (
                                         `id` int NOT NULL AUTO_INCREMENT,
                                         `sd11` TINYINT DEFAULT NULL,
                                         `sd12` TINYINT DEFAULT NULL,
                                         `sd13` TINYINT DEFAULT NULL,
                                         `sd14` TINYINT DEFAULT NULL,
                                         `sd15` TINYINT DEFAULT NULL,
                                         `sd16` TINYINT DEFAULT NULL,
                                         `sd17` TINYINT DEFAULT NULL,
                                         `sd18` TINYINT DEFAULT NULL,
                                         `si21` TINYINT DEFAULT NULL,
                                         `si22` TINYINT DEFAULT NULL,
                                         `si23` TINYINT DEFAULT NULL,
                                         `si24` TINYINT DEFAULT NULL,
                                         `si25` TINYINT DEFAULT NULL,
                                         `si26` TINYINT DEFAULT NULL,
                                         `si27` TINYINT DEFAULT NULL,
                                         `si28` TINYINT DEFAULT NULL,
                                         `iz31` TINYINT DEFAULT NULL,
                                         `iz32` TINYINT DEFAULT NULL,
                                         `iz33` TINYINT DEFAULT NULL,
                                         `iz34` TINYINT DEFAULT NULL,
                                         `iz35` TINYINT DEFAULT NULL,
                                         `iz36` TINYINT DEFAULT NULL,
                                         `iz37` TINYINT DEFAULT NULL,
                                         `iz38` TINYINT DEFAULT NULL,
                                         `id41` TINYINT DEFAULT NULL,
                                         `id42` TINYINT DEFAULT NULL,
                                         `id43` TINYINT DEFAULT NULL,
                                         `id44` TINYINT DEFAULT NULL,
                                         `id45` TINYINT DEFAULT NULL,
                                         `id46` TINYINT DEFAULT NULL,
                                         `id47` TINYINT DEFAULT NULL,
                                         `id48` TINYINT DEFAULT NULL,
                                         `paciente_id` int DEFAULT NULL,
                                         PRIMARY KEY (`id`),
                                         KEY `FK4uho9p3smyj0y3kn5846kba5r` (`paciente_id`),
                                         CONSTRAINT `FK4uho9p3smyj0y3kn5846kba5r` FOREIGN KEY (`paciente_id`) REFERENCES `pacientes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;