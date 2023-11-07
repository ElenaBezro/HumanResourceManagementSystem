package jobPositionManagement;

import applicantManagement.Applicant;

import java.util.ArrayList;
import java.util.List;

public class JobPosition {
    private String title;
    private String description;
    private double offeredSalaryRangeStart;
    private double offeredSalaryRangeEnd;
    private List<String> requiredSkills = new ArrayList<>();
    private String location;
    private String industry;
    private String role;


    public JobPosition(String title, String description, double offeredSalaryRangeStart, double offeredSalaryRangeEnd, List<String> requiredSkills, String location, String industry, String role) {
        this.title = title;
        this.description = description;
        this.offeredSalaryRangeStart = offeredSalaryRangeStart;
        this.offeredSalaryRangeEnd = offeredSalaryRangeEnd;
        this.requiredSkills = requiredSkills;
        this.location = location;
        this.industry = industry;
        this.role = role;
    }

    public String getTitle() {
        return title;
    }

    public String getIndustry() {
        return industry;
    }

    public String getRole() {
        return role;
    }

    public double getOfferedSalaryRangeStart() {
        return offeredSalaryRangeStart;
    }

    public double getOfferedSalaryRangeEnd() {
        return offeredSalaryRangeEnd;
    }

    public boolean isWithinBudget(Applicant applicant) {
        return applicant.getExpectedSalary() < offeredSalaryRangeEnd;
    }
}
