package recruiterManagement;

public enum Specialisation {
    IT_RECRUITER("IT recruiterManagement.Recruiter"),
    HR_RECRUITER("HR recruiterManagement.Recruiter"),
    SALES_RECRUITER("Sales recruiterManagement.Recruiter");

    private String specialisation;

    Specialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }
}
