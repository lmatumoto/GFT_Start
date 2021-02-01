package Ex_2_3_GFT;

import java.util.List;
// import java.util.ArrayList;


public class Loja{
    
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;
    

    public Loja( String nome, String cnpj, List<Livro>livros, List<VideoGame> videoGames){
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public void listaLivros(){
        if(getLivros().isEmpty()){
            System.out.println("A loja não tem livros no estoque");
        }else{
            for (Livro a : livros) {
                System.out.println(a);
            }
        }
    }

    public void listaVideoGames(){
        if(getVideoGames().isEmpty()){
            System.out.println("A loja não tem livros no estoque");
        }else{
            for (VideoGame b : videoGames) {
                System.out.println(b);
            }
        }

    }

    // public double calculaPatrimonio(double a){

    // }
}
