
package livrariaeducar;

public class Item {
        private double precoCusto;
        private double precoVenda;
        private String fornecedor;

    public Item() {
    }

    public Item(double precoCusto, double precoVenda, String fornecedor) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.fornecedor = fornecedor;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
