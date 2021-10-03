# Requirement specification

## Overview
The employer can create tasks which he/she entrusts employees. Goal of the application is that the employees can see which tasks they have to do. The application uses android system which every user can use via the phone.
They see what task they have to do also who untrusted them with the job. Furthermore they can see when is the deadline date. It is good because the employer can monitor that what are each employees are doing.

## Current situation
From the very beginning, our company has stored tasks within the company on paper and excel.
Respectively, the employees of the company were able to view the tasks assigned to them through this, but this is not a very efficient solution, because the employees have to somehow
send a paper-based version or email to excel.The problem with excel is
that the user must find out from the table which task belongs to them.
Or you need to make a separate excel spreadsheet for each user which is not very practical.

## Dream System
The application is intended to replace the current system with a more structured and traceable system.  Application is avaible on Android mobilphones.
The application has a login interface, where employees and employers can login to the application, and they have different permission.
The application is always up-to-date and thanks to this the employees can trace what task given to them. Employers can easily manage their tasks.


## Functional requirements
The application provides login interface and user can contact with admins if something went wrong. 
Task Condition is selectable from the list which is in the top of the corner. 
These are the following conditions
1. Waiting to be processed
2. In progress
3. Waiting to be reviewed
4. Accepted
We can search by name and order by deadline.

## System laws, standards, recommendations 
This application is not open source and cannot be distributed for money. In addition, this application exclude any other copy version. 
Application must be use at company, it cannot be used at home.
This application was built by three main pillar.
1. Integrity
2. Availability
3. Confidentiality

## Current business process model
Nowadays the paper-based system is obsolete and not redundant as well. This is not an unified system, you cannot trace your own work, your own problems etc...
Excel was a step further, but even this isn't the system what this company needs. Our company needs more redundant, and more traceable system.
Paper-based task management is obsolete in the 21st century. That's a lot
printing and printing costs. It can also happen that the little paper we glued to our fridge simply escapes our attention. But we are also able to solve this problem.

## Required business process
The user can login in the welcome screen. There is two textboxes, one for the email and the second for the password.
And there is a hyperlink, where he can contact with the admin if there is some problem with his loing.
After the login, the application has to provide some function, of course it depends from the privileges level.
(Admin has the 3 privilege level, employers has the 2 and employees has to 1 level)
![Login screen](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/WelcomeScreen.png)


After the login, the user will see the interface below

![User Interface](https://github.com/Martonai/Project-Skidrow/blob/main/First%20Project/pictures/UserInterface.png)



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


## Reports
This is questionnaire where users can explain their opinion about the application:

1. Are you satisfied with this application?
2. Will you change something?
3. What kind of mark  are you rating this application?
4. Would you recommend to other companies?


## Glossary

