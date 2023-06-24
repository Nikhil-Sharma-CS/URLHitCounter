# URL Hit Counter

This is the code for URL Hit Counter Application using Spring Boot in Java.
This implement Get API and uses RequestMapping.


## 🚀 About Me
Hi, My name is Nikhil Sharma,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA.


## Data Flow

### Controller
-   This section contains a class named UrlHitController which user functions as mentioned below :

       #### 1. RequestMapping to map request to a particular URL.
       #### 2. GetMapping("count") : This returns the number which represents the times which the URL has been hit.
       #### 3. GetMapping("count/username/{username}") : This returns the name of the user along with the number that shows how many times a particular user has visited the URL.


### Services
-   This section contains a class UrlHitService with functions that helps API to perform their specific tasks : 

    #### 1. Integer getHitCount()
    #### 2. String getUserhitCount()
    

###  Repository
-   This section contains a class HitRepo which returns two beans of types Integer and a HashMap

    #### 1. Integer getHit()
    #### 2. Map<String, Integer> getUserMap()

### Database Design
-   In this section we used two datatypes, one is Integer which helps in counting of the hit times, and other is HashMap which will store which user has visited URL how many times.


## Data Structure Used

- We used **Integer** data type which will hold the number of hits the URL has gotten.
- Secondly we created a **HashMap** of key of type String which will hold the name of the user and value of type Integer which will hold the number of times the user(key) has visited the URL.
## Summary

This project performs the task of counting the number of the URL has been visited. 
We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)

