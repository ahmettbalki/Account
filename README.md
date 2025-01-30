# Account API For Existing Customer  
**Spring Boot Application**  

This project provides an API for creating a new account for **existing customers**.

---

## **Overview**  
This project contains an API that enables the creation of a **new account** for **existing customers**.

---

## **Requirements**  
- ✅ The API provides an endpoint containing **customer information** (**customerID, initialCredit**).  
- ✅ When the endpoint is called, a **new account** is created for the customer with the given **customerID**.  
- ✅ If **initialCredit** is not zero, a **transaction record** is added to the account.  
- ✅ Another endpoint retrieves **customer information** (**Name, Surname, Balance, and Account Transactions**).

---

## **API Endpoints**  

🔹 **Account API**  
🔹 **Customer API**  

| Method | Endpoint | Description |
|--------|-------------|-----------|
| **POST** | `/v1/account` | Creates a new account for the existing customer. |
| **GET** | `/v1/customer/{customerId}` | Retrieves the customer information for the specified customer ID. |
| **GET** | `/v1/customer` | Lists all customers. |

---

## **Technologies Used**  
- **Java 21**  
- **Spring Boot**  
- **Spring Data JPA**  
- **Kotlin**  
- **RESTful API**    
- **Docker & Docker Compose**  

---

## **Prerequisites**  
- 📌 **Maven**  
- 📌 **Docker**  
