package hrSystemOperations;

import applicantManagement.Applicant;
import applicantManagement.Status;
import jobPositionManagement.JobPosition;
import org.junit.jupiter.api.Test;
import recruiterManagement.Recruiter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HRSystemTest {

    @Test
    void addJobPosition() {
        //arrange
        HRSystem hrSystem = new HRSystem();
        JobPosition jobPosition = new JobPosition(70000.00, 90000.00);
        //act
        hrSystem.addJobPosition(jobPosition);
        //assert
        assertTrue(hrSystem.getJobPositions().contains(jobPosition));
        assertEquals(hrSystem.getJobPositions().get(0).getOfferedSalaryRangeStart(), 70000.00);
    }

    @Test
    void addRecruiter() {
        //arrange
        HRSystem hrSystem = new HRSystem();
        Recruiter recruiter = new Recruiter("Lena");
        //act
        hrSystem.addRecruiter(recruiter);
        //assert
        assertTrue(hrSystem.getRecruiters().contains(recruiter));
        assertEquals(hrSystem.getRecruiters().get(0).getName(), "Lena");
    }

    @Test
    void addApplicant() {
        //arrange
        HRSystem hrSystem = new HRSystem();
        Applicant applicant = new Applicant(100.00);

        //act
        hrSystem.addApplicant(applicant);
        //assert
        assertTrue(hrSystem.getApplicants().contains(applicant));
    }

    @Test
    void generateReports() {
        //arrange
        HRSystem hrSystem = new HRSystem();
        Applicant applicant = new Applicant(100.00);
        JobPosition jobPosition = new JobPosition("Backend developer");
        jobPosition.addApplicant(applicant);
        Status status = Status.REVIEWED;
        Recruiter recruiter = new Recruiter("Lena");
        recruiter.reviewApplicant(applicant);
        hrSystem.addApplicant(applicant);
        hrSystem.addJobPosition(jobPosition);
        String positiveOutput = "Status: " + status + '\n' + "---- " + applicant + '\n' + "Job Position: " + jobPosition.getTitle() + '\n' + "---- " + applicant + '\n';

        //act
        String report = hrSystem.generateReportsInternally();

        //assert
        assertEquals(positiveOutput, report);
    }
}