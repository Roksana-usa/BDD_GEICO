Feature: Vlidating geico homepage and login button

  @regression @auto @smoke
  Scenario: Home page test
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
    And input zipcode inside mailing zipcode box'11432'
    And verify the length of the zip code'5'
    And click on the continue button
    Then verify the error message "The information you entered does not match our system. Please try again"

    
    @xyz-123
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