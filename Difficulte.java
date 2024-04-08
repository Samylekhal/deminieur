

public enum Difficulte {
    FACILE(10,8),
    NORMAL(20,16),
    DIFFICILE(40,16),
    EXTREME(99,24);

    private final int nbMines;
    private final int tailleGrilles;

    private Difficulte(int nbMines, int tailleGrilles) {
        this.nbMines = nbMines;
        this.tailleGrilles = tailleGrilles;
    }

    public int getNbMines() {
        return nbMines;
    }

    public int getTailleGrilles() {
        return tailleGrilles;
    }
}
