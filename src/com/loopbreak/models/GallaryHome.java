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

import com.loopbreak.entities.Gallary;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class Gallary.
 * 
 * @see com.loopbreak.entities.Gallary
 * @author Hibernate Tools
 */
public class GallaryHome {

	private static final Log log = LogFactory.getLog(GallaryHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Gallary.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Gallary transientInstance) {
		log.debug("persisting Gallary instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Gallary instance) {
		log.debug("attaching dirty Gallary instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Gallary instance) {
		log.debug("attaching clean Gallary instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Gallary persistentInstance) {
		log.debug("deleting Gallary instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Gallary merge(Gallary detachedInstance) {
		log.debug("merging Gallary instance");
		try {
			Gallary result = (Gallary) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Gallary findById(java.lang.Integer id) {
		log.debug("getting Gallary instance with id: " + id);
		try {
			Gallary instance = (Gallary) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Gallary", id);
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

	public List<Gallary> findByExample(Gallary instance) {
		log.debug("finding Gallary instance by example");
		try {
			List<Gallary> results = (List<Gallary>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Gallary").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
