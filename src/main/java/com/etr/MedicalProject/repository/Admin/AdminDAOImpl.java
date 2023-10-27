package com.etr.MedicalProject.repository.Admin;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.etr.MedicalProject.entity.admin.Admin;
import jakarta.persistence.EntityManager;


@Repository
public class AdminDAOImpl implements AdminDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Admin createAdmin(Admin admin) {
        Session currentSession = entityManager.unwrap(Session.class);
        long id = (long) currentSession.save(admin);
        return currentSession.get(Admin.class, id);
    }
    @Override
    public Admin getAdminByUsername(String username) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Admin> query = currentSession.createQuery("FROM Admin WHERE username = :username", Admin.class);
        query.setParameter("username", username);
        return query.uniqueResult();
    }

}
