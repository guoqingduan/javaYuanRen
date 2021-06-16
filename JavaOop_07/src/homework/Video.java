package homework;

public class Video {

    private String name; //- 片名
    private boolean isRent;// - 是否被出租的标识
    private int mark;//用户的平均评分
    private int markTimes=0; //用户评分次数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRent() {
        return isRent;
    }

    public boolean setRent(boolean rent) {
        //TODO
        this.isRent=isRent();
        isRent=rent;
        return isRent;
    }

    public int getMark() {
        return mark;
    }

    public int getMarkTimes() {
        return markTimes;
    }

    public void setMarkTimes(int markTimes) {
        this.markTimes = markTimes;
    }

    public void setMark(int mark) {
        //TODO
        int avg=0;
        avg=this.mark*markTimes;
        markTimes++;
        avg=(avg+mark)/markTimes;
        this.mark=avg;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", isRent=" + isRent +
                ", mark=" + mark +
                ", markTimes=" + markTimes +
                '}';
    }
}
