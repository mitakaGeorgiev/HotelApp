# HotelApp
A small  backend app I've made during my java classes in the University.
I have used MVC architecture in the creation of this file.
The main purpose of the app, is to simulate a site in which the user can check rooms available,check the prices and make a reservation. The administrator can check the reserved rooms, add new users, add new rooms, or change prices.

# Tools and Technologies used for creating the project

Eclipse & Java IDE - 2021 for realization of the project.

For database  - MySQL

Build automation tool -Maven

Backend (or “server-side”) - Spring Boot 2.5.2.

Since the project doesnt have front-end included I used Postman for sending data to the server

# Instalation
For installation u have to clone the repository and put it inside your IDE

# Starting the project 
In irder to be able to start the project properly, you have to get the needed tools from the marketplace in eclipse (web dev tools 3, spring tools 4)

# Database connections
I've used 3 databases User, Catalogue(room), and Room(reservations). The User and Catalog databases are connected to Room using a ManyToOne(annotations).
