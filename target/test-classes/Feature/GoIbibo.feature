Feature: xyz

  Scenario Outline: Go to GoIbibo and book flight
    Given launch the browser
    Then enter the url
    Given select start point "<start_loc>"
    When select end point "<end_loc>"
    Then select no of seat <seats>

    Examples: 
      | start_loc  | end_loc        | seats |
      | Pune (PNQ) | Kolkata, India |     3 |
    #  | New Delhi, India | Hyderabad, India |     2 |
    #  | Kolkata, India   | Pune, India      |     4 |

    