package org.example;

public class FuncionarioSenior extends Funcionario {

    public String verificarMeta() {
        if (this.calcularSalarioTotal() >= 8000.0f) {
            return "Meta Atingida";
        }
        else {
            return "Meta Nao Atingida";
        }
    }

    @Override
    public String getTipo() {
        return "FuncionarioSenior";
    }
}