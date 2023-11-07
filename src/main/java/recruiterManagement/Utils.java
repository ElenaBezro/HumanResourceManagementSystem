package recruiterManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Utils {
    public static void fillSpecialisationToJobTitleMap(Map<Specialisation, List<String>> map) {
        List<String> jobTitlesHR = new ArrayList<>();
        jobTitlesHR.add("Human Resources Manager");
        jobTitlesHR.add("Talent Acquisition Specialist");
        jobTitlesHR.add("HR Generalist");

        List<String> jobTitlesIT = new ArrayList<>();
        jobTitlesIT.add("Software Engineer");
        jobTitlesIT.add("Network Administrator");
        jobTitlesIT.add("Database Developer");

        List<String> jobTitlesSales = new ArrayList<>();
        jobTitlesSales.add("Sales Representative");
        jobTitlesSales.add("Account Executive");
        jobTitlesSales.add("Business Development Manager");

        map.put(Specialisation.IT_RECRUITER, jobTitlesIT);
        map.put(Specialisation.HR_RECRUITER, jobTitlesHR);
        map.put(Specialisation.SALES_RECRUITER, jobTitlesSales);
    }
}
