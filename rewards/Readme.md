# Introduction to rewards application
### Getting Started

For further reference, please consider the following steps:
* To run the application goto com/rewards/RewardsApplication.java
* right-click on the file and choose run option
* server will start on 8080 port and start listening
* Monitor console for server start up logs.

###Steps to test the endpoint
*install postman client application
* [use following endpoint to calculate rewards](http://localhost:8080/rewards/get-rewards)
* use following response body to pass data to service
  ####Input
    {
      "cartValue":101,
      "rewards":0
      }
  ####Output
  Response structure will be followed same
      {
      "cartValue":101,
      "rewards":21
      }
