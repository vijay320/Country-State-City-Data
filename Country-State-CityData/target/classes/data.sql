-- Insert countries
INSERT INTO countries (name) VALUES ('United States');
INSERT INTO countries (name) VALUES ('India');
INSERT INTO countries (name) VALUES ('Canada');

-- Insert states for United States
INSERT INTO states (name, country_id) VALUES ('California', 1);
INSERT INTO states (name, country_id) VALUES ('Texas', 1);
INSERT INTO states (name, country_id) VALUES ('New York', 1);

-- Insert states for India
INSERT INTO states (name, country_id) VALUES ('Maharashtra', 2);
INSERT INTO states (name, country_id) VALUES ('Karnataka', 2);
INSERT INTO states (name, country_id) VALUES ('Tamil Nadu', 2);

-- Insert states for Canada
INSERT INTO states (name, country_id) VALUES ('Ontario', 3);
INSERT INTO states (name, country_id) VALUES ('Quebec', 3);
INSERT INTO states (name, country_id) VALUES ('British Columbia', 3);

-- Insert cities for California
INSERT INTO cities (name, state_id) VALUES ('Los Angeles', 1);
INSERT INTO cities (name, state_id) VALUES ('San Francisco', 1);
INSERT INTO cities (name, state_id) VALUES ('San Diego', 1);

-- Insert cities for Texas
INSERT INTO cities (name, state_id) VALUES ('Houston', 2);
INSERT INTO cities (name, state_id) VALUES ('Dallas', 2);
INSERT INTO cities (name, state_id) VALUES ('Austin', 2);

-- Insert cities for Maharashtra
INSERT INTO cities (name, state_id) VALUES ('Mumbai', 4);
INSERT INTO cities (name, state_id) VALUES ('Pune', 4);
INSERT INTO cities (name, state_id) VALUES ('Nagpur', 4);

-- Insert cities for Karnataka
INSERT INTO cities (name, state_id) VALUES ('Bangalore', 5);
INSERT INTO cities (name, state_id) VALUES ('Mysore', 5);
INSERT INTO cities (name, state_id) VALUES ('Hubli', 5);

-- Insert cities for Ontario
INSERT INTO cities (name, state_id) VALUES ('Toronto', 7);
INSERT INTO cities (name, state_id) VALUES ('Ottawa', 7);
INSERT INTO cities (name, state_id) VALUES ('Mississauga', 7);