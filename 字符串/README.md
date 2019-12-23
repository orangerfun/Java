**Java提供String和StringBuffer两个类来封装字符串**<br>
String是不可变类，一旦String对象被创建后，该字符串序列不可变<br>
StringBuffer对象代表可变的字符串序列，可以改变其中字符

### 1. String类
```java
public class StringClass {
    public static void main(String[] args)
    {
        char[] content = {'a','b','c'};
        //String s = new String("i love china, heihei");
        String s = "i love China, heihei";
        // 获取指定位置的字符
        System.out.println(s.charAt(3));
        // 链接两个字符串，相当于+
        System.out.println(s.concat("abd"));
        // 是否以某字符（串结尾）
        System.out.println(s.endsWith("i"));
        //返回某字符第一次出现的位置
        System.out.println(s.indexOf("i",4));
        //返回字符串长度
        System.out.println(s.length());
        //全部转换成小写
        System.out.println(s.toLowerCase());

        s = s+"i love anhui to";
        System.out.println(s);
    }
}
```
**一些有用的方法集合**<br>
`charAt(index)`:获取指定位置的字符<br>
`endsWith(char)`:是否以某字符（串结尾）<br>
`indexOf(char,from)`: 从某个索引开始，字符char首次出现的位置，当不设置from参数时，默认从头开始<br>
`toLowerCase()`:全部转换成小写<br>
`concat(String)`:将String链接在string的后头<br>

### 2.StringBuilder/StringBuffer
```java
public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("i love china,");
        System.out.println(sb);
//      在末尾追加字符串
        sb.append("i also love anhui");
        System.out.println(sb);
//       中间某位置插入字符串
        sb.insert(0, "haha ");
        System.out.println(sb);
//      删除索引从2到5的字符,不包括5
        sb.delete(2,5);
        System.out.println(sb);
//      翻转
        sb.reverse();
        System.out.println(sb);
    }
```
