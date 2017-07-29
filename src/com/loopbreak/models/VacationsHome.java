package com.loopbreak.models;
// Generated Jun 11, 2017 10:04:12 PM by Hibernate Tools 5.2.1.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.loopbreak.entities.Students;
import com.loopbreak.entities.Vacations;

/**
 * Home object for domain model class Vacations.
 * 
 * @see com.loopbreak.entities.Vacations
 * @author Hibernate Tools
 */
public class VacationsHome {

	private static final Log log = LogFactory.getLog(VacationsHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Vacations.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Vacations transientInstance) {
		log.debug("persisting Vacations instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Vacations instance) {
		log.debug("attaching dirty Vacations instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vacations instance) {
		log.debug("attaching clean Vacations instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Vacations persistentInstance) {
		log.debug("deleting Vacations instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Vacations merge(Vacations detachedInstance) {
		log.debug("merging Vacations instance");
		try {
			Vacations result = (Vacations) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Vacations findById(java.lang.Integer id) {
		log.debug("getting Vacations instance with id: " + id);
		try {
			Vacations instance = (Vacations) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Vacations",
					id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Vacations> findByExample(Vacations instance) {
		log.debug("finding Vacations instance by example");
		try {
			List<Vacations> results = (List<Vacations>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Vacations").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
