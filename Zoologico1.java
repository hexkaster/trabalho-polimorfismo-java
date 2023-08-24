public class Zoologico1 {
    private Animal1[] jaulas;

    public Zoologico1(int quantidade) {
        this.jaulas = new Animal1[quantidade];
    }

    public Zoologico1() {
        this.jaulas = new Animal1[5];
    }

    public Animal1[] getJaulas() {
        return jaulas;
    }

    public void setJaulas(Animal1[] jaulas) {
        this.jaulas = jaulas;
    }

}