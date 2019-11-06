/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2v2;

import java.util.ArrayList;

/**
 *
 * @author bruno.191196
 */
public class Loja {
  
  ArrayList<ArrayList<Produto>> lista;

  public void adicionaProduto(Produto prod) {
    if (prod.cat == TipoCategoria.CALCADO) {
      lista.get(0).add(prod);
    } else { //suplemento
      lista.get(1).add(prod);
    }
  }
  
  public void ordena(TipoCriterio crit, TipoCategoria cat) {
    Ordenacao ord = new Ordenacao();
    if (cat == TipoCategoria.CALCADO) {
      ord.heapSort(lista.get(0), crit);
    } else {
      ord.heapSort(lista.get(1), crit);
    }
  }
  
  public Loja() {
    this.lista = new ArrayList<>();
    lista.add(new ArrayList<>());
    lista.add(new ArrayList<>());
  }
}
