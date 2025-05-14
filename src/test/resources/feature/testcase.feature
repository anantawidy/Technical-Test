Feature: Register Page

  Scenario: Input valid data
    Given user is on the registration page
    When user input all mandatory fields
    And click button daftar
    Then user will be redirect to otp page

  Scenario: Input invalid phone number
    Given user is on the registration page
    When user input phone number using invalid number
      And input other field
    Then button daftar will be disable
      And shown error Nomor handphone tidak valid

  Scenario: Input invalid email
    Given user is on the registration page
    When user input email using invalid email
      And input other field
    Then button daftar will be disable
      And shown error Format email tidak valid

  Scenario: Open syarat dan ketentuan
    Given user is on the registration page
    When user click syarat dan ketentuan
    Then redirect to syarat dan ketentuan page

  Scenario: Open kebijakan privasi
    Given user is on the registration page
    When user click kebijakan privasi
    Then redirect to kebijakan privasi page