/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projhomebeer;

/**
 *
 * @author stranger
 */
public class RemoverProduto extends ConsultarProduto implements AlterarProduto {
  //  @Override
    
    
    
    public boolean excluir(int id) {
        for (CadastrarProduto produtos : listaDeProdutos) {
            if (bebida.getCodigo() == bebida.getCodigo()) {
                ProdutobebidaList.remove(cadproduto);
                ProdutobebidaList.add(bebida);
            }
        }
        return false;
    }
    
}
