CREATE TABLE Bilett (
                        id INTEGER AUTO_INCREMENT NOT NULL,
                        film VARCHAR(255) NOT NULL,
                        antall number(2) NOT NULL,
                        fnavn VARCHAR(255) NOT NULL,
                        enavn VARCHAR(255) NOT NULL,
                        tlfnr VARCHAR(255) NOT NULL,
                        epost VARCHAR(255) NOT NULL,
                        PRIMARY KEY (id)
);