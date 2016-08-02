package pucrs.tp.relatorios;

import java.util.ArrayList;

/**
 *
 * @author bernardo
 */
public class Turma implements Relatorio{
    private ArrayList<Aluno> alunos;
    private int cursor;
    
    public Turma(){
        alunos = new ArrayList<>();
        cursor = 0;
    }
    
    public void addAluno(Aluno umAluno){
        alunos.add(umAluno);
    }
    
    public Aluno getAluno(int matricula){
        for(Aluno a:alunos){
            if (a.getMatricula() == matricula){
                return a;
            }
        }
        return null;
    }
    
    public boolean updateAluno(Aluno alterado){
        for(int i=0;i<alunos.size();i++){
            if (alunos.get(i).getMatricula() == alterado.getMatricula()){
                alunos.set(i, alterado);
                return true;
            }
        }
        return false;
    }
    
    public double calculaMedia(int matricula) {
        Aluno aluno = getAluno(matricula);
        if (aluno != null) {
            int[] notas = aluno.get();
            double somatorio = 0.0;
            for(int i=0; i<notas.length; i++){
                somatorio += notas[i];
            }
            return somatorio/notas.length;
        }
        return -1.0;
    }
    
    @Override
    public String getCabecalho() {
        return "Mat : Nome          : Notas";
    }

    @Override
    public void reset() {
        cursor = 0;
    }

    @Override
    public String nextLine() {
        if (cursor < alunos.size()){
            String linha = alunos.get(cursor).toString();
            cursor++;
            return linha;
        }else{
            return null;
        }
    }

    @Override
    public String getRodape() {
        return "Total de alunos na turma: "+alunos.size();
    }
}
