package hrSystemOperations;

import jobPositionManagement.JobPosition;

public class Utils {
    public static boolean validateJobPosition(JobPosition jobPosition) {
        if (!isNotNull(jobPosition)) {
            return false;
        }
        if (jobPosition.getOfferedSalaryRangeStart() > jobPosition.getOfferedSalaryRangeEnd()) {
            System.out.println("JobPosition salary range is incorrect. Invalid operation.");
            return false;
        }
        return true;
    }
    public static boolean isNotNull(Object obj) {
        if (obj == null) {
            System.out.println("Value is null. Invalid operation.");
            return false;
        }
        return true;
    }
}
