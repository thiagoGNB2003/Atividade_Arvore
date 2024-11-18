class ArvoreBinaria {
    private No raiz;

    // Inserir
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        if (valor < no.getValor()) {
            no.setEsquerdo(inserirRecursivo(no.getEsquerdo(), valor));
        } else if (valor > no.getValor()) {
            no.setDireito(inserirRecursivo(no.getDireito(), valor));
        }
        return no;
    }

    // Achar o maior
    public int encontrarMaior() {
        if (raiz == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }
        return encontrarMaiorRecursivo(raiz);
    }

    private int encontrarMaiorRecursivo(No no) {
        return (no.getDireito() == null) ? no.getValor() : encontrarMaiorRecursivo(no.getDireito());
    }

    // Achar o menor
    public int encontrarMenor() {
        if (raiz == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }
        return encontrarMenorRecursivo(raiz);
    }

    private int encontrarMenorRecursivo(No no) {
        return (no.getEsquerdo() == null) ? no.getValor() : encontrarMenorRecursivo(no.getEsquerdo());
    }

    // Achar o menor
    public void removerMenor() {
        if (raiz == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }
        raiz = removerMenorRecursivo(raiz);
    }

    private No removerMenorRecursivo(No no) {
        if (no.getEsquerdo() == null) {
            return no.getDireito(); // Retorna o nó direito, excluindo o menor
        }
        no.setEsquerdo(removerMenorRecursivo(no.getEsquerdo()));
        return no;
    }

    // Exibir
    public void exibirEmOrdem() {
        exibirEmOrdemRecursivo(raiz);
        System.out.println();
    }

    private void exibirEmOrdemRecursivo(No no) {
        if (no != null) {
            exibirEmOrdemRecursivo(no.getEsquerdo());
            System.out.print(no.getValor() + " ");
            exibirEmOrdemRecursivo(no.getDireito());
            }
        }
    }