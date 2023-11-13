/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paciente.entity;

/**
 *
 * @author Felype
 */
public class Exame {
    
    private Paciente paciente;
    private Glicemia glicemia;
    private Colesterol colesterol;
    private Triglicerideos triglicerideos;
    
    public Exame(){
        this.paciente = paciente;
        this.glicemia = glicemia;
        this.colesterol = colesterol;
        this.triglicerideos = triglicerideos;
    };

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Glicemia getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(Glicemia glicemia) {
        this.glicemia = glicemia;
    }

    public Colesterol getColesterol() {
        return colesterol;
    }

    public void setColesterol(Colesterol colesterol) {
        this.colesterol = colesterol;
    }

    public Triglicerideos getTriglicerideos() {
        return triglicerideos;
    }

    public void setTriglicerideos(Triglicerideos triglicerideos) {
        this.triglicerideos = triglicerideos;
    }
    
    
     
}
