# TicketfareCalculatingServlet

# Introduction
The TicketfareCalculating is a web-based project designed to calculate travel fares based on user input.The application includes user authentication, user registration, login and allow user to select journey details to compute the fare. The computed fare then displayed on a ticket-like interface. The project uses Java Servlets, JSps, Hibernate for ORM, and PostgreSQL for database management.

#Project Structure

                MyWebApp/
                |
                |----src/main/java
                |       |-----entity
                |             |----User.java
                |     |----model
                |             |----RegistrationServlet.java
                |             |----LoginServlet.java
                |             |----CalculateFare.java
                |     |----utility
                |             |----HibernateUtility..java
                |-----src/main/webapp
                |       |----WEB-INF
                |              |----web.xml
                |------index.jsp
                |------Registration.html
                |------Login.html
                |------Journey.html
                |------PrintTicket.jsp

## Files and Directories
* Registration.html : The registration page where new users enter their credentials.

* Login.html : The login page where user enter theeir credentials.

* RegistrationServlet.java : A servlete that handles user regsitration.

* LoginServlet.java : A servlet that handles user authentication.

* Journey.html: A html page where authenticated user enter their journey details.

* CalculateFareServlet.java : A servlet that calculates fare based on user inputs and forward the request to the PrintTicket page.

* PrintTicket.jsp : A jsp page that displays the calculated fare and journey details.

* HibernateUtility.java : A utility class for setting up Hibernate session.

* web.xml : The deployment descriptor file that maps the servlets to specific URls.

## Dependencies 
Add the followig dependencies to your project: 

* PostgreSQL : For database connectivity.

* Hibernate Core Relocation : For ORM (Object Relational Mapping).

* Servlet API : For handling HTTP request and responses.

## Database Setup

1 PostgreSQL Database : Create a PostgreSQL database named farecalculator.

2.Hibernate Configuration : by adding persistence inside

                     |------ myWebApp
                     |        |--------src/main/resource
                     |                   |---META-INF
                     |                          |------Persistence.xml

## User Registration
* Registration Page: A form where new users can register by providing a username, password, and email.

* Registration Servlet: Handles the registration form submission, saves user data in the database using Hibernate.

## User Login

* Login Page: A form where users enter their credentials.

* Login Servlet: Validates the user credentials against the database. If valid, redirects to the journey details page; otherwise, shows an error message.

## Journey Details

* welcome.jsp: A form where users enter the journey details including starting station, destination station, and journey type (one-way or return).

## Fare Calculation

* Fare Calculator Servlet: Calculates the fare based on the journey details entered by the user. The fare is then forwarded to the ticket display page.

## Ticket Display

* printTicket.jsp: Displays the journey details and the calculated fare in a ticket format.

## Configuration Files

* web.xml: Maps the servlets to specific URLs and configures session management.

### Summary

1.Dependencies: Ensure necessary dependencies for PostgreSQL, Hibernate, and Servlet API are included.

2.Database Setup: Create a PostgreSQL database and the required tables.

3.Hibernate Configuration: Set up Hibernate for database interaction.

4.User Registration: Implement user registration and data storage in the database.

5.User Login: Implement user login and credential validation.

6.Journey Details: Collect journey details from the user.

7.Fare Calculation: Calculate and display the fare based on journey details.

This overview provides a clear structure and functionality breakdown of the Fare Calculator Web Application project. It guides users through setting up the project, adding necessary dependencies, and understanding the flow of user registration, authentication, and fare calculation.

  
