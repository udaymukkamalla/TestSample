Feature: Verification of Motors screen in ebay

  Scenario: Verification of Motors page in ebay
    Given the user is on the ebay home page
    When the user clicks on Motors button
    #Then User clicks on PartsAndAccessories link
    Then User clicks on AllPartsAndAccessories link
    Then User clicks on CarAndTruck Parts link
    Then User clicks on ElectricVehicleParts link
    #Then User clicks on CarAndAccessorie link
    Then User clicks on Chevrolet option

  
