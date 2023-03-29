package principal;

import java.util.Scanner;

import juego.piedrapapeltijera;
import salud.Empleado;

public class inicio {

    public static void main(String[] args) {
         /*Scanner scanner = new Scanner(System.in);

       
         * Persona p = new Persona();
         * p.pedirDatos();
         * p.mostrarPersona();
         * String imc= p.calcularIMC();
         * if (imc.equals("PESOBAJO")) {
         * System.out.println("El peso está por debajo de lo ideal");
         * } else if (imc.equals("PESOIDEAL")) {
         * System.out.println("El peso es ideal");
         * } else if (imc.equals("SOBREPESO")) { {
         * System.out.println("Tiene sobrepeso");
         * }
         * p.mayorEdad();
         */
        /*
         * String tipoDoc;
         * String documento;
         * String nombre;
         * String apellido;
         * String cargo;
         * int horas;
         * double valorhora;
         * System.out.print("Ingrese el tipo de documento: ");
         * tipoDoc = scanner.next();
         * System.out.print("Ingrese el número de documento: ");
         * documento = scanner.next();
         * System.out.print("Ingrese el nombre: ");
         * nombre = scanner.next();
         * System.out.print("Ingrese el apellido: ");
         * apellido = scanner.next();
         * System.out.print("Ingrese cargo: ");
         * cargo = scanner.next();
         * System.out.print("Ingrese horas trabajadas: ");
         * horas = scanner.nextInt();
         * System.out.print("Ingrese valor hora: ");
         * valorhora = scanner.nextDouble();
         * Empleado a = new Empleado(tipoDoc, documento, nombre, apellido, cargo, horas,
         * valorhora);
         * a.calcularHonorarios();
         
        scanner.close();*/

        piedrapapeltijera juego = new piedrapapeltijera();
        juego.iniciar();
        juego.jugar();
        juego.finalizar();

    }

}