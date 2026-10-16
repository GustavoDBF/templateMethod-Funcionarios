package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioSeniorTest {

    @Test
    void deveRetornarMetaAtingida() {
        FuncionarioSenior funcionario = new FuncionarioSenior();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setComissao(3000.0f);
        assertEquals("Meta Atingida", funcionario.verificarMeta());
    }

    @Test
    void deveRetornarMetaNaoAtingida() {
        FuncionarioSenior funcionario = new FuncionarioSenior();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setComissao(2999.0f);
        assertEquals("Meta Nao Atingida", funcionario.verificarMeta());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioSenior funcionario = new FuncionarioSenior();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setComissao(3000.0f);
        funcionario.setNome("Gustavo");
        funcionario.setId(102);
        assertEquals("FuncionarioSenior{id=102, nome='Gustavo', resultado=Meta Atingida}", funcionario.getInfo());
    }
}