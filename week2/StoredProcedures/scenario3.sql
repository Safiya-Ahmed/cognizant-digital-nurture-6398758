CREATE TABLE accounts (
  account_id NUMBER PRIMARY KEY,
  customer_id NUMBER,
  balance NUMBER
);
INSERT INTO accounts VALUES (101, 1, 10000);
INSERT INTO accounts VALUES (102, 2, 5000);
INSERT INTO accounts VALUES (103, 3, 2000);

COMMIT;
CREATE OR REPLACE PROCEDURE TransferFunds (
  source_account_id IN NUMBER,
  target_account_id IN NUMBER,
  amount IN NUMBER
) IS
  source_balance NUMBER;
BEGIN
  SELECT balance INTO source_balance
  FROM accounts
  WHERE account_id = source_account_id;

  IF source_balance >= amount THEN
    UPDATE accounts
    SET balance = balance - amount
    WHERE account_id = source_account_id;

    UPDATE accounts
    SET balance = balance + amount
    WHERE account_id = target_account_id;

    COMMIT;
  ELSE
    DBMS_OUTPUT.PUT_LINE(' Insufficient balance in source account.');
  END IF;
END;
EXEC TransferFunds(101, 102, 3000);
SELECT * FROM accounts;
