package br.com.alura.microsservice.loja.dto;

public class ItemDaCompraDTO {

    private long id;

    private Integer quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
