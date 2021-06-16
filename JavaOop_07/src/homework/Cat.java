package homework;

public class Cat {
    private String variety;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public String getInfo(){
        return this.color+this.variety;
    }

    public void print(){
        System.out.println(getInfo());
    }

    public void playWith(Dog dog){
        System.out.println(getInfo()+"和"+dog.getInfo()+"一起玩");
    }

}