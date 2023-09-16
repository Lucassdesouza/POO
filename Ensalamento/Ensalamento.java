public class Ensalamento {
    public static void main(String[] args) {
        Aluno alfredo = new Aluno("Alfredo", "TI");
        Aluno peterson = new Aluno("Peterson", "ADM");
        Aluno wendel = new Aluno("Wendel", "TI");
        Aluno ian = new Aluno("Ian", "ADM");
        Aluno debra = new Aluno("Debra", "TI");
        Aluno luana = new Aluno("Luana", "ADM");
        Aluno bruno = new Aluno("Bruno", "TI");
        Aluno romeu = new Aluno("Romeu", "ADM");
        Aluno julieta = new Aluno("Julieta", "TI");
        Aluno maria = new Aluno("Maria", "ADM");
        Aluno capitu = new Aluno("Capitú", "TI");
        Aluno bentinho = new Aluno("Bentinho", "ADM");
        Aluno amelia = new Aluno("Amélia", "TI");

        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");

        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");

        Disciplina pooTi = new Disciplina("POO do curso de TI");
        Disciplina estruturaTi = new Disciplina("Estrutura de Dados do curso de TI");
        Disciplina biAdm = new Disciplina("BI do curso de ADM");

        ti.addDisciplina(pooTi);
        ti.addDisciplina(estruturaTi);
        adm.addDisciplina(biAdm);

        Turma turma1 = new Turma(mia, pooTi);
        turma1.addAluno(alfredo);
        turma1.addAluno(wendel);
        turma1.addAluno(debra);
        turma1.addAluno(bruno);
        turma1.addAluno(julieta);
        turma1.addAluno(capitu);
        turma1.addAluno(amelia);

        Turma turma2 = new Turma(saulo, estruturaTi);
        turma2.addAluno(alfredo);
        turma2.addAluno(wendel);

        System.out.println("Ensalamento concluído!");
    }
}
