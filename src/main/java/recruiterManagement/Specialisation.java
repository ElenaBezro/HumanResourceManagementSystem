package recruiterManagement;

public enum Specialisation {
    //TODO: use in Recruiter specializedIndustries
    IT_RECRUITER("IT"),
    MARKETING_RECRUITER("Marketing"),
    SALES_RECRUITER("Sales");

    private String specialisation;

    Specialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }
}
