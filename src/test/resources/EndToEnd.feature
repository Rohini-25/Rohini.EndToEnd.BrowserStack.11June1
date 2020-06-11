Feature:End to end scenario
  Login add product to cart check out with money order payment option

  Scenario:Payment money order
    Given User is at homepage
    When  I click on login link from nav bar
    Then  I should be navigated to login page
    When  I enter user name
    And   I enter password
    And   I click on login button
    When  I select homeandkitchen
    And   I select cooking and dining
    Then  I should get result for corresponding product
    When  I click on add to cart button for third product on home page
    Then  the product should appear in the shopping cart
    When  I click on checkout button
    Then  I am directed to shipping address page
    When  I click on continue1 button
    Then  I am direct to shipping method page
    And   I am directed to payment method tab
    And   I am directed to payment information page
    When  I click on continue button
    Then  I am directed to confirm order page
    When  I click on confirm
    Then  I get confirmation message

