#### 1.以下代码的输出结果是
```
public class StaticDemo {

  int num1 = 6;
  static int num2 = 10;

  public static void main(String args[]) {
    StaticDemo s1 = new StaticDemo();
    StaticDemo s2 = new StaticDemo();
    s1.num1 = 15;
    s1.num2 = 17;
    s2.num1 = 22;
    s2.num2 = 28;
    System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " " + s2.num2);
  }
}
```

```
A. 15 17 22 28
B. 15 17 22 17
C. 15 28 22 28
D. 22 17 22 28
E. 22 28 22 28
F. 编译错误
```
C
#### 2.以下选项插入到代码片段中可以编译通过的是
```
public class Demo {

  final String exam1 = "O";  //常量 不能变
  static String exam2 = "C";

  {
    // CODE SNIPPET 1
  }

  static {
    // CODE SNIPPET 2
  }
}
```

```
A. exam1 = "A"; // CODE SNIPPET 1
B. exam2 = "J"; // CODE SNIPPET 1
C. exam1 = "P"; // CODE SNIPPET 2
D. exam2 = "8"; // CODE SNIPPET 2
E. 编译错误
F. 运行错误
```
B  D
#### 3.以下代码的输出结果是

```
public class StaticDemo {
  static String n1 = examName("O");
  {
    n1 = examName("A");
  }
  static {
    n1 = examName("C");
  }

  public static void main(String[] args) {
    StaticDemo sd = new StaticDemo();
  }

  public static String examName(String s) {
    System.out.println(s);
    return s;
  }
}
```
```
A. O C A
B. C A O
C. O A C
D. C A O
E. 编译错误
F. 运行错误
```
A
#### 4. 以下代码哪一行会编译错误
```
public class StaticDemo {
  StaticDemo sd = new StaticDemo();
  void method1() {
    method4();  // 1
    StaticDemo.method2(); // 2
    StaticDemo.method3(); // 3
  }
  static void method2() {

  }
  void method3() {
    method1(); //4
    method2(); //5
    sd.method2(); //6
  }
  static void method4() {
  }
}
```
```
A. 1
B. 2
C. 3
D. 4
E. 5
F. 6
```
C
#### 5. 以下代码的输出结果是
```
public class StaticDemo {
  int num1 = 3;
  static int num2 = 5;
   //  new  StaticDemo().num2
  StaticDemo(int num1, int num2) {
    if (num2 < 30) {
      this.num2 = num2;
    }
    num1 = num1;
  }
  public static void main(String args[]) {
    StaticDemo s1 = new StaticDemo(9, 10);
    StaticDemo s2 = new StaticDemo(12, 22);
    System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " " + s2.num2);

  }
}
```
```
A. 9 10 12 22
B. 9 22 12 22
C. 9 10 12 10
D. 3 22 3 22
E. 编译错误
```
D
#### 6. 以下代码的输出结果是
```
class Test1 {
  int x = 10;
  public static void main(String[] args) {
    Test1 t1 = new Test1();
    Test1 t2 = new Test1();
    t1.x = 20;
    System.out.print(t1.x + " ");
    System.out.println(t2.x);
  }
} 
```
```
A. 10 10
B. 20 20
C. 10 20
D. 20 10
```
D
#### 7. 以下代码的输出结果是
```
class Test1 {
  static int i = 1;
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      i = i + 2; //
      System.out.print(i + " ");
    }
  }
} 
```
```
A. 3 6 9
B. 3 6 9 …. 27
C. 编译错误
D. 没有输出
```
A
#### 8. 以下代码的输出结果是
```
class Test1 {
  static int i = 1;
  public static void main(String[] args) {
    int i = 1;
    for (Test1.i = 1; Test1.i < 10; Test1.i++) {
      i = i + 2;
      System.out.print(i + " ");
    }
  }
} 
```
```
A. 1 3 9
B. 1 2 3 … 9
C. 3 5 7 9 11 13 15 17 19
D. 无输出
```
C
#### 9. 以下代码的输出结果是
```
class Test1 {

  static int i = 1;

  public static void main(String[] args) {
    static int i = 1;
    for (Test1.i = 1; Test1.i < 10; Test1.i++) {
      i = i + 2;
      System.out.print(i + " ");
    }
  }
} 
```
```
A. 编译报错
B. 1 3 9
C. 3 5 7 9 11 13 15 17 19
D. 1 2 3 … 9
```
A
#### 10. 以下代码的输出结果是

```
class Test1 {

  public static void main(String[] args) {
    static int arr1[] = {11, 22, 33};
    static int arr2[] = {11, 22, 33, 44, 55};
    static int ptr[];
    ptr = arr1;
    arr1 = arr2;
    arr2 = ptr;
    System.out.print(arr1.length + " ");
    System.out.println(arr2.length);
  }
} 
```
```
A. 编译错误
B. 5 5
C. 5 3
D. 3 5
```
A
#### 11. 以下代码的输出结果是

```
class Test1 {
  public static void main(String[] args) {
    int x = 20;
    System.out.println(x);
  }

  static {
    int x = 10;
    System.out.print(x + " ");
  }
} 
```
```
A. 10 20
B. 20 10
C. 10 10
D. 20 20
```
A
#### 12. 以下代码的输出结果是
```
class Test1 {

  int x = 10;

  public static void main(String[] args) {
    System.out.println(x);
  }

  static {
    System.out.print(x + " ");
  }
} 
```
```
A. 10 10
B. 编译错误
C. 运行异常
D. 无输出
```
B
#### 13. 以下代码的输出结果是
```
class Test1 {

    int x = 10;

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1.x);
    }

    static {
        int x = 20;
        System.out.print(x + " "); 
    } 
} 
```
```
A. 10 20
B. 20 10
C. 10 10
D. 编译错误
```
B
#### 14. 以下代码的输出结果是

```
class Test1 {

  int x = 10;

  public static void main(String[] args) {
    System.out.println(Test1.x);
  }

  static {
    int x = 20;
    System.out.print(x + " ");
  }
} 
```
```
A. 10 10
B. 20 20
C. 20 10
D. 编译错误
```
D
#### 15. 以下代码的输出结果是
```
class Test1 {

  static int x = 10;

  public static void main(String[] args) {
    Test1 t1 = new Test1();
    Test1 t2 = new Test1();

    t1.x = 20;
    System.out.print(t1.x + " ");
    System.out.println(t2.x);
  }
} 
```
```
A. 10 10
B. 20 20
C. 10 20
D. 20 10
```
B
### 练习
补全`class Person`代码，分别统计创建Person对象的总数和调用了两个参数的构造方法的总数
补全`class club.banyuan.main.Main`中的`main`方法，结尾处输出以下内容
<pre>
一共创建了5个对象
两个参数的构造方法被调用了2次
</pre>

### 实现Product类具备以下属性和方法

属性
- name : String
- price : double
- scanCode : int
- num : int

方法
- 构造方法(String name,double price)
- String getName()
- int getScanCode()
- double getPrice()
- void changePrice(double)
- int getNum()
- void setNum(int)
- String getInfo()
- boolean buy(int)

ScanCode 是一个4位数字，首位数字不能为0，将在构造对象的时候自动生成，保证每一个Product对象的ScanCode是唯一的
buy 方法将num 减去传入的数字，如果传入数字较大表示库存不足，num不做修改则返回false，否则返回true

getInfo() 返回一个字符串如下
```
--- 产品信息 ---
名称: 手机
编码：1001
价格: 2001.00元
```

自己编写一个测试用的类，测试所有的方法功能正常