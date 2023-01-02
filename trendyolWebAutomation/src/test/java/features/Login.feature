Feature: Login feature

  Background:
    * Navigate to https://www.trendyol.com/
    * Accept Cookies for page

  Scenario: HappyPath for Login
    Given Go to Login Page
    And Check page control for Login page
    And Enter "rgm44198@boofx.com" on email field
    And Enter "Test1234" on password field
    When Click Login Button
    Then "Hesabım" element is enable

  Scenario: Check Forget to Password field
    Given Go to Login Page
    And Check page control for Login page
    When Click Forget Password
    Then Check "https://www.trendyol.com/sifremiunuttum" page

  Scenario Outline: UnHappyPath Scenario
    Given Go to Login Page
    And Check page control for Login page
    And Enter "<email>" on email field
    And Enter "<password>" on password field
    When Click Login Button
    Then Error message is "<errorMessage>"
    Examples:
      | email              | password   | errorMessage                               |
      |                    |            | Lütfen geçerli bir e-posta adresi giriniz. |
      | test123@           |            | Lütfen geçerli bir e-posta adresi giriniz. |
      | deneme12@gmail.com |            | Lütfen geçerli bir e-posta adresi giriniz. |
      | deneme00@gmail     |            | Lütfen şifrenizi giriniz.                  |
      | test1234@gmail.co  |            | Lütfen şifrenizi giriniz.                  |
      | test1234@gmail.com | 123        | E-posta adresiniz ve/veya şifreniz hatalı. |
      | asda@yandex.com  | denemeyanlıs | E-posta adresiniz ve/veya şifreniz hatalı. |

