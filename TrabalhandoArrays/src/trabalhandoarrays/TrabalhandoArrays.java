/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhandoarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author alisson_formento
 */
import java.util.ArrayList;
public class TrabalhandoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRIE UM PROGRAMA COM JOPTION PANE QUE PEÇA 3 NOTAS E INFORME A MEDIA DO ALUNO
        //media();
        
        //mediaVariasNotas();
   menorMaiorComMedia();
    }
    
    public static void menorMaiorComMedia(){
        ArrayList<Integer> numbers = new ArrayList<>();
    
    String resp = "";
    
    while(!resp.equals("x")){
            resp = JOptionPane.showInputDialog("Digite um numero ou x para sair:");
        if(!resp.equals("x")){
            numbers.add(Integer.parseInt(resp));     
        }
    }   
            
    // UTILIZANDO O ARRAU LIST. PEGAR QUANTOS INTEIROS QUE O USUÁRIO QUISER DIGITAR
    // NO FINAL INDIQUE QUAL´O MENOR, QUAL O MAIOR NUMERO E QUAL A MEDIA DOS INTEIROS;
        Integer menor = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < menor){
                menor = numbers.get(i);
            }
        }
        
        Integer maior = numbers.get(0);
        for(Integer n : numbers) {
            if(n > maior){
                maior = n;
            }
            
            Double media = 0.0;
            Iterator<Integer> it = numbers.iterator();
            while(it.hasNext()){
                media += it.next();
            }
            media /= numbers.size();
            
            JOptionPane.showMessageDialog(null, "Dos números inteiros digitados\n"+
                                                "O menor número é: "+menor+"\n"+
                                                "O maior número é: "+maior+"\n"+
                                                "E a média dos números é: "+media);
    }
        
    }
    
    public static void pedirVariasNotas(){
         Double[] notas = new Double[1];
       String resp = "";
       
       int contador = 0;
       while(!resp.equals("-1")){
        resp = (JOptionPane.showInputDialog("Digite a nota ou -1 para encerrar"));
        if (!resp.equals("-1")){
            if(notas.length == contador){
                Double[] newNotas = new Double[contador+1];
            }
            Double[] newNotas = null;
            notas = newNotas;
        }
        notas[contador] = Double.parseDouble(resp);
        contador++;
     }
    }
    
    public static void media(){
    Double[] notas = new Double[3];
        
        for (int i = 0; i <= 2; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(i+1)+"ª nota:"));
        }
        
        double media = (notas[0] + notas[1] +notas[2])/3;
        
        JOptionPane.showMessageDialog(null, "A media do aluno foi de "+media+".");
        
    
    }
    
}
