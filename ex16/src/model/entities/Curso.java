package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nome;

    Set<Usuario> usuarios = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

}
