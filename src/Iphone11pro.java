public class Iphone11pro extends Iphone {
    private int photo;
    private int video;
    private String screen;

    public int getPhoto() {
        return photo;
    }

    public int getVideo() {
        return video;
    }

    public String getScreen() {
        return screen;
    }

    public Iphone11pro() {
    }

    public Iphone11pro(String size, Model modelIphone, String application, String memory, Color color, int photo, int video, String Screen) {
        this.photo = photo;
        this.video = video;
        this.screen = screen;
    }
    public String getIphone() {
        return super.getModelIphone() +
                "Фото:" + getPhoto() +
                "Видео:" + getVideo() +
                "Экран:" + getScreen();


    }


}



