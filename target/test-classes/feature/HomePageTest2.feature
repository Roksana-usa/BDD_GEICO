
Feature: HomePageTest validition 2

  @xyz-456
    Scenario: Home page test 2
    Given homepage title is "The insurance savings you expect"
    And verify subtitle "See how much you could save! Let's get started by entering your ZIP Code:"
    When type in search field 'auto'
    And click on login button it will open another popup login button
    And click on the login button
    And click on 'Sign up for an account'
    And input your policy number '1012457854'
    And input your date of birth '01/01/1985'
    And input the zipcode '11432'
    And clear zipcode
    And input zipcode inside mailing zipcode box <zipCode>
    And verify the length of the zip code <length>
    
       Examples: 
      | zipCode | length |
      | '11432' | '5'    |
      | '11423' | '5'    |
      
    @inline-table
     Scenario: Home page test 3
    Given homepage title is "The insurance savings you expect"
    And verify subtitle "See how much you could save! Let's get started by entering your ZIP Code:"
    When type in search field 'auto'
    And click on login button it will open another popup login button
    And click on the login button
    And click on 'Sign up for an account'
    And input your policy number '1012457854'
    And input your date of birth '01/01/1985'
    And input the zipcode '11432'
    And clear zipcode
    And input zipcode inside mailing zipcode box <zipCode>
     | '11432' |
     | '11423' |
    Then verify zipcode length is '5'
     