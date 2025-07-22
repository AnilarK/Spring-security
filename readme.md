<h1 align="center">Spring Boot Security Demo</h1>
<h3 align="center">A practical demonstration of implementing Spring Security in a Spring Boot application with user registration, password hashing, and secured REST APIs.</h3>

---

- 🔭 This project showcases **secure backend development** using Spring Boot.
- 💬 Ask me about **Java, Spring Boot, Spring Security, REST APIs, and JPA**.
- 🌱 I’m currently expanding my knowledge in **microservices and cloud-native technologies**.
- 📫 How to reach me: **abhayanilark@gmail.com**
- 🧠 Fun fact: I enjoy building robust and scalable backend systems!

---

### 💼 Project Details

<table>
  <tr>
    <td><b>🔐 Spring Boot Security Demo</b></td>
    <td>
      A comprehensive example of a secure Spring Boot application.
      <br/>
      🔹 <b>Features:</b>
      <ul>
        <li>User registration with BCrypt password encoding.</li>
        <li>Stateless session management, ideal for REST APIs.</li>
        <li>Custom <code>UserDetailsService</code> for database authentication.</li>
        <li>Secured endpoints requiring authentication.</li>
        <li>CSRF token generation endpoint.</li>
      </ul>
      🔗 <a href="https://github.com/AnilarK/spring-security" target="_blank">GitHub Repository</a>
    </td>
  </tr>
</table>

---

### 🛠️ Technologies Used

- **Languages & Frameworks:** Java 21, Spring Boot 3.4.3, Spring Security, Spring Data JPA
- **Database:** PostgreSQL
- **Authentication:** BCrypt Password Hashing, JWT (jjwt-api, jjwt-impl, jjwt-jackson)
- **Build Tool:** Maven
- **API:** RESTful Web Services

---

### 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

#### Prerequisites

- Java JDK 21 or later
- Maven
- A running instance of PostgreSQL

#### Installation

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/AnilarK/spring-security.git](https://github.com/AnilarK/spring-security.git)
    ```
2.  **Configure your database:**
    Update `src/main/resources/application.properties` with your PostgreSQL credentials.
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/SpringSecurity
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```
3.  **Run the application:**
    ```sh
    ./mvnw spring-boot:run
    ```
    The application will be accessible at `http://localhost:8085`.

---

### 📡 API Endpoints

| Method | Endpoint        | Description                                  | Security      |
| :----- | :-------------- | :------------------------------------------- | :------------ |
| `POST` | `/register`     | Register a new user.                      | Public        |
| `GET`  | `/students`     | Get a list of all students.                | Authenticated |
| `POST` | `/students`     | Add a new student to the list.             | Authenticated |
| `GET`  | `/csrf-token`   | Get a Cross-Site Request Forgery (CSRF) token. | Authenticated |
| `GET`  | `/`             | A simple greeting endpoint.                   | Authenticated |
