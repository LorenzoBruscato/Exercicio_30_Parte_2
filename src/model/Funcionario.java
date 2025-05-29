package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Funcionario extends Academia {
     private String senhaCorreta = "senha";
      private double descontopromocao = 0.5;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, String cpf, String rg, int idade, String rua) {
        super(nome, email, cpf, rg, idade, rua);
    }

    public boolean validarSenha() {
        String senhaDigitada = JOptionPane.showInputDialog("Digite a senha de acesso:");
        return senhaDigitada.equals(senhaCorreta);
    }

    public void realizarTarefa() {
        JOptionPane.showMessageDialog(null, "Tarefa do funcionário realizada com sucesso!");
    }
    
     public double getDescontoPromocao(){
        return descontopromocao;
    }
     public void alterarDescontoPromocao() {
       try {
            double desconto = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite o novo desconto da promoção:"));
            if (desconto > 0 && desconto < 1) {
                descontopromocao = desconto;
                JOptionPane.showMessageDialog(null, "Desconto alterado para " + String.format("%.0f", descontopromocao * 100) + "%");
            } else {
                JOptionPane.showMessageDialog(null, "Desconto inválido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
        }
    }
}
