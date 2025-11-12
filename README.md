# Student Management System

A console-based application built in Java that provides an authenticated user interface and allows management of student records (add, delete, modify, search, sort, report). This project uses `ArrayList` to store student entities and `HashMap` for user authentication.

## 🧩 Project Overview  
- Authentication: user credentials stored in a `HashMap<String, String>` (username → password).  
- Data Storage: students are held in an `ArrayList<Student>` during runtime.  
- Menu driven: After login, the user is presented with a menu of operations: Add Student, Delete Student, Modify Student, Search Student, Sort Student List, Generate Report, Exit.  
- Merged classes: While initially separate classes handled each operation, the final design merges them into a single class structure with modular methods for simplicity.

## 🔧 Technologies & Concepts  
- Java (core)  
- Collections: `ArrayList`, `HashMap`  
- Console I/O with `Scanner`  
- Object-Oriented Design: `Student` entity class, methods for each operation  
- Basic authentication using collections  
- Developed and tested in Eclipse IDE

## ✨ Key Features  
- Login authentication (with limited attempts)  
- Menu-based user interface in console  
- Full CRUD-like operations on student list (in memory)  
  - Add new student  
  - Delete existing student  
  - Modify student details  
  - Search for student(s)  
  - Sort list of students  
  - Generate report of all students  
- Simple, maintainable code structure

## 🚀 Getting Started  
### Prerequisites  
- Java JDK installed  
- Eclipse IDE (or any Java-capable IDE)  
- (Optional) MySQL if you enhance persistence later

### Setup & Run  
1. Clone or download this repository.  
2. Open Eclipse → File → Import → Existing Projects into Workspace → select project folder.  
3. Ensure Java build path is correct.  
4. Run the main class (e.g., `developer_Main.java`).  
5. On prompt, enter the username & password (default: `Kali` / `Kalilinux`).  
6. After login, choose menu operations by entering the corresponding number.

## 📂 Project Structure  
```
src/
  ├─ Login_Auth.java       // handles login and menu loop  
  ├─ Student_Entity.java   // model class representing a student  
  ├─ AddStudent.java       // method(s) to add students  
  ├─ DeleteStudent.java    // method(s) to delete students  
  ├─ ModifyStudent.java    // method(s) to modify student details  
  ├─ SearchStudent.java    // method(s) to search students  
  ├─ SortStudent.java      // method(s) to sort the ArrayList  
  ├─ ReportStudent.java    // method(s) to generate/print report  
  └─ ShowMenu.java         // displays the menu and reads user choice
  __ developermain.java   // it has the created object of authentication and calling login method ()  
```

## 🔍 Future Enhancements  
- Persist student data into MySQL instead of only in memory.  
- Add user roles (Admin vs User) with different permissions.  
- Create GUI or web interface (using JSP/Servlet or Spring Boot) instead of console.  
- Improve authentication (hash passwords, lockouts, new user registration).  
- Add unit tests for each operation (JUnit).  
- Export reports to file (CSV / PDF).

## 👤 Author  
Dushet Hambir – Full Stack Java Developer  
Panvel, Mumbai, Maharashtra  
Email: hambirdushet9@gmail.com  

## 📄 License  
This project is open-source under the MIT License (or your chosen license). See the `LICENSE` file for details.

