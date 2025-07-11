BEGIN
  FOR loan_rec IN (
    SELECT c.name, c.customer_id, l.loan_id, l.due_date
    FROM customers c
    JOIN loans l ON c.customer_id = l.customer_id
    WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
  )
  LOOP
    DBMS_OUTPUT.PUT_LINE(
      ' Reminder: ' || loan_rec.name || 
      ' (Customer ID: ' || loan_rec.customer_id || 
      ') — your Loan ID ' || loan_rec.loan_id || 
      ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY')
    );
  END LOOP;
END;
SELECT * FROM loans;
