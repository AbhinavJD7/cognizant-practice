-- Stored procedure to add two numbers and print the sum
CREATE OR REPLACE PROCEDURE add_numbers(a IN NUMBER, b IN NUMBER) IS
    sum_result NUMBER;
BEGIN
    sum_result := a + b;
    DBMS_OUTPUT.PUT_LINE('Sum is: ' || sum_result);
END;
/

BEGIN
    add_numbers(10, 20); -- Replace 10 and 20 with any numbers
END;
/