public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo valores na árvore
        arvore.inserir(100);
        arvore.inserir(220);
        arvore.inserir(770);
        arvore.inserir(260);
        arvore.inserir(49);
        arvore.inserir(13);
        arvore.inserir(87);

        System.out.println("Árvore em ordem:");
        arvore.exibirEmOrdem();

        System.out.println("Maior valor: " + arvore.encontrarMaior());
        System.out.println("Menor valor: " + arvore.encontrarMenor());

        arvore.removerMenor();
        System.out.println("Árvore após remover o menor valor:");
        arvore.exibirEmOrdem();
    }
}