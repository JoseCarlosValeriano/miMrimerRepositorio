import java.util.Scanner;
public class java {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int a = leer.nextInt();

        leer.close();

        System.out.println(" Tú edad es: " + a);
    }
}
