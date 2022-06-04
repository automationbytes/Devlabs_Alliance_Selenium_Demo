Feature: To open Facebook
  Scenario: Launching Facebook 
  
  Given the user launches facebook
  Then the user verifies facebook title
  And the user enters "username" in username field
  And the user enters "password" in password field
  And the user clicks on signup button
  #signup page
  And the user enters "devops" in firstname field
  