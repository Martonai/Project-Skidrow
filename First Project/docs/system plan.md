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

** Milestones: **
*System showcase.
*Delivery of the completed software.

## Business plan model
![Business Plan Model](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/business_plan_model.png)

## Requirements
### Functional requirements
* Store user's datas
* Work on at last 5.0 or newer android system
* Add permission levels to users

### Non-functional requirements
* Normal users are not be able to access other user's datas, only the admin.

### Laws, rules
* compliance with gdpr

## Functional plan
### System characters
* Admin
* Employers
* Employees

Amind:

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

Backend:

1. The system requires a database server, in this case we use MySql.
2. We use Java and php language for the development.

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
