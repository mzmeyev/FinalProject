@FinalProject

Feature: Final Project

  Scenario: Go to 1a.lv, choose any product, add to cart and review order
    Given Open HomePage
    Then Dismiss Cookie popup
    And Validate that Home Page is open https://www.1a.lv/
    Then Find the searchbar and enter Xbox
    And Click the search button
    And Click on the product
    And Scroll down to Add to cart button and Click it
    And Set Product Price and Name
    Then Click Browse the Shopping Cart button
    And Click continue in Shopping Cart page
    And Enter email and password
    And Login as User
    Then Select a pick up point to be Jelgava
    And Validate the final price to be 308.99
    And Validate the final name to be Spēļu konsole Microsoft XBOX Series S, USB 3.1 / HDMI / Wi-Fi




