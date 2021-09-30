# System plan
The plan of this system is, the user easily keep track of their tasks and don’t forget to do it.
All in a transparent interface that does not pose any problems in managing the system.
It is important to the user easily adapt to interfaces therefore minimalist users
interface is given to the program.
Because the app is for Android only
we want to make it available in an application, it is not our intention to make it different, for example
Run on a device with an iOS operating system.
We want all ages to easily find their place in the use of the app and spread it as widely as possible.

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

Milestones: *
			*
			*

## Business plan model

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

## Installation plan

## Maintance plan