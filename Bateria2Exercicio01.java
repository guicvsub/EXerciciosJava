import java.util.Scanner;
public class Bateria2Exercicio01 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a temperatura em C");
        float tempC=scanner.nextFloat();
        double f = (tempC*1.8)+32;
        float fTotal = Math.round(f);
        float k = Math.round(tempC+273.15);
        float re =Math.round(tempC*0.8);
        float ra = Math.round(f+459.67);

        System.out.println("a temperatura em Fahrenheit "+ fTotal);
        System.out.println("a temperatura em Kelvin e "+ k);
        System.out.println("a temperatura em  Réaumur e " + re);
        System.out.println("temperatura em Rankine "+ ra);

    }
}