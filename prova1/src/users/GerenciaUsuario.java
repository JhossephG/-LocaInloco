package users;
import java.util.ArrayList;

public class GerenciaUsuario extends Usuario{

public GerenciaUsuario(String nome, String iDUser, String numero) {
    super(nome, iDUser, numero);
    
    }
ArrayList<Usuario> guardaUsuario = new ArrayList<Usuario>();   

public void addUsuario(){
    Usuario newUsuario = new Usuario(nome, IDUser, numero);
    guardaUsuario.add(newUsuario);
    }

 public void removeUsuario(int index){
    guardaUsuario.remove(index);
    }    
}
