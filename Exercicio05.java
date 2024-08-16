
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String args[]){
        int salarioMinimo=1412;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu salario seu pobre");
        float salarioUsuario = scanner.nextFloat();
        float cotacao = salarioUsuario/salarioMinimo;
        float valorAredondado= Math.round(cotacao);
        System.out.println("seu salario atual corresponde a cercade "+ valorAredondado +" vezes o salario minimo");

    }
}