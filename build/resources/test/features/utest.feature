@stories

  Feature: UTest
    As a user, I want to automate the account creation in screamplay at UTest.com

    @scenario1
    Scenario Outline: Create account at UTest.com
      Given that user wants to create an account in utest.com
        | firstName   | lastName    | email   | month   | day   | year    |
        | <firstName> | <lastName>  | <email> | <month> | <day> | <year>  |

      When he fills the account's information
        | computer   | version    | language   | mobile   | model   | os    |
        | <computer> | <version>  | <language> | <mobile> | <model> | <os>  |

      Then he creates the new account
        | password   | confirmPassword    | informed   | terms   | privacy   |
        | <password> | <confirmPassword>  | <informed> | <terms> | <privacy> |

      Examples:
        | firstName |lastName|email|month|day|year|computer|version|language|mobile|model|os|password|confirmPassword|informed|terms|privacy|
        | Oscar |Calderon|oec.correo@gmail.com|January|1|1990|Windows|10.0|Spanish|Apple|iPhone|iOS 14.4|Passwordutest12345|Passwordutest12345|1|1|1|
