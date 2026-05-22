package Sistemas_do_Dia_Dia.Biblioteca_Escolar.Entities;

public class Aluno {
    private int[] numMatricula;
    private int[] numMultas;
    private int[] numLivros;
    private int usuarioAtual;

    public Aluno() {
        this.numMatricula = new int[]{1, 2, 3, 4};
        this.numMultas = new int[]{0, 0, 0, 1};
        this.numLivros = new int[]{1, 2, 3, 2};
    }

    public boolean verificarMatricula(int matricula){
        boolean temMatricula = false;
        for (int i = 0; i<numMatricula.length; i++) {
            if (matricula == numMatricula[i]) {
                temMatricula = true;
                usuarioAtual = i;
                break;
            }
        }
        return temMatricula;
    }

    public boolean verificarMultas(){
        boolean multa = false;
        if (numMultas[usuarioAtual] > 0){
            System.out.println("Possui multa");
            multa = true;
        }
        return multa;
    }
    public boolean verificarLivros() {
        boolean livrosEmprestados = false;
        if (numLivros[usuarioAtual] >= 3) {
            livrosEmprestados = true;
        }
        return livrosEmprestados;
    }
}

