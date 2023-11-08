package jobPositionManagement;

import applicantManagement.Applicant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class JobPositionTest {

    @Test
    void isWithinBudgetPositive() {
        //arrange
        Applicant applicantPositive = new Applicant(80000.00);
        JobPosition jobPosition = new JobPosition(70000.00, 90000.00);
        //act
        boolean ifPositive = jobPosition.isWithinBudget(applicantPositive);
        //assert
        assertTrue(ifPositive);
    }

    @Test
    void isWithinBudgetNegative() {
        //arrange
        Applicant applicantNegative = new Applicant(100000.00);
        JobPosition jobPosition = new JobPosition(70000.00, 90000.00);

        //act
        boolean ifNegative = jobPosition.isWithinBudget(applicantNegative);

        //assert
        assertFalse(ifNegative);
    }
    @Test
    void isWithinBudgetApplicantIsNull() {
        //arrange
        Applicant applicantNull = null;
        JobPosition jobPosition = new JobPosition(70000.00, 90000.00);

        //act
        boolean ifNull = jobPosition.isWithinBudget(applicantNull);

        //assert
        assertFalse(ifNull);
    }
}