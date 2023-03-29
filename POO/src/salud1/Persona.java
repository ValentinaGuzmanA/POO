package salud;

import java.util.Scanner;

public class Persona {
  // Atributos de la clase Persona
  private String tipoDoc;
  private String documento;
  private String nombre;
  private String apellido;
  private double peso;
  private double estatura;
  private int edad;
  private char sexo;
  public Persona(){}
  // Constructor de la clase Persona
  public Persona(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
      int edad, char sexo) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.peso = peso;
    this.estatura = estatura;
    this.edad = edad;
    this.sexo = sexo;
  }

  // Método para pedir los datos de la persona
  public void pedirDatos() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el tipo de documento: ");
    this.tipoDoc = scanner.nextLine();

    System.out.print("Ingrese el número de documento: ");
    this.documento = scanner.nextLine();

    System.out.print("Ingrese el nombre: ");
    this.nombre = scanner.nextLine();

    System.out.print("Ingrese el apellido: ");
    this.apellido = scanner.nextLine();

    System.out.print("Ingrese el peso (en kilogramos): ");
    this.peso = scanner.nextDouble();

    System.out.print("Ingrese la estatura (en metros): ");
    this.estatura = scanner.nextDouble();

    System.out.print("Ingrese la edad: ");
    this.edad = scanner.nextInt();

    System.out.print("Ingrese el sexo (M/F): ");
    this.sexo = scanner.next().charAt(0);
  }

  // Método para mostrar los datos de la persona
  public void mostrarPersona() {
    System.out.println("Tipo de documento: " + this.tipoDoc);
    System.out.println("Número de documento: " + this.documento);
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellido: " + this.apellido);
    System.out.println("Peso: " + this.peso + " kg");
    System.out.println("Estatura: " + this.estatura + " m");
    System.out.println("Edad: " + this.edad + " años");
    System.out.println("Sexo: " + this.sexo);
  }

  // Método para calcular el IMC y mostrar el resultado
  public void calcularIMC() {
    double imc = this.peso / Math.pow(this.estatura, 2);
    System.out.println("IMC: " + imc);

    if (imc < 20) {
      System.out.println("El peso está por debajo de lo ideal");
    } else if (imc >= 20 && imc <= 25) {
      System.out.println("El peso es ideal");
    } else {
      System.out.println("Tiene sobrepeso");
    }
  }

  // Método para determinar si la persona es mayor de edad
  public void mayorEdad() {
    if (this.edad >= 18) {
      System.out.println("La persona es mayor de edad");
    } else {
      System.out.println("no es mayor de edad");
    }
  }
}