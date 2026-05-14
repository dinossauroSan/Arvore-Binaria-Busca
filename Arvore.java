public class Arvore {
    private int grau;
    private No raiz;

    // Criando a árvore vazia
    public Arvore(int grau) {
        this.grau = grau;
        this.raiz = null;

    }

    public void inserir(int x, No raiz) {
        if(estaVazia()) {
            No novo = new No(x);
            raiz = novo;
            return System.out.prinln("Nó inserido com sucesso");
        }
        if( x < raiz.getX()) {
            raiz.setEsquerdo(raiz);
            
            inserir(x, raiz.getEsquerdo());
        }else if( x > raiz.getX) {
            raiz.setDireito(raiz);

            inserir(x, raiz.getDireito());
        }
        


    }

    // Método estaVazia()
    public boolean estaVazia() {
        return raiz == null;
    }

    //Gets e Sets
    public No getRaiz() {
        return raiz;
    }

}