package model.entities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Instrutor {
    private String nome;

    Set<Curso> cursos = new HashSet<>();
    
    public Instrutor(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public int allUsers(){

        Set<Usuario> users = new TreeSet<>();

        for (Curso curso : cursos) {
            users.addAll(curso.getUsuarios());
        }

        return users.size();
    }
    
}
