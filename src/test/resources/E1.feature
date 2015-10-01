@PDiff
Feature: Compare Endeca pages
  As a user
  I want to compare endeca pages on old and new endeca

  @complete
  Scenario Outline: Compare old and new endeca pages
    When I open <Page No> for <old endeca> and <new endeca>
    Then I should see comparison for <Page No>

    Examples: 
      | Page No | old endeca                                               | new endeca                                                                                                      |
      | Page 1  | http://www.marksandspencer.com/l/your-questions-answered | http://www.marksandspencer.com/MSFindItemsByCategory?langId=-24&storeId=10151&catalogId=10051&categoryId=98431  |
      | Page 2  | http://www.marksandspencer.com/l/x-preview-wines         | http://www.marksandspencer.com/MSFindItemsByCategory?langId=-24&storeId=10151&catalogId=10051&categoryId=679504 |
