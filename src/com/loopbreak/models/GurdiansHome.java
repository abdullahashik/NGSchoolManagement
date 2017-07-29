package com.loopbreak.models;
// Generated Jun 11, 2017 10:04:12 PM by Hibernate Tools 5.2.1.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.loopbreak.entities.Gurdians;

/**
 * Home object for domain model class Gurdians.
 * 
 * @see com.loopbreak.entities.Gurdians
 * @author Hibernate Tools
 */
public class GurdiansHome {

	private static final Log log = LogFactory.getLog(GurdiansHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Gurdians.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public int persist(Gurdians transientInstance) {
		log.debug("persisting Gurdians instance");
		try {
			if (sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().persist(transientInstance);
				sessionFactory.getCurrentSession().getTransaction().commit();
			} else {
				sessionFactory.getCurrentSession().beginTransaction();
				sessionFactory.getCurrentSession().persist(transientInstance);
				sessionFactory.getCurrentSession().getTransaction().commit();
			}
			// sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		} finally {
			sessionFactory.close();
		}
		return transientInstance.getId();
	}

	public int saveData(Gurdians gurdian) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(gurdian);
			session.getTransaction().commit();
		} catch (Exception ex) {

		} finally {
			session.close();
		}
		return 0;
	}

	public void attachDirty(Gurdians instance) {
		log.debug("attaching dirty Gurdians instance");
		try {
			if (sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().saveOrUpdate(instance);
				sessionFactory.getCurrentSession().getTransaction().commit();
			} else {
				sessionFactory.getCurrentSession().beginTransaction();
				sessionFactory.getCurrentSession().saveOrUpdate(instance);
				sessionFactory.getCurrentSession().getTransaction().commit();
			}
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		} finally {
			sessionFactory.close();
		}
	}

	public void attachClean(Gurdians instance) {
		log.debug("attaching clean Gurdians instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Gurdians persistentInstance) {
		log.debug("deleting Gurdians instance");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().delete(persistentInstance);
			sessionFactory.getCurrentSession().beginTransaction().commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Gurdians merge(Gurdians detachedInstance) {
		log.debug("merging Gurdians instance");
		try {
			Gurdians result = (Gurdians) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Gurdians findById(java.lang.Integer id) {
		log.debug("getting Gurdians instance with id: " + id);
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			Gurdians instance = (Gurdians) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Gurdians",
					id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			sessionFactory.getCurrentSession().beginTransaction().commit();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Gurdians> findByExample(Gurdians instance) {
		log.debug("finding Gurdians instance by example");
		try {
			List<Gurdians> results = (List<Gurdians>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Gurdians").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	// get all gurdians
	public List<Gurdians> getAllGurdians() {
		log.debug("finding Gurdians instance by example");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			@SuppressWarnings({ "deprecation", "unchecked" })
			List<Gurdians> results = (List<Gurdians>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Gurdians").list();
			sessionFactory.getCurrentSession().getTransaction().commit();
			;
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		} finally {
			sessionFactory.getCurrentSession().close();
		}
	}
}
