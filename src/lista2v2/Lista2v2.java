/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2v2;

/**
 *
 * @author bruno.191196
 */
public class Lista2v2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Loja loja = new Loja();
    
    loja.adicionaProduto(new Calcado("Adidas", 100.00, 20, TipoCategoria.CALCADO, "40", TipoCalcado.CASUAL));
    loja.adicionaProduto(new Calcado("Nike", 200.00, 10, TipoCategoria.CALCADO, "40", TipoCalcado.ESPORTE));
    loja.adicionaProduto(new Calcado("All Star", 150.00, 25, TipoCategoria.CALCADO, "40", TipoCalcado.CASUAL));
    loja.adicionaProduto(new Calcado("Asics", 250.00, 15, TipoCategoria.CALCADO, "40", TipoCalcado.CASUAL));
    
    System.out.println("Desordenados por preço: ");
    loja.lista.get(0).forEach((produto) -> {
      System.out.print(produto.nome + ": " + produto.preço + ", ");
    });
    
    loja.ordena(TipoCriterio.PRECO, TipoCategoria.CALCADO);
    
    System.out.println("\nOrdenados por preço: ");
    loja.lista.get(0).forEach((produto) -> {
      System.out.println(produto.nome + ": " + produto.preço + ", ");
    });
    
    System.out.println("\nDesordenados por quantVendas: ");
    loja.lista.get(0).forEach((produto) -> {
      System.out.println(produto.nome + ": " + produto.quantVendas + ", ");
    });
    
    loja.ordena(TipoCriterio.QUANTIDADE, TipoCategoria.CALCADO);
    
    System.out.println("\nOrdenados por quantVendas: ");
    loja.lista.get(0).forEach((produto) -> {
      System.out.println(produto.nome + ": " + produto.quantVendas + ", ");
    });
  }
  
}
