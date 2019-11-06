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
public abstract class Produto {
  String nome;
  double preço;
  int quantVendas;
  TipoCategoria cat;
  
  Produto(String nome, double preco, int quantVendas, TipoCategoria cat) {
    this.nome = nome;
    this.preço = preco;
    this.quantVendas = quantVendas;
    this.cat = cat;
  }
}
