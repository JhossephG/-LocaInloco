package library;
import java.util.ArrayList;

//add e remover
public class GerenciaLivro extends Livros{
public GerenciaLivro(String ID,String genero, String titulo, String autor, int paginas, int edicao, String link) {
        super(ID, genero, titulo, autor, paginas, edicao, link);
        
    }
ArrayList<Livros> guardaLivros = new ArrayList<Livros>();

//adicao de livros
public void addlivroComum(){
    Livros newlivroComum = new Livros(ID, genero, titulo, autor, paginas, ISBN, edicao);
    guardaLivros.add(newlivroComum);
    }

public void addEbook(){
    Livros newEbook = new Livros(ID, genero, titulo, autor, paginas, edicao, link);
    guardaLivros.add(newEbook);
    }

public void addAudioBook(){
    AudioBook newAudioBook = new AudioBook(ID, genero, titulo, autor, edicao, link, duracao);
    guardaLivros.add(newAudioBook);
    }

//remocao de livros    
public void removelivroComum(int index){
    //implementar scanner
    System.out.println("Informe o indice onde esta guardado o livro a ser removido");
    guardaLivros.remove(index);
    }
    
    public void removeEbook(int index){
        //implementar scanner
        System.out.println("Informe o indice onde esta guardado o livro a ser removido");
        guardaLivros.remove(index);
    }
    
    public void removeAudioBook(int index){
        //implementar scanner
        System.out.println("Informe o indice onde esta guardado o livro a ser removido");
        guardaLivros.remove(index);
    }

}
