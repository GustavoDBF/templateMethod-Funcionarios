package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioJuniorTest {

    @Test
    void deveRetornarMetaAtingida() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setSalarioBase(2000.0f);
        funcionario.setComissao(1000.0f);
        assertEquals("Meta Atingida", funcionario.verificarMeta());
    }

    @Test
    void deveRetornarMetaNaoAtingida() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setSalarioBase(2000.0f);
        funcionario.setComissao(999.0f);
        assertEquals("Meta Nao Atingida", funcionario.verificarMeta());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setSalarioBase(2000.0f);
        funcionario.setComissao(999.0f);
        funcionario.setNome("Lucas");
        funcionario.setId(101);
        assertEquals("Funcionario{id=101, nome='Lucas', resultado=Meta Nao Atingida}", funcionario.getInfo());
    }
}