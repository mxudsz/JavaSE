import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    @Test
    public void testMap(){
        Map<String,Object> map=new HashMap<String, Object>();

        map.put("key01","value01");
        map.put("key02","key01");
        map.put("key01","value02");
        System.out.println(map.toString());
    }
}
