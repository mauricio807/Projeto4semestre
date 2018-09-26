/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projhomebeer;
import javax.swing.JOptionPane;
/**
 * @author stranger
 */
public class CadastrarProduto {

    private String descricao;
    private int codigo;
    private double preco;
    private  String data;

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return descricao;
    }

    void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    int getCodigo() {
        return codigo;
    }

    void setpreco(double preco) {
        this.preco = preco;
    }

    double getpreco() {
        return preco;
    }

    public void setData(String valor) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
    public void adicionarProduto(){
        JOptionPane.showMessageDialog(null,"o Produto sera inserido no estoque");
        JOptionPane.showMessageDialog(null,"Descrição"+ getDescricao());
    }
}


