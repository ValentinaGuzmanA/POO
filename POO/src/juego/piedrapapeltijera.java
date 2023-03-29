package juego;

import java.util.Scanner;

public class piedrapapeltijera implements metodos {

    private String valorpc;
    private String valorusuario;

    @Override
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");
        System.out.println("Jugador, ¿qué eliges? (Piedra, Papel o Tijera)");
        this.setValorusuario(scanner.nextLine());
        scanner.close();
    }

    @Override
    public void jugar() {
        int aleatorio = (int) (Math.random() * 3) + 1;

        if (aleatorio == 1) {
            this.setValorpc("piedra");
        } else if (aleatorio == 2) {
            this.setValorpc("papel");
        } else if (aleatorio == 3) {
            this.setValorpc("tijera");
        }
    }

    @Override
    public void finalizar() {
        System.out.println("La computadora eligió " + this.getValorpc());

        if (this.getValorusuario().equalsIgnoreCase("piedra")) {
            if (this.getValorpc().equalsIgnoreCase("piedra")) {
                System.out.println("Empate");
            } else if (this.getValorpc().equalsIgnoreCase("papel")) {
                System.out.println("La computadora gana");
            } else if (this.getValorpc().equalsIgnoreCase("tijera")) {
                System.out.println("¡Ganaste!");
            }
        } else if (this.getValorusuario().equalsIgnoreCase("papel")) {
            if (this.getValorpc().equalsIgnoreCase("piedra")) {
                System.out.println("¡Ganaste!");
            } else if (this.getValorpc().equalsIgnoreCase("papel")) {
                System.out.println("Empate");
            } else if (this.getValorpc().equalsIgnoreCase("tijera")) {
                System.out.println("La computadora gana");
            }
        } else if (this.getValorusuario().equalsIgnoreCase("tijera")) {
            if (this.getValorpc().equalsIgnoreCase("piedra")) {
                System.out.println("La computadora gana");
            } else if (this.getValorpc().equalsIgnoreCase("papel")) {
                System.out.println("¡Ganaste!");
            } else if (this.getValorpc().equalsIgnoreCase("tijera")) {
                System.out.println("Empate");
            }
        } else {
            System.out.println("Opción inválida. Por favor ingrese Piedra, Papel o Tijera");
        }
    }

    public String getValorpc() {
        return valorpc;
    }

    public void setValorpc(String valorpc) {
        this.valorpc = valorpc;
    }

    public String getValorusuario() {
        return valorusuario;
    }

    public void setValorusuario(String valorusuario) {
        this.valorusuario = valorusuario;
    }

}
