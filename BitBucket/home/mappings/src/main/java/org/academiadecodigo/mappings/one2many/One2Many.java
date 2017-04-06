package org.academiadecodigo.mappings.one2many;

import org.academiadecodigo.mappings.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tekman on 21/03/2017.
 */
public class One2Many {

    public static void main(String[] args) {

        try {
            Session session = HibernateSessionManager.beginTransaction();

            Category drug;

            Set<Product> products = new HashSet<Product>();

            products.add(new Product("COCA"));
            products.add(new Product("PEPSI"));
            products.add(new Product("SUMOL"));
            products.add(new Product("LSDsinho pa cortar"));
            products.add(new Product("UM BONGO"));
            products.add(new Product("UCAL"));

            drug = new Category("Nao sei que drogas sao estas", products);

            session.save(drug);

            HibernateSessionManager.commitTransaction();
        } catch (HibernateException ex) {
            HibernateSessionManager.rollbackTransaction();

        } finally {
            HibernateSessionManager.close();
        }


    }


}
