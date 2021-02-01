package questão02;

public class VideoGame extends Produto implements Imposto{

    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public VideoGame(String nome, double preco, int qtd) {
        super(nome, preco, qtd);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto(double valor) {
        if (this.isUsado()){
            return valor *= 0.25;
        }else{
            return valor *= 0.45;
        }
    }
}
