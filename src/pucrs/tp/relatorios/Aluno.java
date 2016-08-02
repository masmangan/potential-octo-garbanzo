package pucrs.tp.relatorios;

/**
 *
 * @author bernardo
 */
public class Aluno {

    private static final int QTDADENOTAS = 3;
    private int matricula;
    private String nome;
    private int[] notas;

    public Aluno(int umaMatricula, String umNome) {
        matricula = umaMatricula;
        nome = umNome;
        notas = new int[QTDADENOTAS];
    }

    public String getNome(){
        return nome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public int[] get(){
        return notas;
    }
    
    public boolean infoNota(int nro, int nota) {
        if (nota < 0 || nota > 10) {
            return false;
        } else {
            if (nro < 0 || nro >= QTDADENOTAS) {
                return false;
            }
        }
        notas[nro] = nota;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(matricula).append(" : ").append(nome).append(", notas: ");
        for(int i=0; i<QTDADENOTAS;i++){
            str.append("N").append(i+1).append(": ").append(notas[i]);
            if (i<QTDADENOTAS-1){
                str.append(", ");
            }
        }
        return str.toString();
    }
}
