package oo.composicao;

public class CursoTeste {
    
    public static void main(String[] args) {
        
    
    Aluno aluno1 = new Aluno("Joao");
    Aluno aluno2 = new Aluno("Maria");
    Aluno aluno3 = new Aluno("Pedro");

    Curso curso1 = new Curso("Java");
    Curso curso2 = new Curso("React");
    Curso curso3 = new Curso("Security");
    
    curso1.adicionarAluno(aluno1);
    curso1.adicionarAluno(aluno2);

    curso2.adicionarAluno(aluno1);
    curso2.adicionarAluno(aluno3);


    aluno1.adicionarCurso(curso3);
    aluno2.adicionarCurso(curso3);
    aluno3.adicionarCurso(curso3);
    
    for(Aluno aluno: curso2.alunos) {
        System.out.printf("Estou matriculado no %s", curso2.nome);
        System.out.printf(" e meu nome e %s.\n",  aluno.nome);
    }
    
    System.out.println(aluno1.cursos.get(1).alunos);
    
    Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
    
    if(cursoEncontrado != null) {
        System.out.println(cursoEncontrado.nome);
        System.out.println(cursoEncontrado.alunos);
    }
    
    }
   
}
