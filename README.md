
# product-service
In this service we have exposed GET endpoint **/v1.0/product/{productId}** which takes the productId as a parameter. 

First we check the **Adidas** API for the given productId, and once data is found, we then query the other **review-service** to get the average review and number of reviews. 

If any of the API is down then we have implemented the CircuitBreaker which in our case will return the null object hence no exceptions. 

Clone the repo locally and run the command **./mvnw spring-boot:run**, in case if we get the Permission Denied error in mac or linux we can run the following command **chmod +x mvnw** and then run the **./mvnw spring-boot:run** command again. 

By default this application will run on the 8080 port, which can be changed from **application.properties** file
