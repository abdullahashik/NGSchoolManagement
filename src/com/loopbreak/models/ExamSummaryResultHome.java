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

import com.loopbreak.entities.ExamSummaryResult;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class ExamSummaryResult.
 * @see com.loopbreak.entities.ExamSummaryResult
 * @author Hibernate Tools
 */
public class ExamSummaryResultHome {

	private static final Log log = LogFactory.getLog(ExamSummaryResultHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(ExamSummaryResult.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ExamSummaryResult transientInstance) {
		log.debug("persisting ExamSummaryResult instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ExamSummaryResult instance) {
		log.debug("attaching dirty ExamSummaryResult instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExamSummaryResult instance) {
		log.debug("attaching clean ExamSummaryResult instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ExamSummaryResult persistentInstance) {
		log.debug("deleting ExamSummaryResult instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExamSummaryResult merge(ExamSummaryResult detachedInstance) {
		log.debug("merging ExamSummaryResult instance");
		try {
			ExamSummaryResult result = (ExamSummaryResult) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExamSummaryResult findById(java.lang.Integer id) {
		log.debug("getting ExamSummaryResult instance with id: " + id);
		try {
			ExamSummaryResult instance = (ExamSummaryResult) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.ExamSummaryResult", id);
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

	public List<ExamSummaryResult> findByExample(ExamSummaryResult instance) {
		log.debug("finding ExamSummaryResult instance by example");
		try {
			List<ExamSummaryResult> results = (List<ExamSummaryResult>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.ExamSummaryResult").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
