package negocio;

public class Livro {
    private int codigo;
    private String autor;
    private String titulo;
    private String capa;
    private double avaliacao;
    private double valor;

    public Livro(String autor, String titulo, String capa, double avaliacao, double valor, int codigo) {
        this.autor = autor;
        this.titulo = titulo;
        this.capa = capa;
        this.avaliacao = avaliacao;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCapa() {
        return capa;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public double getValor() {
        return valor;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

    @Override
    public String toString() {
        return titulo + "," + autor + "," + "avaliação(" + avaliacao + ")," + capa + "," + valor;
    }
}
