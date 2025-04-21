
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

### Artifact: 

The artifact is a Contact Management System originally created for the CS320 course, which I developed to manage contact information using CRUD operations. Initially, the system employed an ArrayList to store contact data, which worked but was not the most efficient for operations like searching, updating, and deleting contacts. The enhancement involves replacing the ArrayList with a HashMap, which will significantly improve the performance of these operations, reducing the time complexity from O(n) to O(1). The new version of the system will also include optimizations in the update and search algorithms to ensure that only the fields that need updating are modified. 



### Justification for Inclusion: 

This artifact highlights my ability to apply algorithmic principles and data structure optimizations to a real-world software application. The improvement from an ArrayList to a HashMap directly addresses performance bottlenecks in the original system, aligning with key course outcomes. By enhancing both the data structure and the efficiency of the algorithms, the artifact demonstrates the impact of thoughtful design choices in real-world systems. 

**Data Structure Optimization:** Replacing the ArrayList with a HashMap demonstrates my understanding of selecting the right data structure based on the performance requirements of the system. 

**Algorithmic Efficiency:** Refining the update and search functions minimizes redundant operations, illustrating my ability to design efficient algorithms. 

**Scalability:** The use of a HashMap enables the system to scale efficiently, especially as the number of contacts grows. 

### Specific Components Showcasing Skills: 

**Data Structure Optimization:** The shift from an ArrayList to a HashMap will allow the system to handle CRUD operations in constant time (O(1)) instead of linear time (O(n)). This enhancement directly improves the performance of the system, especially when dealing with large amounts of data. 

**Algorithmic Efficiency:** The update and search functions have been refined so that only the necessary fields are updated, and the search is performed using the contact ID as the key in the HashMap. This ensures that retrieval and modification operations are as efficient as possible. 

### Course Outcome Coverage: 

I successfully met the course outcomes related to software design, particularly: 

**Course Outcome 3:** I designed and evaluated a computing solution by optimizing the contact management system’s data structure and algorithms. This improvement illustrates my ability to apply algorithmic principles to enhance the efficiency of a real-world application while managing the trade-offs involved in design choices. 

**Course Outcome 4:** I applied well-founded techniques and tools, such as selecting appropriate data structures and refining algorithms, to improve the system’s efficiency. This aligns with industry goals of delivering scalable, high-performance software solutions. 

### Reflection on the Enhancement Process: 

The enhancement process provided valuable learning opportunities: 

**Optimization Of Performance:** I gained a deeper understanding of the impact of selecting the right data structure for the task at hand. Replacing the ArrayList with a HashMap directly improved the system's time complexity for search, update, and delete operations, allowing for constant-time performance rather than linear-time performance. 

**Efficiency Of Algorithms:** I learned how refining algorithms to work on only the necessary data can significantly enhance performance by minimizing redundant operations. 

**Challenges:** One of the challenges I faced during this enhancement was ensuring backward compatibility with the existing code. Since the original system used an ArrayList and relied on linear searches, I had to carefully plan the transition to a HashMap without disrupting existing functionality. This required modifying the contact management logic while ensuring the updated methods still worked seamlessly with the rest of the application. I also had to test the new data structure thoroughly to avoid introducing new bugs, especially in edge cases where a contact might not exist. 

[ContactService Original V2 Enhancement 2](https://github.com/SVLemus/ePortfolio/blob/main/Enchantment%20Two%20Collection%20-%20Algorithms%20and%20Data%20Structure/ContactService%20(Revisited).java)

[ContactService Revisited V2 Enhancement 2](https://github.com/SVLemus/ePortfolio/blob/main/Enchantment%20Two%20Collection%20-%20Algorithms%20and%20Data%20Structure/ContactService%20Revisited%20Enhancement%202.java)

## Enhancement Three - Databases

### Artifact: 

The artifact is AnimalShelter.py, a backend application that manages animal shelter data using MongoDB. It was created as part of CS 340 Project 2: Dashboard. Initially, the system allowed for basic CRUD operations to manage animal records but lacked efficiency in handling larger datasets. The enhancement involves adding advanced MongoDB features such as data indexing, aggregation pipelines, and user authentication with role-based access control. These improvements will optimize the system’s performance and security, making it more efficient and scalable. 

 

### Justification for Inclusion:

I selected this artifact because it demonstrates my ability to optimize database-driven applications and enhance their functionality. The improvements I made, such as adding indexing and using aggregation pipelines, directly address performance bottlenecks. The addition of user authentication and role-based access control showcases my understanding of how to secure applications, which is a crucial skill in real-world software development. These changes enhance the system’s scalability, security, and efficiency. 

**Data Structure Optimization:** By adding indexing and using aggregation pipelines, I optimized data retrieval and complex query performance. 

**Algorithmic Efficiency:** The aggregation pipeline enhances query performance by grouping and filtering data efficiently, improving the system's overall algorithmic performance. 

**Security and Access Control:** Implementing user authentication and role-based access ensures that only authorized personnel can access sensitive data, highlighting my skills in securing software applications. 

### Specific Components Showcasing Skills: 

**Data Structure Optimization:** Implementing indexing improves query performance by reducing lookup time, making operations faster and more efficient as the data grows. 

**Algorithmic Efficiency:** The aggregation pipelines allow complex queries to run efficiently, enabling reports and detailed searches to be executed quickly. 

**Security and Access Control:** Adding role-based access control ensures that only authorized users can perform sensitive operations such as updating or deleting records. 

### Course Outcome Coverage: 

I successfully met the course outcomes related to software design, particularly: 

**Course Outcome 3:** I designed and evaluated a computing solution by optimizing the AnimalShelter.py system with advanced database features like indexing and aggregation pipelines, applying algorithmic principles to improve performance. 

**Course Outcome 4:** I implemented secure coding practices by incorporating user authentication and role-based access control, aligning with industry standards for building secure applications. 

### Reflection on the Enhancement Process: 

The enhancement process provided valuable learning opportunities: 

**Optimization Of Performance:** I gained insight into how indexing, and aggregation pipelines can drastically improve the performance of MongoDB queries, especially for large datasets. These enhancements make the system more efficient and scalable. 

**Improving Security:** Implementing role-based access control was a valuable learning experience, as it ensured that only users with the correct roles could perform sensitive actions, such as updating or deleting animal records. 

**Challenges:** One of the biggest challenges was ensuring that the new features worked harmoniously with the existing CRUD operations. Integrating the new MongoDB features required careful testing to avoid issues with the legacy code, particularly around user authentication and permissions. Another challenge was ensuring the system remained easy to use while adding complex database functionalities like aggregation and indexing. 

[AnimalShelter.py](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20Three%20Collection%20-%20Databases/AnimalShelter.py)

[AnimalShelter.py - Revisited](https://github.com/SVLemus/ePortfolio/blob/main/Enhancement%20Three%20Collection%20-%20Databases/AnimalShelter%20-%20Revisited.py)
