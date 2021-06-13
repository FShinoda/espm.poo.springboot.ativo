CREATE TABLE `empresa` (
    `empCodi` varchar(36) NOT NULL,
    `empNome` varchar(50) NOT NULL,
    `empSimb` varchar(5) DEFAULT NULL,
    PRIMARY KEY (`empCodi`)
) ENGINE=InnoDB;