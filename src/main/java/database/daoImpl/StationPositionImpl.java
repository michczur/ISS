package database.daoImpl;

import database.dao.StationPositionDao;
import model.entity.StationPosition;
import org.hibernate.Session;
import utils.HibernateUtils;

import javax.persistence.NoResultException;
import java.sql.Timestamp;
import java.util.List;

public class StationPositionImpl implements StationPositionDao {

    public void save(StationPosition position) {
        Session session = HibernateUtils
                .instance()
                .getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();

        session.saveOrUpdate(position);

        session.getTransaction().commit();
        session.close();
    }

    public StationPosition checkPositionBytime(Timestamp timestamp) {
        StationPosition position = null;
        Session session = HibernateUtils
                .instance()
                .getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try {
            position = session
                    .createQuery("from StationPosition where timestamp=:timestamp", StationPosition.class)
                    .setParameter("timestamp", timestamp)
                    .getSingleResult();
        } catch (NoResultException e) {
        }

        session.getTransaction().commit();
        session.close();

        return position;
    }

    public List<StationPosition> movePath() {
        Session session = HibernateUtils
                .instance()
                .getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        List<StationPosition> result = session
                .createQuery("from StationPosition", StationPosition.class)
                .list();

        session.getTransaction().commit();
        session.close();

        return result;
    }

    public void deleteByTime(Timestamp timestamp) {
        Session session = HibernateUtils
                .instance()
                .getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();

        session.createQuery("delete StationPosition where timestamp=:timestamp")
                .setParameter("timestamp", timestamp)
                .executeUpdate();

        session.getTransaction().commit();
        session.close();

    }
}
