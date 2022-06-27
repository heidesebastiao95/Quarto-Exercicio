package poo;

import java.util.Arrays;

public class Loja {

    public Loja() {
    }

    private Livro[] livros=new Livro[5];
    private CDs[] cds=new CDs[5];
    private DVDs[] dvds=new DVDs[5];

    public void AdicionarLiros(int pos,String nome,String autor,float preco){
        livros[pos]=new Livro(nome,autor,preco);
    }
    public void AdicionarCds(int pos,String nome,float preco,int nfaixa){
        cds[pos]=new CDs(nome,preco,nfaixa);
    }
    public void AdicionarDvds(int pos,String nome,float preco,float duracao){
        dvds[pos]=new DVDs(nome,preco,duracao);
    }



    public String toString(int l, int c, int d) {
        return ""+livros[l].toString()+"\n"+
                cds[c].toString()+"\n"+
                dvds[d].toString();
    }

}
