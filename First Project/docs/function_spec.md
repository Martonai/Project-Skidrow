# Function specification

## Overview
We are building an application which can help the employees to trace thier tasks, and help employers to manage their employees and tasks.
This application provides an up-to-date system, where users (employees and employers) can see what the task is, when the task was given, and what is the deadline.
Furthermore, they can see each task's condition, and they can change it depends on what permission level connected to the user.



## Current situation
The customer want to change their obsolete system to a new, modern, up-to-date system.
Customer had ordered a well-built system, which was built in the 3 main pillar.





## List of requirements
Modul | ID | Name | Version | Explantation
------------ | ------------- | ------------ | ----------- | -----------
Permission | P1 | Login interface | 1.0 | The user can login to the application with his/her email and with the generated password
Employer | E1 | Show employer | 1.0 | This field will show, who assigned the task
Employee | E2 | Show employee | 1.0 | This field will show, who had got the task
Task given time | TG1 | Show time | 1.0 | This field will show, when the task was given
Deadline | D1 | Show deadline | 1.0 | In this field, the employers can set deadlines to each tasks
Task conditions | T1 | Show what condition the task in | 1.0 | In this field, the employers and employees can switch between task conditions

## Current business processes model
In today’s world, education doesn’t take advantage of existing technologies to make learning a lot more fun.
Young people are less and less willing to learn in a "classic" way. The Paper task management Nowdays was obsolete.
It can be made much more interesting and easier.
This is not an unified system, you cannot trace your own work, your own problems etc...
Excel was a step further, but even this isn't the system what this company needs.
Our company needs more redundant, and more traceable system.

## Required business processes model

## Use cases
* ADMIN: Admin has the maxium permission level, beacuse if there is something wrong with the application, like user cannot login, or forgot password, admin can fix this.
* EMPLOYER: Employer has the permission level 2, employers can give task to the employees, and change the deadline, and change all condition of task.
* EMPLOYEE: Employee has the permission level 1, employees can see what task was given to them, and change the "In progress" condition to "Waiting to be reviewed".

## Correspondence, how the use cases are covered a requirements

## Screen plans
If the user start the application, a login screen will shown.
The user will type the email address and the generated password.
![Login screen](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/WelcomeScreen.png)

After the login, the user will see the interface below
![Login screen](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/UserInterface.png)

* In the 1 field, the user see who set the task to him/her
* In the 2 fiield, the user see when the task was given
* In the 3 field, the user see what is the deadline of the task
* In the 4 field, the user see what condition the task is in and he can change depends on his permission
* In the 5 field, the user see the description about the task
* In the 6 field, the user see his/her username
* In the 7 field, the user see his/her email address
* In the 8 field, the user see his/her permission level
* In the 9 field, the user can contact with the admin

Attention! These pictures only an illustration, the final application can be different!

## Scenario
There is 3 main character of this application.

1. First of all, the running application, where if the user has logged in, they can see everything which was provided by the applictaion.
2. Second is the user, who connected to the applictiaon, and who can modify changes. Like write new task...
3. Database, which is the provides the datas for the applictaion.

## Function-requirements compliance

## Glossary


























