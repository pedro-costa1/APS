package atividade01;

public class Produto{
    private int codigo;
    private String descricao;
    private double valor_compra;
    private double custo;
    private double margem_lucro;
    private int qtd_estoque;

    public Produto() {}

    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double valor_compra, double custo, double margem_lucro){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_compra = valor_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }

    public Produto(int codigo, String descricao, double valor_compra, double custo, double margem_lucro, int qtd_estoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_compra = valor_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.qtd_estoque = qtd_estoque;
    }

    public void compra(int quant){
        qtd_estoque = qtd_estoque + quant;
    }

    public void venda(int quant){
        qtd_estoque = qtd_estoque - quant;
    }

    public double calculaPrecoVenda(){
        return valor_compra + custo + margem_lucro*(valor_compra + custo);
    }

    public double getValorDeCompra(){
        return this.valor_compra;
    }
    public void setValorDeCompra(double valor_compra){
        this.valor_compra = valor_compra;
    }

    public double getCusto(){
        return this.custo;
    }
    public void setCusto(double custo){
        this.custo = custo;
    }

    public double getMargemDeLucro(){
        return this.margem_lucro;
    }
    public void setMargemDeLucro(double margem_lucro){
        this.margem_lucro = margem_lucro;
    }
}