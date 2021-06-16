package homework;

public class VideoStore {
    private Video[] videos = new Video[10];
    private int count=0;

    /**
     * 添加一个新的电影
     * 通过电影的名称创建一个video对象，将对象保存在数组中
     *
     * @param name 电影的名称
     */
    public void addVideo(String name) {
        //TODO
        Video video=new Video();
        video.setName(name);
        videos[count]=video;
        count++;
        this.count=count;
    }

    /**
     * 根据片名借出电影
     *
     * @return 成功借出电影，返回true,如果片名不存在，则返回false
     */
    public boolean checkOut(String videoName) {
        //TODO
        if(videoName==null){
            return false;
        }
        for (int i = 0; i < count; i++) {
            if(videoName.equals(videos[i].getName())){
                return  videos[i].setRent(true);
            }
        }
        return false;
    }
    /**
     * 归还电影
     *
     * @return 成功归还电影，返回true,如果片名不存在，则返回false
     */
    public boolean returnVideo(String videoName) {
        //TODO
        if(videoName==null){
            return false;
        }
        for (int i = 0; i < count; i++) {
            if(videoName.equals(videos[i].getName())){
                videos[i].setRent(false);
                return true;
            }
        }
        return false;
    }

    /**
     * 根据 电影名称查询电影
     *
     * @param videoName
     * @return 匹配到的电影，如果找不到对应名称的电影，返回null
     */
    private Video findVideoByName(String videoName) {
        //TODO
        return null;
    }

    /**
     * 设置用户对电影的评分(1~5)，收到评分之后，计算该电影的平均评分，
     */
    public void receiveRating(String videoName, int mark) {
        //TODO
        if(videoName==null||mark==0){
            return;
        }
        for (int i = 0; i < videos.length; i++) {
            if(videoName==videos[i].getName()){
                videos[i].setMark(mark);
                break;
            }
        }

    }


    public void listInventory() {
        for (int i = 0; i < count; i++) {
            System.out.println(videos[i].toString());
        }
    }
}
