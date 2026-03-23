package br.com.minisaas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Essa anotação avisa o Java: "Isso aqui é uma tabela do Postgres!"
@Table(name = "tb_tarefa") // O nome exato da tabela que criamos no seu banco.sql
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String descricao;

    // Construtor vazio (obrigatório para o Java entender o banco)
    public Tarefa() {}

    // Getters e Setters (as ferramentas para ler e escrever os dados)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}