package club.banyuan;

public class Main2 {
    public static void main(String[] args) {
        Product product=new Product("手机",2001);
        Product product2=new Product("电脑",6000);

        System.out.println(product.getScanCode()+"\t"+product2.getScanCode());
        System.out.println(product.buy(12)+"\t"+Product.getNum());
        System.out.println(product.getInfo());


    }
}
