/* #3 - Implemente uma classe Veterinario que contenha um método examinar() cujo
parâmetro de entrada é um Animal, quando o animal for examinado ele deve emitir
um som, passe os 3 animais com parâmetro.  */

import javax.swing.JOptionPane;

public class Veterinario1 {
    public static void main(String[] args) {
        int quantidade = 3;


        Animal1[] jaulas = new Animal1[quantidade];

        // Passa as 3 espécies animais para o veterinário examinar
        for (int i = 0; i < quantidade; i++) {
            String nome = JOptionPane.showInputDialog("Qual a especie do animal examinado?");

            if (nome.equalsIgnoreCase("cachorro")) {
                Animal1 cachorro = new Cachorro1();
                jaulas[i] = cachorro;
            } 
            else if (nome.equalsIgnoreCase("preguica")){
                Animal1 preguica = new Preguica1();
                jaulas[i] = preguica;
            }
            else if (nome.equalsIgnoreCase("cavalo")) {
                Animal1 cavalo = new Cavalo1();
                jaulas[i] = cavalo;
            }
        }

    
        Zoologico1 zoologico = new Zoologico1(quantidade);
        
        zoologico.setJaulas(jaulas);

        // Emite o som do animal examinado
        for (Animal1 animal : zoologico.getJaulas()) {

            JOptionPane.showMessageDialog(null, animal.emitirSom());
        }

    }
}