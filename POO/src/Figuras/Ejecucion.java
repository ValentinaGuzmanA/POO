package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {

        float radio;
        float pi;
        float ancho;
        float alto;
        float base;
        float altura;

        int nFig;
        

        Scanner lectura =new Scanner(System.in);

        System.out.println("ESCOJA LA FIGURA QUE DESEA OBTENER EL AREA");
        System.out.println("1. TRIANGULO \n2.-CIRCULO \n3.RECTANGULO");
        nFig=lectura.nextInt();



        if (nFig==1) {

            System.out.println("Escogiste El Triangulo");
            System.out.println("Digita La Altura Del Triangulo");
            altura=lectura.nextFloat();
            System.out.println("Digita La Base Del Triangulo");
            base=lectura.nextFloat();

            Triangulo t1=new Triangulo(altura,base);
            t1.calcularArea();

        }else if (nFig==2) {

            System.out.println("Escogiste El circulo");
            System.out.println("Digita El Radio Del Circulo");
            radio=lectura.nextFloat();
            System.out.println("Digite Pi");
            pi=lectura.nextFloat();
            

            Circulo c1=new Circulo(radio,pi);
            c1.calcularArea();

        }else if(nFig==3){
            
            System.out.println("Escogiste El Rectangulo");

            System.out.println("Por Favor Digite El Ancho Del Rectangulo");
            ancho=lectura.nextFloat();
            System.out.println("Por Favor Digite La Altura Del Rectangulo");
            alto=lectura.nextFloat();

            final Rectangulo r1=new Rectangulo(alto, ancho);
            r1.calcularArea();


lectura.close();

        }
    }
    

    }

