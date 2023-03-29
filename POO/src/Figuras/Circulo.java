package FigurasGeometricas;

public class Circulo extends Figura{

    //atrivutos 

    Float radio;
    float pi;
    
    //metodo Constructor

    public Circulo(Float radio, float pi) {
        this.radio = radio;
        this.pi = pi;
    }

    
    
    //Metodos Accesores

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }



    //Metodos Propios
    
    public void calcularArea(){
        float area;
        area=pi*(radio*radio);
        System.out.println("El Radio Del Circulo es: "+radio+" y su área es: "+area);
        }
}
