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

import com.loopbreak.entities.ExamRoutine;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class ExamRoutine.
 * @see com.loopbreak.entities.ExamRoutine
 * @author Hibernate Tools
 */
public class ExamRoutineHome {

	private static final Log log = LogFactory.getLog(ExamRoutineHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(ExamRoutine.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ExamRoutine transientInstance) {
		log.debug("persisting ExamRoutine instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ExamRoutine instance) {
		log.debug("attaching dirty ExamRoutine instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExamRoutine instance) {
		log.debug("attaching clean ExamRoutine instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ExamRoutine persistentInstance) {
		log.debug("deleting ExamRoutine instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExamRoutine merge(ExamRoutine detachedInstance) {
		log.debug("merging ExamRoutine instance");
		try {
			ExamRoutine result = (ExamRoutine) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExamRoutine findById(java.lang.Integer id) {
		log.debug("getting ExamRoutine instance with id: " + id);
		try {
			ExamRoutine instance = (ExamRoutine) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.ExamRoutine", id);
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

	public List<ExamRoutine> findByExample(ExamRoutine instance) {
		log.debug("finding ExamRoutine instance by example");
		try {
			List<ExamRoutine> results = (List<ExamRoutine>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.ExamRoutine").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
