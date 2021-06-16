package com.yuanren.homework;

public class Test3 {
    public static void main(String[] args) {
        boolean tag;

        User user=new User();
        user.setUserId("9523");
        user.setName("李白");
        user.setPassWord("1234");
        user.setSex('男');
        user.setAddress("荣耀街酒坊");
        user.setPhone("12345678901");


        User user1=new User();
        user1.setUserId("9527");
        user1.setName("宫本武藏");
        user1.setPassWord("5678");
        user1.setSex('男');
        user1.setAddress("天刀二刀流");
        user1.setPhone("12345678901");


        User user2=new User();
        user2.setUserId("9527");
        user2.setName("关羽");
        user2.setPassWord("5678");
        user2.setSex('男');
        user2.setAddress("天刀二刀流");
        user2.setPhone("12345678901");

        User user3=new User();
        user3.setUserId("9527");
        user3.setName("张飞");
        user3.setPassWord("5678");
        user3.setSex('男');
        user3.setAddress("天刀二刀流");
        user3.setPhone("12345678901");

        User user4=new User();
        user4.setUserId("9527");
        user4.setName("吕布");
        user4.setPassWord("5678");
        user4.setSex('男');
        user4.setAddress("天刀二刀流");
        user4.setPhone("12345678901");


        MethodFunction methodFunction=new MethodFunction();
        DButil dButil=new DButil();
        methodFunction.addUser(user);
        methodFunction.addUser(user1);
        methodFunction.addUser(user2);
        methodFunction.addUser(user3);
        methodFunction.addUser(user4);

        methodFunction.deleteUser("");
        //methodFunction.updateUser("9423","546432","不知道啊","124432634523");

        methodFunction.print();




    }
}
