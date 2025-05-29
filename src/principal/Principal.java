package principal;

import javax.swing.JOptionPane;
import model.Aluno;
import model.Funcionario;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        Funcionario funcionario = new Funcionario();
        int op;
        while (true) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bem-vindo\n"
                    + "1 - Cadastrar o Cliente\n"
                    + "2 - Mostrar Dados do Cliente\n"
                    + "3 - Acesso ao Funcionário\n"
                    + "4 - Sair"));

            switch (op) {
                case 1:
                    a.leituracliente();
                    break;
                case 2:
                    a.imprimircliente(funcionario.getDescontoPromocao());
                    break;
                case 3:
                    if (funcionario.validarSenha()) {
                        int opcaoFuncionario = -1;
                        while (opcaoFuncionario != 0) {
                            opcaoFuncionario = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Área do Funcionário\n"
                                    + "1 - Atualizar o cadastro do cliente\n"
                                    + "2 - Ver os dados do cliente\n"
                                    + "3 - Alterar o desconto da promoção\n"
                                    + "0 - Voltar"));

                            switch (opcaoFuncionario) {
                                case 1:
                                    a.leituracliente();
                                    break;
                                case 2:
                                    a.imprimircliente(funcionario.getDescontoPromocao());
                                    break;
                                case 3:
                                    funcionario.alterarDescontoPromocao();
                                    break;
                                case 0:
                                    JOptionPane.showMessageDialog(null, "Voltando ao menu principal...");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta. Acesso negado!");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

            }
        }
    }
}
