
# Self-Assessment

Completing the Computer Science program and building this ePortfolio has allowed me to showcase my strengths, refine my professional goals, and prepare for a career in the tech industry. Through hands on projects and coursework, I’ve developed a solid foundation in software engineering, data structures, databases, and security all critical areas in today’s job market.

Team collaboration and stakeholder communication were key parts of my learning experience in my courses throughout my program. I’ve also grown confident in presenting technical concepts to both technical and non technical audiences.

My technical strengths include optimizing algorithms, writing scalable code, and building secure database systems. For example, I improved performance in a Java based contact manager by switching from an ArrayList to a HashMap. In a separate Python project, I enhanced a MongoDBbased animal shelter system with indexing, aggregation pipelines, and role based access control.

The artifacts in this portfolio reflect my ability to analyze, enhance, and implement real world applications using industry best practices. They demonstrate how my skills in software development, data handling, and system security come together to solve practical problems efficiently and effectively.

With this foundation, I’m confident in my ability to contribute to development teams and grow as a professional in the computer science field.

# Informal Code Review

## Summary

My code review video includes two software artifacts: ContactService.java and AnimalShelter.py. I review each artifact individually to identify design issues, performance inefficiencies, and opportunities for enhancement. During the walkthrough of each artifact, I explain my plans for improvement and how these align with industry best practices. For the engineering and design, as well as algorithms and data structures topics, I analyze and demonstrate enhancements in ContactService.java using Java. For the database topic, I showcase AnimalShelter.py in Python. Throughout the video, I apply clear, professional, and technically sound oral, visual, and written communication strategies to present a coherent and accessible code review experience suitable for a professional or academic audience. My review centers around three essential aspects:

## Existing Functionality:
I begin by walking through the current structure and functionality of each code artifact. For ContactService.java, I explain how contacts are managed using an ArrayList, highlighting its limitations. For AnimalShelter.py, I cover how it currently supports basic CRUD operations using MongoDB.

## Code Analysis:
I identify areas for improvement, such as repeated logic, inefficient data structures, minimal error handling, and limited scalability. In ContactService.java, I point out opportunities to refactor methods for better modularity and to improve lookup efficiency by replacing the ArrayList with a HashMap. In AnimalShelter.py, I emphasize the need for comprehensive error handling, full CRUD coverage, and optimizations like indexing and aggregation pipelines.

## Enhancements:
I describe and demonstrate planned enhancements. In ContactService.java, I break down larger methods, apply the Single Responsibility Principle, and switch to a HashMap for better performance. In AnimalShelter.py, I add update and delete operations, improve error handling by catching specific exceptions, implement indexing for commonly queried fields, integrate aggregation pipelines for reporting, and introduce user authentication and role-based access control to secure data access.

By implementing these enhancements, both artifacts are transformed into more efficient, scalable, and secure systems, prepared for real world application in production environments.

## Code View Video

