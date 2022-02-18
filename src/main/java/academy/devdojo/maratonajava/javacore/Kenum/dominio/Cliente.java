package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private String tipo;
    public static final String PESSOA_FISICA = "PESSOAFISICA";
    public static final String PESSOA_JURIDICA = "PESSOA JURIDICA";
    public TipoPagamento tipoPagamento;

    public Cliente(String nome, String tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
