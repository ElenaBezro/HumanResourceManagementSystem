package recruiterManagement;


import applicantManagement.Applicant;
import applicantManagement.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Recruiter {
    private String name;
    private List<JobPosition> jobPositionsManaged = new ArrayList<>();

    private Set<Specialisation> specialisations;

    public Recruiter(String name, Set<Specialisation> specialisations) {
        this.name = name;
        this.specialisations = specialisations;
    }

    public void assignJobPosition(JobPosition jobPosition) {
        jobPositionsManaged.add(jobPosition);
    }

    public void reviewApplicant(Applicant applicant) {
        //TODO: check if applicant is suitable for any position
        applicant.setApplicationStatus(Status.REVIEWED);
    }
    public boolean isSpecializedFor(JobPosition jobPosition) {
        Map<Specialisation, List<String>> specialisationToJobTitleMap =  SpecialisationToJobTitle.getInstance().getMap();

        for (Specialisation spec: specialisations) {
            return specialisationToJobTitleMap.get(spec).contains(jobPosition.getTitle());
        }
        return false;
    }
    //: Checks if the recruiter is specialized for a given job position. [Details need to be provided.]



}
