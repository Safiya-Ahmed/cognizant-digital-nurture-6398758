CREATE TABLE savings_accounts (
  account_id NUMBER PRIMARY KEY,
  customer_id NUMBER,
  balance NUMBER
);
INSERT INTO savings_accounts VALUES (101, 1, 10000);
INSERT INTO savings_accounts VALUES (102, 2, 20000);
INSERT INTO savings_accounts VALUES (103, 3, 30000);

COMMIT;
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE savings_accounts
  SET balance = balance + (balance * 0.01);
  
  COMMIT;
END;
EXEC ProcessMonthlyInterest;
SELECT * FROM savings_accounts;

