🌍 Country-State-City API

A Spring Boot REST API that provides hierarchical location data (countries, states, and cities) with MySQL database integration.
🚀 Features

    Hierarchical Data: Retrieve countries, states, and cities in a nested structure

    Parameter-based Filtering:

        No parameters → All countries

        Country parameter → States of that country

        Country + State parameters → Cities of that state

    MySQL Integration: Persistent data storage with JPA

    RESTful Design: Clean API endpoints following REST principles

📦 Technologies Used

    Java 17

    Spring Boot 3.5

    Spring Data JPA

    MySQL Database

    Maven

    Lombok

🗄️ Database Schema
sql

countries (id, name)
states (id, name, country_id)
cities (id, name, state_id)

🔌 API Endpoints
Get Locations
text

GET /api/locations

Parameters:

    country (optional) - Filter by country name

    state (optional) - Filter by state name (requires country parameter)

Examples:

    Get all countries:
    bash

GET http://localhost:8080/api/locations

Get states of a country:
bash

GET http://localhost:8080/api/locations?country=United States

Get cities of a state:
bash

GET http://localhost:8080/api/locations?country=United States&state=California

Sample Responses:
json

// All countries
[
  {"id": 1, "name": "United States"},
  {"id": 2, "name": "India"},
  {"id": 3, "name": "Canada"}
]

// States of United States
[
  {"id": 1, "name": "California"},
  {"id": 2, "name": "Texas"},
  {"id": 3, "name": "New York"}
]

// Cities of California
[
  {"id": 1, "name": "Los Angeles"},
  {"id": 2, "name": "San Francisco"},
  {"id": 3, "name": "San Diego"}
]

🛠️ Installation & Setup
Prerequisites

    Java 17 or higher

    MySQL 5.7+ or MySQL 8.0

    Maven 3.6+

1. Clone the Repository
bash

git clone https://github.com/your-username/country-state-city-api.git
cd country-state-city-api

2. Configure Database

Create MySQL database:
sql

CREATE DATABASE location_db;

3. Update Application Properties

Edit src/main/resources/application.properties:
properties

spring.datasource.url=jdbc:mysql://localhost:3306/location_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4. Build and Run
bash

# Using Maven
mvn clean install
mvn spring-boot:run

# Or run directly
java -jar target/demo-0.0.1-SNAPSHOT.jar

The API will be available at: http://localhost:8080
📁 Project Structure
text

src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── controller/
│   │       │   └── LocationController.java
│   │       ├── model/
│   │       │   ├── Country.java
│   │       │   ├── State.java
│   │       │   └── City.java
│   │       ├── repository/
│   │       │   ├── CountryRepository.java
│   │       │   ├── StateRepository.java
│   │       │   └── CityRepository.java
│   │       ├── service/
│   │       │   ├── LocationService.java
│   │       │   └── LocationServiceImpl.java
│   │       └── DemoApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql

🧪 Testing the API

Use curl, Postman, or any HTTP client:
bash

# Test all endpoints
curl "http://localhost:8080/api/locations"
curl "http://localhost:8080/api/locations?country=United%20States"
curl "http://localhost:8080/api/locations?country=United%20States&state=California"

🔧 Configuration Options
Database Initialization
properties

# For development - recreates schema on restart
spring.jpa.hibernate.ddl-auto=create-drop

# For production - preserves data
spring.jpa.hibernate.ddl-auto=update

Sample Data

The application includes sample data for:

    Countries: United States, India, Canada

    States: California, Texas, New York, Maharashtra, etc.

    Cities: Los Angeles, San Francisco, Mumbai, Bangalore, etc.

## 🐛 Troubleshooting

### Common Issues:

1. **Database Connection Error**
   - Verify MySQL is running
   - Check credentials in `application.properties`

2. **Port Already in Use**
   - Change port in `application.properties`: `server.port=8081`

3. **Data Not Loading**
   - Check `spring.jpa.hibernate.ddl-auto` setting
   - Verify `data.sql` is in `src/main/resources/`

🤝 Contributing

    Fork the project

    Create your feature branch (git checkout -b feature/AmazingFeature)

    Commit your changes (git commit -m 'Add some AmazingFeature')

    Push to the branch (git push origin feature/AmazingFeature)

    Open a Pull Request

📝 License

This project is licensed under the MIT License - see the LICENSE.md file for details.
🆘 Support

If you have any questions or issues, please open an issue on GitHub or contact the development team.

⭐ Star this repo if you found it useful!
