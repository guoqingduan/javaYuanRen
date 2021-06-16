package homework;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setColor("黑色");
        cat.setVariety("英短");
        Cat cat2=new Cat();
        cat2.setColor("白色");
        cat2.setVariety("波斯猫");

        Dog dog=new Dog();
        dog.setiQ(-100);
        dog.setVariety("哈士奇");
        Dog dog2=new Dog();
        dog2.setiQ(100);
        dog2.setVariety("金毛");
        Dog dog3=new Dog();
        dog3.setiQ(40);
        dog3.setVariety("柯基");
        dog.playWith(cat2);
        cat2.playWith(dog);
        cat.playWith(dog3);
    }

}
