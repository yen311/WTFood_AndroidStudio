## [](#app-insert-app-name)App - _WTFood_

## [](#team-name-insert-team-name)Team name - _Fantasty Inc._

## [](#team-structure-and-roles)Team structure and roles

| NAME | UID | ROLE |
| ------ | ------ | ------ |
| Chan Xu | u7076870 | Graphic Design; Basic Structure; User Authentication; Report Editing |
| Junliang Liu | u7096757 | Data Structure; Data Generation; Formatting; Testing and Debugging |
| Lili Chen | u6004244 | Data Collection; Data Clean-up; Tutorial; Location Service |
| Yen Kuo | u7075575 | Query Grammar & Processing; Information Retrieval; Testing and Debugging |

## Table of Contents

0. [Environment](#environment)
1. [App Overview](#app-overview)
2. [App Implemented Features](#app-implemented-features)
3. [Usage Instructions](#usage-instructions)
4. [Design Summary](#design-summary)
5. [Testing Summary](#testing-summary)
6. [Known Issues](#known-issues)
7. [Team Meeting Minutes](#team-meeting-minutes)
8. [Git Commit History](#git-commit-history)
9. [Statement of Originality](#statement-of-originality)

## [](#environment)Environment

 - Android Gradle Plugin Version: 4.1.0

 - Gradle Version: 6.6.1

 - Java Development Kit: 14.0.2

 - minSdkVersion: 25 (Android 7.1)

## [](#app-overview)App Overview

_Add a paragraph that gives a summary of the app you implemented. Include screenshots here._

Our app's icon in the Android system:

![icon](https://user-images.githubusercontent.com/62017108/116249889-98870400-a7b0-11eb-997e-8f9d278ccbc4.png)
![icon2](https://user-images.githubusercontent.com/62017108/116249895-99b83100-a7b0-11eb-8059-479785a339d0.png)


The splash screen when the user opens the app:

![splash](https://user-images.githubusercontent.com/62017108/116249906-9cb32180-a7b0-11eb-98ca-0dc87e2c4847.png)


The main activity of our app that contains the search bar, search button, menu button, a tutorial button and a logo button:
![main](https://user-images.githubusercontent.com/62017108/116249925-a046a880-a7b0-11eb-990d-bba75cdbaf86.png)
![query](https://user-images.githubusercontent.com/62017108/116249929-a177d580-a7b0-11eb-9614-c32d3f9c8dc4.png)


The result activity that displays all the matching restaurants in a list view. Users can easily click on each item for more information on that restaurant or make another query:

![results](https://user-images.githubusercontent.com/62017108/116249950-a50b5c80-a7b0-11eb-8b03-c87e2791fd93.png)
![details](https://user-images.githubusercontent.com/62017108/116249957-a63c8980-a7b0-11eb-9526-fbaf7b519136.png)


Users can open the drawer menu by clicking the menu button at the top left corner in the main activity to log in or sign up:

![drawernull](https://user-images.githubusercontent.com/62017108/116249978-ac326a80-a7b0-11eb-9a33-c944f3fd6453.png)
![loggingin](https://user-images.githubusercontent.com/62017108/116249984-ad639780-a7b0-11eb-80cc-7829372feba7.png)
![signup](https://user-images.githubusercontent.com/62017108/116249987-adfc2e00-a7b0-11eb-972e-77fcfbeb6121.png)
![draweruser](https://user-images.githubusercontent.com/62017108/116249991-af2d5b00-a7b0-11eb-8918-e73c90b8fc7a.png)


The logo button in the main activity opens a page about the developers of this app:

![info](https://user-images.githubusercontent.com/62017108/116250003-b18fb500-a7b0-11eb-8ea8-78a9f8b0efc4.png)

Some landscape version screenshots of our app:

![mainL](https://user-images.githubusercontent.com/62017108/116250205-dd129f80-a7b0-11eb-8b41-ef39d2f29659.png)
![resultsL](https://user-images.githubusercontent.com/62017108/116250210-ddab3600-a7b0-11eb-8e50-82cb25ee8362.png)
![detailsL](https://user-images.githubusercontent.com/62017108/116250213-dedc6300-a7b0-11eb-9e19-5bf0021e6a3c.png)
![drawernullL](https://user-images.githubusercontent.com/62017108/116250218-e00d9000-a7b0-11eb-8295-5de52cb857cf.png)
![loginL](https://user-images.githubusercontent.com/62017108/116250223-e0a62680-a7b0-11eb-8e43-529b277e827a.png)
![signupL](https://user-images.githubusercontent.com/62017108/116250224-e1d75380-a7b0-11eb-8c03-1aa9c8296917.png)
![draweruserL](https://user-images.githubusercontent.com/62017108/116250230-e3088080-a7b0-11eb-82f6-f423d7d4aeec.png)



## [](#app-implemented-features)App Implemented Features

 _A list of implemented default features:_

 - A separate result activity from the main search activity to display a list of results for a given query and a detailed information page for each result; a log-in activity; a sign-up activity; a tutorial activity; a developer info activity; a navigation drawer menu.

 - Red-Black trees and HashSets for organizing, processing, retrieving and storing data. 
   - package com.example.wtfood.rbtree: class: Colour, Node, RBTree

 - A tokenizer and a parser to process user query. 
    - package com.example.wtfood.parser: MyTokenizer, Parser, Query, Token, Tokenizer; 
    - package com.example.wtfood: class: MainActivity; 
    - package com.example.wtfood: class: ResultActivity

 - The ability to retrieve data from a JSON or a CSV file. 
    - package com.example.wtfood: class: MainActivity; 
    - package com.example.wtfood: class: ResultActivity

 - A Java program to generate 1000 pseudo restaurant data instances. 
    -  package com.example.wtfood.fileprocess: class: FileProcess

_A list of implemented advanced features:_

 - Different layouts (LinearLayout in header.xml, DrawerLayout in the activity_main.xml, and ConstraintLayout in activity_result.xml, activity_details.xml, etc.) in different activities.

 - Support for different screen sizes and orientation (portrait/landscape). 

 - The ability to read data instances from multiple files in different formats (JSON and CSV). 
    - package com.example.wtfood: class: MainActivity; 
    - package com.example.wtfood: class: ResultActivity

 - The ability to utilize GPS information to provide better query results.
    - package com.example.wtfood.model: class: Location;
    - package com.example.wtfood: class: SplashScreen; 
    - package com.example.wtfood: class: MainActivity; 
    - package com.example.wtfood: class: ResultActivity; 


 - The ability to handle partially valid and invalid queries.
    - package com.example.wtfood.parser: Parser

 - Firebase Authentication to allow users to sign up and log-in to the app with email and password. 
    - package com.example.wtfood: class: MainActivity; 
    - package com.example.wtfood: class: LoginActivity; 
    - package com.example.wtfood: class: RegisterActivity

_A list of implemented surprise features:_

 - Query results are ranked based on the distance between the matching restaurants and the current location of the user.
    - package com.example.wtfood.model: class: Location;
    - package com.example.wtfood: class: SplashScreen; 
    - package com.example.wtfood: class: MainActivity; 
    - package com.example.wtfood: class: ResultActivity; 

## [](#usage-instructions)Usage Instructions

 - In the search bar of the MainActivity or the ResultActivity, users can input the query based on three attributes of restaurants: price (AUD/person), rating (star), and delivery (Y/N), and users can use semicolons to separate each attribute. (e.g. price < 30; rating >= 3; delivery = y)

 - Users can click the tutorial button at the top right corner of the MainActivity to learn the grammar of the query.

 - In the MainActivity, users can click the menu button at the top left corner to open the navigation drawer menu, where users can go to the login activity to log in or sign up if they are new users.

## [](#design-summary)Design Summary

[Class UML Diagram](https://gitlab.cecs.anu.edu.au/u7076870/comp2100_6442_s2_2020_group_project/-/wikis/uploads/ae005aa506c6f82ab49ae772c8899575/WTFood.png)
 
 - Basic Information

    - Our application is designed to help users search their desired restaurants and learn more information on restaurants they are interested in.
    - There are 6 main activities in our app: a MainActivity that contains the search bar, menu, and tutorial, a ResultActivity that displays the query result and allows the user to search again, a DetailsActivity that shows the detailed information on the user's selected restaurant, a LoginActivity that allows the user to log in to our app, a RegisterActivity that allows a new user to sign up to our app, and a TutorialPage that gives some instructions of our search query rule.
    - There are 9 attributes of a given restaurant: name, rating, delieveryService, location, type, price, address, phone, and distance.
    - The user can set criteria on three of these attributes: price, rating, and delieveryService, for example, "price < 20; ratings >= 4; delivery = n".

 - Production Rules


\<Sentence\> → \<Expression\> ; \<Sentence\> | \<Expression\>

\<Expression\> → \<Attribute\> \<Operator\> \<Num\> | \<Delivery\> = \<Delivery_Value\>

\<Attribute\> → price | rating

\<Operator\> → > | < | = | <= | >=

\<Delivery\> → delivery

\<Delivery_Value\> → y | n

\<Num\> → \<Digit\> | \<Digit\> \<Num\>

\<Digit\> → 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

 - Parser Logic
    - Our query combines by three parts, attribute, operator and value. Our parser will firstly determine the attribute, the operator and then the value respectively. If there's any invalid token or correct token on the wrong place. We will mark it as an invalid query and immediately go through our getEnd method. This method will determine whether the next token is the correct attributes or not. If it is, parser will repeat the step from the start and determine the new requirements again. However, if next token isn't the correct attribute. We will mark it as invalid query and go ahead to check next token, the process will keep going until the last token in the query.

 - Data Structure
    - We concluded that Red-Black Trees are the best data structure in our case. The red-Black tree can balance itself, so we do not have to worry about the order we insert the data. When we insert a large amount of restaurant data, it would be much more efficient for the user to find the desired restaurants in Red-Black Trees compared to Binary-Search Trees or other data structures.

 - Persistent Data
    - We decided to use JSON and CSV to store our data because JSON is a lightweight format that has been widely used in many scenarios, and CSV is a plain-text format that is easy to create and transform into a readable Excel file.

 - Firebase Authentication
    - We implemented the Firebase Authentication provided by Google so that it would be easier for us to provide personalized content to the user.

 - Location Service
    - Our app utilizes GPS data to locate the user and sort the result list based on the distance between the matching restaurant and the user.

## [](#testing-summary)Testing Summary

![coverage](https://user-images.githubusercontent.com/62017108/116249520-40e89880-a7b0-11eb-8ea0-f1a4c01d12b5.png)


 - We have five test cases in the tokenizer test to test our tokenizer. 
    - The first test is to test whether _hasNext_ function returns correctly or not. 
    - The second one tests whether the tokenizer can break the unnormal user input to an unknown type of token.
    - The third case is the empty case situation.
    - The fourth case is testing whether tokenizer still works in the wrong order input. 
    - The fifth case tests tokenizing the query with multiple correct requirements.

(The test case coverage is 9/9 (100%) of methods and 72/75 (96%) of lines in MyTokenizer class.)

 - We have six test cases in the parser test for testing out our parser function. 
    - The first test is testing the situation user only enter one requirement.
    - The second test tests the situation user enter some unexpected symbol.
    - The third test tests the situation user enter multiple requirements.
    - The fourth case is the wrong order situation. (E.g. Correct: Delivery = Y. Wrong: Y = Delivery)
    - The fifth case is testing empty input. 
    - The sixth case is the situation on wrong input, including wrong attribute, wrong operator and wrong value.

(The test case coverage is 5/5 (100%) of methods and 61/68 (89%) of lines in Parser class.)

 - We also have four test cases in the red-black tree test for testing out our implementation of red-black tree. 
    - The first test is testing we can add the instances from List correctly.
    - The second test is testing duplicate instances will not be inserting.
    - The third case is testing the pre-order and in-order of tree to test the correctness of the order of instances.
    - The fourth case tests the correctness of the search for restaurants that satisfies the requirement. 

(The test case coverage is 28/33 (84%) of methods and 167/196 (85%) of lines in RBTree class.)

 - We have two test cases in the restaurant test for testing out our implementation of restaurant. 
    - The first test is testing the getters of restaurant.
    - The first test is testing the setters of restaurant.

(The test case coverage is 21/23 (91%) of methods and 58/76 (76%) of lines in Restaurant class.)

 - We have two test cases in the file process test for testing out our implementation of file process. 
    - The first test is testing the correctness of reading from JSON file.
    - The first test is testing the correctness of reading from CSV file.
 The methods of creating files is just for showing and not called here, so it is not tested.

(The test case coverage is 3/5 (60%) of methods and 28/72 (38%) of lines in FileProcess class.)

## [](#known-issues)Known Issues

- The query process from the red-black tree can be optimized. After retrieving the first set of restaurants that satisfy the first requirement, we can use this set to remove the restaurants that do not satisfy the other requirement, replacing the current processing that we use the retainAll method in set to find the intersection of restaurants that satisfies the different requirement.

- The application will crash when the value of a query is extremely large.

## [](#team-meeting-minutes)Team Meeting Minutes

_Our team utilize WeChat to have constant communications and discussions, and we keep each other updated on the progress of our work. Therefore, it's not necessary to have frequent formal meetings._

 - First meeting (07/09/2020 16:00 - 17:00): Decided the theme of our application and the basic role of each member.

 - Second meeting (08/09/2020 19:00 - 20:00): Set short-term goals, that is, to understand how to create our data and write them to a JSON file via a program, and to think about which data structure is the optimal option for our data.

 - Third meeting (30/09/2020 22:00 - 23:00): Reported on the progress of everyone's current work. Discussed the major challenges and possible solutions. Specified each member's role and responsibility.

 - Fourth meeting (12/10/2020 22:00 - 23:00): Prepared for the checkpoint in Week 10\. Finalized the implementation of our data structure and query grammar. Discussed some advanced features.

 - Fifth meeting (23/10/2020 02:00 - 7:00): Finalized the location service and implemented the sorting algorithms based on distance. Discussed the content and the structure of our Wiki report. Discussed how to structure and present our project in the Minute Madness presentation.
 
 - Sixth meeting (TBD): ...


## [](#statement-of-originality)Statement of Originality

https://gitlab.cecs.anu.edu.au/u7076870/comp2100_6442_s2_2020_group_project/-/blob/master/statement-of-originality.yml
