package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-------");
        System.out.println("Professor " + this.nome);
        if (seminarios == null) return;
        System.out.println("## SEMINARIOS CADASTRADOS ##");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEnderenco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            System.out.println("** ALUNOS **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
