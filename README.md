# -better-banking
open banking using spring boot 

At most, it most be able to figure out the merchant, but you would have to scrutinize your statement. better-banking.io maintains a curated list of merchants and their codes, which will be used to enrich their consumers’ statements.

We will be using Spring Boot to build this application. We will be integrating with an external service, matching transactions to merchant codes in order to enhance the transaction data with the merchants’ names and logos. Integration is one of the most common activities in software development. We will use Open API to integrate with an Open Banking Standard compliant REST-based API.

We will generate client code from the specification, build a REST controller to serve this data, use Spring Security to secure the API, enable caching to speed it up, and then ready it for containerized deployment. 

TODO :) 
* [x] Creating a Spring Boot application that returns transactional and merchant data.
* [x] Consuming external banking data and integrating it with our application using RestTemplate, the main class to make HTTP requests.
* [x] Securing our own application and pulling data from secured endpoints.
* [x] Ready our Spring Boot application for production (caching and containerizing).
