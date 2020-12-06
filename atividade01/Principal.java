package atividade01;

import atividade01.Produto;
import atividade01.RevendaComArray;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op, tam, qtd_produtos = 0;

        int codigo, qtd_estoque; 
        String descricao; 
        double valor, custo, margem_lucro;

        System.out.println("Quantidade de produtos permitidos no estoque:");
        tam = Integer.parseInt(in.nextLine());
        RevendaComArray produtos = new RevendaComArray(tam);

        do{

            System.out.println("---------------------------\n");
            System.out.println("1 - Adicionar produto\n");
            System.out.println("2 - Comprar produto\n");
            System.out.println("3 - Vender produto\n");
            System.out.println("4 - Listar produtos\n");
            System.out.println("5 - Editar\n");
            System.out.println("6 - Consultar\n");
            System.out.println("7 - Sair\n\n");

            op =  Integer.parseInt(in.nextLine())

            switch (op) {
                case 1:
                    if (qtd_estoque < tam) {
                        System.out.println("1 - Adicionar produto\n\n");

                        System.out.println("Codigo do produto:");
                        codigo = Integer.parseInt(in.nextLine());

                        System.out.println("Descrição do produto:");
                        descricao = in.nextLine();

                        System.out.println("Valor de compra do produto:");
                        valor = Double.parseDouble(in.nextLine());

                        System.out.println("Custa para armazernar e/ou beneficiar o produto:");
                        custo = Double.parseDouble(in.nextLine());

                        System.out.println("Margem de lucro do produto:");
                        margem_lucro = Double.parseDouble(in.nextLine());

                        System.out.println("Quantidade de unidades do produto em estoque:");
                        qtd_estoque = Integer.parseInt(in.nextLine());

                        produtos.inserirProduto(new Produto(codigo, descricao, valor, custo, margem_lucro, qtd_estoque));

                        qtd_produtos++;
                    } else System.out.println("Estoque cheio");

                    break;

                case 2:
                    System.out.println("2 - Comprar produto\n\n")

                    System.out.println("Digite o codigo do produto que deseja comprar e quantas unidades, respectivamente:")
                    codigo = Integer.parseInt(in.nextLine());
                    int qtd = Integer.parseInt(in.nextLine());

                    produtos.comprar(codigo, qtd);

                    System.out.println("Produto adicionado");

                    break;

                case 3:
                    System.out.println("3 - vender produto\n\n")

                    System.out.println("Digite o codigo do produto que deseja vender e quantas unidades, respectivamente:")
                    codigo = Integer.parseInt(in.nextLine());
                    int qtd = Integer.parseInt(in.nextLine());

                    produtos.vender(codigo, qtd);

                    System.out.println("Produto adicionado");

                    break;

                case 4:
                    System.out.println("4 - Listar produtos\n\n");

                    produtos.listarPrecos();

                    break;

                case 5:
                    System.out.println("5 - Editar\n\n");

                    System.out.println("O que deseja editar?\n");
                    System.out.println("1 - Preco de um produto\n");
                    System.out.println("2 - Custo de um produto\n");
                    System.out.println("3 - Margem de lucro de um produto\n");

                    op =  Integer.parseInt(in.nextLine())

                    switch(op) {
                        case 1:
                            System.out.println("1 - Editar preco de um produto\n\n");

                            System.out.println("Digite o codigo e o novo valor do produto que deseja editar, respectivamente:");
                            codigo = Integer.parseInt(in.nextLine());
                            double nov_valor = Double.parseDouble(in.nextLine());

                            produtos.editarPreco(codigo, novo_valor);

                            break;
                        case 2:
                            System.out.println("1 - Editar custo de um produto\n\n");

                            System.out.println("Digite o codigo e o novo valor do custo que deseja editar, respectivamente:");
                            codigo = Integer.parseInt(in.nextLine());
                            double nov_valor = Double.parseDouble(in.nextLine());

                            produtos.editarCusto(codigo, novo_valor);

                            break;
                        case 3:
                            System.out.println("1 - Editar margem de lucro de um produto\n\n");

                            System.out.println("Digite o codigo e o novo valor da margem de lucro que deseja editar, respectivamente:");
                            codigo = Integer.parseInt(in.nextLine());
                            double nov_valor = Double.parseDouble(in.nextLine());

                            produtos.editarMargemDeLucro(codigo, novo_valor);

                            break;
                        default:
                            System.out.println("Opcao invalida.\n");
                    }

                    break;
                    
                case 6:
                    System.out.println("5 - Consultar\n\n");

                    System.out.println("O que deseja consultar?\n");
                    System.out.println("1 - Preco de um produto\n");
                    System.out.println("2 - Custo de um produto\n");
                    System.out.println("3 - Margem de lucro de um produto\n");

                    op =  Integer.parseInt(in.nextLine())

                    switch(op) {
                        case 1:
                            System.out.println("1 - Consultar preco de um produto\n\n");

                            System.out.println("Digite o codigo do produto que deseja consultar o preco");
                            codigo = Integer.parseInt(in.nextLine());

                            produtos.mostrarPreco(codigo, novo_valor);

                            break;
                        case 2:
                            System.out.println("1 - Consultar custo de um produto\n\n");

                            System.out.println("Digite o codigo do produto que deseja consultar o custo");
                            codigo = Integer.parseInt(in.nextLine());

                            produtos.mostrarCusto(codigo, novo_valor);

                            break;
                        case 3:
                            System.out.println("1 - Consultar margem de lucro de um produto\n\n");

                            System.out.println("Digite o codigo do produto que deseja consultar a margem de lucro");
                            codigo = Integer.parseInt(in.nextLine());

                            produtos.mostrarMargemDeLucro(codigo, novo_valor);

                            break;
                        default:
                            System.out.println("Opcao invalida.\n");
                    }            
                    break;
            
                default:
                    System.out.println("Opcao invalida.\n");
            }

        } while (op != 7);
    }
}