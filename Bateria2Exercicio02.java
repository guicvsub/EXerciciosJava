import java.util.Scanner;
public class Bateria2Exercicio02 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("vamos la 1clThanos Digite o seu nonezinho");
        String clt01 = scanner.nextLine();


        System.out.println("digite seu salario(pra calcular a taxinha)");
        float salarioclt01= scanner.nextFloat();
        scanner.nextLine();//Exclui o caracter que esta no  buffer quando se
        // usa nextFloat(nao sabia disso) o mesmo vale pra int


        System.out.println("vamos la clThanos Digite o seu nonezinho");
        String clt02 = scanner.nextLine();

        System.out.println("digite seu salario(pra calcular a taxinha)");
        float salarioclt02= scanner.nextFloat();
        scanner.nextLine();//aqui e a mesma fita

        System.out.println("vamos la clThanos Digite o seu nonezinho");
        String clt03 = scanner.nextLine();


        System.out.println("digite seu salario(pra calcular a taxinha)");
        float salarioclt03= scanner.nextFloat();
        scanner.nextLine();//aqui também

        float Media = (salarioclt01+salarioclt03+salarioclt02)/3;
        float media= Math.round(Media);
        String valorfinal=String.format("%.2f",media);//formata duas casas decimais
        System.out.println("a media salrial dos clthanos e " + valorfinal);

    }
}