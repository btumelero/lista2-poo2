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
public class Ordenacao {
  private int tamanho;
  
  private void maxHeapify(ArrayList<Produto> al, int pai, TipoCriterio crit) {
    int esq = (2 * pai) + 1;
    int dir = (2 * pai) + 2;
    int maior = pai;
    if (esq <= tamanho) {
      if (crit == TipoCriterio.PRECO) {
        if (al.get(esq).preço > al.get(maior).preço) {
          maior = esq;
        }
      } else {
        if (al.get(esq).quantVendas > al.get(maior).quantVendas) {
          maior = esq;
        }
      }
    }
    if (dir <= tamanho) {
      if (crit == TipoCriterio.PRECO) {
        if (al.get(dir).preço > al.get(maior).preço) {
          maior = dir;
        } 
      } else {
        if (al.get(dir).quantVendas > al.get(maior).quantVendas) {
          maior = dir;
        }
      }
    }
    if (maior != pai) {
      Produto aux = al.get(pai);
      al.set(pai, al.get(maior));
      al.set(maior, aux);
      maxHeapify(al, maior, crit);
    }
  }

  private void buildMaxHeap(ArrayList<Produto> al, TipoCriterio crit) {
    tamanho = al.size() - 1;
    for (int pai = tamanho / 2; pai >= 0; pai--) {
      maxHeapify(al, pai, crit);
    }
  }

  public void heapSort(ArrayList<Produto> al, TipoCriterio crit) {
    buildMaxHeap(al, crit);
    for (int i = tamanho; i > 0; i--) {
      Produto aux = al.get(i);
      al.set(i, al.get(0));
      al.set(0, aux);
      tamanho--;
      maxHeapify(al, 0, crit);
    }
  }
}
