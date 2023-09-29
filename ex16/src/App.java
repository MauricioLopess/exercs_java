// Em um portal de cursos online, cada usuário possui um código único, representado por
// um número inteiro. ==> id = INT

// Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
// matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
// é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
// alunos repetidos em mais de um curso

// O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.

// Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
// quantidade total e alunos dele, conforme exemplo.

import java.util.Scanner;

import model.entities.Curso;
import model.entities.Instrutor;
import model.entities.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Instrutor alex = new Instrutor("Alex");
        
        Curso A = new Curso();
        Curso B = new Curso();
        Curso C = new Curso();


        System.out.print("How many students for course A? ");
        int aux = sc.nextInt();

        for(int i = 0; i < aux; i++){
            int id = sc.nextInt();
            Usuario user = new Usuario(id);
            A.addUsuario(user);
        }

        System.out.print("How many students for course B? ");
        aux = sc.nextInt();

        for(int i = 0; i < aux; i++){
            int id = sc.nextInt();
            Usuario user = new Usuario(id);
            B.addUsuario(user);
        }

        System.out.print("How many students for course C? ");
        aux = sc.nextInt();

        for(int i = 0; i < aux; i++){
            int id = sc.nextInt();
            Usuario user = new Usuario(id);
            C.addUsuario(user);
        }

        alex.addCurso(A);
        alex.addCurso(B);
        alex.addCurso(C);

        int total = alex.allUsers();

        System.out.print("Total students: " + total);

        sc.close();
    }
}
