package vinicius.prado.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vinicius.prado.todo.orm.Tarefas;
import vinicius.prado.todo.service.TarefasService;

import java.util.List;

/**
 * @author Vinicius Gabriel <vinicius.prado@nexuscloud.com.br>
 * @version 1.0
 * @since 28/08/23
 */
@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    private final TarefasService tarefasService;

    @Autowired
    public TarefasController(TarefasService tarefasService) {
        this.tarefasService = tarefasService;
    }

    @GetMapping
    public List<Tarefas> getAllTarefas() {
        return tarefasService.listarTarefas();
    }

    @PutMapping("/concluir/{idTarefa}")
    public Tarefas concluirTarefa(@PathVariable Long idTarefa) {
        return tarefasService.concluirTarefa(idTarefa);
    }

    @PostMapping
    public Tarefas adicionarTarefa(@RequestBody Tarefas tarefa) {
        return tarefasService.adicionarTarefa(tarefa);
    }

}
