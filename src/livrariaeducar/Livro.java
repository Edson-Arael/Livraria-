/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaeducar;

public class  Livro extends Item {
        private String titulo;
        private String autor;
        private int paginas;    
    public Livro() {
    }

    public Livro(String titulo, String autor, int paginas, double precoCusto, double precoVenda, String fornecedor) {
        super(precoCusto, precoVenda, fornecedor);
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void mostrarDados(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(paginas);
        System.out.println("Valor de Compra: "+this.getPrecoCusto());
        System.out.println("Valor de venda: "+this.getPrecoVenda());
        System.out.println("Fornecedor: "+this.getFornecedor());
}
}