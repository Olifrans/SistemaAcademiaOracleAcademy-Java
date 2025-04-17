/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class AlunoAcademia {
    String nomeAluno;
    double pesoAluno;
    double alturaAluno;

    public AlunoAcademia(String nomeAluno, double pesoAluno, double alturaAluno) {
        this.nomeAluno = nomeAluno;
        this.pesoAluno = pesoAluno;
        this.alturaAluno = alturaAluno;
    }
    
    public double calcularIMC(){
        return pesoAluno /(alturaAluno * alturaAluno);        
    }
    
    public void exibirStatus(){
        double imc = calcularIMC();
        
        System.out.println("Nome: " + nomeAluno);
        System.out.println("IMC: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Classificação do IMC: Abaxo do peso");            
        }else if(imc < 25){
            System.out.println("Classificação do IMC: Peso normal");
        }else if(imc < 30){
            System.out.println("Classificação do IMC: Sobrepeso");
        }else{
            System.out.println("Classificação do IMC: Obesidade");
        }
    }
}
