/** GUSTAVO PARCIANELLO CARDONA */
public class Tamagotchi
{
    private String nome;
    private int idade, peso;
    
    public Tamagotchi(String nome, int idade, int peso)
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
}