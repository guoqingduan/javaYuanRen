package club.banyuan;

public class Product {
   /* 属性
- name : String
- price : double
- scanCode : int
- num : int*/
    private String name;
    private double price;
    private int scanCode;
    private static int num;
 /*   方法
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
--- 产品信息 ---
名称: 手机
编码：1001
价格: 2001.00元*/
    static {
        num=10000;
    }
    {
        int qian=((int)(Math.random()*9)+1)*1000;
        int bai=((int)(Math.random()*10))*100;
        int shi=((int)(Math.random()*10))*10;
        int ge=(int)(Math.random()*10);
        this.scanCode=qian+bai+shi+ge;
    }

    public Product(String name, double price){
      this.name=name;
      this.price=price;
  }

    public String getName() {
        return name;
    }

    public int getScanCode() {
        return scanCode;
    }

    public double getPrice() {
        return price;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Product.num = num;
    }
    public void changePrice(double price){

    }
    public String getInfo(){
       String str="--- 产品信息 ---"+"\n";
        str+="名称: "+this.name+"\n";
        str+="编码："+this.scanCode+"\n";
        str+="价格: "+this.price+"元";
      return str;
    }
    public boolean buy(int number){
        if(num-number>0){
            num=num-number;
            return true;
        }
            return false;
    }

}
