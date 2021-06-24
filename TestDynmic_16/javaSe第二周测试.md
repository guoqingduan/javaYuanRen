## 一、选择题（2*40）

1. 下面描述函数重写错误的是（C）

   A.   要有子类继承或实现

   B.   子类方法的权限必须大于等于父类的权限

   C.   父类中被private权限修饰的方法可以被子类重写

   D.   子类重写接口中的抽象方法,子类的方法权限必须是public的



2. 关于封装下面介绍错误的是（D）。

   A.   封装将变化隔离

   B.   封装提高重用性。

   C.   封装安全性

   D.   只有被private修饰才叫做封装

 

3. 试图编译运行下面的代码会发生什么情况（D）

   public class MyClass{

   static int i;

   public static void main(String[] args){

    System.out.println(i);

   }

   }

   A.   错误，变量i没有被初始化

   B.   输出null

   C.   输出1

   D.   输出0

 

4. 在Java中，下面对于构造函数的描述正确的是（D）。

   A.   类必须显式定义构造函数

   B.   构造函数的返回类型是void

   C.   构造函数和类有相同的名称，并且不能带任何参数

   D.   一个类可以定义多个构造函数

 

5. 下面Java代码的运行结果是（C）。

   class Penguin {

   private String name=null; // 名字

   private int health=0; // 健康值

   private String sex=null; // 性别

   public void Penguin() {         //是一般方法，不是构造方法

   healt = 10;

   sex = "雄";

   System.out.println("执行构造方法。");

   }

   public void print() {

   System.out.println("企鹅的名字是" + name +

   "，健康值是" + health + "，性别是" + sex+ "。");

   }

   public static void main(String[] args) {

   Penguin pgn = new Penguin();

   pgn.print();

   }

   }

   A.   企鹅的名字是null，健康值是10，性别是雄。

   B.   执行构造方法。

   企鹅的名字是null，健康值是0，性别是null。

   C.   企鹅的名字是null，健康值是0，性别是null。

   D.   执行构造方法。

   企鹅的名字是null，健康值是10，性别是雄。



6. class A {

   public int i = 10;

   }

   class B extends A{

   public int i = 20;

   }

   public class Test{

   public static void main(String args[]){

   B b = new B();

   A a = b;    

   System.out.println(b.i);

   System.out.println(a.i);

   }

   }输出为多少 ( C )

   A.10 10

   B.10 20  

   C.20 10

   D.20 20

    

7. 下面说法正确的是( C )。

   A.   匿名内部类编译后不会生成.class文件

   B.   接口编译后不会生成.class文件

   C.   抽象类中没有构造方法

   D.   局部内部类只能访问被final修饰的局部变量。	



8. 下面对this的作用描述错误的是(D)

   A.   当成员变量和局部变量重名的时候可以用this区分

   B.   this()语句必须放在构造函数的第一行,根据this后面括号中的参数调用本类其他的构造函数.

   C.   this可以调用本类的一般函数

   D.   this可以调用父类的一般函数

 

9. 在Java中，以下程序编译运行后的输出结果为（C）。

   public class Test {

   int x, y;

   Test(int x, int y) {

   this.x = x;

   this.y = y;

   } 

   public static void main(String[] args) {

   Test pt1, pt2;

   pt1 = new Test(3, 3);

   pt2 = new Test(4, 4);

   System.out.print(pt1.x + pt2.x);}

   }

   A.   6

   B.   3 4

   C.   8

   D.   7

 

10. 在Java语言中，下列关于类的继承的描述，正确的是（ B ）。 

    A.   一个类可以继承多个父类

    B.   一个类可以具有多个子类

    C.   子类可以使用父类的所有方法

    D.   子类一定比父类有更多的成员方法

 

11. Java中，如果类C是类B的子类，类B是类A的子类，那么下面描述正确的是（B）。

    A.   C可以继承B中的公有成员，同样也可以继承A中的公有成员

    B.   C只继承了B中的成员 

    C.   C只继承了A中的成员

    D.   C不能继承A或B中的成员

 

