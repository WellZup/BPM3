package test;

import org.example.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void validarPessoa() {
        Pessoa pessoa1 = new Pessoa(1, "Ciclano");
        assertTrue(pessoa1.valido());

        Pessoa pessoa2 = new Pessoa(2, "");
        assertFalse(pessoa2.valido());

        Pessoa pessoa3 = new Pessoa(0, "Ciclano");
        assertFalse(pessoa3.valido());

        Pessoa pessoa4 = new Pessoa(-1, "Ciclano");
        assertFalse(pessoa4.valido());

        Pessoa pessoa5 = new Pessoa(1, "Ciclano");
        assertEquals(pessoa1.getNome(), pessoa5.getNome());
    }


}
