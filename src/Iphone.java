public class Iphone {
    private int size;
    private  Model modelIphone;
    private Color color;

    public Iphone() {

    }

    public int getSize() {
        return size;
    }

    public Model getModelIphone() {
        return modelIphone;
    }

    public Color getColor() {
        return color;
    }

    public Iphone(int size, Model modelIphone, Color color) {
        this.size = size;
        this.modelIphone = modelIphone;
        this.color = color;
    }
}
