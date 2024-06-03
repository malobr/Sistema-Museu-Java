public class ObraArte {
    private String titulo;
    private String autor;
    private int anoCriacao;
    private String tipoObra;
    private String localizacao;


    public ObraArte(){};


    public ObraArte(String titulo, String autor, int anoCriacao, String tipoObra, String localizacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoCriacao = anoCriacao;
        this.tipoObra = tipoObra;
        this.localizacao = localizacao;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAnoCriacao() {
        return anoCriacao;
    }
    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }


    public String getTipoObra() {
        return tipoObra;
    }
    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }


    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", anoCriacao=" + anoCriacao + ", tipoObra="
                + tipoObra + ", localizacao=" + localizacao;
    }

    public String exibirDados(){
        return "\nTitulo: " + titulo + "\n Autor: " + autor + "\nAno de Criacao: " + anoCriacao + 
                "\n Tipo de Obra: " + tipoObra + "\n Lcalizacao no Museu: " + localizacao;
    }

}
