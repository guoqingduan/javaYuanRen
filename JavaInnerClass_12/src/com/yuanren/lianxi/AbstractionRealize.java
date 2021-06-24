package com.yuanren.lianxi;

import java.util.Arrays;
import java.util.Objects;

public class AbstractionRealize implements AbstractionDemo{

    private Object[] objects;
    private int count=0;

    public AbstractionRealize(){
        this.objects=new Object[0];
    }
    /**
     * 更新指定下标位置的元素
     *
     * @param index   替换的位置
     * @param element 替换后的元素
     * @return 被替换掉的元素
     */
    @Override
    public Object set(int index, Object element) {
        if(index<0||index>count-1){
            return null;
        }
        Object obj = this.objects[index];
        this.objects[index]=element;
        return obj;
    }
    /**
     * 根据下标获取元素
     *
     * @param index 下标
     * @return
     */
    @Override
    public Object get(int index) {
        if(index<0||index>count-1){
            return null;
        }
        return this.objects[index];
    }
    /**
     * 清空集合中的所有元素
     */
    @Override
    public void clear() {
        this.objects=new Object[0];
        count=0;
    }
    /**
     * 删除指定位置的元素
     *
     * @param index
     * @return 返回被删除掉的元素的引用，如果传入index不合法，返回null
     */
    @Override
    public Object remove(int index) {
        if(index<0||index>count-1){
            return null;
        }
        Object obj = this.objects[index];
        for (int i = index; i < count-1; i++) {
            Object temp= this.objects[i];
            this.objects[i]=this.objects[i+1];
            this.objects[i+1]=temp;
        }
        this.objects=Arrays.copyOf(this.objects,objects.length-1);
        count--;
        return obj;
    }

    /**
     * 查找匹配的元素并删除
     *
     * @param o
     * @return true 被删除的元素存在，并且成功被移除
     */
    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            if(o.equals(this.objects[i])){
                Object remove = remove(i);
                if(remove!=null){
                    return true;
                }
            }
        }
       return false;
    }

    /**
     * @param o 添加元素
     * @return true 添加成功
     */
    @Override
    public boolean add(Object o) {
        if(o==null){
            return false;
        }
        this.objects = Arrays.copyOf(this.objects, this.objects.length + 1);
        objects[objects.length-1]=o;
        count++;
        return true;
    }

    /**
     * @return true 空集合， false 集合中包含元素
     */
    @Override
    public boolean isEmpty() {
        if(this.objects==null||count==0){
            return true;
        }
        return false;
    }

    /**
     * @return 集合中元素个数
     */
    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "AbstractionRealize{" +
                "objects=" + Arrays.toString(objects) +
                ", count=" + count +
                '}';
    }
}
