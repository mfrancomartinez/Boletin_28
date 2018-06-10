/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_28;

/**
 *
 * @author Marcos
 */
import javax.swing.JOptionPane;

public class Alumno {
    
    String nome;
    int nota;
    Enderezo enderezo;
    
    class Enderezo {
        
        String rua;
        int numero;
        
        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }
        
        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }
        
        @Override public String toString() {
            return "Enderezo { " + "rua: " + rua + ", numero: " + numero + " }";
        }
    }
    
    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }
    
    public void cambiarNota(){
        
        this.nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nueva nota: "));
    }
    
    @Override public String toString() {
        return "Alumno { " + "nome: " + nome + ", nota: " + nota + ", " + enderezo + " }";
    }
    
    
}
