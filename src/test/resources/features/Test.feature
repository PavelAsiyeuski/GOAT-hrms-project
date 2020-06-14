Feature: Add employee licenses

  Scenario: As an admin user should be able to add different licenses in qualifications
    Given user logging in as an admin
    When user navigates to Admin menu and Qualification
    Then user is able to create new license

  Scenario: As an admin user should be able to add different licenses in qualifications by specifying Type,License Number, Issue and Expiration date
    Given user logging in as an admin
    And user is creating a new employee profile
    When user navigates to Qualifications
    Then user has to be able to add different licenses
      | Type              | LicenseNum | IssueDate   | ExpDate     |
      | AWS Certification |  123456789 | 2020-Jun-04 | 2021-Jun-04 |
      | Java Certificate  |  123456789 | 2019-Jan-04 | 2022-Jun-13 |
      | Scrum Master      |  123456789 | 2018-Jul-10 | 2023-Jul-30 |
      | Sales             |  123456789 | 2020-Aug-15 | 2020-Sep-16 |
      | Oracle            |  123456789 | 2017-Dec-12 | 2022-Mar-23 |
