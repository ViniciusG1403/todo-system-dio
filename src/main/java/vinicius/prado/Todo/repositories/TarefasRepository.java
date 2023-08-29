package vinicius.prado.Todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vinicius.prado.Todo.orm.Tarefas;

/**
 * @author Vinicius Gabriel
 * @version 1.0
 * @since 28/08/23
 */
@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
}