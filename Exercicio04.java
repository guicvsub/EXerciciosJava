
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String args[] ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero:");
        int numero = scanner.nextInt();
        int sucessor= numero+1;
        int atecessor= numero-1;
        System.out.println("o sucessor do "+sucessor );
        System.out.println("o aticessor e "+atecessor);

    }
}