

# RideWave

RideWave is a ride-sharing application similar to Uber, designed to provide seamless and efficient transportation services. Built using **Spring Boot**, **ReactJS**, and **PostgreSQL**, RideWave aims to connect riders with drivers through an intuitive and user-friendly interface.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features
- **User Authentication** – Secure login and registration.
- **Ride Booking** – Request rides with ease and track them in real-time.
- **Driver Interface** – Drivers can accept and manage ride requests.
- **Admin Panel** – Admins can manage users, rides, and drivers.
- **Payment Integration** – Simplified ride fare calculation and payment process.
- **Live Tracking** – Real-time tracking of rides.
- **Responsive Design** – Fully functional on mobile and desktop.

## Technologies Used
- **Frontend**: ReactJS, HTML5, CSS3, Bootstrap
- **Backend**: Spring Boot
- **Database**: PostgreSQL
- **Tools**: Postman, Git, GitHub, Firebase (for authentication), Docker

## Installation

### Prerequisites
- Java 11 or higher
- Spring boot
- PostgreSQL
- Maven
- Git

### Setup
1. **Clone the repository**
   ```bash
   git clone https://github.com/sachinaryan912/ridewave.git
   ```
2. **Backend Setup**
   ```bash
   cd ridewave/backend
   mvn spring-boot:run
   ```
3. **Frontend Setup**
   ```bash
   cd ridewave/frontend
   npm install
   npm start
   ```
4. **Database Configuration**
   - Configure PostgreSQL with the necessary schema provided in `ridewave/backend/resources/schema.sql`.

## Usage
- Access the application by visiting `http://localhost:3000` for the frontend.
- Backend API runs on `http://localhost:8080`.
- Register as a user or driver and start booking or accepting rides.

## Contributing
Contributions are welcome! Feel free to submit a pull request or report issues.

### How to Contribute
1. Fork the project.
2. Create your feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

### Contact
For any questions or feedback, feel free to reach out to:
- **GitHub**: [sachinaryan912](https://github.com/sachinaryan912)
- **Email**: [sachinsachu1998.ss@gmail.com]  

Happy Riding! 🚗

