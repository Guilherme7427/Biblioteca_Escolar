package Sistemas_do_Dia_Dia.Biblioteca_Escolar.Entities;

public class Livros {
   public String[] nomeLivro = {"Harry potter", "Batman", "Diario de um banana", "Vidas Secas"};
   public int[] idLivro = {1, 2, 3, 4};
   public boolean[] disponivel= {true, false, true, false};
   public int livroAtual;

   public boolean verificarIdDoLivro(int id) {
       boolean temLivro = false;
       for (int i=0; i<idLivro.length; i++) {
           if (id == idLivro[i]) {
               temLivro = true;
               livroAtual = i;
               break;
           }
       }
       return temLivro;
   }
   public boolean livroDisponivel() {
       boolean lDisponivel = false;
       if (disponivel[livroAtual]) {
           lDisponivel = true;
       }
       return lDisponivel;
   }
}

