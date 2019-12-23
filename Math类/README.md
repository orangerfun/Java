**两个变量**：`Math.E=e`;`Math.PI=pai`<br>
Math类中的都是类方法，可直接用类名来调用
```java
public class MATH {
    public static void main(String[] args){
//        余弦计算
        System.out.println(Math.cos(3));
//        四舍五入取整
        System.out.println(Math.round(4.5));
//        计算平方根
        System.out.println(Math.sqrt(5));
//        计算立方根
        System.out.println(Math.cbrt(5));
//        计算e的n次幂
        System.out.println(Math.exp(2));
//        计算乘方
        System.out.println(Math.pow(2,3));
//        计算以10为底的对数
        System.out.println(Math.log10(10));
//        计算自然对数
        System.out.println(Math.log(Math.E));
//        计算绝对值
        System.out.println(Math.abs(-7));
//        符号函数
        System.out.println(Math.signum(-9));
//        最大值
        System.out.println(Math.max(5,7));
//        最小值
        System.out.println(Math.min(3,4));
//        返回0-1之间的随机数
        System.out.println(Math.random());
    }
}
```
