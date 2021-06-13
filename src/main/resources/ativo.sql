CREATE TABLE `ativo` (
    `atvCodi` varchar(36) NOT NULL,
    `empCodi` varchar(36) NOT NULL,
    `atvData` date NOT NULL,
    `atvValor` decimal(14,4) DEFAULT NULL,
    PRIMARY KEY (`atvCodi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
