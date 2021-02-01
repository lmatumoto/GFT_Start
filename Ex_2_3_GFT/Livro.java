package Ex_2_3_GFT;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag){
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }
    
    public String getAutor() {
        return autor;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public String getTema() {
        return tema;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void calculaimposto(){
        if(this.tema == "educativo"){
            this.setPreco(this.getPreco());
        }else{
            this.setPreco(this.getPreco() * 1.10);
        }
    }

    @Override
    public String toString() {
        
        return "Livro " + this.getNome() + " Autor " + this.getAutor() + " Tema: " + this.getTema() +
        " Preço: " + this.getPreco() + " Qtd " + this.getQtd() + "Qtd de pág: " + this.getQtdPag();
    }
}
