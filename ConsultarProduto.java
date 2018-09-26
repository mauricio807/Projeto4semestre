/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projhomebeer;   

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stranger
 */
public class ConsultarProduto implements AlterarProduto {

    CadastrarProduto cadproduto = new CadastrarProduto();
    Produtos bebida = new Produtos();

    List<CadastrarProduto> listaDeProdutos = new ArrayList<CadastrarProduto>();
    List<Produtos> ProdutobebidaList = new ArrayList<Produtos>();

    @Override

    public List<Produtos> listar(Produtos cadproduto) {

        for (CadastrarProduto produtos : listaDeProdutos) {
            if (cadproduto.getCodigo() == bebida.getId()) {
                bebida.setCodigo(cadproduto.getCodigo());
                listaDeProdutos.add(cadproduto);

            }

        }
        return ProdutobebidaList;
    }

    @Override
    public boolean incluir(Produtos produto) {
        listaDeProdutos.add(produto);
        return false;
    }

    @Override
    public boolean alterar(Produtos produto) {
        for (CadastrarProduto produtos : listaDeProdutos) {
            if (bebida.getCodigo() == bebida.getId()) {
                ProdutobebidaList.remove(cadproduto);
                ProdutobebidaList.add(bebida);
            }
        }
        return true;
    }
    //@Override
 //   public boolean excluir(int id) {
   //     for (CadastrarProduto produtos : listaDeProdutos) {
     //       if (bebida.getCodigo() == bebida.getCodigo()) {
       //         ProdutobebidaList.remove(cadproduto);
         //       ProdutobebidaList.add(bebida);
           // }
        //}
       // return false;
    //}

    @Override
    public boolean exlcluir(int codigo) {
        return false;
    }
}
