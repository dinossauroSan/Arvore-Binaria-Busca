public class No {
    private int x;
    private No esquerdo;
    private No direito;

    public No(int x) {
        this.x = x;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getX() {
        return x;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }
}
