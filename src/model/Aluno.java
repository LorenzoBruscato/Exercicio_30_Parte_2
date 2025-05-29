package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Aluno extends Academia {

    private int peso;
    private double altura;
    private int dias;
    private int salario;

    public Aluno() {
    }

    public Aluno(int peso, double altura, int dias, int salario, String nome, String email, String cpf, String rg, int idade, String rua) {
        super(nome, email, cpf, rg, idade, rua);
        this.peso = peso;
        this.altura = altura;
        this.dias = dias;
        this.salario = salario;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void leituracliente() {
        super.leituraempresa();
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso em Kg: ")));
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));
        setDias(Integer.parseInt(JOptionPane.showInputDialog("Qunatos dias de treino: ")));
        setSalario(Integer.parseInt(JOptionPane.showInputDialog("Salário: ")));
    }

    public void imprimircliente(double descontopromocao) {
        JOptionPane.showMessageDialog(null, paraStringcliente(descontopromocao));
    }

    public String paraStringcliente(double descontopromocao) {
        String texto = super.paraStringempresa() + "\n"
                + "Peso: " + getPeso() + " Kg\n"
                + "Altura: " + getAltura() + " m\n"
                + "Dias de treino: " + getDias() + "\n"
                + "Salário: R$" + getSalario() + "\n";

        if (getSalario() < 1500) {
            double promocao = 900 - (900 * descontopromocao);
            texto += "Promoção aplicada: " + String.format("%.0f", descontopromocao * 100) + "%" + "\nMensalidade: R$" + promocao;
        } else {
            texto += "Mensalidade: R$900";
        }
        return texto;
    }
}
