/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projhomebeer;

//import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * import java.awt.Toolkit; import java.text.DateFormat; import
 * java.text.SimpleDateFormat; import java.util.Calendar; import java.util.Date;
 * import java.util.Locale; import javax.swing.JOptionPane;
 *
 *
 *
 * @author stranger
 */
public class HomeBeer {
    //  ConsultarProduto consulta =new ConsultarProduto();

    public static void main(String[] args) {

        Locale localBR = new Locale("pt", "BR");
        int opc = 0;
        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(null, " HomeBeer Gerenciador de Estoque\n"
                    + "\n " + "Informe o Número que corresponde a Opção desejada!" + "\n"
                    + "\n" + "1.Cadastrar Produtos" + "\n"
                    + "2.Consultar Produtos" + "\n"
                    + "3.Remover Produtos" + "\n"
                    + "4.Alterar Produtos" + "\n"
                    + "5.Sair" + "\n"
            ));
            CadastrarProduto cadastro = new CadastrarProduto();
            if (opc == 1) {

                String codigo = JOptionPane.showInputDialog(
                        " Digite o código do produto: " + cadastro.getCodigo());
                String descricao = JOptionPane.showInputDialog(
                        " Digite o nome do produto: " + cadastro.getDescricao());
                Double preco = Double.parseDouble(JOptionPane
                        .showInputDialog(" Digite o preço do produto:" + cadastro.getpreco()));

                String data = JOptionPane.showInputDialog("Digite a Data do Cadastro" + cadastro.getData()
                        + new SimpleDateFormat("dd/MM/yyyy")
                                .format(new Date()) + " \n");

            } else if (opc == 2) {
                ConsultarProduto consulta = new ConsultarProduto();
                JOptionPane.showMessageDialog(null, "Lista de  Produtos Cadastrados " + consulta.listaDeProdutos);

            } else if (opc == 3) {
                RemoverProduto exc = new RemoverProduto();
                JOptionPane.showMessageDialog(null, "Informe o ID do Produto que deseja remover" + exc.ProdutobebidaList);
            } else if (opc == 4) {
                Produtos pro =new Produtos();
                JOptionPane.showInputDialog(null, "Informe a descrição do Produto que deseja Alterar" + pro.getDescricao());
                JOptionPane.showMessageDialog(null, "");
            } else if (opc == 5) {
                JOptionPane.showMessageDialog(null, "");
            }

        } while (opc != 5);

    }
}
