package ABSTRACTFACTORY;

/**
 *
 * @author guirgo
 */
public class Alugado {
    private String nome;

    private String HP;

    private String FC;
    
    private String cor;

    public Alugado(String nome, String HP, String FC, String cor) {
        this.nome = nome;
        this.HP = HP;
        this.FC = FC;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getHP() {
        return HP;
    }

    public String getFC() {
        return FC;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    public void setFC(String FC) {
        this.HP = FC;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
