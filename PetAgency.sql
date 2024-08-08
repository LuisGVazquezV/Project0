-- Drop the old tables if they exist
DROP TABLE IF EXISTS pets;
DROP TABLE IF EXISTS users;

-- Create the users table
CREATE TABLE users (
    user_id_pk SERIAL PRIMARY KEY,
    username VARCHAR(15) NOT NULL,
    password VARCHAR(60) NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone_number VARCHAR(15),
    address VARCHAR(100)
);

-- Insert users into the users table
INSERT INTO users (username, password, email, phone_number, address) VALUES
    ('john_doe', 'password1', 'john.doe@example.com', '1234567890', '123 Maple Street'),
    ('jane_smith', 'password2', 'jane.smith@example.com', '0987654321', '456 Oak Avenue'),
    ('mike_jones', 'password3', 'mike.jones@example.com', '5555555555', '789 Pine Road'),
    ('emma_watson', 'password4', 'emma.watson@example.com', '2223334444', '101 Birch Lane'),
    ('oliver_brown', 'password5', 'oliver.brown@example.com', '6667778888', '202 Cedar Drive'),
    ('ava_johnson', 'password6', 'ava.johnson@example.com', '1112223333', '303 Elm Court'),
    ('william_clark', 'password7', 'william.clark@example.com', '4445556666', '404 Maple Boulevard'),
    ('sophia_martin', 'password8', 'sophia.martin@example.com', '7778889999', '505 Oak Place'),
    ('liam_wilson', 'password9', 'liam.wilson@example.com', '9998887777', '606 Pine Circle'),
    ('mia_davis', 'password10', 'mia.davis@example.com', '3332221111', '707 Birch Square');

-- Create the pets table
CREATE TABLE pets (
    pet_id_pk SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    species VARCHAR(10) NOT NULL,
    breed VARCHAR(20),
    age INT,
    gender CHAR,
    description VARCHAR(200),
    user_id_fk INT NOT NULL REFERENCES users(user_id_pk)
);

-- Insert pets into the pets table ensuring each pet has an owner
INSERT INTO pets (name, species, breed, age, gender, description, user_id_fk) VALUES
    ('Bella', 'Dog', 'Labrador Retriever', 3, 'F', 'Friendly and energetic dog', 1),
    ('Max', 'Dog', 'German Shepherd', 4, 'M', 'Loyal and protective companion', 2),
    ('Luna', 'Cat', 'Siamese', 2, 'F', 'Curious and playful cat', 1),
    ('Charlie', 'Dog', 'Beagle', 1, 'M', 'Loves to explore and sniff around', 3),
    ('Lucy', 'Cat', 'Maine Coon', 5, 'F', 'Gentle and sociable cat', 4),
    ('Cooper', 'Dog', 'Bulldog', 6, 'M', 'Calm and affectionate dog', 4),
    ('Bubbles', 'Fish', 'Goldfish', 1, 'F', 'Small and peaceful fish', 5),
    ('Spike', 'Reptile', 'Iguana', 5, 'M', 'Calm and easygoing reptile', 5),
    ('Tweety', 'Bird', 'Canary', 2, 'F', 'Cheerful and active bird', 6),
    ('Snowball', 'Rabbit', 'Netherland Dwarf', 3, 'F', 'Gentle and friendly rabbit', 7),
    ('Buddy', 'Dog', 'Poodle', 3, 'M', 'Smart and friendly dog', 2),
    ('Coco', 'Cat', 'Ragdoll', 4, 'F', 'Affectionate and relaxed cat', 6),
    ('Oscar', 'Dog', 'Dachshund', 2, 'M', 'Playful and curious dog', 3),
    ('Nala', 'Cat', 'British Shorthair', 3, 'F', 'Quiet and friendly cat', 1),
    ('Toby', 'Dog', 'Shih Tzu', 5, 'M', 'Friendly and easygoing dog', 8),
    ('Milo', 'Dog', 'Cocker Spaniel', 4, 'M', 'Gentle and affectionate dog', 9),
    ('Sly', 'Reptile', 'Python', 4, 'M', 'Quiet and intriguing snake', 9),
    ('Whiskers', 'Rabbit', 'Lop', 2, 'M', 'Calm and affectionate rabbit', 10),
    ('Chirpy', 'Bird', 'Parakeet', 3, 'F', 'Active and colorful bird', 10),
    ('Goldie', 'Fish', 'Betta', 2, 'M', 'Vibrant and solitary fish', 5),
    ('Bailey', 'Dog', 'Golden Retriever', 2, 'F', 'Playful and loves water', 1),
    ('Daisy', 'Cat', 'Bengal', 4, 'F', 'Active and curious cat', 9),
    ('Rocky', 'Dog', 'Boxer', 5, 'M', 'Strong and energetic dog', 1),
    ('Leo', 'Cat', 'Savannah', 3, 'M', 'Playful and active cat', 3),
    ('Rex', 'Reptile', 'Tortoise', 10, 'M', 'Slow and steady tortoise', 2),
    ('Thumper', 'Rabbit', 'Angora', 4, 'M', 'Fluffy and gentle rabbit', 3),
    ('Bella', 'Cat', 'Siamese', 3, 'F', 'Curious and playful cat', 4),
    ('Simba', 'Cat', 'Abyssinian', 2, 'M', 'Active and playful cat', 6),
    ('Zoe', 'Dog', 'Border Collie', 6, 'F', 'Smart and energetic dog', 2),
    ('Rocky', 'Dog', 'Boxer', 2, 'M', 'Strong and energetic dog', 3),
    ('Ginger', 'Cat', 'Maine Coon', 4, 'F', 'Playful and affectionate cat', 4),
    ('Buster', 'Dog', 'Beagle', 3, 'M', 'Loves to explore and sniff around', 5),
    ('Oliver', 'Cat', 'British Shorthair', 2, 'M', 'Quiet and friendly cat', 6),
    ('Shadow', 'Cat', 'Persian', 5, 'F', 'Fluffy and quiet cat', 7),
    ('Rex', 'Dog', 'German Shepherd', 3, 'M', 'Loyal and protective companion', 8),
    ('Mittens', 'Cat', 'Ragdoll', 4, 'F', 'Affectionate and relaxed cat', 9),
    ('Rover', 'Dog', 'Labrador Retriever', 2, 'M', 'Friendly and energetic dog', 10),
    ('Sasha', 'Dog', 'Poodle', 5, 'F', 'Smart and friendly dog', 6),
    ('Blue', 'Bird', 'Parakeet', 2, 'M', 'Active and colorful bird', 7);