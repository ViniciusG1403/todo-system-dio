CREATE TABLE tarefas(
    id_tarefa SERIAL NOT NULL,
    ds_titulo TEXT NOT NULL,
    ds_tarefa TEXT NOT NULL,
    dt_criacao TIMESTAMPTZ NOT NULL,
    dt_limite TIMESTAMPTZ,
    sn_concluido BOOLEAN NOT NULL DEFAULT FALSE
)