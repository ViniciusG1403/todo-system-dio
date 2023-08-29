package vinicius.prado.Todo.orm;

import jakarta.persistence.*;

import java.sql.Timestamp;

/**
 * @author Vinicius Gabriel
 * @version 1.0
 * @since 28/08/23
 */
@Entity
@Table(name = "tarefas")
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarefa")
    private Integer idTarefa;

    @Column(name = "ds_titulo")
    private String dsTitulo;

    @Column(name = "ds_tarefa")
    private String dsTarefa;

    @Column(name = "dt_criacao")
    private Timestamp dtCriacao;

    @Column(name = "dt_limite")
    private Timestamp dtLimite;

    @Column(name = "sn_concluido")
    private Boolean snConcluido;

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(final Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getDsTitulo() {
        return dsTitulo;
    }

    public void setDsTitulo(final String dsTitulo) {
        this.dsTitulo = dsTitulo;
    }

    public String getDsTarefa() {
        return dsTarefa;
    }

    public void setDsTarefa(final String dsTarefa) {
        this.dsTarefa = dsTarefa;
    }

    public Timestamp getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(final Timestamp dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public Timestamp getDtLimite() {
        return dtLimite;
    }

    public void setDtLimite(final Timestamp dtLimite) {
        this.dtLimite = dtLimite;
    }

    public Boolean getSnConcluido() {
        return snConcluido;
    }

    public void setSnConcluido(final Boolean snConcluido) {
        this.snConcluido = snConcluido;
    }
}
