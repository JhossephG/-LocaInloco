package library;
import java.util.Scanner;
import users.Usuario;

public class Emprestimo {
protected String IDlivro;
protected String IDusuario; 
Scanner scan= new Scanner (System.in);
    
public void fazerEmprestimo(){
System.out.println("informe o ID do livro desejado:");
String ID= scan.nextLine();
System.out.println("informe o seu ID");
String IDUser= scan.nextLine();
//GerenciaEmprestimo emprestimo= new GerenciaEmprestimo(ID, IDUser);

}

}
