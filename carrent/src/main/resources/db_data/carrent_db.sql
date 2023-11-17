CREATE SCHEMA IF NOT EXISTS carrent_db;

USE carrent_db;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    birth_date DATE,
    admin BOOLEAN,
    email VARCHAR(100) CHECK (email REGEXP '^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com\\.br|com)$'),
    password VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE vehicles (
    vehicle_id INT AUTO_INCREMENT PRIMARY KEY,
    plate VARCHAR(7) CHECK (plate REGEXP '^[A-Z]{3}[0-9]{1,2}[A-Z0-9]{1,4}$'),
    model VARCHAR(50),
    brand VARCHAR(50),
    color VARCHAR(20),
    year INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    current_renter_id INT,
    FOREIGN KEY (current_renter_id) REFERENCES users(user_id)
);

INSERT INTO users (first_name, last_name, birth_date, admin, email, password, created_at)
VALUES 
    ('João', 'Gonçalves', '2012-12-12', true, 'joao@email.com.br', 'senha123', '2023-11-14 16:38:00'),
    ('Maria', 'Silva', '1990-05-20', false, 'maria@email.com', 'senha456', '2023-11-14 16:39:00'),
    ('Carlos', 'Santos', '1985-08-03', false, 'carlos@email.com', 'senha789', '2023-11-14 16:40:00'),
    ('Ana', 'Oliveira', '1995-02-15', false, 'ana@email.com', 'senhaabc', '2023-11-14 16:41:00'),
    ('Fernando', 'Pereira', '1982-07-08', false, 'fernando@email.com', 'senhafef', '2023-11-14 16:42:00'),
    ('Isabel', 'Costa', '1998-11-30', false, 'isabel@email.com.br', 'senhaghi', '2023-11-14 16:43:00'),
    ('Ricardo', 'Martins', '1976-04-18', false, 'ricardo@email.com.br', 'senhajkl', '2023-11-14 16:44:00'),
    ('Juliana', 'Lima', '1989-09-22', false, 'juliana@email.com', 'senha835', '2023-11-14 16:45:00'),
    ('Pedro', 'Rodrigues', '1993-03-05', false, 'pedro@email.com', 'senhavsr', '2023-11-14 16:46:00'),
    ('Camila', 'Almeida', '1987-06-10', false, 'camila@email.com', 'senha525', '2023-11-14 16:47:00');

INSERT INTO vehicles (plate, model, brand, color, year, created_at, status, current_renter_id)
VALUES 
    ('XBI1234', 'Gol', 'Volkswagen', 'branco', 2014, '2023-11-14 16:38:00', 0, NULL),
    ('YNO5678', 'Fusion', 'Ford', 'preto', 2016, '2023-11-14 16:39:00', 0, NULL),
    ('OEK4321', 'Civic', 'Honda', 'azul', 2015, '2023-11-14 16:40:00', 0, NULL),
    ('ABC9876', 'Corolla', 'Toyota', 'prata', 2017, '2023-11-14 16:41:00', 0, NULL),
    ('DEF5432', 'Fiesta', 'Ford', 'vermelho', 2013, '2023-11-14 16:42:00', 0, NULL),
    ('GHI8765', 'Sentra', 'Nissan', 'preto', 2018, '2023-11-14 16:43:00', 0, NULL),
    ('JKL5432', 'Accord', 'Honda', 'branco', 2016, '2023-11-14 16:44:00', 0, NULL),
    ('MNO9876', 'Camry', 'Toyota', 'prata', 2019, '2023-11-14 16:45:00', 0, NULL),
    ('PQR1234', 'Uno', 'Fiat', 'verde', 2015, '2023-11-14 16:46:00', 0, NULL),
    ('STU5678', 'Celta', 'Chevrolet', 'amarelo', 2012, '2023-11-14 16:47:00', 0, NULL);
