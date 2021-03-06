/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.LinkedList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

/**
 * Dao g�n�rique pour toute les classes
 * @author Alexy Duquesnoy
 * @param <T> 
 */
public class Dao<T> {
    
    protected Session session;
    
    public Dao() {
    }
    
    /**
     * R�cup�re la session
     * Initialise et d�bute la transaction
     */
    protected void startOperation() {
        this.session = HibernateUtil.getSession();
        this.session.beginTransaction();
    }
    
    /**
     * Commit la transaction en BDD
     * Ferme la session
     */
    protected void endOperation(){
        this.session.getTransaction().commit();
        this.session.close();
    }
    
    /**
     * Sauvegarde ou Met � jours un object en BDD
     * @param object 
     */
    public void saveOrUpdate(T object) {
        startOperation();
        this.session.saveOrUpdate(object);
        endOperation();
    }
    
    /*public void save(T object) {
        startOperation();
        this.session.save(object);
        endOperation();
    }*/
    
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
     * Retour l'objet correspondant � la class et � l'id donn�.
     * @param objectClass
     * @param id
     * @return 
     */
    public T getById(Class objectClass, int id) {
        startOperation();
        T object = (T) this.session.get(objectClass, id);
        endOperation();
        return object;
    }
    
    /**
     * Retour la liste des objets correspondant au where indiqu�
     * @param objectClass
     * @param where
     * @return 
     */
    public List<T> getBy(Class objectClass, int limit, String where, Object ... parameters) {
        
        String hql = "FROM "+objectClass.getSimpleName();
        
        if(where != null) {
            hql = hql + " WHERE " + where;
        }
        
        startOperation();
        
        Query query = session.createQuery(hql);
        
        if(parameters != null) {
            int cpt = 0;
            for(Object parameter : parameters) {
                query.setParameter(cpt, parameter);
                cpt++;
            }
        }
        
        if(limit != -1) {
            query.setMaxResults(limit);
        }
        
        List<T> objects = query.list();
        endOperation();
        
        if(objects.isEmpty())
            return new LinkedList<T>();
        else
            return objects;
    }
    
    public List<T> getBy(Class objectClass, String where, Object ... parameters) {
        return getBy(objectClass, -1, where, parameters);
    }
    
    public List<T> getAll(Class objectClass, int limit) {
        return getBy(objectClass, limit, null, null);
    }
    
    public List<T> getAll(Class objectClass) {
        return getBy(objectClass, -1, null, null);
    }
    
    public void merge(Object object) {
        startOperation();
        this.session.merge(object);
        endOperation();
    }
}
