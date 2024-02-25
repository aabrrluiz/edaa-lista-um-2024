public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Andre Anjos", 20, "15589508690");
        Professor professor = new Professor("Daniel Paiva");
        Universidade universidade = new Universidade("Una", "Av. Maria da Glória Rocha ");
        Disciplina disciplina = new Disciplina("Ciencia da Computação");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Professor: "+ professor.getNome());
        System.out.println("Universidade " + universidade.getNome());
        disciplina.lancarPresencaDiariaAluno(10, aluno);
    }
}
