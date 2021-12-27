# Technical test
REST APIs to check mobile details, book and return phone
# Getting Started
Make sure that you have at least Java 8 and Maven installed on your computer.
run below command from project directory. 
```
mvn clean install  
java -jar target\mobile-phone-api-portal-0.0.1-SNAPSHOT.jar  
```
# Integrations
This service currently depends on below tech specs APIs to get the list of specified phones. It was asked to used Fonoapi but it is down for a while so tech specs API was used.  

* *TechSpecs Api* https://apis.dashboard.techspecs.io/e2t2fcqhn624qcjz/api/product/  
Header to access the api is below  
* *X-BLOBR-KEY* BmKYXw3iFS2oM9BjAjdMQVAo6Gs13Zn9  
	
# API Docs
###### GET //mobCnt/findAll
This REST API will return a list of all the phones with brand and version matching specified in below list.
- Samsung Galaxy S9
- Samsung Galaxy S8
- Samsung Galaxy S7
- Motorola Nexus 6
- LG Nexus 5X
- Huawei Honor 7X
- Apple iPhone X
- Apple iPhone 8
- Apple iPhone 4s
- Nokia 3310


###### POST /mobCnt/bookPhone
This REST API will book phone for the given customerId and phoneId

###### PUT /mobCnt/returnPhone/{orderId}
This REST API will cancel the order and return the phone to the vendor

# Testing
All test cases could not be returned due to time shortage  
Run the below Maven command for running the tests  
mvn test  

# Reflection

###### What aspect of this exercise did you find most interesting?
As this exercise requires bit of troubleshooting since FonoApi was not working. Initially, I thought it might be mistakenly shared but seems it is required from developer end to troubleshoot and find alternative. This took a lot of time but that is what our daily job supposed to achieve result at the end.

###### What did you find most cumbersome?
Integration with TechSpecs Api was cumbersome. Initially, I invested my time to make the FonoApi working but it didn't worked so I used TechSpecs api in same repository under techspecs branch
```
