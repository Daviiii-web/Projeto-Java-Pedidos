package entities;

import java.text.SimpleDateFormat;
import java.util.Date;;

public class Client {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String nome;
    private String email;
    private Date dataNascimento;

    public Client(String nome, String email, Date dataNascimento){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDate() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return nome + " (" + sdf.format(dataNascimento) + ") - " + email;
    }

}
