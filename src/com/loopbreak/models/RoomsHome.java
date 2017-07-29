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

import com.loopbreak.entities.Rooms;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class Rooms.
 * @see com.loopbreak.entities.Rooms
 * @author Hibernate Tools
 */
public class RoomsHome {

	private static final Log log = LogFactory.getLog(RoomsHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Rooms.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Rooms transientInstance) {
		log.debug("persisting Rooms instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Rooms instance) {
		log.debug("attaching dirty Rooms instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Rooms instance) {
		log.debug("attaching clean Rooms instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Rooms persistentInstance) {
		log.debug("deleting Rooms instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Rooms merge(Rooms detachedInstance) {
		log.debug("merging Rooms instance");
		try {
			Rooms result = (Rooms) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Rooms findById(java.lang.Integer id) {
		log.debug("getting Rooms instance with id: " + id);
		try {
			Rooms instance = (Rooms) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Rooms", id);
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

	public List<Rooms> findByExample(Rooms instance) {
		log.debug("finding Rooms instance by example");
		try {
			List<Rooms> results = (List<Rooms>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Rooms").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
