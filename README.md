## Important Points About Coding:
- The submission must have full unit test coverage.
- Design the solution considering future use case.
- Code as if writing for production, avoid if-else waterfalls.
- You would be asked to enhance the same solution for in-office interview.
- Ideally it should take 2-3 days to implement, if you need more time do inform us upfront.
- Do not remove anything that is already present in build.gradle, as it helps us automate a few things for evaluation

## Important Points about the exercise:
- Please do not share the coding problem or solution with anyone. 
- Avoid publishing problem statement, and your code in any public forum like Github.
- Please do not copy paste solutions from any website. We deploy plagiarism tools to check code submissions. 
- We value integrity the most in our potential candidates. Any breach of above points would immediately disqualify you from any future considerations.


# Medly Coding Test: Income Tax Calculator

In the country of **Coderland**, the annual income tax for an individual is calculated based on their total earnings and investments for a given financial year according to rules that are predefined for a financial year.

### Notes
- Luckily, Coderland's Financial Year is aligned to Calendar Year i.e. Jan-Dec.
- Coincidentally, Coderland's Currency is INR (₹) and follows [Indian Numbering System](https://en.wikipedia.org/wiki/Indian_numbering_system)

### Rules
Here are rules for last three consecutive years:

##### 2018:

| Income Range             | Tax Percentage |
| ------------------------ | :------------- |
| < ₹ 1,00,000             | 0%             |
| ₹ 1,00,001 - ₹ 5,00,000  | 10%            |
| ₹ 5,00,001 - ₹ 10,00,000 | 20%            |
| > ₹ 10,00,000            | 30%            |

- One can reduce taxable income by investing in tax-free Government Bonds up to ₹1,00,000.
- If individual’s total tax is above ₹ 5,00,000 then they are charged cess of 1% on total tax amount.

##### 2019:

| Income Range             | Tax Percentage |
| ------------------------ | :------------- |
| < ₹ 1,00,000             | 0%             |
| ₹ 1,00,001 - ₹ 6,00,000  | 10%            |
| ₹ 6,00,001 - ₹ 12,00,000 | 20%            |
| > ₹ 12,00,000            | 30%            |

- One can reduce taxable income by investing in tax free Government Bonds up to ₹1,50,000. 
- If individual’s total tax is above ₹ 5,00,000 then they are charged cess of 2% on total tax amount.
- For Taxpayers above age 60, taxable income is reduced by 50,000 for purpose of calculations.

##### 2020:

| Income Range             | Tax Percentage |
| ------------------------ | :------------- |
| < ₹ 1,00,000             | 0%             |
| ₹ 1,00,001 - ₹ 10,00,000 | 15%            |
| > ₹ 10,00,000            | 25%            |

- One can reduce taxable income by investing in tax free Government Bonds up to ₹2,00,000.
- If individual’s total tax is above ₹ 5,00,000 then they are charged cess of 5% on total tax amount.
- For Taxpayers above age 60, taxable income is reduced by 75,000 for purpose of calculations.

### Example 1:

> For Duke (aged 25), who earns ₹ 8,25,000 per annum and invests ₹75,000 in tax free govt bonds his 2019 payable tax will be calculated as follows:
>
> After investment deduction,
>
> net taxable income = ₹8,25,000 - ₹75,000 = ₹7,50,000
>
> out of which on first ₹1,00,000 tax is ₹0 
>
> on next ₹5,00,000 tax is 10% i.e. ₹50,000
>
> and on remaining ₹1,50,000 tax is 20% i.e. ₹30,000
>
> so total tax payable would be ₹80,000
>
> total cess = ₹ 0 

### Example 2:

> For Gopher (aged 65), who earns ₹ 38,00,000 per annum and invests ₹1,00,000 in tax free govt bonds. His 2020 payable tax will be calculated as follows:
>
> After investment deduction,
>
> net taxable income = ₹38,00,000 - ₹1,00,000 = ₹37,00,000
>
> Because he is above 60, he is eligible for additional deduction
>
> net taxable income = ₹37,00,000 - ₹75,000 = ₹36,25,000
>
> out of which on first ₹1,00,000 tax is ₹0 
>
> on next ₹9,00,000 tax is 15% i.e. ₹1,35,000
>
> and on remaining ₹26,25,000 tax is 25% i.e. ₹6,56,250
>
> so total tax payable would be  ₹7,91,250
>
> since tax is above ₹5,00,000 additional 5% cess will be added
>
> so cess  = ₹7,91,250 * 5% = 39,562.5 
>
> total tax + cess payable = ₹8,30,812.5 

## Problem Statement
For a given year, age of user, user's taxable income and total tax free investments, write a program that can read a file with following content format:

```
year,age,income,investment
```

e.g.

```
2019,28,500000,75000
2020,62,100000,0
2020,33,1800000,200000
```

And produce the output corresponding to each row:

```
tax,cess,total
tax,cess,total
tax,cess,total
```

Output should be int/float numbers only, no commas, no currency symbols etc.

**Good to have**: CLI Variation 

```
tax-calc --year 2019 --income 230000 --investment 75000 --age 40
```

## Submitting your solution

Please push your changes to the `master branch` of this repository. You can push one or more commits. <br>

Once you are finished with the task, please click the `Complete task` link on <a href="https://app.codescreen.dev/#/codescreentest7dc09a0e-9d96-4c24-94db-40c9f440489a" target="_blank">this screen</a>.TaxCalculator
