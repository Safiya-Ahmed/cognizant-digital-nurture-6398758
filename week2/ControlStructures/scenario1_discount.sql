--Create customers table
CREATE TABLE customers (
  customer_id NUMBER PRIMARY KEY,
  name VARCHAR2(100),
  age NUMBER,
  balance NUMBER,
  IsVIP VARCHAR2(10)
);

-- Create loans table
CREATE TABLE loans (
  loan_id NUMBER PRIMARY KEY,
  customer_id NUMBER REFERENCES customers(customer_id),
  interest_rate NUMBER,
  due_date DATE
);

-- Insert sample data
INSERT INTO customers VALUES (1, 'Alice', 65, 12000, 'FALSE');
INSERT INTO customers VALUES (2, 'Bob', 45, 8000, 'FALSE');
INSERT INTO customers VALUES (3, 'Charlie', 70, 15000, 'FALSE');

INSERT INTO loans VALUES (101, 1, 9.5, SYSDATE + 10);
INSERT INTO loans VALUES (102, 2, 10.0, SYSDATE + 40);
INSERT INTO loans VALUES (103, 3, 8.5, SYSDATE + 5);

COMMIT;
BEGIN
  FOR cust_rec IN (
    SELECT c.customer_id, c.age, l.loan_id, l.interest_rate
    FROM customers c
    JOIN loans l ON c.customer_id = l.customer_id
  )
  LOOP
    IF cust_rec.age > 60 THEN
      UPDATE loans
      SET interest_rate = interest_rate - 1
      WHERE loan_id = cust_rec.loan_id;
    END IF;
  END LOOP;

  COMMIT;
END;
SELECT * FROM loans;