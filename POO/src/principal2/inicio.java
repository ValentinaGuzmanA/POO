package principal;

import salud.Persona;

public class inicio {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.pedirDatos();
        p.mostrarPersona();
        String imc=  p.calcularIMC();
        if (imc.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal");
          } else if (imc.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal");
          } else if (imc.equals("SOBREPESO")) { {
            System.out.println("Tiene sobrepeso");
          }
        p.mayorEdad();

    }

}