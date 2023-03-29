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

  public Persona() {
  }

  public String getTipoDoc() {
    return tipoDoc;
  }

  public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getEstatura() {
    return estatura;
  }

  public void setEstatura(double estatura) {
    this.estatura = estatura;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public Persona(String tipoDoc, String documento, String nombre, String apellido) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;

  }

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
    setTipoDoc(scanner.nextLine());

    System.out.print("Ingrese el número de documento: ");
    setDocumento(scanner.nextLine());

    System.out.print("Ingrese el nombre: ");
    setNombre(scanner.nextLine());

    System.out.print("Ingrese el apellido: ");
    setApellido(scanner.nextLine());

    System.out.print("Ingrese el peso (en kilogramos): ");
    setPeso(scanner.nextDouble());

    System.out.print("Ingrese la estatura (en metros): ");
    setEstatura(scanner.nextDouble());

    System.out.print("Ingrese la edad: ");
    setEdad(scanner.nextInt());

    System.out.print("Ingrese el sexo (M/F): ");
    setSexo(scanner.next().charAt(0));
    scanner.close();
  }

  // Método para mostrar los datos de la persona
  public void mostrarPersona() {
    System.out.println("Tipo de documento: " + this.getTipoDoc());
    System.out.println("Número de documento: " + this.getDocumento());
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Apellido: " + this.getApellido());
    System.out.println("Peso: " + this.getPeso() + " kg");
    System.out.println("Estatura: " + this.getEstatura() + " m");
    System.out.println("Edad: " + this.getEdad() + " años");
    System.out.println("Sexo: " + this.getSexo());
  }

  // Método para calcular el IMC y mostrar el resultado
  public String calcularIMC() {
    double imc = this.getPeso() / Math.pow(this.getEstatura(), 2);
    System.out.println("IMC: " + imc);
    String retorno;
    if (imc < 20) {
      // System.out.println("El peso está por debajo de lo ideal");
      retorno = "PESOBAJO";
    } else if (imc >= 20 && imc <= 25) {
      // System.out.println("El peso es ideal");
      retorno = "PESOIDEAL";
    } else {
      // System.out.println("Tiene sobrepeso");
      retorno = "SOBREPESO";
    }
    return retorno;
  }

  // Método para determinar si la persona es mayor de edad
  public void mayorEdad() {
    if (this.getEdad() >= 18) {
      System.out.println("La persona es mayor de edad");
    } else {
      System.out.println("no es mayor de edad");
    }
  }
}