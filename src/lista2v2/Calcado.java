/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2v2;

/**
 *
 * @author Bruno
 */
public class Calcado extends Produto {
  String tamanho;
  TipoCalcado tipo;

  public Calcado(String nome, double preco, int quantVendas, TipoCategoria cat,
                 String tamanho, TipoCalcado tipo) {
    super(nome, preco, quantVendas, cat);
    this.tamanho = tamanho;
    this.tipo = tipo;
  }
}
