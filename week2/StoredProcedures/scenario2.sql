CREATE TABLE employees (
  emp_id NUMBER PRIMARY KEY,
  name VARCHAR2(100),
  department VARCHAR2(50),
  salary NUMBER
);
INSERT INTO employees VALUES (1, 'Alice', 'HR', 50000);
INSERT INTO employees VALUES (2, 'Bob', 'IT', 60000);
INSERT INTO employees VALUES (3, 'Charlie', 'HR', 55000);
INSERT INTO employees VALUES (4, 'David', 'Finance', 70000);

COMMIT;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept_name IN VARCHAR2,
  bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_percent / 100)
  WHERE department = dept_name;

  COMMIT;
END;
EXEC UpdateEmployeeBonus('HR', 10);
SELECT * FROM employees;
