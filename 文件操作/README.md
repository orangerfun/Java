## File类
File类主要用来获取或处理与磁盘文件相关的信息，像文件名、 文件路径、访问权限和修改日期等，还可以浏览子目录层次结构；**File 类不具有从文件读取信息和向文件写入信息的功能，
它仅描述文件本身的属性**
在操作文件之前必须创建一个指向文件的链接或者实例化一个文件对象，也可以指定一个不存在的文件从而创建它;File类提供了如下三种形式构造方法:
```
File(File parent,String child)  根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例
File(String pathname)  给定路径名字符串转换成抽象路径名来创建一个新 File 实例;如果给定字符串是空字符串，则结果是空的抽象路径名
File(String parent,String child)  根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例
```
<br>

**一些常用方法**<br>
* `exists()`测试当前 File 是否存在<br>
* `isDirectory()`测试当前 File 对象表示的文件是否为一个路径<br>
* `list()`返回当前 File 对象指定的路径文件列表<br>
* `mkdir()`创建一个目录，它的路径名由当前 File 对象指定<br>
[**更多细节参考 click here**](http://c.biancheng.net/view/1133.html)

## 动态读取文件
动态读取是指从文件的任意位置开始访问文件，而不是必须从文件开始位置读取到文件末尾。动态读取需要用到 Java 中的 `RandomAccessFile` 类。
RandomAccessFile 类的构造方法有如下两种重载形式：
```
RandomAccessFile(File file, String mode)：访问参数 file 指定的文件，访问形式由参数 mode 指定，mode 参数有两个常用的可选值 r 和 rw，其中 r 表示只读，rw 表示读写
RandomAccessFile(String name, String mode)：访问参数 name 指定的文件，mode 参数的含义同上
```
如果使用 rw 方式声明 RandomAccessFile 对象时，要写入的文件不存在，系统将自动进行创建<br>
[**更详细参考 click here**](http://c.biancheng.net/view/1137.html)
