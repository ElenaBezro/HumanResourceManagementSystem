package recruiterManagement;

import jobPositionManagement.JobPosition;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterTest {

    @Test
    void isSpecializedForPositive() {
        //arrange
        JobPosition jobPosition = new JobPosition("IT", "Backend developer");

        Set<String> specializedIndustriesPositive = new HashSet<>();
        specializedIndustriesPositive.add("Sales");
        specializedIndustriesPositive.add("IT");

        Set<String> specializedRolesPositive = new HashSet<>();
        specializedRolesPositive.add("Backend developer");
        specializedRolesPositive.add("Frontend developer");

        Recruiter recruiterPositive1 = new Recruiter("Lena", specializedIndustriesPositive, specializedRolesPositive);

        //act && assert
        assertTrue(recruiterPositive1.isSpecializedFor(jobPosition));
    }

    @Test
    void isSpecializedForNegative() {
        //arrange
        JobPosition jobPosition = new JobPosition("IT", "Backend developer");

        Set<String> specializedIndustriesNegative = new HashSet<>();
        specializedIndustriesNegative.add("Sales");

        Set<String> specializedRolesNegative = new HashSet<>();
        specializedRolesNegative.add("Frontend developer");

        Set<String> specializedIndustriesPositive = new HashSet<>();
        specializedIndustriesPositive.add("Sales");
        specializedIndustriesPositive.add("IT");

        Set<String> specializedRolesPositive = new HashSet<>();
        specializedRolesPositive.add("Backend developer");
        specializedRolesPositive.add("Frontend developer");

        Recruiter recruiterNegative1 = new Recruiter("Lena", specializedIndustriesPositive, specializedRolesNegative);
        Recruiter recruiterNegative2 = new Recruiter("Lena", specializedIndustriesNegative, specializedRolesPositive);
        Recruiter recruiterNegative3 = new Recruiter("Lena", specializedIndustriesNegative, specializedRolesNegative);

        //act && assert
        assertFalse(recruiterNegative1.isSpecializedFor(jobPosition));
        assertFalse(recruiterNegative2.isSpecializedFor(jobPosition));
        assertFalse(recruiterNegative3.isSpecializedFor(jobPosition));
    }
}