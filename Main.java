import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite os dias que voce viveu: ");
        int n= scanner.nextInt();
        int ano =365;
        int AnosVividos = n/365;

        //calcula o que sobrou que nao tem valor suficiente para ser anos
        int BaseDoCalculoPraMeses = n%365;
        //calcula meesses usando o resto da divisao anterior
        int Meses =BaseDoCalculoPraMeses/30;

        int BaseDoCalculoPraDias = BaseDoCalculoPraMeses%30;
        System.out.println("voce viveu " + AnosVividos +" anos e "+ Meses +"meses "+ BaseDoCalculoPraDias +"dias");
    }
}