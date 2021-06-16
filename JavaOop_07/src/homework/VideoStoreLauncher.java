package homework;

public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        videoStore.addVideo("黑客帝国");
        videoStore.addVideo("教父");
        videoStore.addVideo("沉默的羔羊");
        videoStore.listInventory();
        videoStore.checkOut("教父");
        videoStore.listInventory();
        videoStore.returnVideo("教父");
        videoStore.receiveRating("教父", 4);
        videoStore.listInventory();
    }
}
