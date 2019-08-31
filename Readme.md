# Hibernate entity inheritance strategies showcase

This project is an example how different Hibernate inheritance strategies work:
- `SINGLE_TABLE`
- `JOINED`
- `TABLE_PER_CLASS`

## Setup

- Clone the repository
- Make sure you have MySQL server up and running
- Adjust MySQL connection parameters in `src/main/resources/META-INF/persistence.xml` (url, user and password)
- Run application (`src/main/java/Main.java`), which will create tables in the database and populate them with data.

## Outcome

You can then observe how the database structure differs for each inheritance strategy, and how the data in organized inside them.

- `SINGLE_TABLE` - creates only one table for all of the classes
- `JOINED` - creates 3 tables - one for each class in the inheritance hierarchy
- `TABLE_PER_CLASS` - creates 2 tables - one for each concrete (non abstract) class
