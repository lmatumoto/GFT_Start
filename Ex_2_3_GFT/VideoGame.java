package Ex_2_3_GFT;

public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado){
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }

    @Override
    public void calculaimposto(){
        if(this.isUsado){
            this.setPreco(this.getPreco() * 1.25);
        }else{
            this.setPreco(this.getPreco() * 1.45); 
        }
    }

    @Override
    public String toString() {
        
        return "Videogame " + this.getNome() + " Marca " + this.getMarca() + " Modelo " + this.getModelo() + " É usado " + this.isUsado() +
        " Preço: " + this.getPreco() + " Qtd " + this.getQtd();
    }
}
