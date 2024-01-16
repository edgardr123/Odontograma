CREATE TABLE IF NOT EXISTS `historial` (
                                           `id` int NOT NULL AUTO_INCREMENT,
                                           `procedimiento` varchar(500) NOT NULL,
    `fechaprocedimiento` datetime(6) DEFAULT NULL,
    `paciente_id` int DEFAULT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `FK4uho9p3smyj0y3kn5846kba5r` FOREIGN KEY (`paciente_id`) REFERENCES `pacientes` (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;