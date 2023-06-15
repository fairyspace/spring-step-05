package bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "AAA");
        hashMap.put("10002", "BBB");
        hashMap.put("10003", "CCC");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }


}
