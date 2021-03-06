CREATE TABLE `ativo` (
    `atvCodi` varchar(36) NOT NULL,
    `empCodi` varchar(36) NOT NULL,
    `atvData` date NOT NULL,
    `atvValor` decimal(14,4) DEFAULT NULL,
    PRIMARY KEY (`atvCodi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into `ativo` values
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-11', 257.89),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-10', 257.24),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-09', 253.59),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-08', 252.57),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-07', 253.81),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-04', 250.79),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-03', 245.71),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-02', 247.30),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-06-01', 247.40),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-28', 249.68),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-27', 249.31),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-26', 251.49),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-25', 251.72),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-24', 250.78),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-21', 245.17),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-20', 246.48),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-19', 243.12),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-18', 243.08),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-17', 245.18),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-14', 248.15),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-13', 243.03),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-12', 239.00),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-11', 246.23),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-10', 247.18),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-07', 252.46),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-06', 249.73),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-05', 246.47),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-04', 247.79),
(UUID(), '46d85e0e-cc87-11eb-bf1c-d09466b99d08', '2020-05-03', 251.86);
