package recruiterManagement;


import applicantManagement.Applicant;
import applicantManagement.Status;
import jobPositionManagement.JobPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Recruiter {
    private String name;
    private List<JobPosition> jobPositionsManaged = new ArrayList<>();
    private Set<String> specializedIndustries;
    private Set<String> specializedRoles;

    public Recruiter(String name, Set<String> specializedIndustries, Set<String> specializedRoles) {
        this.name = name;
        this.specializedIndustries = specializedIndustries;
        this.specializedRoles = specializedRoles;
    }

    public void assignJobPosition(JobPosition jobPosition) {
        jobPositionsManaged.add(jobPosition);
    }

    public void reviewApplicant(Applicant applicant) {
        //TODO: check if applicant is suitable for any position
        applicant.setApplicationStatus(Status.REVIEWED);
    }
    public boolean isSpecializedFor(JobPosition jobPosition) {

        return specializedIndustries.contains(jobPosition.getIndustry())
                && specializedRoles.contains(jobPosition.getRole());
    }
}
