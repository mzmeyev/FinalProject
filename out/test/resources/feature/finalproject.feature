@FinalProject

Feature: Final Project

  Scenario: Go to 1a.lv, choose any product, add to cart and review order
    Given Open HomePage
    Then Dismiss Cookie popup
    And Validate that Home Page is open
    Then Find the searchbar and enter Xbox
    And Click the search button
    And Scroll down to product
    And Click on the product
    And Scroll down to Add to cart button and Click it
    Then Click Browse the Shopping Cart button
    And Validate the product name
    And Click continue in Shopping Cart page
    And Enter email akdmisha@gmail.com and password testpassword
    And Select a pick up point
    Then Validate the final price




