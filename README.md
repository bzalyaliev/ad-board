## Backend server for the operation of an ad board.

The functionality that needs to be implemented:
1.	Registration and authentication of the user in the personal cabinet:
      a. user must specify role, email and password when registering;
      b. to implement authentication through login by email and password.
2.	In personal cabinet user can create an ad and place it on the ad board in the general list. The ad contains title, description, seller's contacts and pictures.
3.	Board of ads in this case is a list of all ads with numerous filters (think of the maximum possible options for filters at your discretion), which is displayed on the main page of the service.
4.	The user can both post their own ads and make transactions within other ads.
5.	The ads have 2 statuses - active and withdrawn from publication.
6.	To consider and implement the option of communication between the buyer and the seller during the transaction.
7.	For all methods it's necessary to implement API-methods with documentation on Swagger.
8.	Cover all the functionality with tests. It is desirable to use TDD during development.

Additional requirements:
1. Wrap the source code in a docker image (add a Dockerfile to the root directory, docker-compose.yml if necessary).
2. Place the text of this task in the readme file, as well as instructions on how to deploy the project and the basic commands to run it.
3. Put the source code on github.com in the public repository.
4. Write meaningful names when creating commits.
5. Use the test coverage tool to display the % of source code coverage by tests.
6. To test the code, connect a linter of your choice additionally.
