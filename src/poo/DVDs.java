package poo;

public class DVDs {
    private String Nome;
    private float preco;
    private float duracao;

    public DVDs(String nome, float preco, float duracao) {
        Nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "DVDs{\n" +
                "Nome='" + Nome + '\'' +
                ",\n preco=" + preco +
                ",\n duracao=" + duracao +
                '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
}
