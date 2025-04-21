# ePortfolio



## Self-Assessment

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

The ContactService.java file is a Java class that provides basic functionality for managing a list of contacts, including operations to add, update, delete, and retrieve contact information. It was originally created in an earlier course in my Computer Science program and later enhanced during the Spring 2025 term as part of CS499. This artifact demonstrates essential object-oriented programming principles, including encapsulation, modularity, and method abstraction.

I selected this artifact for my ePortfolio because it reflects my growth in software design and engineering. While the original version of the class met functional requirements, it lacked robustness and proper input validation. Enhancing the artifact allowed me to demonstrate the application of core design principles such as single responsibility and clean code practices. By introducing helper methods like isValidName, isValidPhoneNumber, and validateContact, I was able to modularize the logic, reduce duplication, and improve maintainability. These changes showcase my ability to refactor existing code to meet higher quality standards, making the application more reliable and easier to extend in the future.

Through the enhancement process, I learned how critical thoughtful design decisions are when writing scalable and maintainable software. I focused on organizing the code more effectively, improving validation, and ensuring better fault tolerance through clear and concise error handling. I received feedback during the enhancement phase, and it confirmed that my design decisions aligned well with the expectations of the course. No significant changes were necessary, which reinforced my confidence in my approach to software design.

The artifact is significantly improved in terms of structure, readability, and resilience to invalid input. It now follows a more modular design, supports better error handling, and enforces constraints on the data being stored. This enhancement fully meets the Software Design and Engineering outcome of the course by demonstrating my ability to produce clean, modular, and logically sound code. Other outcomes such as Databases and Automation were not addressed in this particular enhancement, as the focus was strictly on improving the design and structure of the core application logic.

[Contact Service Original](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20One%20Collection%20-%20Software%20Design%20And%20Engineering/ContactService%20(Original).java)

[Contact Service Revisited](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20One%20Collection%20-%20Software%20Design%20And%20Engineering/ContactService%20(Revisited).java)

## Enhancement Two - Algorithms and Data Structure

The artifact is a Java class named ContactService, developed to manage contact information including names, phone numbers, and addresses. Initially, the class utilized an ArrayList to store contacts, with each operation requiring linear search. The enhanced version transitioned to using a HashMap, significantly improving performance by enabling constant-time lookups, updates, and deletions based on contact IDs. This work was completed during a software development course focused on object-oriented design and data structures.

This artifact was chosen for my ePortfolio because it showcases my growth as a developer, particularly in understanding and applying core programming concepts such as object-oriented principles, data validation, and efficient data management. The most significant change in the enhancement was the move from an ArrayList to a HashMap, which demonstrates my ability to evaluate and improve the performance of my code. The enhanced version also includes clearer exception handling and more robust validation logic, making the code more maintainable and reliable.

Through enhancing this artifact, I developed a deeper understanding of how different data structures affect the performance and scalability of applications. The challenge of maintaining consistent functionality while refactoring core logic required close attention to detail and rigorous testing. Peer and instructor feedback played a key role in shaping the final version, pushing me to clean up redundant logic and focus on clarity and efficiency. I learned how to refactor code thoughtfully and how to implement enhancements that make a real impact on usability and performance.

This artifact demonstrates my ability to write efficient, clean, and scalable code. It reflects several course outcomes including the use of object-oriented techniques, implementation of robust validation and exception handling, and performance optimization through proper data structure selection.

[ContactService Original V2 Enhancement 2](https://github.com/SVLemus/ePortfolio/blob/main/Enchantment%20Two%20Collection%20-%20Algorithms%20and%20Data%20Structure/ContactService%20(Revisited).java)

[ContactService Revisited V2 Enhancement 2](https://github.com/SVLemus/ePortfolio/blob/main/Enchantment%20Two%20Collection%20-%20Algorithms%20and%20Data%20Structure/ContactService%20Revisited%20Enhancement%202.java)

## Enhancement Three - Databases


[AnimalShelter.py](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20Three%20Collection%20-%20Databases/AnimalShelter.py)

[AnimalShelter.py - Revisited](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20Three%20Collection%20-%20Databases/AnimalShelter%20-%20Revisited.py)
