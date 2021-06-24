package com.yuanren.practice;

import com.yuanren.practice.pojo.Business;
import com.yuanren.practice.pojo.Product;
import com.yuanren.practice.service.impl.ProductServiceImpl;
import com.yuanren.practice.util.DataUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Business business = new Business();
        Product product = new Product();
        product.setPrice(123.00);
        product.setpName("手机");
        product.setpRecipe("afdsa");
        product.setpCount(2000);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(date);
        System.out.println(formatter.parse(dateString));
        System.out.println(dateString);
        product.setDate(date);
        business.setProducts(product);
        Product product2 = new Product();
        product2.setPrice(123.00);
        product2.setpName("手机");
        product2.setpRecipe("afdsa");
        product2.setDate(date);
        business.setProducts(product2);
        Product[] products = business.getProducts();
        System.out.println(Arrays.toString(products));
        ProductServiceImpl productService = new ProductServiceImpl();
        String date1="2021-6-21";
        Date date3=formatter.parse(date1);
        int[] ints = DataUtil.indexPDate(business, date);
        System.out.println(ints.length);
        System.out.println("222222222222222");
        Product[] products1=new Product[0];
        for (int i = 0; i < ints.length;i++) {
            products1=DataUtil.changeProductsLength(products1);
            products1[products1.length-1]=products[ints[i]];
        }
        DataUtil.printProduct2(products1);
       /* if("1".equals(products[0].getPid())) {
            products[0] = null;
            for (int j = 0; j < products.length - 1; j++) {
                Product temp = products[j];
                products[j] = products[j + 1];
                products[j + 1] = temp;
            }
        }
        products=Arrays.copyOf(products,products.length-1);
        DataUtil.printProduct2(products);
        */
        System.out.println(DataUtil.isPID(business,"10"));

    }
}
