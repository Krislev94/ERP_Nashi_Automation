### Application Under Test
https://qa.twiliaerp.com/web/login

### Repository
https://github.com/Krislev94/ERP_Nashi_Automation

### Jira Link
https://jira.cydeo.com/secure/RapidBoard.jspa?rapidView=1454&projectKey=B29G32&view=planning&issueLimit=100

### Naming Convention:

| `Point`              | `Instructions`                                           |
|---------------------|---------------------------------------------------------|
| `Feature files`      | US01_MainModules.feature (another ex. US04_CalendarModule) |
| `Step Defs`           | US01_StepDefs_GS (GS - are your initials)               |
| `Pages`               | MainModulesPage_GS (GS - are your initials)             |
| `git Branch`          | USO1_JiraIDNumber (ex. US07_B29G32-213)                 |
| `Test Cases On JIRA`  | USO1_JiraIDNumber (ex. US07_B29G32-213)                 |
| `Test Execution On JIRA` | US01 Login Functionality - Test Execution               |


### Login credentials
| `Role`            | `User Name` | `Password` |
|-------------------|-----------|----------|
| `POS Manager`       |    posmanager5 -- 155@info.com       |     posmanager     |
| `CRM Manager`       |eventscrmmanager1 --- 120@info.com|eventscrmmanager|
| `Sales Manager`     |salesmanager5 -- 105 @info.com |salesmanager|
| `Inventory Manager` |imm10 -- 160 @info.com|inventorymanager|
| `Expenses Manager`  |expensesmanager10 -- 110@info.com|expensesmanager|

### Template Automation Framework For Project Implementation

- Team Lead and members clone that project
- Then team will create their own project by using that template which has all folder structure and dependencies
  are needed

### While project creation:

>1. Team will use own project name for
    package name

>2. Copy runners package and paste under project package

>3. Change CukesRunner glue key

>4. Change FailedTestRunner glue

>5. Copy features directory paste in your resources directory

>6. Copy step_definitions packege and paste under your project package

>7. Copy pages package and paste under your project package

>8. Copy utilities package and paste under your project package

### *** IMPORTANT ***

>- Fix your each class import statements


