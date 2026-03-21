package br.com.minisaas.model;

public class TarefaDTO {
    private String titulo;
    private String descricao;

    
    public TarefaDTO() {}

    // Getters e Setters
    public String getTitulo() {
    	return titulo; }
    public void setTitulo(String titulo) {
    	this.titulo = titulo; }

    public String getDescricao() {
    	return descricao; }
    
    public void setDescricao(String descricao) {
    	this.descricao = descricao; }
}