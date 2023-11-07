package recruiterManagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SpecialisationToJobTitle {
    private static SpecialisationToJobTitle instance = null;
    private Map<Specialisation, List<String>> map = new HashMap<>();

    private SpecialisationToJobTitle() {
    }

    public static SpecialisationToJobTitle getInstance() {
        if (instance == null) {
            instance = new SpecialisationToJobTitle();
            Utils.fillSpecialisationToJobTitleMap(instance.map);
        }
        return instance;
    }

    public Map<Specialisation, List<String>> getMap() {
        return map;
    }
}
