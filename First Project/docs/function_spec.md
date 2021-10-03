# Function specification

## Overview
We are building an application which can help the employees to trace thier tasks, and help employers to manage their employees and tasks.
This application provides an up-to-date system, where users (employees and employers) can see what the task is, when the task was given, and what is the deadline.
Furthermore, they can see each task's condition, and they can change it depends on what permission level connected to the user.



## Current situation
The customer want to change their obsolete system to a new, modern, up-to-date system.
Customer had ordered a well-built system, which is available throught android.
The system helps the employees to monitor their tasks. They used a paper based solution before
but they quickly realized that it is not really effective. So they started to search for a application
that helps them in this situation.




## List of requirements
Modul | ID | Name | Version | Explantation
------------ | ------------- | ------------ | ----------- | -----------
Permission | K1 | Login interface | 1.0 | The user can login to the application with his/her email and with the generated password
Modification | K2 | Create user | 1.0 | Creating user by adding text to the username field and adding password.
Modification | K3 | Delete time | 1.0 | Delete user by simply clicking on a delete button.
Modification | K4 | Create task| 1.0 | Create task by: EMPLOYER who created auto generated, EMPLOYEE  who is attached to the task, creation date auto generated, deadline added by the emplyer.
Modification | K5 | Modify task | 1.0 | In this field, the employers and employees can switch between task conditions
Modification | K6 | Register user | 1.1 | Only the admin can register the users.
Modification | K7 | Delete user | 1.1 | Only the admin can delete the user.
Permission | K8 | Permission levels | 1.1 | -Admin: Can create and delete users. Can manage the table by adding tasks to it or modifing them. Also he can delete tasks. -Employer: He can read the table and see everyones task alos he can add new tasks or can modify them. -Employee: They can only view the tasks and modify the task status. -
Modification | K9 | Dark mode | 1.0 | Changes the app theme. The background color becames dark and the texts become light


## Current business processes model
In today’s world, education doesn’t take advantage of existing technologies to make learning a lot more fun.
Young people are less and less willing to learn in a "classic" way. The Paper task management Nowdays was obsolete.
It can be made much more interesting and easier.
This is not an unified system, you cannot trace your own work, your own problems etc...
Excel was a step further, but even this isn't the system what this company needs.
Our company needs more redundant, and more traceable system.

## Required business processes model
building a completely reliable and easy-to-use system which everyone can easily use in their daily lives.
In order to simplify the tasks of the students, we create a program that is in line with today
can stand its ground in the world of electronics.
The ToDo app is an easy-to-use interface that everyone can use easily and dynamically every day.
This will make everyone's days easier. We can set tasks for ourselves and assign a deadline or a reminder
so that we don't forget to do it by accident;)
in the end, we can also set whether we’ve done the task, whether we still need time, or whether we shouldn’t do it anyway.

## Use cases
* ADMIN: Admin has the maxium permission level, beacuse if there is something wrong with the application, like user cannot login, or forgot password, admin can fix this.
* EMPLOYER: Employer has the permission level 2, employers can give task to the employees, and change the deadline, and change all condition of task.
* EMPLOYEE: Employee has the permission level 1, employees can see what task was given to them, and change the "In progress" condition to "Waiting to be reviewed".
![Use cases](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/business_plan_model.png)
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


























