/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Bettor;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Louis
 */
public class BettorDao extends Dao {
    public List<Bettor> getBettorOrderBy(String orderBy) {
        super.startOperation();
        String hql = "FROM "+Bettor.class.getSimpleName();
        
        if(orderBy != null) {
            hql = hql + " ORDER BY " + orderBy;
        }
        
        Query query = session.createQuery(hql);
        List<Bettor> results = query.list();
        super.endOperation();
        return results;
    }
}
