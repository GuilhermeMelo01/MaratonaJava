package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LightMovel {
    private String nome;
    private Double preço;
    private Category category;

    public LightMovel(String nome, Double preco) {
        this.nome = nome;
        this.preço = preco;
    }

    public LightMovel(String nome, Double preco, Category category) {
        this.nome = nome;
        this.preço = preco;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightMovel that = (LightMovel) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "LightMovel{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                ", category=" + category +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
