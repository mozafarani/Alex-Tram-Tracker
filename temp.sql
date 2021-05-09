
Drop table Train;
Drop table Station;
Drop Table Track;
Drop Table User;
Drop Table Ticket;

CREATE TABLE Train(     
                        train_no Integer Primary Key,
                        destination Text,
                        arrival_time Text Not Null,
                        departure_time Text Not Null,
                        location Text Not null,
                        capacity Integer,
                        way Integer
                  );
CREATE TABLE Station(   
                        station_id Integer primary key,
                        name text Not null,
                        track_no Integer
                        
                    );
CREATE TABLE Track(     
                        track_id Integer primary key,
                        type Text,
                        name Text not null
                  );

CREATE TABLE User(
                        user_id Integer Primary key,
                        username Text,
                        password Text, 
                        admin Integer
                 );

CREATE TABLE Ticket(
                        user_id Integer Primary Key,
                        train_no Integer,
                        FOREIGN KEY(user_id) REFERENCES User(user_id),
                        FOREIGN KEY(train_no) REFERENCES Train(train_no)
                 );

-- Tracks

INSERT INTO Track (track_id,type,name) VALUES(1,"normal","Ramlh-El Nasr");
INSERT INTO Track (track_id,type,name) VALUES(2,"subway", "Ramlh-El Nasr");
INSERT INTO Track (track_id,type,name) VALUES(25,"normal", "Ramlh-Sidi Gaber");
INSERT INTO Track (track_id,type,name) VALUES(36,"high", "Ramlh-San Estefano");

-- Stations

INSERT INTO Station (station_id,name,track_no) VALUES(1,"Ramlh",4);
INSERT INTO Station (station_id,name,track_no) VALUES(2,"Gamea' Ibrahim",4);
INSERT INTO Station (station_id,name,track_no) VALUES(3,"Azarita",4);
INSERT INTO Station (station_id,name,track_no) VALUES(4,"Al Shahid Moustafa Ziean",4);
INSERT INTO Station (station_id,name,track_no) VALUES(5,"Al Shobban Al Moslemin",4);
INSERT INTO Station (station_id,name,track_no) VALUES(6,"Al Shatby",4);
INSERT INTO Station (station_id,name,track_no) VALUES(7,"Al Gamaa",4);
INSERT INTO Station (station_id,name,track_no) VALUES(8,"Camp Caesar",4);
INSERT INTO Station (station_id,name,track_no) VALUES(9,"Al Ibrahimiyya",4);
INSERT INTO Station (station_id,name,track_no) VALUES(10,"Sporting Al Soghra",4);
INSERT INTO Station (station_id,name,track_no) VALUES(11,"Sporting Al Kobra",4);


INSERT INTO Station (station_id,name,track_no) VALUES(12,"Cleopatra Al Soghra",12);
INSERT INTO Station (station_id,name,track_no) VALUES(13,"Cleopatra Hammamat",12);
INSERT INTO Station (station_id,name,track_no) VALUES(14,"Sidi Gaber Al Sheikh",12);

INSERT INTO Station (station_id,name,track_no) VALUES(15,"Zananere",22);
INSERT INTO Station (station_id,name,track_no) VALUES(16,"Sidi Gaber Al Mahata",22);

INSERT INTO Station (station_id,name,track_no) VALUES(17,"Mustafa Kamil",3);
INSERT INTO Station (station_id,name,track_no) VALUES(18,"Mohammed Mahfouz",3);
INSERT INTO Station (station_id,name,track_no) VALUES(19,"Roushdy",3);
INSERT INTO Station (station_id,name,track_no) VALUES(20,"Bolkly",3);


INSERT INTO Station (station_id,name,track_no) VALUES(21,"Al Hedaya",1);
INSERT INTO Station (station_id,name,track_no) VALUES(22,"Saba Pasha",1);
INSERT INTO Station (station_id,name,track_no) VALUES(23,"Ramsis",1);
INSERT INTO Station (station_id,name,track_no) VALUES(24,"Al Fonoun Al Gamella",1);
INSERT INTO Station (station_id,name,track_no) VALUES(25,"Kasr Al Safa",1);

INSERT INTO Station (station_id,name,track_no) VALUES(26,"San Stefano",32);
INSERT INTO Station (station_id,name,track_no) VALUES(27,"Tharwat",32);
INSERT INTO Station (station_id,name,track_no) VALUES(28,"Loran",32);
INSERT INTO Station (station_id,name,track_no) VALUES(29,"Al Saraya",32);
INSERT INTO Station (station_id,name,track_no) VALUES(30,"Sidi Beshr",32);
INSERT INTO Station (station_id,name,track_no) VALUES(31,"Al Seyouf",32);
INSERT INTO Station (station_id,name,track_no) VALUES(32,"Al Nasr",32);

INSERT INTO Station (station_id,name,track_no) VALUES(33,"Al Wezara",42);
INSERT INTO Station (station_id,name,track_no) VALUES(34,"Al Karnak",42);
INSERT INTO Station (station_id,name,track_no) VALUES(35,"Baccos",42);
INSERT INTO Station (station_id,name,track_no) VALUES(36,"Safar",42);
INSERT INTO Station (station_id,name,track_no) VALUES(37,"Schutz",42);
INSERT INTO Station (station_id,name,track_no) VALUES(38,"Gianaclis",42);

-- Trains

INSERT INTO Train (train_no,destination,arrival_time,departure_time,location,capacity,way) VALUES(1, "Gamea' Ibrahim", Date('now', '+4 days'), Date('now'), "Ramlh", 155, 1);
INSERT INTO Train (train_no,destination,arrival_time,departure_time,location,capacity,way) VALUES(2, "Gamea' Ibrahim", Date('now', '+3 days'), Date('now'), "Ramlh", 340, 1);
INSERT INTO Train (train_no,destination,arrival_time,departure_time,location,capacity,way) VALUES(25, "Gamea' Ibrahim", Date('now', '+4 days'), Date('now'), "Ramlh", 223, 1);
INSERT INTO Train (train_no,destination,arrival_time,departure_time,location,capacity,way) VALUES(36, "Gamea' Ibrahim", Date('now', '+2 days'), Date('now'), "Ramlh", 67, 1);

-- Users

-- Put here 10 users
INSERT INTO User (user_id, username, password, admin) VALUES(1, "admin", "admin", 1);
INSERT INTO User (user_id, username, password, admin) VALUES(2, "ez", "ez", 0);
INSERT INTO User (user_id, username, password, admin) VALUES(3, "admin2", "admin", 1);
INSERT INTO User (user_id, username, password, admin) VALUES(4, "admin3", "admin", 1);
INSERT INTO User (user_id, username, password, admin) VALUES(5, "horus", "MxYhiDyoud1", 0);
INSERT INTO User (user_id, username, password, admin) VALUES(6, "seth", "kredlQuszGn", 0);
INSERT INTO User (user_id, username, password, admin) VALUES(7, "ptah", "jPzLh3AbFwb", 0);
INSERT INTO User (user_id, username, password, admin) VALUES(8, "re", "FMXooTqH7AT", 0);
INSERT INTO User (user_id, username, password, admin) VALUES(9, "hathor", "jIVWxZWDtq", 0);
INSERT INTO User (user_id, username, password, admin) VALUES(10, "anubis", "YelzMhj3ouU", 0);



--Tickets

-- put here 20 tickets


