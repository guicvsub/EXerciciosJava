import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int anos,meses,dias;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a quantidade de anos");
        anos = scanner.nextInt();
        System.out.println("digite os meses");
        meses = scanner.nextInt();
        System.out.println("digite os dias");
        dias = scanner.nextInt();
        System.out.println(anos*(365)+(30*meses)+dias);
    }
}