[![CS499 Capstone Code Review](https://img.youtube.com/vi/pZlWwK_YXGA/0.jpg)](https://www.youtube.com/watch?v=pZlWwK_YXGA)

## Enhancement One - Software Design And Engineering

### Artifact: 

The artifact is a Contact Management System written in Java. It allows users to manage contacts by performing CRUD (Create, Read, Update, Delete) operations. Initially created as part of the CS320 course that I participated in around a year ago, the system is focused on testing and ensuring correct behavior. The original version was functional but lacked robust input validation, error handling, and efficiency improvements. The artifact here is the original code and its enhanced version after applying modifications to improve its modularity, validation, and overall efficiency. 

 

### Justification for Inclusion: 

This artifact showcases my skills in software development, particularly in the following areas: 

**Modular design:** The refactored code is more modular, with helper functions for validation and error handling, which enhances code maintainability and readability. 

**Validation and error handling:** The improved code introduces thorough validation of input data and proper exception handling, making the system more robust. 

**Performance improvement:** Although the original code uses ArrayList to store contacts, the refactored version focuses on improving data validation and streamlining the processes to make the system more efficient. 

I selected this artifact because it allowed me to apply real world best practices to a project and improve its functionality, aligning with the objectives of testing, validation, and modular design. 

 

### Specific Components Showcasing Skills: 

**Modularity:** The creation of helper functions like isValidName, isValidPhoneNumber, and validateContact refactors the larger methods, making the code cleaner and easier to manage. 

**Input Validation:** The original code lacked input validation, but I introduced checks to ensure contact details meet specific criteria, ensuring more reliable data input. 

**Error Handling:** The use of specific exception messages enhances the clarity of error responses, helping developers and users better understand what went wrong. 

**Efficiency Improvement:** The validation and error handling are improvements that will make the system more stable in its current form. 

 

### Course Outcome Coverage: 

I successfully met the course outcomes related to software design, particularly: 

**Course Outcome 3:** I designed and evaluated computing solutions that improved the original system through algorithmic improvements such as validation and a more robust structure. 

**Course Outcome 4:** I demonstrated my ability to use techniques and tools like validation functions and helper methods to improve the system's functionality and ensure it works reliably in a real-world scenario. 

 

### Reflection on the Enhancement Process: 

The enhancement process provided valuable learning opportunities: 

**Validation and Testing:** I realized the importance of thorough validation to ensure that input data adheres to expected formats, which helps prevent runtime errors and data corruption. 

**Modularization:** Breaking down large functions into smaller, focused ones helped me understand solid design principles, particularly Single Responsibility. This not only made the code easier to read but also easier to test. 

**Challenges:** A significant challenge was ensuring that all validation checks were comprehensive while avoiding overly complex logic. It’s also been a bit since I’ve fully sat down and worked with java in quite a time, so I had to remind myself of certain things about the language. 

[Contact Service Original](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20One%20Collection%20-%20Software%20Design%20And%20Engineering/ContactService%20(Original).java)

[Contact Service Revisited](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20One%20Collection%20-%20Software%20Design%20And%20Engineering/ContactService%20(Revisited).java)

## Enhancement Two - Algorithms and Data Structure

The ContactService.java file is a Java class that provides basic functionality for managing a list of contacts, including operations to add, update, delete, and retrieve contact information. It was originally created in an earlier course in my Computer Science program and later enhanced during the Spring 2025 term as part of CS499. The enhanced version transitioned to using a HashMap, significantly improving performance by enabling constant-time lookups, updates, and deletions based on contact IDs. This work was completed during a software development course focused on object-oriented design and data structures. 

This artifact was chosen for my ePortfolio because it showcases my growth as a developer, particularly in understanding and applying core programming concepts such as object-oriented principles, data validation, and efficient data management. The most significant change in the enhancement was the move from an ArrayList to a HashMap, which demonstrates my ability to evaluate and improve the performance of my code. The enhanced version also includes clearer exception handling and more robust validation logic, making the code more maintainable and reliable. 

Through enhancing this artifact, I developed a deeper understanding of how different data structures affect the performance and scalability of applications. The challenge of maintaining consistent functionality while refactoring core logic required close attention to detail and rigorous testing. Peer and instructor feedback played a key role in shaping the final version as I received feedback that I had the clear to continue which helped my resolve. I learned how to refactor code thoughtfully and how to implement enhancements that make a real impact on usability and performance. 

This artifact demonstrates my ability to write efficient, clean, and scalable code. It reflects several course outcomes including the use of object-oriented techniques, implementation of robust validation and exception handling, and performance optimization through proper data structure selection. 

[ContactService Original V2 Enhancement 2](https://github.com/SVLemus/ePortfolio/blob/main/Enchantment%20Two%20Collection%20-%20Algorithms%20and%20Data%20Structure/ContactService%20(Revisited).java)

[ContactService Revisited V2 Enhancement 2](https://github.com/SVLemus/ePortfolio/blob/main/Enchantment%20Two%20Collection%20-%20Algorithms%20and%20Data%20Structure/ContactService%20Revisited%20Enhancement%202.java)

## Enhancement Three - Databases

The AnimalShelter.py module is a Python based backend system designed to manage animal data using MongoDB. Originally developed during my CS 340: Data Structures and Database course, the artifact provided basic functionality for inserting and querying animal records. In April 2025, I revisited and enhanced the script to demonstrate more advanced database concepts and backend development practices for inclusion in my ePortfolio. 

This artifact represents my growing ability to design and implement scalable, secure, and maintainable software. The enhanced version introduces several meaningful upgrades: role-based access control for sensitive operations, an aggregation pipeline to gather breed statistics, index creation for improved query performance, and a simple authentication system for users. These additions not only improved the application's real-world viability but also showcased my ability to apply practical database enhancements and enforce security measures within the backend. 

Throughout the enhancement process, I deepened my understanding of MongoDB beyond basic CRUD operations. Implementing the aggregation pipeline allowed me to analyze shelter data, while adding index creation demonstrated my ability to optimize performance at scale. Designing role-based access controls introduced security concepts into the project, ensuring that only users with admin privileges could modify or delete records. This also helped simulate a multi-user environment, reflecting professional backend development practices. 

I faced several challenges along the way, including managing exceptions gracefully across various MongoDB operations, enforcing access control without overcomplicating the logic, and ensuring data validation. To overcome these issues, I reviewed documentation, followed MongoDB’s best practices, and conducted extensive testing. Although I worked independently, I drew from previous project feedback and emphasized writing robust, secure, and modular code. 

This artifact reflects proficiency in key areas of software development. It meets the outcomes for Software Design and Engineering through structured, maintainable code and defensive programming techniques. The use of MongoDB’s aggregation and indexing features demonstrates competency in Databases and Algorithms and Data Structures. While the project does not include a front-end component, it provides a solid foundation for back-end services and could be extended into a full-stack application. 

Enhancing this artifact allowed me to bridge classroom knowledge with real-world application, reinforcing my confidence in working with databases, implementing access control, and writing secure, production-quality code. 

[AnimalShelter.py](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20Three%20Collection%20-%20Databases/AnimalShelter.py)

[AnimalShelter.py - Revisited](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20Three%20Collection%20-%20Databases/AnimalShelter%20-%20Revisited.py)
