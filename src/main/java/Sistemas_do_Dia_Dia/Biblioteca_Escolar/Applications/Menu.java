package Sistemas_do_Dia_Dia.Biblioteca_Escolar.Applications;

import Sistemas_do_Dia_Dia.Biblioteca_Escolar.Entities.Aluno;
import Sistemas_do_Dia_Dia.Biblioteca_Escolar.Entities.Livros;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Aluno aluno = new Aluno();
    Livros livros = new Livros();

    public void menuPrincipal() {
        System.out.println("Digite sua matricula");
        int matricula = sc.nextInt();

        if (aluno.verificarMatricula(matricula)) {
            System.out.println("Matricula Encontrada!");

            if (aluno.verificarMultas()){

                if (aluno.verificarLivros()){

                    System.out.println("Digite o ID do livro");
                    int idLivro = sc.nextInt();
                    if (livros.verificarIdDoLivro(idLivro)) {
                        System.out.println("Livro encontrado!");
                    }
                    else
                        System.out.println("Livro não encontrado");

                    if (livros.livroDisponivel()) {
                        System.out.println("O liro esta disponivel");
                    }
                    else
                        System.out.println("Livro não disponivel");
                }

            } else
                System.out.println("Emprestimo bloqueado");
        }
        else
            System.out.println("Matricula não encontrada!");
    }
}
