package br.com.tarefas.repository;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.tarefas.model.Tarefa;

@SpringBootTest
public class TarefaRepositoryTest {

	@Autowired
	private TarefaRepository repositorio;
	
	void testFindByNomeCategoria() {
		List<Tarefa> tarefas = repositorio.findByNomeCategoria("Estudos");
		Assertions.assertEquals(2, tarefas.size());	
	}
	
	void testTarefasporCategoria() {
		List<Tarefa> tarefas = repositorio.tarefasPorCategoria("Estudos");
		Assertions.assertEquals(2, tarefas.size());	
	}
}
