/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paciente.entity;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Felype
 */
public class Paciente {
       
    private static String nome; 
    private static String tpSangue;
    private static int idade;

    public Paciente() {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTpSangue() {
        return tpSangue;
    }

    public void setTpSangue(String tpSangue) {
        this.tpSangue = tpSangue;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
    
    
    
}
