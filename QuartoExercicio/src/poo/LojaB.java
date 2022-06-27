package poo;

public class LojaB {
    public static void main(String[] args) {

        Loja produtos=new Loja();

        produtos.AdicionarLiros(0,"Anjos e Demonios","Dan Brown",5000f);
        produtos.AdicionarLiros(1,"O Alquimista","Paulo Coelho",3000f);
        produtos.AdicionarLiros(2,"Harry Potter e o Calice de fogo","JK Rowling",6000f);
        produtos.AdicionarLiros(3,"A magia da Realidade","Charles Darwin",4000f);

        produtos.AdicionarCds(0,"Fine line",9000f,8);
        produtos.AdicionarCds(1,"Wake up in the sky",3000f,10);

        produtos.AdicionarDvds(0,"Codigo da Vincci",3000,120);
        produtos.AdicionarDvds(1,"A origem",4000,140);
        produtos.AdicionarDvds(2,"1975",5000,134);

        System.out.println(""+produtos.toString(2,0,1));

    }
}
