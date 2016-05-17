/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.isc.reservas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author JOAO LUIS
 */
@Entity
public class Reserva {
    @Id
    @GeneratedValue
    private int id;
    
    @Column(length = 60 , nullable= false)
    private String livro;
    
     @Column(length = 50 , nullable= false)
    private int tombo;
     
      @Column(length = 110 , nullable= false)
    private String autor;   
       @Column(length = 100 , nullable= false)
    private String aluno;
       
        @Column(length = 60 , nullable= false)
    private int matricula;
        
         @Column(length = 16 , nullable= false)
    private String dataReserva;
         
          @Column(length = 16 , nullable= false)
    private String dataChegada;
          
           @Column(length = 16 , nullable= false)
    private String dataRetorno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
           
           
    
}
