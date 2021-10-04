# System plan

## System purpose
The goal of this system is, to provides an up-to-date application, for the users, and thanks to, they can trace their tasks.
On the other hand, the system will replace the obsolete, paper-based system.
Employers can easily manage their employees, tasks and etc...
Employees can easily trace what tasks was given to them, what is the deadline, when the task was given to them.




## Project plan
Function | Task | Priority | estimation | elapsed time | Remaining Time
------------ | ------------- | ------------ | ----------- | ----------- | -----------
Requirement specification |   | 0 | 12 | 12 | 0
Functional specification |   | 0 | 12 | 12 | 0
System plan |   | 0 | 16 | 8 | 8
Data storage | Data model planning | 0 | 4 | 4 | 0
|   | Implementing a database in server | 1 | 1 | 0 | 1
Login interface | Creating a logo | 2 | 8 | 0 | 8

 ***Milestones***
* System showcase.
* Delivery of the completed software.

## Business plan model
![Business Plan Model](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/business_plan_model.png)

### Business Users
The system couldn't be used without signing in. There are 3 type of users. The first group is the employee's group which one is only
able to read his tasks and modify the own task status. Second group is the employer who can create tasks and can asign it to an employee. Also he can view everyones tasks and can modify the task's status.
The third group is the admin group who can do all of the above mentioned things. Furthermore the admin can create and delete users.
### Business Process
The login process is same for everyone. When opening the application the login interface appears. Where the user have to type in their username  to the Username textbox and their password to the password textbox.
 Then clicking on the the button called Login. When the identification is done the Menu appears based on the user entitlement.
### Business process for Employee
* Read task: Able to read all task which is assigned to them by clicking on it he can see the description of the task who created the task, when was the task created and when is the deadline of the task. Furthermore can see what is the status of the task.
* Modify task: Able to modify the task status from "Waiting to be processed" to "Work in progress" to "Waiting for validation".
### Business process for Employer
*Read task: Able to read all the tasks assigned to everybody by clicking on it he can see the description of the task who created the task, when was the task created and when is the deadline of the task. Furthermore can see what is the status of the task.
*Create task: Able to create task assigned to a employee by clicking on the Create task button then he needs to fill the textboxes called 'Description', 'Task is assigned to' and select a date for 'Deadline'. The creator of the task is automaticaly the task creator name and the creation date is the moment when the task is created. It is also automated.
*Modify task: Able to modify the task status from "Waiting to be processed" to "Work in progress" to "Waiting for validation". Also he can modify "Waiting for validation" to "Waiting to be processed" or "Done". Furthermore he can modify Deadline date.
### Business process for Admin
*Read task: Able to read all the tasks assigned to everybody by clicking on it he can see the description of the task who created the task, when was the task created and when is the deadline of the task. Furthermore can see what is the status of the task.
*Create task: Able to create task assigned to a employee by clicking on the Create task button then he needs to fill the textboxes called 'Description', 'Task is assigned to' and select a date for 'Deadline'. The creator of the task is automaticaly the task creator name and the creation date is the moment when the task is created. It is also automated.
*Modify task: Able to modify the task status from "Waiting to be processed" to "Work in progress" to "Waiting for validation". Also he can modify "Waiting for validation" to "Waiting to be processed" or "Done". Furthermore he can modify Deadline date.
*Remove task: The admin is able to remove a task by clicking on the "Delete" button next to the task.
*Create user: The admin can create a user by clicking on the create user button where he needs to fill in the blanks: username, passoword. Then he needs to click on the Register button.
*Delete user: The admin can delete a user by clicking on a Delete user button where thje list of the users are listed. Everywhere next to the username there is a "Delete" button. He needs to click on it. Then the application asks the admin if he is sure to delete the user. If he clicks on the Delete user for sure the user is deleted.
## Requirements
### Functional requirements
* Every employee should be able to login to their account with the generated username and password. To achieve this entitlement they should be registered by the admin. Every user can watch their own tasks and modify their task statuses.
* The system should store all of the user datas up to 5 years and the system should run on Android version 5.0 or newer.

### Non-functional requirements
* The product requirements
	* Usability requirements: The created product should be easy to learn for new users and should only require minimal IT knowledge.
	* Reliability follow-ups: The system to be developed accesses a database through a web interface. Competing access to the database is ensured and it cannot be brought into an inconsistent state under normal use.
	* Efficiency/ Performance: The system should be capable of dealing with a maximum amount of 2000 people based on the company. Furthermore the product size could not reach the 1GB.
* Organizational requirements
	* Delivery requirements: The software will be delivered by the date specified in the contract, otherwise the customer will be entitled to the penalty in the contract.
	* Implementation requirements: The program is installed on the mobile devices specified in the contract, ready for use by users, a minimum amount of data is uploaded to the database in order to facilitate the practical training of the employees.
	* Standardization requirements: The relevant standardization criteria can be found in the section Legal requirements, standards.
