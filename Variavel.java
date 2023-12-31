public class Variavel {
    private String nome;
    private String tipo;
    private int escopo;
    private String valor;

    public Variavel(String nome, String tipo, int escopo, String valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.escopo = escopo;
        this.valor = valor;
    }

    public Variavel() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEscopo() {
        return this.escopo;
    }

    public void setEscopo(int escopo) {
        this.escopo = escopo;
    }

    public String getValor(){
        return this.valor;
    }
    
    public void imprime(){
        System.out.println("Nome: "+nome+"\nTipo: "+tipo+"\nEscopo: "+escopo);
    }
}
