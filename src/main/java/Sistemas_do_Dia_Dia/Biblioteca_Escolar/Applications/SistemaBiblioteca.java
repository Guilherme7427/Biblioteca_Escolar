package Sistemas_do_Dia_Dia.Biblioteca_Escolar.Applications;

import Sistemas_do_Dia_Dia.Biblioteca_Escolar.Entities.Aluno;

import java.util.Scanner;

public class SistemaBiblioteca {
    static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de biblioteca");
        Menu menu = new Menu();
        menu.menuPrincipal();
    }
}
