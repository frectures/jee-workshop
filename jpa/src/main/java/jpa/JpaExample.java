package jpa;

import jakarta.persistence.*;

public class JpaExample {
    public static void main(String[] args) throws Exception {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            // TODO Objekte erzeugen

            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            try {
                // TODO Objekte persistieren

                transaction.commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }

            entityManager.clear();
            // TODO Objekte abfragen
            Query query = entityManager.createQuery("select x from ... x where ...");
            System.out.println(query.getResultList());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}
