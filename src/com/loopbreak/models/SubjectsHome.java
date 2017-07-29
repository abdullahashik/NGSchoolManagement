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
import com.loopbreak.entities.Subjects;

/**
 * Home object for domain model class Subjects.
 * @see com.loopbreak.entities.Subjects
 * @author Hibernate Tools
 */
public class SubjectsHome {

	private static final Log log = LogFactory.getLog(SubjectsHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Subjects.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Subjects transientInstance) {
		log.debug("persisting Subjects instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Subjects instance) {
		log.debug("attaching dirty Subjects instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Subjects instance) {
		log.debug("attaching clean Subjects instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Subjects persistentInstance) {
		log.debug("deleting Subjects instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Subjects merge(Subjects detachedInstance) {
		log.debug("merging Subjects instance");
		try {
			Subjects result = (Subjects) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Subjects findById(java.lang.Integer id) {
		log.debug("getting Subjects instance with id: " + id);
		try {
			Subjects instance = (Subjects) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Subjects",
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

	public List<Subjects> findByExample(Subjects instance) {
		log.debug("finding Subjects instance by example");
		try {
			List<Subjects> results = (List<Subjects>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Subjects").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
