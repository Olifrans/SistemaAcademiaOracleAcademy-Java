/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

import model.AlunoAcademia;

/**
 *
 * @author Aluno
 */
public class SistemaAcademia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {              
        AlunoAcademia aluno = new AlunoAcademia("Pedro", 85.5, 1.75);
        AlunoAcademia aluno1 = new AlunoAcademia("Maria", 72.4, 1.88);
        AlunoAcademia aluno2 = new AlunoAcademia("José", 120.5, 1.55);
        
        aluno.exibirStatus();
        aluno1.exibirStatus();
        aluno2.exibirStatus();
    }    
}
