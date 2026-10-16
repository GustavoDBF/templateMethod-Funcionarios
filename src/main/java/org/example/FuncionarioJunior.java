package org.example;

public class FuncionarioJunior extends Funcionario {

    public String verificarMeta() {
        if (this.calcularSalarioTotal() >= 3000.0f) {
            return "Meta Atingida";
        }
        else {
            return "Meta Nao Atingida";
        }
    }
}