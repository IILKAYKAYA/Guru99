Feature: Practice as a team

  Scenario: AC1-As a user, when I click on the link, I can reach website out
    Then User lands on Guru99 Demo Site and  Guru99 Bank is displayed

  Scenario:Login Credentials
    Given User on the login home page
    When User enters username and password and then click on the loggin button
      |UserID|mngr346090|
      |Password|asUsugu|
    Then user able to see Manger Id : mngr346090 page

  Scenario:User should be able to click new customer button and user should able to add new customer information
    Given User is on the Managerhomepage
    When click on New Customer button
    Then User on the New Customer Entry page and user can see Add New Customer text

  Scenario: User can Add New Customer
    Given  User is on the Add New Customer page
    When User fill out all the information for new customer and submit the informations
      | Customer Name | Can Guler           |
      | Gender        | Female              |
      | Date of Birth | 10171990            |
      | Address       | 123 Street          |
      | City          | Toronto             |
      | State         | Ontario             |
      | PIN           | 123456              |
      | Mobile Number | 4595875858          |
      | E-mail        | abcvde234@gmail.com |
      | Password      | 12345678|

    Then  verifying the new customer added