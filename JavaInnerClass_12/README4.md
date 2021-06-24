### 写出以下程序的输出结果

#### 1. 以下代码能否通过编译，为什么
```
class Outer{
 public static void main(String[] args){
  new Inner(); 
 } 
 class Inner { 
  Inner() {} 
 }  
}
```
错误，静态方法只能访问静态
#### 2. 以下代码能否通过编译，为什么
```
static class Outer{
 public static void main(String[] args){

 }
 private class Inner{
  Inner() {} 
 }
}
```
能通过
#### 3.
```
class Outer {
 String s1 = "Java";
 String s2 = "2";

 public static void main(String[] args) { 
  Outer outer = new Outer();  
 }
 Outer() { 
  Inner inner = new Inner();  
 }
 class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
        
  Inner() {
   System.out.println(Outer.this.s1);
   System.out.println(s1);
   System.out.println(s2);
  }
 }
}
```
Java
Certification
Exam
#### 4. 以下代码能否通过编译，为什么
```
class A
{
    class B
    {
        static void methodB()
        {
            System.out.println("Method B");
        }
    }
}
```
编译错误 内部类中的方法如果是静态的那么这个类一定是静态内部类
#### 5.
```
class OuterInnerStatic {
 static String s1 = "Java"; 
 static String s2 = "2";
 public static void main(String[] args) { 
  Inner inner = new Inner();  
}

 static class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
  Inner() {
   System.out.println(OuterInnerStatic.s1);
   System.out.println(this.s1);
   System.out.println(s2);
  }
 }
}

```
Java Certification  Exam
#### 6. 在下面的示例中，如何访问"XYZ"类的"i"字段？
```
class ABC
{
    class XYZ
    {
        int i = 111;
    }
}
```
new ABC().new XYZ().i;
#### 7. 运行以下程序时，它是否在控制台上打印“SUCCESS”？
```
class A {
    {
        new B();
    }
     
    static class B {
        {
            new A().new C();
        }
    }
     
    class C
    {
        {
            System.out.println("SUCCESS");
        }
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        new A();
    }
}
```
不能 ，堆栈溢出
#### 8. 以下代码能否通过编译，为什么
```
class A
{
    String s = "AAA";
     
    void methodA()
    {
        System.out.println(s);
    }
     
    static class B
    {
        void methodB()
        {
            methodA();
        }
    }
}
```
不能从静态方法访问非静态方法
#### 9.
```
abstract class A
{
    {
        System.out.println(1);
    }
     
    static
    {
        System.out.println(2);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A() { };
    }
}
```
抽象类不能实例化对象
#### 10.
```
class A
{
    static String s = "AAA";
     
    class B
    {
        String s = "BBB";
         
        void methodB()
        {
            System.out.println(s);
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();
         
        System.out.println(a.s);
         
        A.B b = a.new B();
         
        System.out.println(b.s);
         
        b.methodB();
    }
}
```
AAA
BBB
BBB
#### 11. 以下代码能否通过编译，为什么
```
class A
{
    void methodOne()
    {
        class B
        {
            void methodTwo()
            {
                System.out.println("Method Two");
            }
        }
    }
     
    void methodThree()
    {
        new B().methodTwo();
    }
}
```
不能   不能访问B类
#### 12. 以下代码能否通过编译，为什么
```
class A
{
    class B
    {
        {
            System.out.println(1);
        }
         
        static
        {
            System.out.println(2);
        }
    }
}
```
不能   内部类中的方法如果是静态的那么这个类一定是静态内部类

#### 13. 

```
class A {
    void methodA1(int i) {
        System.out.println(i+++i);
    }
     
    void methodA2(int i) {
        System.out.println(--i-i--);
    }
}
 
class B {
    A a = new A() {
        void methodA1(int i) {
            System.out.println(++i+i++);
        }
        void methodA2(int i){
            System.out.println(i---i);
        }
    };
}
 
public class MainClass {
    public static void main(String[] args) {
        A a = new A();
        a.methodA1(10);
        a.methodA2(10);
        B b = new B();
        b.a.methodA1(10);
        b.a.methodA2(10);
    }
}

```
21
0
22
1
#### 14. 以下代码能否通过编译，为什么
```
class A
{
    class B extends A
    {
        class C extends B
        {
            class D extends C
            {
                 
            }
        }
    }
}
```
可以   一个类中可以有多个内部类
#### 15. 在下面的示例中，如何访问“内部类”的“i”字段？
```
class OuterClass
{
    static class InnerClass
    {
        int i;
    }
}
```
new Derived.InnerClass().i;
#### 16.
```
class A
{   
    abstract class B
    {
        abstract void method();
    }
     
    {
        new B() {
            @Override
            void method(){
                System.out.println("BBB");
            }
        }.method();
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        new A();
    }
}
```
BBB 
#### 17. 如何在class A以外的其他类中实例化 class B
```
class A
{
    void methodA()
    {
        class B
        {
             
        }
        B B=new B();
    }
}
```
A a=new A();
a.methodA();

#### 18.
```
public class Outer { 
	public static int temp1 = 1; 
	private static int temp2 = 2; 
	public int temp3 = 3; 
	private int temp4 = 4; 
	
	public static class Inner 
	{ 
		private static int temp5 = 5; 
		
		private static int getSum() 
		{ 
			return (temp1 + temp2 + temp3 + temp4 + temp5); 
		} 
	} 
	
	public static void main(String[] args) 
	{ 
		Outer.Inner obj = new Outer.Inner(); 
		System.out.println(obj.getSum()); 
	} 
	
} 

```
不能从静态上下文引用非静态字段
#### 19.
```
interface Anonymous 
{ 
	public int getValue(); 
} 
public class Outer 
{ 
	private int data = 15; 
	public static void main(String[] args) 
	{ 
		Anonymous inner = new Anonymous() 
				{ 
					int data = 5; 
					public int getValue() 
					{ 
						return data; 
					} 
					public int getData() 
					{ 
						return data; 
					} 
				}; 
		Outer outer = new Outer(); 
		System.out.println(inner.getValue() + inner.getData() + outer.data); 
	} 
} 

```
编译错误，找不到getData方法
