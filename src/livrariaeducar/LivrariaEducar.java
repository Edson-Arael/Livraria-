package livrariaeducar;


public class LivrariaEducar {


    public static void main(String[] args) {
        Livro livro =  new Livro("Arte da Guerra", "Edson Arael", 200, 1000,2900, "amazon");
        livro.mostrarDados();
        quadrinho quadri = new quadrinho( 2, 300, "AMAZON ", 2000, 4000, "Mercado livro");
        quadri.mostrarQuadrinhos();
        Brinquedos brin = new Brinquedos("Carros", 5, "AMiguinhos do Papai", 19,29, "Mercado Kids");
    }
    
    
}
