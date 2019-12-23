**java中字典由map构成**
```java
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class MapTest {
    public static void main(String[] args)
    {
        Map map = new HashMap();
        // 增加键值对
        map.put("a",1);
        map.put("b",2);
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
```
**一些有用的方法**
* `clear()` 删除map中所有键值对
* `containsKey(key)`查询是否包含指定的key
* `containsValue`查询是否包含指定的value
* `get(key)`获取指定key对应的value
* `keySet()`返回map中所有Key组成的set
* `remove(key)`删除指定key对应的键值对
* `size()`返回map中键值对的个数
