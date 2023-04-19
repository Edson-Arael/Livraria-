/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaeducar;


public class Brinquedos extends Item{
    private String tipo;
    private int idade;
    private String fabricante;

    public Brinquedos() {
    }

    public Brinquedos(String tipo, int idade, String fabricante, double precoCusto, double precoVenda, String fornecedor) {
        super(precoCusto, precoVenda, fornecedor);
        this.tipo = tipo;
        this.idade = idade;
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void mostrarBrinquedos(){
        System.out.println("Tipo"+ tipo);
        System.out.println("Idade: "+idade);
        System.out.println("Frabricante :"+fabricante);
        System.out.println("Preco de compra:"+this.getPrecoCusto());
        System.out.println("Preco de compra:"+this.getPrecoVenda());
        System.out.println("Fornecedor:"+ this.getFornecedor());
    }
}
