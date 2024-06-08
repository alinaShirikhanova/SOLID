package open_close;

import java.util.HashMap;

public class BonusStatuses {
    static HashMap<String, Double> statuses = new HashMap<>() {{
        put("PLATINUM", 0.3);
        put("GOLDEN", 0.2);
        put("SILVER", 0.1);
        put("BRONZE", 0.05);
    }};

    public static double getDiscount(String status) {
        return statuses.get(status);
    }
}