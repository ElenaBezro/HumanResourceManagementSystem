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

    public List<JobPosition> getJobPositions() {
        return jobPositions;
    }

    public List<Recruiter> getRecruiters() {
        return recruiters;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }

    //This method is only for test purposes
    public String generateReportsInternally() {
        StringBuilder result = new StringBuilder();
        Map<Status, List<Applicant>> statusToApplicantsMap = applicants
                .stream()
                .collect(Collectors.groupingBy(Applicant::getApplicationStatus));
        statusToApplicantsMap.forEach((status, applicants) -> {
            result.append("Status: ")
                    .append(status)
                    .append('\n');
            for (Applicant applicant: applicants) {
                result.append("---- ")
                        .append(applicant)
                        .append('\n');
            }
        });

        Map<JobPosition, List<Applicant>> jobPositionToApplicantsMap = jobPositions
                .stream()
                .collect(Collectors.toMap(jobPosition -> jobPosition,
                        jobPosition -> jobPosition.getApplicants()));

        jobPositionToApplicantsMap.forEach((jobPosition, applicants) -> {
            result.append("Job Position: ")
                    .append(jobPosition.getTitle())
                    .append('\n');
            for (Applicant applicant: applicants) {
                result.append("---- ")
                        .append(applicant)
                        .append('\n');
            }
        });

        return result.toString();
    }

    public void generateReports() {
        System.out.println(generateReportsInternally());
    }

}
