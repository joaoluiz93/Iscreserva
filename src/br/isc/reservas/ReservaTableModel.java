/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.isc.reservas;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JOAO LUIS
 */
public class ReservaTableModel extends AbstractTableModel {

    private List<Reserva> reservas;
    private String[] colunas = {"Id", "Livro", "Tombo", "Autor", "Aluno", "Matricula", "Data Reserva",
        "Data Chegada", "Data Retorno"};

    public ReservaTableModel(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public int getRowCount() {
        return reservas.size();

    }

    @Override
    public int getColumnCount() {

        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Reserva reserva = reservas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return reserva.getId();
            case 1:
                return reserva.getLivro();
            case 2:
                return reserva.getTombo();
            case 3:
                return reserva.getAutor();
            case 4:
                return reserva.getAluno();
            case 5:
                return reserva.getMatricula();
            case 6:
                return reserva.getDataReserva();
            case 7:
                return reserva.getDataChegada();
            case 8:
                return reserva.getDataRetorno();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];
            case 8:
                return colunas[8];
        }
        return null;
    }
}
