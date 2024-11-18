# **Simple Restaurant Menu Management Application**

## **Project Description**  
This is a Java-based application designed to assist with restaurant menu management. With simple CRUD features, the application allows users to:  
- **Add Menu Items**:  
  - Regular Menu (code, name, price).  
  - Special Menu (with additional discount).  
- **View All Menu Items**:  
  - Display a list of regular and special menus in an organized format, including discount details for special menus.  
- **Delete Menu Items**:  
  - Remove menu items using their unique code.  

This project leverages **Object-Oriented Programming (OOP)** concepts such as abstraction, polymorphism, and interfaces.

---

## **Key Features**  
1. **Abstraction & Polymorphism**  
   - Utilizes the abstract class `MenuItem` to model generic menu items.  
   - Implements polymorphism to handle specific details for regular and special menus.  
2. **Interface `Discountable`**  
   - Applies the discount feature for special menu items.  
3. **Input Validation**  
   - Ensures entered data (menu code, name, price, discount) adheres to defined rules.  
4. **Dynamic Data Structure**  
   - Uses `ArrayList` to store menu data, allowing flexible additions and deletions.  
5. **Text-Based Interaction**  
   - Uses **Scanner** to process user input for CRUD operations (Create, Read, Update, Delete).  

---

## **Technologies Used**  
- **Programming Language:** Java  
- **Programming Paradigm:** OOP (Object-Oriented Programming)  

---

## **How to Run the Project**  
1. **Clone the Repository**  
   ```bash
   git clone https://github.com/username/repository-name.git
   cd repository-name
   ```
2. **Compile the Program**  
   Ensure you have the latest **JDK** installed.  
   ```bash
   javac Main.java
   ```
3. **Run the Program**  
   ```bash
   java Main
   ```

---

## **Sample Output**  
Here’s an example of what the application looks like when running:  

```
===== Restaurant Menu Management =====
1. Add Menu
2. View All Menus
3. Delete Menu
4. Exit
Choose an option: 
```

---

## **Project Structure**  
```
.
├── src/
│   ├── Main.java
│   ├── MenuItem.java
│   ├── RegularMenu.java
│   ├── SpecialMenu.java
│   └── Discountable.java
├── README.md
```

---

## **Future Enhancements**  
- **Database Integration**  
  - Store data permanently in databases like MySQL or PostgreSQL.  
- **Graphical User Interface (GUI)**  
  - Improve user experience using **JavaFX** or **Swing**.  
- **Reporting Features**  
  - Generate reports such as total revenue and the number of sold menu items.  
