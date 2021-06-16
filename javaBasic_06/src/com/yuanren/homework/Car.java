package com.yuanren.homework;

public class Car {
    /*.编写一个汽车类,属性有 品牌 型号 长度 高度 颜色 ,行为有： 制冷 播放音频;
    创建两个不同的对象,对对象进行赋值，然后调用输出信息的方法*/
    private String brand;
    private String model;
    private double length;
    private double height;
    private String color;
    public void refrigeration(){
        System.out.println("汽车正在制冷。。。");
    }
    public void playAudio(){
        System.out.println("汽车正在播放音频。。。");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
