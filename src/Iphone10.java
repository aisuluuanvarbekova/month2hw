
public class Iphone10 extends Iphone {
    private String application;
    private String memory;

    public String getApplication() {
        return application;
    }

    public String getMemory() {
        return memory;
    }

    public Iphone10(int size, String modelIphone, Color color, String application, String memory) {
        this.application = application;
        this.memory = memory;
    }

    public Iphone10(String application, String memory) {
        this.memory = memory;
    }

    public final void Iphone10(String memory) {
        System.out.println(memory);
    }

    public String getIphone() {
        return "Модель телефона:" + super.getModelIphone().modelIphone + "Год Выпуска:" + super.getModelIphone().yearProducing +
                "Размер:" + getSize() +
                "Цвет:" + getColor() +
                "Приложение:" + getApplication() +
                " Память:" + getMemory();
    }

}

