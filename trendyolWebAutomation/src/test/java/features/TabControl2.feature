Feature: About Tab Section Control


  Background:
    * Navigate to https://www.trendyol.com/
    * Accept Cookies for page

  Scenario: Product and product image control
    * Click "Kadın" on tab
    * Click first component
    * Check fourth product and image


  Scenario Outline: Product and product image control from tabs
    * Click "<category>" on tab
    * Click first component
    * Check fourth product and image

    Examples:
      | category         |
      | Kadın            |
      | Erkek            |
      | Çocuk            |
      | Ev & Mobilya     |
      | Süpermarket      |
      | Kozmetik         |
      | Ayakkabı & Çanta |
      | Ev & Mobilya     |
      | Saat & Aksesuar  |
      | Elektronik       |
      | Spor&Outdoor     |