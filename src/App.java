import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         try (/*Projeto de Calculadora usando OOP */
        Scanner scan = new Scanner(System.in)) {
            Calculo n1 = new Calculo();
             Calculo n2 = new Calculo();
             Calculo resultado = new Calculo();

             System.out.println("Digite o Valor 1: ");
             n1.setValor(scan.nextInt());
             System.out.println("Digite o Valor 2: ");
             n2.setValor(scan.nextInt());
             resultado.setValor(n1.getValor() + n2.getValor());
             System.out.println("A soma do Valor n1 e n2 é igual a = " + resultado.getValor());
        }

         

    }
}
