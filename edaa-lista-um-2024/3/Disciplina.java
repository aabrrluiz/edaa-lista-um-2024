import java.text.MessageFormat;

public class Disciplina {
    private String nome;
    private double quantidadedealuno;
    private String prova;
    private Aluno aluno;
    private double presencadiaria;

    public Disciplina(String nome) {
        this.nome = nome;
        
    }

    public void lancarPresencaDiariaAluno (int qtdeAulaVista, Aluno aluno) {
        presencadiaria = qtdeAulaVista;
        System.out.println(MessageFormat.format("Aluno(a) {0} presente em aula!", aluno.getNome()));
    
        }
        

}
