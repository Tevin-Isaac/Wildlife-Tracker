# Wildlife Tracker
#### By **Tevin Isaac**

![]()
## Description
The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. This application was developed to allow Rangers to track wildlife sightings in the area.

## sreeen shot
![Screenshot from 2021-08-21 05-40-16](https://user-images.githubusercontent.com/81568615/130308171-3187826f-474b-46a8-91f1-03f94d21e889.png)
![Screenshot from 2021-08-21 05-40-32](https://user-images.githubusercontent.com/81568615/130308210-6749d5cc-483f-40d1-a992-e45cbe9c954a.png)


##  Technologies Used
HTML
CSS
JAVA
JS
Java
JUnit
Gradle
Spark
Velocity
Postgres
PSQL
Heroku
Roff

## Installation
* `git clone <https://github.com/Tevin-creator>` this repository


## Database Creation
To create the necessary databases, launch postgres, then psql, and run the following commands:

CREATE DATABASE wildlife_tracker;
\c wildlife_tracker;
CREATE TABLE animals (id serial PRIMARY KEY, name varchar);
CREATE TABLE endangered_animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar);
CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, date TIMESTAMP);
CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

## User Requirements
The applications allow users to do the following:
1.Add a new animal
2.Add an endangered animal
3.Add an animal Sighting

## known Bugs
Null so far.

Tevin Isaac(c)copyright.