# 🛒 E-Commerce Web Application

A full-stack **E-Commerce Web Application** developed using **Spring Boot**, **Spring MVC**, **Spring Security**, **Thymeleaf**, and **MySQL**. The application provides a seamless online shopping experience with secure user authentication, product management, shopping cart functionality, and order processing.

This project was built to strengthen my understanding of Java Full Stack Development, RESTful architecture, Spring Security, database integration, and MVC design principles.

---

## 🚀 Features

### 👤 User Features
- User Registration and Login
- Secure Authentication using Spring Security
- Browse Products
- View Product Details
- Add Products to Cart
- Update Cart Quantity
- Remove Items from Cart
- Place Orders
- View Order History
- Responsive User Interface

### 👨‍💼 Admin Features
- Admin Dashboard
- Add New Products
- Update Product Details
- Delete Products
- Manage Categories
- Manage Users
- Manage Orders

---

## 🛠 Tech Stack

### Frontend
- HTML5
- CSS3
- JavaScript
- Thymeleaf

### Backend
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA (Hibernate)
- REST APIs

### Database
- MySQL

### Build Tool
- Maven

### Tools & IDE
- IntelliJ IDEA
- VS Code
- Git
- GitHub
- Postman

---

## 📂 Project Structure

```text
Ecommerce/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ecommerce/
│   │   │           ├── config/
│   │   │           ├── controller/
│   │   │           ├── dto/
│   │   │           ├── entity/
│   │   │           ├── exception/
│   │   │           ├── repository/
│   │   │           ├── security/
│   │   │           ├── service/
│   │   │           │   └── impl/
│   │   │           ├── util/
│   │   │           └── EcommerceApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   ├── js/
│   │       │   └── images/
│   │       ├── templates/
│   │       │   ├── admin/
│   │       │   ├── auth/
│   │       │   ├── cart/
│   │       │   ├── order/
│   │       │   ├── product/
│   │       │   └── index.html
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│
├── target/
├── pom.xml
├── mvnw
├── mvnw.cmd
├── README.md
└── .gitignore
```
---

## ⚙️ Installation

### Prerequisites

- Java 17 or above
- Maven
- MySQL
- IntelliJ IDEA / VS Code

---

## 📥 Clone the Repository

```bash
git clone https://github.com/Surajkumarx077/Ecommerce.git
```

Move into the project directory

```bash
cd Ecommerce
```

---

## 🗄 Configure Database

Create a MySQL database.

```sql
CREATE DATABASE ecommerce_db;
```

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ Run the Project

Using Maven

```bash
mvn spring-boot:run
```

Or

```bash
mvn clean install
```

Run the generated JAR

```bash
java -jar target/ecommerce.jar
```

---

## 🌐 Access the Application

```text
http://localhost:8080
```


## 🧩 Modules

- Authentication Module
- User Module
- Product Module
- Category Module
- Shopping Cart Module
- Order Module
- Admin Module

---

## 📊 Database

Main Entities

- User
- Role
- Product
- Category
- Cart
- Cart Item
- Order
- Order Item

---

## 🔒 Security

- Spring Security Authentication
- Role-Based Authorization
- Password Encryption
- Session Management

---

## 📈 Future Enhancements

- Payment Gateway Integration (Stripe/Razorpay)
- Email Notifications
- Wishlist
- Product Reviews & Ratings
- Search & Filtering
- Order Tracking
- Invoice Generation
- Docker Deployment
- AWS EC2 Deployment
- CI/CD with Jenkins

---

## 📚 Learning Outcomes

Through this project, I gained hands-on experience with:

- Spring Boot
- Spring MVC
- Spring Security
- Hibernate / JPA
- MySQL
- Thymeleaf
- REST APIs
- MVC Architecture
- CRUD Operations
- Authentication & Authorization
- Git & GitHub
- Backend Development Best Practices

---

## 👨‍💻 Author

**Suraj Kumar**

📧 Email: surajkumarx077@gmail.com

🔗 GitHub: https://github.com/Surajkumarx077

🔗 LinkedIn: https://www.linkedin.com/in/suraj-kumar077/

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.

---

This project is created for educational and portfolio purposes.
