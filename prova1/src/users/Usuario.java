package users;

public class Usuario {
protected String nome;
protected String IDUser;
protected String numero;

//construtor
public Usuario(String nome, String iDUser, String numero) {
    this.nome = nome;
    IDUser = iDUser;
    this.numero = numero;
}

//getters e setters
public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public String getIDUser() {
    return IDUser;
}


public void setIDUser(String iDUser) {
    IDUser = iDUser;
}


public String getNumero() {
    return numero;
}


public void setNumero(String numero) {
    this.numero = numero;
}    



}