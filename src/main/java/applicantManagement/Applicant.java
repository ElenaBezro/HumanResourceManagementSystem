package applicantManagement;

import java.util.ArrayList;
import java.util.List;

public class Applicant {
    private List<String> previousCompanies;
    private String currentCity;
    private  String preferredLocation;
    private  Double expectedSalary;
    private  Status applicationStatus;

    public Applicant(List<String> previousCompanies, String currentCity, String preferredLocation, Double expectedSalary, Status applicationStatus) {
        this.previousCompanies = previousCompanies;
        this.currentCity = currentCity;
        this.preferredLocation = preferredLocation;
        this.expectedSalary = expectedSalary;
        this.applicationStatus = applicationStatus;
    }

    public Double getExpectedSalary() {
        return expectedSalary;
    }

    public void setApplicationStatus(Status applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Status getApplicationStatus() {
        return applicationStatus;
    }

    public boolean isRelocationPreferred() {
        return !currentCity.equalsIgnoreCase(preferredLocation);
    }

    @Override
    public String toString() {
        return "Applicant: "
                + " previousCompanies=" + previousCompanies
                + " currentCity=" + currentCity
                + " preferredLocation=" + preferredLocation
                + " expectedSalary=" + expectedSalary
                + " expectedSalary=" + expectedSalary
                + " applicationStatus=" + applicationStatus;
    }
}
