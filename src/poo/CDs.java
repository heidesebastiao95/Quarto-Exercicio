package poo;

public class CDs {
    private String Nome;
    private float preco;
    private int Nfaixa;

    public CDs(String nome, float preco, int nfaixa) {
        Nome = nome;
        this.preco = preco;
        Nfaixa = nfaixa;
    }

    @Override
    public String toString() {
        return "CDs{\n" +
                "Nome='" + Nome + '\'' +
                ",\n preco=" + preco +
                ",\n Nfaixa=" + Nfaixa +
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

    public int getNfaixa() {
        return Nfaixa;
    }

    public void setNfaixa(int nfaixa) {
        Nfaixa = nfaixa;
    }
}
