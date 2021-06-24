package club.banyuan;

public class Person {

    private String name;
    private int age;
    private static int count;//调用总数
    private static int count2;//调用了两个参数的构造方法的总数

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        count2++;
    }

    public Person(String name) {
        this.name = name;
        count++;
    }

    public Person() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String print(){
        String str="<pre>"+"\n";
        str+="一共创建了"+count+"个对象"+"\n";
        str+="两个参数的构造方法被调用了"+count2+"次"+"\n";
        str+="</pre>";
        return str;
    }


}
