

---

# 🛒 Ecommerce Backend Project

This is a Spring Boot-based backend for an e-commerce application. It provides RESTful APIs for managing users, products, orders, payments, authentication, and admin functionalities. MongoDB is used for data storage.

---

## 🔧 Tech Stack

- **Backend Framework:** Spring Boot
- **Database:** MongoDB
- **Build Tool:** Maven
- **Language:** Java 17+

---

## 📁 Project Structure

EcommerceBackendProject/ ├── controller/         # REST controllers (Admin, User, Product, Order, etc.) ├── model/              # Data models (Product, User, Order, etc.) ├── repository/         # MongoDB repositories ├── service/            # Business logic layer ├── exception/          # Custom exception handling ├── dto/                # Data Transfer Objects ├── config/             # JWT Security configurations ├── resources/ │   ├── application.properties └── EcommerceBackendProjectApplication.java

---

## 🚀 Features
- 🛍️ Product CRUD operations (Admin
- 📄 Global exception handling
- 📦 MongoDB integration

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Maven
- MongoDB (running locally or cloud)

### Setup Instructions

```bash
# Clone the repository
git clone https://github.com/dheemanthreddym/EcommerceBackendProject.git
cd EcommerceBackendProject

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

The backend will start on http://localhost:8080.


---

📬 API Endpoints (Sample)

Endpoint	Method	Description

/api/auth/register	POST	Register a new user
/api/auth/login	POST	User/Admin login (returns JWT)
/api/admin/products	POST	Add a product (Admin only)
/api/products	GET	List all products
/api/orders	POST	Place a new order
/api/user/orders	GET	View user’s orders


> Use the JWT token in the Authorization header for protected routes:



Authorization: Bearer <your-token-here>


---

🛡️ Security

JWT-based stateless authentication

Role-based access for /admin/** endpoints



---

📷 Sample JSON Payloads

Register

{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "securepass"
}

Login

{
  "email": "john@example.com",
  "password": "securepass"
}




---

🤝 Contribution

Contributions are welcome! Please fork the repository and submit a pull request.


---

📄 License

This project is open source and available under the MIT License.


---

👤 Author

Dheemanth Reddy
GitHub: @dheemanthreddym


---

⭐ Support

If you find this project useful, please give it a ⭐ on GitHub to support the work!



