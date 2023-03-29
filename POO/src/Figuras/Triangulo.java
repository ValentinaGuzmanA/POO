package FigurasGeometricas;

public class Triangulo extends Figura {


// Atributos 

    float altura;
    float base;
    
//Metodo Constructor

public Triangulo(float altura, float base) {
    this.altura = altura;
    this.base = base;

//Metodos Acccesores
}

public float getAltura() {
    return altura;
}

public void setAltura(float altura) {
    this.altura = altura;
}

public float getBase() {
    return base;
}

public void setBase(float base) {
    this.base = base;
}

// métodos propios

public void calcularArea(){
    float area;
    area=base*altura;
    System.out.println("la altura del Triangulo es: "+base+" su base es: "+altura+" y su área es: "+area);
    }




    
    
}
