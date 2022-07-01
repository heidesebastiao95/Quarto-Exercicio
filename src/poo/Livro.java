package poo;

public class Livro {
    private String Nome;
    private String Autor;
    private float Preco;

    @Override
    public String toString() {
        return "Livro{\n" +
                "Nome='" + Nome + '\'' +
                ",\n Autor='" + Autor + '\'' +
                ",\n Preco=" + Preco +
                '}';
    }

    public Livro(String nome, String autor, float preco) {
        Nome = nome;
        Autor = autor;
        Preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float preco) {
        Preco = preco;
    }
}
