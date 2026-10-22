import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== WESTVIEW: VISION Y SU COPIA =====");

        Vision recluta = new Vision();
        Vision aprendiz = new Vision("Jarvis");
        recluta.mostrar();
        aprendiz.mostrar();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Memoria (0 a 100): ");
        int memoria = sc.nextInt();

        Vision v1 = new Vision(nombre, color, memoria);
        Vision v2 = v1;
        Vision v3 = new Vision(v1);

        v3.borrarMemoria();
        v3.cambiarColor("Blanco");
        v2.recordar(10, 2);

        System.out.print("v1: ");
        v1.mostrar();
        System.out.print("v2: ");
        v2.mostrar();
        System.out.print("v3: ");
        v3.mostrar();

        System.out.println("Diferencia de memoria v1-v3: " + v1.diferenciaMemoria(v3));
        System.out.println("Codigo v1: " + v1.codigo());
        System.out.println("Codigo v3: " + v3.codigo());
        System.out.println("v1 == v2? " + (v1 == v2));
        System.out.println("v1 == v3? " + (v1 == v3));

    }
}


