# Financial Management System for University

This Java program implements a financial management system for a university, which includes the following functionalities:

- Collecting tuition fees into accounts
- Paying salaries to university staff
- Paying operational costs
- Checking account information
- Calculating current total expenses

## University Information Management

The program manages the following information about the university:
- University code
- University name

## Lecturer Information Management

For lecturers, the program manages the following information:
- Lecturer code
- Full name
- Year of birth
- Faculty
- Qualifications (bachelor, master, doctorate)
- Allowance
- Number of teaching hours per month
- Salary coefficient
- Starting year of work

## Administrative Staff Information Management

For administrative staff, the program manages the following information:
- Staff code
- Full name
- Year of birth
- Department
- Number of working days
- Salary coefficient
- Allowance
- Position (department head, deputy department head, staff).

## Temporary Worker Information Management

For temporary workers, the program manages the following information:
- Worker code
- Full name
- Year of birth
- Number of working days
- Daily wage
- Account balance

## Operational Cost Management

For operational costs, the program manages the following information:
- Cost code
- Cost name
- Quantity
- Unit price

The operational cost calculation is the total of all operational costs, with each cost calculated by the formula: Quantity x Unit price.

## Student Information Management

For students, the program manages the following information:
- Student code
- Full name
- Number of registered credits
- Credit unit price

Payments are made through bank transfers, and transaction details are managed as follows:
- Transaction code
- Source account
- Destination account
- Amount
- Time
- Expense period

## Salary Allowance Calculation

The salary allowance for university employees is calculated as follows:

| Employee     | Amount (USD/month) |
|--------------|---------------------|
| Bachelor     | 300                 |
| Master       | 900                 |
| Doctorate    | 2000                |
| Head of Dept | 1000                |
| Deputy Dept  | 600                 |
| Staff        | 400                 |

## Salary, Expense, and Tuition Fee Calculation

The salary, expense, and tuition fee calculations are as follows:

| Employee     | Formula                         |
|--------------|---------------------------------|
| Lecturer     | Salary coefficient x basic salary + allowance + number of teaching hours x 45 |
| Administrative Staff | Salary coefficient x minimum regional wage + allowance + number of working days x 30 |
| Temporary Worker | Number of working days x daily wage |
| Operational Cost | Quantity x unit price |
| Tuition Fee | Number of registered credits x credit unit price |

### Class and Interface Definitions

- `Account`: Interface for managing accounts with methods for getting balance, debiting, and crediting.
- `Staff`: Abstract class for university staff with methods for getting salary, setting name, and setting year of birth.
- `Payable`: Interface for managing payments with a method for getting the cost.

### Conclusion

This financial management system for a university in Java provides a comprehensive solution for managing finances, including staff salaries, operational costs, and tuition fees. It uses object-oriented programming principles to organize and manage data effectively.
