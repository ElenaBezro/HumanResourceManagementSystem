package hrSystemOperations;

import applicantManagement.Applicant;
import applicantManagement.Status;
import jobPositionManagement.JobPosition;
import recruiterManagement.Recruiter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HRSystem {
    private List<JobPosition> jobPositions = new ArrayList<>();
    private List<Recruiter> recruiters = new ArrayList<>();
    private List<Applicant> applicants = new ArrayList<>();

    public void addJobPosition(JobPosition jobPosition) {
        boolean isValid = Utils.validateJobPosition(jobPosition);
        if(isValid) {
            jobPositions.add(jobPosition);
        }
    }
    public void addRecruiter(Recruiter recruiter) {
        boolean isValid = Utils.isNotNull(recruiter);
        if(isValid) {
            recruiters.add(recruiter);
        }
    }

    public void addApplicant(Applicant applicant) {
        boolean isValid = Utils.isNotNull(applicant);
        if(isValid) {
            applicants.add(applicant);
        }
    }

    public void generateReports() {
        Map<Status, List<Applicant>> statusToApplicantsMap = applicants
                .stream()
                .collect(Collectors.groupingBy(Applicant::getApplicationStatus));
        statusToApplicantsMap.forEach((status, applicants) -> {
            System.out.println("Status: " + status);
            for (Applicant applicant: applicants) {
                System.out.println("---- " + applicant);
            }
        });

        //TODO: how to connect Applicant to a JobPosition?
        //Map<JobPosition, List<Applicant>> jobPositionToApplicantsMap = new HashMap<>();
    }

}