12. 给定一个Java程序Test.java的代码如下所示，编译时，会出现以下（C ）情况。

    class Parent {

    public int count() {        // 第1行

    return 0;

    }

    } 

    public  class Test  extends Parent {

    public float count() {        // 第2行

    return 9;         // 第3行

    }

    }

    A.   编译通过

    B.   在第1行引发编译错误

    C.   在第2行引发编译错误

    D.   在第3行引发编译错误

 

13. 给定如下一个Java源文件Child.java，编译并运行Child.java，以下结果正确的是（  B）。

    class Parent1 {

    Parent1(String s){

    System.out.println(s);

    }

    }

    class Parent2  extends Parent1{

    Parent2(){

    System.out.println("parent2");

     }

    }

    public class Child extends Parent2 {

    public static void main(String[] args) {

    Child child = new Child();

    }

    }

    A.   编译错误：没有找到构造器Child()

    B.   编译错误：没有找到构造器Parent1()  //因为当我们给出了构造方法，系统将不再提供默认的无参构造函数

    C.   正确运行，没有输出值

    D.   正确运行，输出结果为：parent2

 

14. 给定Java程序Child.java的代码如下所示，则编译运行该类的结果是（ A ）。

    class Parent { 

    Parent() {

    System.out.println("parent"); 

    } 

    } 

    public class Child extends Parent {

    Child(String s) {

    System.out.println(s);

    }

    public static void main(String[] args) {

    Child child = new Child("child");

    }

    }

    A.   child

    B.   child

    parent

    C.   parent

    child

    D.   编译错误

     

15. 下列选项中关于Java中super关键字的说法错误的是（ B ）。

    A.   当子父类中成员变量重名的时候,在子类方法中想输出父类成员变量的值,可以用super区分子父类成员变量

    B.   super语句可以放在构造函数的任意一行

    C.   子类可以通过super关键字调用父类的方法

    D.   子类可以通过super关键字调用父类的属性

 

16. 分析如下所示的Java代码，则选项中的说法正确的是（C ）。

    ​	class Parent{

    public String name;

    public Parent(String pName){

    this.name = pName;

    } 

    }

    public class Test  extends Parent {  //1

     

    public Test(String Name){        //2

     

    name="hello";      //3

 

​	super("kitty");      //4

 

​	}  

 

​	}

 

A.   第2行错误，Test类的构造函数中参数名称应与其父类构造函数中的参数名相同

 

B.   第3行错误，应使用super关键字调用父类的name属性，改为super.name="hello";

 

C.   第4行错误，调用父类构造方法的语句必须放在子类构造方法中的第一行

 

D.   程序编译通过，无错误

 

17. 以下关于Object类说法错误的是（B）。

 

A.   一切类都直接或间接继承自Object类

 

B.   接口也继承Object类

 

C.   Object类中定义了toString()方法

 

D.   Object类在java.lang包中

 

18. 在Java中，多态的实现不仅能减少编码的工作量，还能大大提高程序的可维护性及可扩展性，

    下面哪一个选项不属于多态的条件（B）。

 

A.   子类重写父类的方法

 

B.   子类重载同一个方法

 

C.   要有继承或实现

 

D.   父类引用指向子类对象

 

19. 给定Java代码如下所示，则编译运行后，输出结果是（C ）。

 

class Parent {

 

public void count() {

 

System.out.println(10%3);

 

}

 

}

 

public class Child  extends Parent{

 

public void count() {

 

System.out.println(10/3);

 

}

 

public static void main(String args[]) {

 

Parent p = new Child();

 

p.count();

 

}

 

}

 

A.   1

 

B.   1.0

 

C.   3

 

D.   3.3333333333333335

 

20. 编译运行如下Java代码，输出结果是（  B  ）。

 

class Base {

 

public void method(){

 

System.out.print ("Base method");

 

}

 

}

 

class Child extends Base{  

 

public void methodB(){

 

System.out.print ("Child methodB");

 

}

 

}

 

class Sample {

 

public static void main(String[] args) {

 

Base base= new Child();

 

base.methodB();

 

}

 

}

 

A.   Base method

 

B.   Child methodB

 

C.   Base method Child MethodB

 

D.   编译错误

 

