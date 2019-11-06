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
public class Suplemento extends Produto {
  double quantidade;
  TipoSuplemento tipo;

  public Suplemento(String nome, double preco, int quantVendas, TipoCategoria cat,
                    double quantidade, TipoSuplemento tipo) {
    super(nome, preco, quantVendas, cat);
    this.quantidade = quantidade;
    this.tipo = tipo;
  }
}
