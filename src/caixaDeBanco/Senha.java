/*
 *UNICESUMAR
 *Data: 	03 de outubro de 2020
 *Discente: 	Alexsandro Reis Nascimento		RA 19117932-5
 *Disciplina:	Programação 2
 *Curso:	Análise e Desenvolvimento de Sistemas

				Mapa de Programação II 
 */
/**
 * @author Alexsandro Reis Nascimento
 */


package caixaDeBanco;


public class Senha {
    
    // declaração de atributos da classe senha
    private String tipoDeSenha;
    private int numeroDaSenha;
    
    //construtores da classe
    public Senha() {
    }

    public Senha(String tipo, int numero) {
        tipoDeSenha = tipo;
        numeroDaSenha = numero;
    }
    
    // Getters e Setters
    public String getTipoDeSenha() {
        return tipoDeSenha;
    }

    public void setTipoDeSenha(String tipo) {
        tipoDeSenha = tipo;
    }

    public int getNumeroDaSenha() {
        return numeroDaSenha;
    }

    public void setNumeroDaSenha(int numero) {
        numeroDaSenha = numero;
    }
    
    //verifica se a senha é de atendimento prioritário 
    public boolean verificaPrioritaria(){
        if (tipoDeSenha == "P"){
            return true;
        }else{
            return false;
        }
    }
    
    //verifica se a senha é de atendimento rápido
    public boolean verificaRapido(){
        if (tipoDeSenha == "R"){
            return true;
        }else{
            return false;
        }
    }
    
    //verifica se a senha é de atendimento comum
    public boolean verificaComum(){
        if (tipoDeSenha == "C"){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
