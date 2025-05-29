package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Academia {

    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private int idade;
    private String rua;

    public Academia() {
    }

    public Academia(String nome, String email, String cpf, String rg, int idade, String rua) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.rua = rua;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    // Método de promoção
    public void promocao(Aluno a, double descontoPromocao) {
        double salario = a.getSalario();
        if (salario < 1500) {
            double novoValor = 900 - (900 * descontoPromocao);
            System.out.println("Promoção aplicada! Mensalidade: R$" + novoValor);
        } else {
            System.out.println("Não tem direito à promoção.");
        }
    }

    // Métodos de entrada e saída
    public void leituraempresa() {
        setNome(JOptionPane.showInputDialog("Nome: "));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        setEmail(JOptionPane.showInputDialog("Email: "));
        setCpf(JOptionPane.showInputDialog("CPF: "));
        setRg(JOptionPane.showInputDialog("RG: "));
        setRua(JOptionPane.showInputDialog("Rua: "));
    }

    public void imprimirempresa() {
        JOptionPane.showMessageDialog(null, paraStringempresa());
    }

    public String paraStringempresa() {
        return "Nome: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Email: " + getEmail() + "\n"
                + "CPF: " + getCpf() + "\n"
                + "RG: " + getRg() + "\n"
                + "Rua: " + getRua();
    }
}
