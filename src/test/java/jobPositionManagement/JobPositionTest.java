package jobPositionManagement;

import applicantManagement.Applicant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class JobPositionTest {

    @Test
    void isWithinBudget() {
        Applicant applicantPositive = new Applicant(80000.00);
        Applicant applicantNegative = new Applicant(100000.00);
        Applicant applicantNull = null;

        JobPosition jobPosition = new JobPosition(70000.00, 90000.00);

        boolean ifPositive = jobPosition.isWithinBudget(applicantPositive);
        boolean ifNegative = jobPosition.isWithinBudget(applicantNegative);
        boolean ifNull = jobPosition.isWithinBudget(applicantNull);

        assertTrue(ifPositive);
        assertFalse(ifNegative);
        assertFalse(ifNull);
    }
}