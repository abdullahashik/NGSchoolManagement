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

import com.loopbreak.entities.ExamResult;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class ExamResult.
 * @see com.loopbreak.entities.ExamResult
 * @author Hibernate Tools
 */
public class ExamResultHome {

	private static final Log log = LogFactory.getLog(ExamResultHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(ExamResult.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ExamResult transientInstance) {
		log.debug("persisting ExamResult instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ExamResult instance) {
		log.debug("attaching dirty ExamResult instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExamResult instance) {
		log.debug("attaching clean ExamResult instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ExamResult persistentInstance) {
		log.debug("deleting ExamResult instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExamResult merge(ExamResult detachedInstance) {
		log.debug("merging ExamResult instance");
		try {
			ExamResult result = (ExamResult) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExamResult findById(java.lang.Integer id) {
		log.debug("getting ExamResult instance with id: " + id);
		try {
			ExamResult instance = (ExamResult) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.ExamResult", id);
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

	public List<ExamResult> findByExample(ExamResult instance) {
		log.debug("finding ExamResult instance by example");
		try {
			List<ExamResult> results = (List<ExamResult>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.ExamResult").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
