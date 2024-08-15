
import java.util.Scanner;
public class exercicio03 {
        public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu salario seu animal se nao sabe calcular o reajuste deve ta em sub emprego");
        float salario = scanner.nextFloat();
        float salarioReajustado= (salario/100)*1+salario;
        System.out.println("seu salario com reajuste no valor de 1% e" + salarioReajustado);
        }

}
