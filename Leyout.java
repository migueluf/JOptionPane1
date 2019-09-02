//Nome: Miguel Ursulino de faria
//CPD: 47334
package leyout;

import javax.swing.JOptionPane;
public class Leyout {

   
    public static void main(String[] args) {
   String nome;
   String mensagem;
   int idade;
   
   
   
   nome = JOptionPane.showInputDialog("Digite o nome completo: ");
   idade = Integer.parseInt(JOptionPane.showInputDialog("insira a idade: "));
   if (idade >= 18){
       mensagem = String.format("Olá "+nome+" você já pode tirar sua CNH!");
   }else{
        mensagem = String.format("Olá "+nome+" você não pode tirar sua CNH, você tem apenas "+idade+" anos");
               
   }
   
   JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
