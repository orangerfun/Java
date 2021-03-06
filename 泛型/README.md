Java 集合有个缺点，就是把一个对象“丢进”集合里之后，集合就会“忘记”这个对象的数据类型，当再次取出该对象时，该对象的编译类型就变成了 Object 类型；
**泛型本质上是提供类型的“类型参数”，也就是参数化类型。我们可以为类、接口或方法指定一个类型参数，通过这个参数限制操作的数据类型，
从而保证类型转换的绝对安全** <br>
## 泛型集合
 泛型的格式如下:
 ```java
 Map<Integer, Book> books = new HashMap<Integer, Book>()
 ```
 上面这行代码表示：创建了一个键类型为 Integer、值类型为 Book 的泛型集合，即指明了该 Map 集合中存放的键必须是 Integer 类型、值必须为 Book 类型，否则编译出错<br>

## 泛型类
除了可以定义泛型集合之外，还可以直接限定泛型类的类型参数。语法格式如下：
```java
public class class_name<data_type1,data_type2,…>{}
```
其中，class_name 表示类的名称，data_ type1 等表示类型参数。Java 泛型支持声明一个以上的类型参数，只需要将类型用逗号隔开即可<br>

泛型类一般用于类中的属性类型不确定的情况下。在声明属性时，使用下面的语句：
```java
private data_type1 property_name1;
private data_type2 property_name2;
```
data_type1 与类声明中的 data_type1 表示的是同一种数据类型<br>

在实例化泛型类时，需要指明泛型类中的类型参数，并赋予泛型类属性相应类型的值

