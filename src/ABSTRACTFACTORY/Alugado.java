package ABSTRACTFACTORY;

/**
 *
 * @author guirgo
 */
public class Alugado {
    private String marca;
    private String modelo;
    private String cor;

    public Alugado(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
}
