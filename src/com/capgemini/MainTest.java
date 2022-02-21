package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testandoMetodoValidarSenha() {
        assertFalse(Desafio.validaSenha("123456"));
        assertTrue(Desafio.validaSenha("123@Aa"));
        assertFalse(Desafio.validaSenha("1234567"));
    }

    @org.junit.jupiter.api.Test
    void testandoMetodoImprimirArvore() {
      assertEquals(Desafio.imprimeArvore(6),"     *\n" +
              "    **\n" +
              "   ***\n" +
              "  ****\n" +
              " *****\n" +
              "******\n");
    }

    @org.junit.jupiter.api.Test
    void testandoMetodoCalculoAnagrama() {
        assertEquals(Desafio.calculoAnagrama("ovo"),1);
        assertEquals(Desafio.calculoAnagrama("rede"),4);
    }
}
