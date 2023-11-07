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

    public JobPosition(String title, String description, double offeredSalaryRangeStart, double offeredSalaryRangeEnd, List<String> requiredSkills, String location) {
        this.title = title;
        this.description = description;
        this.offeredSalaryRangeStart = offeredSalaryRangeStart;
        this.offeredSalaryRangeEnd = offeredSalaryRangeEnd;
        this.requiredSkills = requiredSkills;
        this.location = location;
    }

    public boolean isWithinBudget(Applicant applicant) {
        return applicant.getExpectedSalary() < offeredSalaryRangeEnd;
    }
}
