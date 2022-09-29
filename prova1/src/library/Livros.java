package library;

public class Livros {
//infos gerais  
protected String ID;  
protected String genero;
protected String titulo;
protected String autor;
protected int paginas;
//infos livros fisicos
protected String ISBN;
protected int edicao;
//infos livros digitais
protected String link;
protected double duracao;


//Livros livroComum = new Livros(genero, titulo, autor, paginas, ISBN, edicao);
//Livros Ebook = new Livros(genero, titulo, autor, paginas, edicao, link);
//Livros AudioBook = new Livros(genero, titulo, autor, edicao, link, duracao);

//construtor livroComum
public Livros(String ID, String genero, String titulo, String autor, int paginas, String iSBN, int edicao) {
    this.genero = genero;
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    ISBN = iSBN;
    this.edicao = edicao;
}
//construtor Ebook
public Livros(String ID, String genero, String titulo, String autor, int paginas, int edicao, String link) {
    this.genero = genero;
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.edicao = edicao;
    this.link = link;
}
//construtor AudioBook
public Livros(String ID, String genero, String titulo, String autor, int edicao, String link, double duracao) {
    this.genero = genero;
    this.titulo = titulo;
    this.autor = autor;
    this.edicao = edicao;
    this.link = link;
    this.duracao = duracao; 
}

//getters e setters
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
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
public int getPaginas() {
    return paginas;
}
public void setPaginas(int paginas) {
    this.paginas = paginas;
}
public String getISBN() {
    return ISBN;
}
public void setISBN(String iSBN) {
    ISBN = iSBN;
}
public int getEdicao() {
    return edicao;
}
public void setEdicao(int edicao) {
    this.edicao = edicao;
}
public String getLink() {
    return link;
}
public void setLink(String link) {
    this.link = link;
}
public double getDuracao() {
    return duracao;
}
public void setDuracao(double duracao) {
    this.duracao = duracao;
}

}
