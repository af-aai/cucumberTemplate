@wip
Feature: complete transaction

Scenario:
  Given user is on the home page
  When  user enters "elyar"
  And   user hides keyboard
  Then  user selects gender female
  When  user clicks  country dropdown
  And   user scrolls until user sees the country "Germany"
  Then  user clicks the country "Germany"
  When  User clicks letsshop button
  Then  user is on the product list page
  And   user selects the top 2 products
  When  user clicks Cart Icon button
  Then  user is on the "Cart" page
  And   user should see the selected products
  And   user checks if the total price of the selected products is correct
  Then  user clicks  sendMeEmail checkbox button
  When  user longpress text "Please read our terms of conditions"
  Then  user should see the conditions message
  And   user clicks close button
  When  user clicks the link button that directs to product website
  Then  googles security window pops up
  And   user agrees with the google security alert







