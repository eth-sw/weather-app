# Weather App README

## Overview

The Weather App is a Java-based application with a graphical user interface (GUI) that provides users with current weather conditions for a specified location. The program utilizes the Java Swing library for creating the GUI and relies on external APIs for geocoding and weather data retrieval.

## Features

- **Location-based Weather Information:** Users can input a location, and the application fetches and displays real-time weather data, including temperature, humidity, wind speed, and weather condition.

- **Intuitive GUI:** The graphical user interface is designed using Java Swing, offering a user-friendly experience with a text input field, search button, and visual representation of weather conditions.

- **API Integration:** The application integrates with external APIs for geocoding and weather data, ensuring accurate and up-to-date information.

## Getting Started

1. **Prerequisites:**
   - Ensure you have Java installed on your machine.
   - The program utilizes external APIs, so an internet connection is required.

2. **Running the Application:**
   - Execute the `AppLauncher` class to launch the Weather App GUI.
   - Enter the desired location in the text field and click the search button to retrieve weather information.

3. **Testing:**
   - Additional testing functionalities are available in the `AppLauncher` class (commented lines) for checking geocoding data and current time retrieval.

## Dependencies

- Java Swing: Used for creating the graphical user interface.
- JSON Simple: A Java library for parsing JSON data, used for handling API responses.

## API References

- [Open Meteo API](https://open-meteo.com/): Utilized for retrieving weather data.
- [Open Meteo Geocoding API](https://open-meteo.com/): Utilized for converting location names to geographical coordinates.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
