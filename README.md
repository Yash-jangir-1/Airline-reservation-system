# Airline-reservation-system
# Project by: Task Force
This repository contains a desktop-based Airline Reservation System developed using Java, Swing, and JDBC. The application follows Object-Oriented Programming (OOP) principles to provide a modular and scalable solution for managing flight bookings and passenger records.
## Group Details: Task Force
        • Member 1: YASH JANGIR 590014858
        • Member 2: PARTH CHOUDHARY 590016913
        • Member 3: DUSHYANT SINGH 590012592
        • Member 4: SOHAM SHARMA 590017041
        • Member 5: ANUJ PANDEY 590017258
## Project Overview
This project simulates a real-world airline management backend with a user-friendly Graphical User Interface (GUI). It utilizes a relational database to persist data, ensuring that flight schedules and passenger information are stored securely beyond a single session.
## Key Features
### 🔹 Passenger Module (Swing GUI)
       • Search Flights: Locate available flights by querying the database for specific origins and destinations.
       • Seat Reservation: Interactive seat selection for different classes (Economy, Business, First Class).
       • Ticket Generation: View and print a digital summary of the booking.
       • Cancellations: Cancel existing reservations with automated updates to the database inventory.
### 🔹 Admin Module
        • Flight Management: Add, update, or remove flight schedules directly in the database.
        • Passenger Logs: Retrieve and display a list of all passengers for any specific flight.
        • Revenue Tracking: Calculate earnings based on historical booking data stored via JDBC.
## OOP & Technical Implementation
### 1.	Encapsulation: 
Private data members in classes like Passenger and Flight are accessed through public getters and setters to maintain data integrity.
### 2.	Inheritance: 
A parent User class is extended by Passenger and Admin to share authentication logic.
### 3.	JDBC Integration: 
Uses PreparedStatement for secure SQL queries to prevent SQL injection while managing flight and user data.
### 4.	Swing UI: 
Built using JFrame, JPanel, and JButton components to create a responsive desktop experience.
## System Architecture
        1. Flight.java: Represents flight entities (ID, Source, Destination, Capacity).
        2• DatabaseConnection.java: Handles the JDBC driver and connection string logic.
        3• BookingSystem.java: The core controller linking the Swing GUI actions to the database.
        4• MainFrame.java: The primary entry point for the Swing application.
## Tech Stack
        • Language: Java (JDK 17+)
        • GUI Toolkit: Java Swing
        • Database: MySQL / PostgreSQL / Oracle (via JDBC)
