import javax.swing.JOptionPane;

/* #4 - Crie uma classe Zoologico, com 10 jaulas (utilize um array) coloque em cada jaula
um animal diferente, percorra cada jaula e emita o som e, se o tipo de animal possuir
o comportamento, faça-o correr. */

public class TesteZoologico1 {

    public static void main(String[] args) {

        int quantidade = 10;


        Animal1[] jaulas = new Animal1[quantidade];

        // Preenche as jaulas com 10 animais - Qualquer espécie inserida que não seja cachorro, cavalo ou preguiça será considerada como uma cela vazia.
        for (int i = 0; i < quantidade; i++) {
            String nome = JOptionPane.showInputDialog("Qual a especie do animal?");

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

        // Percorre o array de Animais emitindo o som e ação do animal
        for (Animal1 animal : zoologico.getJaulas()) {

            JOptionPane.showMessageDialog(null, animal.emitirSom());
            JOptionPane.showMessageDialog(null, animal.acaoAnimal());
        }

    }

}