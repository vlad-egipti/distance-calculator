# Distance calculator
This is a RESTful web service for distance calculation.

## Tools and libraries
- JEE 7, Java 8
- RESTEasy
- WildFly 10
- JAXB
- Maven
- MySQL DB
- Liquibase

## Database structure
Database holds two entities:
- City
  - Id
  - Name
  - Latitude
  - Longitude
- Distance
  - Id
  - From city
  - To city
  - Distance

## Features
> Features are still under construction.
>
> Check API endpoints section below to see what is available so far.

This web service should make it possible to calculate the distance in two ways:
- "Crowflight" (straight distance) between cities. Based on geographical coordinates.
- "Distance matrix" (distance table in the database).

## API endpoints

### List cities
You can list all cities' ids and names making a GET request to `distance-calculator/api/calc`.
