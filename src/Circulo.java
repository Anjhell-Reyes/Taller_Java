public class Circulo extends FiguraGeometrica{
    private Integer radio;

    public Circulo(String nombre, String color, Integer radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }
}
