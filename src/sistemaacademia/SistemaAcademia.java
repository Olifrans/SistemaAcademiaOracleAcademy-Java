/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

import java.util.ArrayList;
import java.util.Scanner;
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
        
        Scanner scanner = new Scanner(System.in);
        ArrayList <AlunoAcademia> alunos = new ArrayList<>();        
        int opcao;
        
        do {
            System.out.println("\n=== Menu da Academia ===");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Lista alunos e IMC");
            System.out.println("3. Sair");
            System.out.println("Escola uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    
                    //System.out.println("Idade: ");
                    //int idade = scanner.nextInt();
                    
                    System.out.println("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    
                     System.out.println("Altura (mt): ");
                    double altura = scanner.nextDouble();
                    
                    alunos.add(new AlunoAcademia(nome, peso, altura));                    
                    break;
                    
                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado");                        
                    }else{
                        System.out.println("\n--- Lista de Aluno ---");
                        
                        for(AlunoAcademia aluno : alunos){
                            System.out.println(aluno);
                        }
                    }
                    break;                    
                    
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;                                      
                    
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 3);
        
        scanner.close();        
        
        //AlunoAcademia aluno = new AlunoAcademia("Pedro", 85.5, 1.75);
        //AlunoAcademia aluno1 = new AlunoAcademia("Maria", 72.4, 1.88);
        //AlunoAcademia aluno2 = new AlunoAcademia("José", 120.5, 1.55);
                //aluno.exibirStatus();
        //aluno1.exibirStatus();
        //aluno2.exibirStatus();
    }    
}
