/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.isc.reservas;

import br.isc.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author JOAO LUIS
 */
public class ReservaDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Reserva reserva) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(reserva);
        transacao.commit();
        sessao.close();
    }
    public void Alterar(Reserva reserva){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(reserva);
        transacao.commit();
        sessao.close();
    }

    public void deletar(Reserva reserva) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(reserva);
        transacao.commit();
        sessao.clear();
    }

    public List<Reserva> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        List<Reserva> lista
                = sessao.createCriteria(Reserva.class).list();
        sessao.close();
        return lista;

    }

    public List<Reserva> consultarLivro(String livro) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        List<Reserva> lista
                = sessao.createCriteria(Reserva.class)
                .add(Restrictions.eq("livro", livro)).list();
        sessao.close();
        return lista;
    }

    public List<Reserva> consultarAluno(int matricula) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        List<Reserva> lista
                = sessao.createCriteria(Reserva.class)
                .add(Restrictions.eq("matricula", matricula)).list();
        sessao.close();
        return lista;
    }

    public Reserva listarId(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        Reserva reservas = (Reserva) sessao.createCriteria(Reserva.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        sessao.close();
        return reservas;
    }

    public boolean autenticar(String livro, int tombo, String autor , String aluno, int matricula, String dataRserva,
            String dataChegada, String dataRetorno){
        sessao = HibernateUtil.getSessionFactory().openSession();
        Reserva reservas = (Reserva) sessao.createCriteria(Reserva.class)
                           .add(Restrictions.eq("livro", livro))
                            .add(Restrictions.eq("tombo", tombo))
                            .add(Restrictions.eq("autor", autor))
                            .add(Restrictions.eq("aluno", aluno))
                            .add(Restrictions.eq("matricula", matricula))
                            .add(Restrictions.eq("dataReserva", dataRserva))
                            .add(Restrictions.eq("dataChegada", dataChegada))
                            .add(Restrictions.eq("dataRetorno", dataRetorno)).uniqueResult();
        if(reservas != null){
            return true;
        } else {
            return false;
        }
    }
}
