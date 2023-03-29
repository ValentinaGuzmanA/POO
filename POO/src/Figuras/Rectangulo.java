package FigurasGeometricas;

public class Rectangulo extends Figura {

    //atributos
    float alto;
    float ancho;
    //Metodo constructor

    public Rectangulo(float base, float altura) {
        this.alto = base;
        this.ancho = altura;
    }
//métodos accesores
    public float getBase() {
        return alto;
    }

    public void setBase(float base) {
        this.alto = base;
    }

    public float getAltura() {
        return ancho;
    }

    public void setAltura(float altura) {
        this.ancho = altura;
    }
// métodos propios
public void calcularArea(){
    float area;
    area=alto*ancho;
    System.out.println("la altura del rectangulo es: "+alto+" su base es: "+ancho+" y su área es: "+area);
    }
    

    
    
}