* External requirements
	* Cooperation requirements: The relationship between the professionals of the software development company and the customer is carried out by the persons specified in the contract. If necessary, additional experts from both sides will be involved to optimise cooperation.
	* Ethical requirements: Employees of the software development company must behave in accordance with the approved code of ethics.
	* Legal requirements:
		* Confidentiality requirements: In this area, the legal requirements apply. The employees of the development company undertake not to transfer the data of the library employees or users to third parties, and after the successful handover, the non-commercial data will be destroyed.
		* Security requirements: During software development, a one-step enrollment system will be implemented for users.

### Laws, rules
* Act LIV of 2018 on the protection of trade secrets
* Act CCXXII of 2015 on general rules for electronic administration and trust services
* Act LXVI of 1995 on public documents, public archives and the protection of private archives
* 73/2018 (IV. 20.) Gov. Decree on the Local Public Service Information System
* 187/2015 (VII.13.) Gov. Regulation is a regulation of the authorities responsible for the security oversight of electronic information systems,and the responsibilities and powers of the Information Security Supervisor, as well as the use of closed electronic information systems fixing.
* 335/2005 (XII. 29.) Gov. Regulation on general requirements for the management of documents by bodies with a public service mission
## Functional plan
### System characters
* Admin
* Employers
* Employees

Admin:

* Manage all user
* Recover or generate new password
* Delete users
* Modify the application
* Delete tasks
* Modify the permission level
 
Employer:

* Manage employees
* Give tasks
* Change task's condition
* Write task explantation
* Change deadline
* Search by name
* Order by deadlines

Employee:

* Trace their tasks 
* Read task explantation
* Change one condition which is from "In progress" to "Wait to be overviewed"


## Physical enviroment
The application supports the android mobilephones. The minimum android version is 5.0.
The application use MySQL database
Developer enviroments: 
* Android studio
* PhPmyAdmin
* dbdiagram.io

Programming languges:
* PhP
* Java 
 
## Abstract domain model

## Architectural plan
Frontend:

1. The design of the application is developed by Android studio.
2. 

Backend:

1. The system requires a database server, in this case we use MySql.
2. We use Java and php language for the development.
3. Development environment is Android studio.


## Database plan
![Database plan](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/Database.PNG)

## Implementation plan
It will be written in Android Studio and Javascript.
These technologies are written in separate files as much as possible
for easier transparency.
You will be able to use the Backend section running
REST service methods, so you can upload and query data from the
from a database.


## Test plan
**Testing procedures:**

**Unit test:**

Wherever possible, it is necessary to test during development to ensure that
methods work properly. The
methods are ready when the test cases run without error
methods.

**Alfa test:**

The primary purpose of the test is to make the existing functions different
testing for compatibility with browsers and androids.
The procedure is successful if you have it in different browsers and on different androids
the various functions work properly.

**Beta test:**

This test is not performed by developers.
Browsers to test: Opera, Firefox, Google Chrome, Safari
Android systems to be tested: 6.0.0 (minimum) or later
Display dimensions to be tested: 1280x720 (minimum), 1366x768, 1920x1080

During testing, testing users can send feedback to
developers in the event of a problem / bug.
If an error occurs, the developers will fix it as soon as possible.

**Functions to be tested:**

**Backend Service**

You need to be able to connect to both web and android clients.
You must be able to serve multiple clients at the same time.
You need to be able to upload and retrieve database data.
It must be able to provide functions available on all interfaces.

**Android**

**Registration interface:**

The registration interface must be available after the program is installed a
on the home screen next to the login option. If
user is not registered yet by clicking the button here
redirect to the registration interface. The appropriate data on this interface
by entering the confirmation button by clicking on the user
registration must be performed as described in the functional specification
go and then make the login available to the user.
If you enter incorrect registration information, you should receive an error message a
user.

|  | Form field | Requirements |  |
------------ | ------------- | ------------ | ----------- 
|  | Username | 1. Required 2. Must not have an already registered username 3. Must be at least 5 characters long and can contain letters and numbers. |  |
|  | Password | 1. Required 2. Minimum 8 characters long, 8 digits of date of birth upon registration |  |
|  | Family Name | 1. Required 2. Must not contain a digit, starts with an uppercase letter, can consist of several name members |  |
|  | Date of birth | 1. Required 2. Fixed date format: yyyy.mm.dd or yyyy-mm-dd |  |
|  | E-mail address | 1. Required 2. Bound format: account name @ domain name, domain name must be an existing domain name |  |
|  | Administrator privileges | 1. optional, checkbox |  |

**Login Interface:**

Checking the login / registration interface layout: Expected operation: a
according to the screen design in the functional specification
look regardless of screen size.

## Installation plan
Download the app from the Google Store, enter the required one
permissions and install the program!
If you do not want to install the application from the store, then
enable on your device the so - called "Third Party
contents "in the settings!
Place the ".apk" extension on your device and run it
it!


## Maintance plan
To check
whether the application is compatible with future versions of Android.
Over time, new categories need to be added to the application to keep it up
level of interest.
Here are some types of maintenance

1. Adaptive Maintenance: Keeping the program up to date and fine-tuning.
2. Preventive Maintenance: Troubleshoot problems you haven't
they seem important, but can cause serious problems later.
3. Perfective Maintenance: Performed for long-term use of the software
modifications, new features, software performance and operation
improving its reliability.
