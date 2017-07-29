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

import com.loopbreak.entities.Exams;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class Exams.
 * @see com.loopbreak.entities.Exams
 * @author Hibernate Tools
 */
public class ExamsHome {

	private static final Log log = LogFactory.getLog(ExamsHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Exams.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Exams transientInstance) {
		log.debug("persisting Exams instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Exams instance) {
		log.debug("attaching dirty Exams instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Exams instance) {
		log.debug("attaching clean Exams instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Exams persistentInstance) {
		log.debug("deleting Exams instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Exams merge(Exams detachedInstance) {
		log.debug("merging Exams instance");
		try {
			Exams result = (Exams) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Exams findById(java.lang.Integer id) {
		log.debug("getting Exams instance with id: " + id);
		try {
			Exams instance = (Exams) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Exams", id);
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

	public List<Exams> findByExample(Exams instance) {
		log.debug("finding Exams instance by example");
		try {
			List<Exams> results = (List<Exams>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Exams").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
