/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Group;
import com.laborun.entity.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dina
 */
public class GroupDaoImp implements GroupDaoInt{
     public List<Group> getGroups(User user){
        Session session = Connection.getConnection();
        List<Group> groups = null;
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("email", user.getEmail()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            groups = new ArrayList<Group>(((User) it.next()).getGroups());
        }

        return groups;
     }
}
