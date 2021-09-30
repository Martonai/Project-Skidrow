# Function specification

## Overview
We are building an application which can help the employees to trace thier tasks, and help employers to manage their employees and tasks.
This application provides an up-to-date system, where users (employees and employers) can see what the task is, when the task was given, and what is the deadline.
Furthermore, they can see each task's condition, and they can change it depends on what permission level connected to the user.



## Current situation
The customer want to change their obsolete system to a new, modern, up-to-date system.
Customer had ordered a well-built system, which was built in the 3 main pillar.





## List of requirements

## Current buisness processes model

## Required buisness processes model

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

## Function-requirements compliance

## Glossary



























-Based on the requirements, our program should have a graphical interface and since
the company only uses andriod phones so the platform should be android.
In the application we can create new task with plus button.
In the header record contains the principal who is basically the user who creates the task,
the agent who can be selected by the user from a list. Creation date automatically equals to the
system time date. The deadline is set by the user while he is selecting a future date.
The initial state of the job cannot be specified, it is automatically set to "Waiting to be processed".
Later, the status of the task can be changed to "In Progress", which after
it can be set to "Waiting Review" when the task is completed. 
If the the task publisher has reviewed the task and meets the expectations, you can change the status to "Accepted",
on the other hand, if the task does not appropriate expectations, it changes the status to "Waiting to Process" and also change the deadline.
In addition, the user can search by name from the table by using a "Search bar".
