# sampleApp
A simple Spring Boot application with Swagger APIs and database using Spring JDBC template

For create APIs : We dont need to pass any arguments/object. It will dynamically call the randowm api, fetch the data and save the required details to the DB.

For Search APIs : 
  For tag "My Controller Class" : Just need to pass the id that of the object that was saved. It will return the response.
  For tags "Service" & "Service Definition" : We need to enter the id in the "serviceCriteria.clientId" attribute, and it will return the saved data.
  
  ![image](https://github.com/S-Agrawal02/sampleApp/assets/29098671/329a3d92-23f4-4c2a-a169-4223f388e9fc)
