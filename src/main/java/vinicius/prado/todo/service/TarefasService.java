package vinicius.prado.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinicius.prado.todo.orm.Tarefas;
import vinicius.prado.todo.repositories.TarefasRepository;

import java.util.List;

/**
 * @author Vinicius Gabriel
 * @version 1.0
 * @since 28/08/23
 */

@Service
public class TarefasService {

    private final TarefasRepository tarefasRepository;

    @Autowired
    public TarefasService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    public Tarefas adicionarTarefa(Tarefas tarefas) {
        return tarefasRepository.save(tarefas);
    }

    public List<Tarefas> listarTarefas() {
        return tarefasRepository.findAll();
    }

    public Tarefas listarTarefasById(Long idTarefa) {
        return tarefasRepository.findById(idTarefa)
            .orElseThrow(
                () -> new RuntimeException("Nenhuma tarefa encontrada com o ID " + idTarefa));
    }

    public Tarefas concluirTarefa(Long idTarefa) {
        Tarefas tarefa = tarefasRepository.findById(idTarefa)
            .orElseThrow(
                () -> new RuntimeException("Nenhuma tarefa encontrada com o ID " + idTarefa));

        if(tarefa.getSnConcluido() == Boolean.TRUE){
            throw new RuntimeException("Tarefa já concluida.");
        }

        tarefa.setSnConcluido(Boolean.TRUE);

        return tarefasRepository.save(tarefa);

    }
}
