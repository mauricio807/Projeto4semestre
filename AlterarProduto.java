/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projhomebeer;

import java.util.List;

/**
 *
 * @author stranger
 */
interface AlterarProduto {
    
    List<Produtos> listar(Produtos produto);

    boolean incluir(Produtos produto);

    boolean alterar(Produtos produto);

    boolean exlcluir(int codigo);

}
