/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.isc.reservas;

/**
 *
 * @author JOAO LUIS
 */
public class Principal {
    public static void main(String[] args) {
        Reserva r = new Reserva();
        r.setAluno("Joao");
        r.setAutor("saulo");
        r.setDataChegada("12/09/2015");
        r.setDataReserva("12/09/2015");
        r.setDataRetorno("19/09/2015");
        r.setLivro("Java 7");
        r.setMatricula(7706);
        r.setTombo(677890);
        
        
        ReservaDAO dao = new ReservaDAO();
        dao.salvar(r);
    }
}
