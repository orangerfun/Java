//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class MapTest {
    public static void main(String[] args)
    {
        Map map = new HashMap();
        // 增加键值对
        map.put("a","1");
        map.put(4,"china");
        map.put("c",3);
        System.out.println(map);
        // 判断是否包含指定key
        System.out.println(map.containsKey("a"));
        // 判断是否包含指定value
        System.out.println(map.containsValue(3));
        // 遍历所有key-value键值对
        for (Object key:map.keySet())
        {
            System.out.println(key+"-->"+map.get(key));
        }
        // 根据key,删除键值对
        map.remove("c");
        System.out.println(map);
    }
}