21. 在Java接口中，下列选项中属于有效的方法声明是（A ）。

 

A.   public void aMethod();

 

B.   final void aMethod();

 

C.   void aMethod(){}

 

D.   private void aMethod();

 

22. 给定如下Java程序代码，在_____横线处加入（ A ）语句，可以使这段代码编译通过。

interface Parent{
public int count(int i);
}

public class Test implements Parent {
public int count(int i){
   return i % 9;
}
public static void main(String[] args){
________________
int i = p.count(20);
}
}

 

A.   Test p = new Test();

 

B.   Parent p;

 

C.   Parent p = new Parent();

 

D.   Test p = new Parent();

 

23. 下面说法中错误的是( D )

A. 静态代码块类一加载只执行一次,以后再创建对象的时候不执行
B. 局部代码块的作用是为了限制变量的生命周期
C. 构造代码块在每创建一次对象就执行一次
D. 以上都不对

24. 在Java中，如果父类中的某些方法不包含任何逻辑，并且需要有子类重写，应该使用（ C ）关键字来声明父类的这些方法。

A.   final
B.   static
C.   abstract
D.   void

 

25. 给定两个java程序，如下：

public interface Face{
int counter = 40;
}   

public class Test implements Face{
private static int counter;
public static void main(String[]args){
System.out.println(++counter);
}
}  Test.java 的编译运行结果是（ D ）。

 

A.   40

 

B.   41

 

C.   0

 

D.   1

 

26. 给定java代码，如下：  

public class Test{
static int i;
public int aMethod( ){
i++;
return i;
}
public static void main(String [] args){
Test test = new Test( );
test.aMethod( );
System.out.println(test.aMethod( ));
}
}编译运行后，输出结果是（ C）。
A.   0  

 

B.   1  

 

C.   2  

 

D.   3

 

27. 给定java程序，如下：   

public class Test{
private static final int counter=10;
public static void main(String [] args){
System.out.println(++counter);
}
}
编译运行Test.java，结果是（C）  

A.   10

 

B.   11  

 

C.   编译错误

 

D.   运行时出现异常

 

28. 给定一个Java程序代码，如下：

public class Test{
int count = 9;
public void count1(){
int count =10;
System.out.println("count1="+count);
}
public void count2(){
System.out.println("count2="+count);
}
public static void main(String args[]){
Test t=new Test();
t.count1();
t.count2();
}
}

 

编译运行后，输出结果是 (B)

A.   count1=9 count2=9
B.   count1=10 count2=9
C.   count1=10 count2=10
D.   count1=9 count2=10

 

29. 给定java代码，如下：编译运行，结果是( B )

public static void main (String [] args){
String s;
System.out.println(“s=”+s);
}

 

A.   编译错误

 

B.   编译通过，但出现运行时错误  

 

C.   正常运行，输出s=null  

 

D.   正常运行，输出s=

 

30. 在java中，以下程序的输出结果是（ C）。  

class Point  {
int x;
boolean y;
void output()   {
System.out.println(x);
System.out.println(y);
}
public static void main(String[] args)   {
Point pt =new Point();
pt.output();
}
}

 

A.   运行错误

 

B.   0 ture  

 

C.   0 false  

 

D.   0 0

 

多选择题：

31. 给定如下 java 代码， 以下（ A,D    ）访问控制修饰符可以填入下划线处。
class Parent{
protected void eat(){
}
}
class Child extends Parent {
_______ void eat(){
}
}

 

A.   protected  

 

B.   private  

 

C.   什么也不填  //及默认修饰符  

 

D.   public

 

32. 给定如下Java代码 , 以下（AB ）方法可以加入Child类中。(多选)


public class Parent{
int change(){
…
}
}
Class Child extends Parent{
(此处可以放入下面哪个选项)
}

 

A.   public int change(){}

 

B.   int show(int i){}

 

C.   private int change(){}//private的权限低于默认修饰符

 

D.   abstract int change(){}

 

33. 下面对static的描述正确的是  （A,C）(多选)


A.   静态修饰的成员变量和成员方法随着类的加载而加载

B.   静态修饰的成员方法可以访问非静态成员变量

