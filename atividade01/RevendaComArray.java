package atividade01;

import atividade01.Produto;

public class RevendaComArray{
    private Produto[] produtos;
    private int id;

    public RevendaComArray(int qtd_produtos){
        this.produtos = new Produto[qtd_produtos];
        this.id = 0;
    }

    public void inserirProduto(Produto produto){
        this.produtos[id] = produto;
        this.id++;
    }

    public void comprar(int codigo, int quantidade){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                this.produtos[j].compra(quantidade);
                return;
            }
        }
        System.out.println("Codigo nao encotrado");
    }

    public void vender(int codigo, int quantidade){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                this.produtos[j].venda(quantidade);
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }

    public void consultarPrecoVenda(int codigo){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                System.out.println("Preco: " + this.produtos[j].calculaPrecoVenda());
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }

    public void listarPrecos(){
        if (this.id == 0) {
            System.out.println("Lista vazia");
            return;
        }
        
        for (int j = 0; j < this.id; j++) {
            System.out.println("Codigo: " + this.produtos[j].getCodigo());
            System.out.println("Descricao: " + this.produtos[j].getDescricao());
            System.out.println("Preco: " + this.produtos[j].calculaPrecoVenda());
            System.out.println("-------------------------------------------");
        }
    }

    public void mostrarPreco(int codigo){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                System.out.println("Valor de compra: " + this.produtos[j].getValorDeCompra());
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }

    public void editarPreco(int codigo, double novo_valor){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                this.produtos[j].setValorDeCompra(novo_valor);
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }

    public void mostrarCusto(int codigo){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                System.out.println("Custo: " + this.produtos[j].getCusto());
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }

    public void editarCusto(int codigo, double novo_custo){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                this.produtos[j].setCusto(novo_custo);
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }

    public void mostrarMargemDeLucro(int codigo){
        for(int j = 0; j < this.i; j++ ){
            if(this.produtos[j].getCodigo() == codigo){
                System.out.println("Margem de lucro: " + this.produtos[j].getMargemDeLucro());
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }

    public void editarMargemDeLucro(int codigo, double margemLucro){
        for (int j = 0; j < this.id; j++) {
            if (this.produtos[j].getCodigo() == codigo) {
                this.produtos[j].setMargemDeLucro(novo_custo);
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }
}