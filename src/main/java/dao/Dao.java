/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.QueryImpl;
import utils.HibernateUtil;

/**
 * Dao générique pour toute les classes
 * @author Alexy Duquesnoy
 * @param <T> 
 */
public class Dao<T> {
    
    private Session session;
    private Transaction transaction;
    
    public Dao() {
    }
    
    /**
     * Récupère la session
     * Initialise et débute la transaction
     */
    private void startOperation() {
        this.session = HibernateUtil.getSession();
        this.session.beginTransaction();
    }
    
    /**
     * Commit la transaction en BDD
     * Ferme la session
     */
    private void endOperation(){
        this.session.getTransaction().commit();
        this.session.close();
    }
    
    /**
     * Sauvegarde ou Met à jours un object en BDD
     * @param object 
     */
    public void saveOrUpdate(T object) {
        startOperation();
        this.session.saveOrUpdate(object);
        endOperation();
    }
    
    /**
     * Supprime un object de la BDD
     * @param object 
     */
    public void delete(T object) {
        startOperation();
        this.session.delete(object);
        endOperation();
    }
    
    /**
     * Retour l'objet correspondant à la class et à l'id donné.
     * @param objectClass
     * @param id
     * @return 
     */
    public T getById(Class objectClass, int id) {
        startOperation();
        T object = (T) this.session.load(objectClass, id);
        endOperation();
        
        return object;
    }
    
    
    /**
     * Retour la liste des objets correspondant au where indiqué
     * @param objectClass
     * @param where
     * @return 
     */
    public List<T> getBy(Class objectClass, String where, String ... parameters) {
        
        String hql = "FROM "+objectClass.getSimpleName();
                
        if(where != null) {
            hql = hql.concat(" WHERE ").concat(where);
        }
        
        startOperation();
        
        Query query = session.createQuery(hql);
        
        if(parameters != null) {
            int cpt = 0;
            for(String parameter : parameters) {
                query.setParameter(cpt, parameter);
                cpt++;
            }
        }
        
        
        List<T> objects = query.list();
        endOperation();
        
        return objects;
    }
    
    /**
     * Retour la liste de toute les instances de la classe donné en parametre
     * @param objectClass
     * @return 
     */
    public List<T> getAll(Class objectClass) {
        return getBy(objectClass, null, null);
    }
    
    
}
