package com.yuanren.practice;

import com.yuanren.practice.pojo.Business;
import com.yuanren.practice.pojo.Product;
import com.yuanren.practice.service.BusinessService;
import com.yuanren.practice.service.impl.BusinessServiceImpl;
import com.yuanren.practice.service.impl.ProductServiceImpl;
import com.yuanren.practice.util.DataUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws ParseException {

        System.out.println("---------------欢迎进入中国商城管理系统--------------");
        /**
         * 商家
         * 产品
         */
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入要操作的数字:");
            System.out.println("1.登录 \t 2.注册 \t 3.删除商户 \t 4.更新商户 \t 5.退出");
            int i = scanner.nextInt();
            BusinessService businessService = new BusinessServiceImpl();

            switch (i){
                case 1:
                    while (true) {
                        System.out.println("请输入姓名:");
                        String name = scanner.next();
                        System.out.println("请输入密码:");
                        String password = scanner.next();

                        boolean login = businessService.login(name, password);
                        int index = DataUtil.login(name, password);
                        // 如果在登录的时候  用户名存在 但是密码不正确  这个时候要重新输入
                        //但是如果用户名都不存在  那么就只能告诉商家要重新注册   重新注册之后   要重新返回去登录（没有产品）
                        if(login){
                            //如果登录成功就进入系统 并且一进去就能看到所有的产品
                            Business business = DataUtil.businesses[index];
                            System.out.println("您的产品如下：");
                            DataUtil.printProduct(business);
                            while(true) {
                                System.out.println("请输入要操作的数字:");
                                System.out.println("1.添加产品  \t 2.修改产品信息 \t 3.根据名字查询产品 \t 4.根据生产时间查询产品  \t 5.删除产品 \t 6.退出");
                                i = scanner.nextInt();
                                ProductServiceImpl productService = new ProductServiceImpl();
                                switch (i){
                                    case 1:
                                        Product product = new Product();
                                        System.out.println("请输入产品名称:");
                                        String pName = scanner.next();
                                        product.setpName(pName);
                                        System.out.println("产品产地:");
                                        String pAddress = scanner.next();
                                        product.setpAddress(pAddress);
                                        System.out.println("请输入产品生产时间:");
                                        String date = scanner.next();
                                        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
                                        Date date1=simpleDateFormat.parse(date);
                                        product.setDate(date1);
                                        System.out.println("请输入产品配方:");
                                        String pRecipe = scanner.next();
                                        product.setpRecipe(pRecipe);
                                        System.out.println("请输入产品库存:");
                                        Integer pCount = scanner.nextInt();
                                        product.setpCount(pCount);
                                        System.out.println("请输入产品价格:");
                                        double price = scanner.nextDouble();
                                        product.setPrice(price);
                                        productService.addProduct(business,product);
                                        DataUtil.printProduct(business);
                                        break;
                                    case 2:
                                        //判断ID是否存在
                                        int index1=0;
                                        while(true) {
                                            System.out.println("请输入需要更改产品的ID:");
                                            String PID=scanner.next();
                                            boolean existsPID = DataUtil.isPID(business,PID);
                                            if (existsPID) {//如果存在
                                                index1=DataUtil.indexPID(business, PID);
                                                break;
                                            } else {//如果不存在
                                                System.out.println("您输入的产品ID不存在 请重新输入....");
                                            }
                                        }
                                        Product product1=business.getProducts()[index1];
                                        System.out.println("请输入产品名称:");
                                        pName = scanner.next();
                                        product1.setpName(pName);
                                        System.out.println("产品产地:");
                                        pAddress = scanner.next();
                                        product1.setpAddress(pAddress);
                                        System.out.println("请输入产品生产时间:");
                                        date = scanner.next();
                                        simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
                                        date1=simpleDateFormat.parse(date);
                                        product1.setDate(date1);
                                        System.out.println("请输入产品配方:");
                                        pRecipe = scanner.next();
                                        product1.setpRecipe(pRecipe);
                                        System.out.println("请输入产品库存:");
                                        pCount = scanner.nextInt();
                                        product1.setpCount(pCount);
                                        System.out.println("请输入产品价格:");
                                        price = scanner.nextDouble();
                                        product1.setPrice(price);
                                        productService.updateProduct(business,product1);
                                        DataUtil.printProduct(business);
                                        break;
                                    case 3:
                                        //判断产品名称是否存在
                                        int[] ints=new int[0];
                                        while(true) {
                                            System.out.println("请输入要查找产品的名字；");
                                            pName=scanner.next();
                                            boolean existsPID = DataUtil.isPName(business,pName);
                                            if (existsPID) {//如果存在
                                                ints = DataUtil.indexPName(business, pName);
                                                break;
                                            } else {//如果不存在
                                                System.out.println("您输入的产品名称不存在 请重新输入....");
                                            }
                                        }
                                        Product[] byProductName = productService.getByAll(business, ints);
                                        DataUtil.printProduct2(byProductName);
                                        break;
                                    case 4:
                                        //判断生产时间是否存在
                                        ints=new int[0];
                                        while(true) {
                                            System.out.println("请输入要查找产品的生产时间；");
                                            date=scanner.next();
                                            simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
                                            date1=simpleDateFormat.parse(date);
                                            boolean existsDate = DataUtil.isDate(business,date1);
                                            if (existsDate) {//如果存在
                                                ints = DataUtil.indexPDate(business, date1);
                                                break;
                                            } else {//如果不存在
                                                System.out.println("您输入的产品生产时间不存在 请重新输入....");
                                            }
                                        }
                                        byProductName = productService.getByAll(business, ints);
                                        DataUtil.printProduct2(byProductName);
                                        break;
                                    case 5:
                                        //id删除产品
                                        //判断ID是否存在
                                        index1=0;
                                        while(true) {
                                            System.out.println("请输入需要删除产品的ID:");
                                            String PID=scanner.next();
                                            boolean existsPID = DataUtil.isPID(business,PID);
                                            if (existsPID) {//如果存在
                                                productService.deleteProduct(business,PID);
                                                break;
                                            } else {//如果不存在
                                                System.out.println("您输入的产品ID不存在 请重新输入....");
                                            }
                                        }
                                        break;
                                    case 6:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("请输入正确内容。。。。。。");
                                        break;
                                }
                                if(business==null){
                                    break;
                                }
                            }
                            break;
                        }else{
                            //判断一下 原本的数组中是否已经存在注册过的名字了
                            boolean existsName = DataUtil.isName(name);
                            if(existsName){//如果存在
                                System.out.println("您输入的密码不正确 请重新输入....");
                            }else {//如果不存在
                                System.out.println("您的账户不存在 请先注册用户....");
                            }
                        }
                    }
                    break;
                case 2:
                    /**
                     * 在注册的时候要判断一下 原本的数组中是否已经存在注册过的名字了
                     */

                    /**
                     *      private String name;
                     *     private String nick; //别称
                     *     private String phone;//联系方式
                     *     private String password;
                     *     private String  IDCard;
                     */
                    String name="";
                    while(true) {
                        System.out.println("请输入用户名:");
                        name = scanner.next();
                        boolean existsName = DataUtil.isName(name);
                        if (existsName) {//如果存在
                            System.out.println("您输入的用户已重复 请重新输入....");
                        } else {//如果不存在

                            break;
                        }
                    }
                        System.out.println("请输入昵称:");
                        String nick = scanner.next();

                        System.out.println("请输入phone:");
                        String phone = scanner.next();

                        System.out.println("请输入password:");
                        String password = scanner.next();

                        System.out.println("请输入IDCard:");
                        String IDCard = scanner.next();
                        businessService.register(new Business(name, nick, phone, password, IDCard));
                    break;

                case 3:
                    while(true) {
                        System.out.println("请输入要删除人员的身份证号：");
                        String IDCard1 = scanner.next();
                        boolean existsIDCard = DataUtil.isIDCard(IDCard1);
                        if (existsIDCard) {//如果存在
                            businessService.deleteBusiness(IDCard1);
                            break;
                        } else {//如果不存在
                            System.out.println("您输入的身份证号不存在 请重新输入....");
                        }
                    }
                    break;

                case 4:
                    String IDCard1="";
                    while(true) {
                        System.out.println("请输入要更改人员的IDCcard：");
                        IDCard1 = scanner.next();
                        boolean existsIDCard = DataUtil.isIDCard(IDCard1);
                        if (existsIDCard) {//如果存在
                            break;
                        } else {//如果不存在
                            System.out.println("您输入的身份证号不存在 请重新输入....");
                        }
                    }
                    businessService.updateBusiness(IDCard1);
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确内容。。。。。。");
            }

        }
    }
}
