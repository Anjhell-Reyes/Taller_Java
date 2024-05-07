public class Rectangtulo extends FiguraGeometrica{
    private Integer base;
    private Integer altura;

    public Rectangtulo(String nombre, String color, Integer base, Integer altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        System.out.println("El area de este rectangulo es de: \n" + (this.base*this.altura) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (this.base*2+this.altura*2) + "cm");
    }
}
