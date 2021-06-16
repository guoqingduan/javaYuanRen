package homework;

public class Dog {
    //属性
    private String variety;
    private int iQ;

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }

    public int getiQ() {
        return iQ;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    //方法
    public String getInfo(){
        if(this.iQ<20){
            return "傻"+this.variety;
        }else if (this.iQ>=20&&this.iQ<=80){
            return "普通的"+this.variety;
        }else if (this.iQ>80){
            return "聪明的"+this.variety;
        }
        return null;
    }

    public void printInfo(){
        System.out.println(getInfo());
    }


    public void playWith(Cat cat){

        System.out.println(this.variety+"和"+cat.getVariety()+"一起玩");

    }

}