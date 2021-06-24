#### 1.
```
class Main {
   public static void main(String args[]) {
      try {
         throw 10;
      }
      catch(int e) {
         System.out.println("Got the  Exception " + e);
      }
  }
}
```
不兼容的类型，无法转换为Throwable
#### 2.
```
class Test extends Exception { }
  
class Main {
   public static void main(String args[]) { 
      try {
         throw new Test();
      }
      catch(Test t) {
         System.out.println("Got the Test Exception");
      }
      finally {
         System.out.println("Inside finally block ");
      }
  }
}
```
Got the Test Exception  
Inside finally block 
#### 3.
```
class Main {
   public static void main(String args[]) {
      int x = 0;
      int y = 10;
      int z = y/x;
  }
}
```
运行错误，算数异常ArithmeticException，分母不能为零
#### 4.
```
class Base extends Exception {}
class Derived extends Base  {}
 
public class Main {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
    catch(Derived d)  { 
       System.out.println("Caught derived class exception"); 
    }
  }
} 
```
编译错误，父类异常捕获要在子类异常后面
#### 5.
```
class Test
{
    public static void main (String[] args)
    {
        try
        {
            int a = 0;
            System.out.println ("a = " + a);
            int b = 20 / a;
            System.out.println ("b = " + b);
        }
 
        catch(ArithmeticException e)
        {
            System.out.println ("Divide by zero error");
        }
 
        finally
        {
            System.out.println ("inside the finally block");
            
        }
    }
}
```
a=0
Divide by zero error
inside the finally block
#### 6.
```
class Test
{
    public static void main(String[] args)
    {
        try
        {
            int a[]= {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++)
            {
                System.out.println ("a[" + i + "]=" + a[i] + "n");
            }
        }
         
        catch (Exception e)
        {
            System.out.println ("error = " + e);
        }
         
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("ArrayIndexOutOfBoundsException");
        }
    }
}
```
编译错误，父类异常捕获要在子类异常后面
#### 7.
```
class Test {
    String str = "a";
    void A() {
        try {
            str +="b";//ab
            B();
        } catch (Exception e) {
            str += "c";
        }
    }
    void B() throws Exception {
        try {
            str += "d";//abd
            C();
        } catch(Exception e) {
            throw new Exception();
        } finally {
            str += "e";
        }
        str += "f";
    }    
    void C() throws Exception {
        throw new Exception();
    }
    void display(){
        System.out.println(str);
    }
    public static void main(String[] args) {
        Test object = new Test();
        object.A();
        object.display();
    }
}
```
abdec    throw抛出异常以后就不执行后面的代码了
#### 8.
```
class Test {   
		int count = 0;
    void A() throws Exception {
        try {
            count++; 
            try{
                count++;
                try {
                    count++;
                    throw new Exception();
                } catch(Exception ex) {
                    count++;
                    throw new Exception();
                }
            } catch(Exception ex) {
                count++;
            }
        } catch(Exception ex){
            count++;
        }
    }
 
    void display() {
        System.out.println(count);
    }
    public static void main(String[] args) throws Exception {
        Test obj = new Test();
        obj.A();
        obj.display();
    }
}
```
5
#### 9.方法返回值是
```
public int myMethod(){
  try {
 		return 1;
  } catch (Exception e){
  	return 2;
  } finally {
	  return 3;
 	}
}
```
3
#### 10.

```
 try {

      File file = new File("filename.txt");

      Scanner sc = new Scanner(file);

      throw new IOException();
    }

    catch (FileNotFoundException e) {

      System.out.println("FileNotFoundException called!!!");

    } catch (IOException e) {

      System.out.println("IOException called!!!");

    } 

```
FileNotFoundException called!!!
#### 11.

```
try {

      File file = new File("filename.txt");

      Scanner sc = new Scanner(file);

      throw new IOException();
    }

    catch (IOException e) {

      System.out.println("IOException called!!!");

    } 
```
控制台错误，FileNotFoundException 文件没找到
#### 12.
```
public class Test {
 
    private static String result = "";
 
    public static void main(String[] args) {
        test(1);
        result += "*";
        test(0);
        System.out.println(result);
    }
 
    public static void test(int i) {
        result += "1";
        try {
            if (i == 0) {
                throw new RuntimeException("");
            }
            result += "2";
        } catch (Exception e) {
            result += "3";
            return;
        } finally {
            result += "4";
        }
        result += "5";
    }
}
```
1245*134
