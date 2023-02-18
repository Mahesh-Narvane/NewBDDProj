Feature: xyz

  Scenario Outline: Go to GoIbibo and book flight
   * launch the browser
    * enter the url
    * select start point "<start_loc>"
    * select end point "<end_loc>"
    * select no of seat <seats>

    Examples: 
      | start_loc  | end_loc        | seats |
      | Pune (PNQ) | Kolkata, India |     3 |
    #  | New Delhi, India | Hyderabad, India |     2 |
    #  | Kolkata, India   | Pune, India      |     4 |

    