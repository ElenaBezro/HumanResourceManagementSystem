package recruiterManagement;

import jobPositionManagement.JobPosition;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterTest {

    @Test
    void isSpecializedFor() {
        //arrange
        JobPosition jobPosition = new JobPosition("IT", "Backend developer");

        Set<String> specializedIndustriesPositive = new HashSet<>();
        Set<String> specializedIndustriesNegative = new HashSet<>();
        specializedIndustriesPositive.add("Sales");
        specializedIndustriesPositive.add("IT");
        specializedIndustriesNegative.add("Sales");

        Set<String> specializedRolesPositive = new HashSet<>();
        Set<String> specializedRolesNegative = new HashSet<>();
        specializedRolesPositive.add("Backend developer");
        specializedRolesPositive.add("Frontend developer");
        specializedRolesNegative.add("Frontend developer");

        Recruiter recruiterPositive1 = new Recruiter("Lena", specializedIndustriesPositive, specializedRolesPositive);
        Recruiter recruiterNegative1 = new Recruiter("Lena", specializedIndustriesPositive, specializedRolesNegative);
        Recruiter recruiterNegative2 = new Recruiter("Lena", specializedIndustriesNegative, specializedRolesPositive);
        Recruiter recruiterNegative3 = new Recruiter("Lena", specializedIndustriesNegative, specializedRolesNegative);

        //act && assert
        assertTrue(recruiterPositive1.isSpecializedFor(jobPosition));
        assertFalse(recruiterNegative1.isSpecializedFor(jobPosition));
        assertFalse(recruiterNegative2.isSpecializedFor(jobPosition));
        assertFalse(recruiterNegative3.isSpecializedFor(jobPosition));
    }
}