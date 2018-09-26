/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projhomebeer;

import javax.swing.JOptionPane;

/**
 *
 * @author stranger
 */
public class Produtos extends CadastrarProduto{
   
    private int id;
    private String bebidas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    @Override
    public void adicionarProduto(){
    JOptionPane.showMessageDialog(null,"O produto Cadastrado é"+ getDescricao());
        
    }

}