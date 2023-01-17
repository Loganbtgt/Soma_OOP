import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
         try (/*Projeto de Calculadora usando OOP */
        Scanner scan = new Scanner(System.in)) {
            Calculo n1 = new Calculo();
             Calculo n2 = new Calculo();
             Calculo resultado = new Calculo();

            String opcao = JOptionPane.showInputDialog(null,"Digite o Valor 1: ");
             n1.setValor(Double.parseDouble(opcao));
            String opcao2 = JOptionPane.showInputDialog("Digite o Valor 2: ");
             n2.setValor(Double.parseDouble(opcao2));
             resultado.setValor(n1.getValor() + n2.getValor());
             JOptionPane.showMessageDialog(null,"A soma do Valor n1 e n2 é igual a = " + resultado.getValor());
        }

         

    }
}
