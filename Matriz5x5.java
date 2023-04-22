/*
Atividade:

Paulo, o estudante do Ensino Médio que você conheceu no Mergulhando no Tema, agora deseja criar um programa que realize a soma de todos os elementos de uma matriz 5x5, contendo números inteiros. 
Elabore a codificação em linguagem Java de um software que resolva o problema de Paulo.

IMPORTANTE: O programa deverá solicitar a digitação dos valores e armazenar numa matriz 5x5.

*/
package matriz5x5;
import javax.swing.JOptionPane;
/**
 *
 * @author engda
 */
public class Matriz5x5 {
    public static void main(String[] args){
       
        int linhaMatriz = 0, colMatriz = 0;
        boolean valido = false;
        
        //configurando o tamanho da matriz
       String solTamMatriz = JOptionPane.showInputDialog("Digite o tamanho da sua matriz \n utilizando numeros inteiros\n No seguinte formato => ex:5x5\nA maior matriz que pode ser calcular é 9x9");
       
       
       //verificação se os numeros digitados são inteiros de 1 a 9.
       while(!valido){
           try{
               linhaMatriz = Character.getNumericValue(solTamMatriz.charAt(0));
               colMatriz = Character.getNumericValue(solTamMatriz.charAt(2));
               
               if(linhaMatriz >= 1 && linhaMatriz <= 9 && colMatriz >= 1 && colMatriz <= 9){
                   valido = true;
               }else{
                   solTamMatriz = JOptionPane.showInputDialog("Digite números inteiros de 1 a 9,\nseguindo o exemplo => 5x5");
               }
               
           }catch(Exception e){
               solTamMatriz = JOptionPane.showInputDialog("Digite números inteiros de 1 a 9,\nseguindo o exemplo => 5x5");
           }
       }
       
       //criando a matriz com os numeros validos digitados
       int [][] matriz = new int[linhaMatriz][colMatriz];
       
       //preenchimento da matriz
       for(int coluna=0; coluna<colMatriz; coluna++){
           for(int linha=0; linha<linhaMatriz; linha++){
               int numMatriz = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que vai estar na linha " +(linha+1)+ " e na coluna " +(coluna+1)+ " da matriz"));
               matriz[coluna][linha] = numMatriz;
           }           
       }
       
       //mostrando a matriz
       String mostraMatriz = "";

       for (int linha = 0; linha < matriz.length; linha++) {
           for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
               mostraMatriz += matriz[linha][coluna] + " ";
           }
           mostraMatriz += "\n";
       }
       
       //janela que exibe a matriz
       JOptionPane.showMessageDialog(null, "Essa é a sua matriz\n"+mostraMatriz);

       
       //soma da matriz
       int soma = 0;       
       
       for (int linha = 0; linha < matriz.length; linha++) {
         // percorrendo as colunas da matriz
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
            soma += matriz[linha][coluna];
            }
        }
       
       //mostrando o resultado da soma da matriz
       JOptionPane.showMessageDialog(null, "A soma dos valores da matriz é: " +soma); 
    }
}