C.   静态修饰的成员可以被整个类对象所共享

D.   静态修饰的成员变量和成员方法随着类的消失而消失

 

34. 给定java代码，如下：   

 

abstract class Shape   {
abstract void draw( );
}

 

要创建Shape类的子类Circle，以下代码正确的是（B,D ）。（多选）

 

A.   class Circle extends Shape{   int draw( ){}    }

 

B.   abstract class Circle extends Shape{    }

C.   class Circle extends Shape{   void draw( ); }

D.   class Circle extends Shape{   void draw( ){} }

 

35. 在Java中，下面关于抽象类的描述正确的是（ ）。  （多选）

 

A.   抽象类可以被实例化

 

B.   如果一个类中有一个方法被声明为抽象的，那么这个类必须是抽象类

 

C.   抽象类中的方法必须都是抽象的  

 

D.   声明抽象类必须带有关键字abstract

 

36. 在java中，已定义了两个接口B和C以下语句正确的是 （ A,C ）  （多选）


A.   interface A extends B,C  

B.   interface A implements B,C  

C.   class A implements B,C

D.   class A implements B,implements C

 

37. 关于abstract不能和哪些关键字共用正确的是( A,B,C	)  （多选）

A.   abstract不可以和private共用

B.   abstract不可以和static共用

C.   abstract不可以和final共用

D.   abstract不可以和public共用

38. 下面关于Java接口的说法正确的是（ A,B,D ）。 （多选）

A.   Java接口中定义的是扩展功能
B.   Java接口中可以被多个子类实现,一个类也可以同时实现多个接口
C.   Java接口中可以声明私有成员
D.   Java接口不能被实例化

39. 分析如下Java代码，如果想在控制台上输出“B类的test()方法”，则在主函数应填入（ A,D ）。  （多选）
class A {
public void test() {
System.out.println("A类的test()方法");
}
}
class B extends A {
public void test() {
System.out.println("B类的test()方法");
}
public static void main(String args[]) {
}
} 

A.   A a = new B();

a.test();

B.   A a = new A(); 

a.test();

C.   B b = new A(); 

b.test();

D.   new B().test();



40. 在Java接口中定义常量，下面语法正确的是（A,B,C ）。 （多选）

A.   static int MALE = 1;

B.   final int MALE = 1;

C.   int MALE = 1; 

D.   private int MALE = 1;



## 二、简答题（2*5）

```java
1.什么是方法重写？什么是方法重载？
方法重写：方法名相同，参数列表相同，返回类型相同，实现代码块不同；
        方法重载：方法名相同，参数列表和返回类型没有要求。实现代码块也不同。
        
2.抽象类和接口有什么区别？
        子类实现不同：接口是implements，抽象类是extends。
        子类可以实现多个接口，只能继承一个父类。
        抽象类中可以有变量和私有方法，接口不行。
        抽象类和接口都不能实例化对象。没有构造函数。
        接口只能继承接口。抽象类可以继承抽象类和实现接口。

3.内部类的使用有什么好处？什么情况下使用匿名内部类？
        内部类好处：同一个类中可以多继承，使用方便，保存变量等。只使创建一次该对象时使用匿名内部类。       
4.详述static关键字
    static修饰变量时：变量变常量，类中全局方法都可以使用。类名.变量名。
        static修饰方法时：方法不可以重写，方法可以被外部类调用，类名。方法名。
        静态的只能访问静态的，非静态方法可以访问静态和非静态方法。
5.类变量和方法中定义的局部变量在初始化上有何区别？
当类变量和局部变量同名时，优先使用局部变量。
类变量随着类的加载而开辟内存空间，创建对象时，对对象的变量赋值。
方法中的局部变量的生命周期随着方法使用的结束而结束。
```

## 三、编程题（10*1）

Player 玩家

```java
private String name;
private  boolean flag;//是否是地主

/**
	成员不限以上描述，可自行添加
*/
```
分析:三人斗地主，每人17张牌，地主有额外的底牌3张（地主20张）,牌种 4种  ,每一种有17张 ,大小王,一共54张牌

需求:最终需要在控制台输出三个人的牌