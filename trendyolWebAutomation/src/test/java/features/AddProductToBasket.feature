Feature: Adding products to basket scenarios


  Background:
    * Navigate to https://www.trendyol.com/
    * Accept Cookies for page
    * Go to Login Page
    * Enter "rgm44198@boofx.com" on email field
    * Enter "Test1234" on password field
    * Click Login Button
    * "Hesabım" element is enable

  Scenario: Adding product on Basket by filtering
    * Enter "Oyuncu Bilgisayarı" on search field
    * Check page control for List page
    * Select "Monster" on the filter brand field
    * Select min "3000" and max "10000" on the filter price field
    * Check product by filtering
    * Click product on list page
    * Switch to window
    * Add product to basket

  Scenario: Adding product on Basket by Favorite Section
    * Enter "Gömlek" on search field
    * Check page control for List page
    * Add favorite to product
    * Click "Favorilerim" section
    * Check "https://www.trendyol.com/Hesabim/Favoriler" page
    * Add product to basket on favorite page
    * Check basket icon as "1"


