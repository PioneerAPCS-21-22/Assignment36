# Assignment 36

For this assignment you will use an `ArrayList` to create an address book.

## Specifications

Download the three starter classes from Github and fill in the missing methods, as well as the `Runner`. The `Runner` should ask for input so that Contacts can be created and then added, accessed, and removed. Optionally, you can also add a method to edit a `Contact`.

## Sample Outputs

```
Would you like to (1) add, (2) access, (3) show list, or (4) delete? 1

What is the name? Mr. King
Mobile: 4085555555
Work: 4085356500
Email: cking@sjusd.org

Would you like to (1) add, (2) access, (3) show list, or (4) delete? 1

What is the name? Jane Dean
Mobile: 4085555557
Work: 4085356502
Email: jdean@sjusd.org

Would you like to (1) add, (2) access, (3) show list, or (4) delete? 3

Number of contacts: 2
-------------------------
| Jane Dean             |
| M: 4085555557         |
| W: 4085356502         |
| E: jdean@sjusd.org    |
-------------------------

-------------------------
| Mr. King              |
| M: 4085555555         |
| W: 4085356500         |
| E: cking@sjusd.org    |
-------------------------

Would you like to (1) add, (2) access, (3) show list, or (4) delete? 2

What is the name? Mr. King

-------------------------
| Mr. King              |
| M: 4085555555         |
| W: 4085356500         |
| E: cking@sjusd.org    |
-------------------------

Would you like to (1) add, (2) access, (3) show list, or (4) delete? 2

What is the name? Mr. V

Contact not found.

Would you like to (1) add, (2) access, (3) show list, or (4) delete? 4

What is the name? Jane Dean

Are you sure (yes/no)? This action cannot be undone. Yes

Contact has been removed.
```

### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.

