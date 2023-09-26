package test;

import org.example.Pessoa;
import org.example.Turma;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TurmaTest {
    private Turma turma;

    @Before
    public void setUp() {
        turma = new Turma();
    }

    @Test
    public void adicionarPessoaTest() throws Exception{
        Pessoa pessoa1 = new Pessoa(1, "Ciclano");
        Pessoa pessoa2 = new Pessoa(2,"Ojuara");

        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        ArrayList<Pessoa> pessoasEnturmadas = turma.getPessoas();
        assertEquals(2, pessoasEnturmadas.size());

        Pessoa pessoa3 = new Pessoa(1, "Ciclano");
        assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa3));

        Pessoa pessoa4 = new Pessoa(0, "Erro");
        assertThrows(Exception.class, ()-> turma.adicionarPessoa(pessoa4));
    }

    @Test
    public void removerTodasPessoasTest() throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Ciclano");
        Pessoa pessoa2 = new Pessoa(2,"Ojuara");

        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        ArrayList<Pessoa> pessoasEnturmadas = turma.getPessoas();
        assertEquals(2, pessoasEnturmadas.size());

        turma.removerTodasPessoas();

        pessoasEnturmadas = turma.getPessoas();
        assertEquals(0, pessoasEnturmadas.size());

        ArrayList<Pessoa> pessoasNaTurma = turma.getPessoas();
        assertTrue(pessoasNaTurma.isEmpty());
    }
}
