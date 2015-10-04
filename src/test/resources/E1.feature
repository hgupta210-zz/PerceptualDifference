@PDiff
Feature: Compare Endeca pages
  As a user
  I want to compare endeca pages on old and new endeca

  @complete
  Scenario Outline: Compare old and new endeca pages
    When I open <url1> and <url2> at <S_No>
    Then I should see comparison for <S_No>

    Examples: 
      | S_No   | url1                            | url2                            |
     # | Page_1 | http://www.yahoo.com  | http://www.yahoo.com  |
     # | Page_2 | http://www.google.com | http://www.google.com |
      | Page_3 | http://www.marksandspencer.com/ | http://www.marksandspencer.com/ |
      | Page_4 | http://www.marksandspencer.com/ | http://www.marksandspencer.com/ |
      | Page_5 | http://www.marksandspencer.com/ | http://www.marksandspencer.com/ |
      | Page_6 | http://www.marksandspencer.com/ | http://www.marksandspencer.com/ |
      | Page_7 | http://www.marksandspencer.com/ | http://www.marksandspencer.com/ |
      | Page_8 | http://www.marksandspencer.com/ | http://www.marksandspencer.com/ |
      