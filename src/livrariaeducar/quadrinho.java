/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaeducar;


public class quadrinho extends Item {
    private int colecao;
    private int numero;
    private String editora;

    public quadrinho(int colecao, int numero, String editora, double precoCusto, double precoVenda, String fornecedor) {
        super(precoCusto, precoVenda, fornecedor);
        this.colecao = colecao;
        this.numero = numero;
        this.editora = editora;
    }

    public quadrinho() {
    }

    public int getColecao() {
        return colecao;
    }

    public void setColecao(int colecao) {
        this.colecao = colecao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void mostrarQuadrinhos(){
        System.out.println(colecao);
        System.out.println(numero);
        System.out.println(editora);
        System.out.println("Preco de compra:"+this.getPrecoCusto());
        System.out.println("Preco de compra:"+this.getPrecoVenda());
        System.out.println("Fornecedor:"+ this.getFornecedor());

    }
}
 