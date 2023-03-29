package principal;

import salud.Persona;

public class inicio {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.pedirDatos();
        p.mostrarPersona();
        p.calcularIMC();
        p.mayorEdad();

    }

}