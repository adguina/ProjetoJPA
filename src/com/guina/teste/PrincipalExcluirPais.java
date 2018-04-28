package com.guina.teste;

import com.guina.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author agnaldo
 */
public class PrincipalExcluirPais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GUINAPU");
        EntityManager em = emf.createEntityManager();
        Pais p = em.find(Pais.class,2);//Busca o objeto 2 na classe Pais
        em.getTransaction().begin();//inicia a transação
        em.remove(p);//Excluir
        em.getTransaction().commit();//executa a transação
        em.close();
        emf.close();   
        
        // TODO code application logic here
    }
    
}
