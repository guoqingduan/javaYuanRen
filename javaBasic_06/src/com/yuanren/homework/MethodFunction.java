package com.yuanren.homework;

public class MethodFunction {
    private DButil dButil=new DButil();
    public void addUser(User user){
        User[] users=dButil.getUser();
        int index= dButil.getIndex();
        users[index]=user;
        index++;
        dButil.setIndex(index);
    }
    /**
     * @param name 用户名
     * @deprecated 删除DButil类中存在的用户
     */
    public void deleteUser(String name){   //
        //去判断对象数组中是否存在 姓名为name的 对象
        if(name==null||name.equals("")){
           return;
        }
        //获取数组
        User[] users= dButil.getUser();
        //获取当前的最大下标
        int index= dButil.getIndex();
        //for循环判断
        for (int i = 0; i < users.length; i++) {
            if(name.equals(users[i].getName())){//如果出现名字相同，删除数组，下标减少
                users[i]=null;
                for (int j = i; j < users.length-1 ; j++) {
                    users[j]=users[j+1];
                    users[j+1]=null;
                }
                break;
            }
        }
        dButil.setIndex(--index);
        //给新数组赋值

    }



    /**
     * @param userId 用户编号
     * @param password 密码
     * @param address  地址
     * @param phone  联系方式
     *
     */
    public  void updateUser(String userId,String password,String address,String phone){
        if(userId==null||userId.equals("")){
            return;
        }
        User[] users= dButil.getUser();
        for (int i = 0; i < users.length; i++) {
            if(userId.equals(users[i].getUserId())){
                users[i].setPassWord(password);
                users[i].setPhone(phone);
                users[i].setAddress(address);
                break;
            }

        }

    }

    public void print(){
        User[] users= dButil.getUser();
        for (int i = 0; i < dButil.getIndex(); i++) {
            System.out.println(users[i].toString());
        }
    }

}
