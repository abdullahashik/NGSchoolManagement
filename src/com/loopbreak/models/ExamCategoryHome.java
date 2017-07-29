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

import com.loopbreak.entities.ExamCategory;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class ExamCategory.
 * 
 * @see com.loopbreak.entities.ExamCategory
 * @author Hibernate Tools
 */
public class ExamCategoryHome {

	private static final Log log = LogFactory.getLog(ExamCategoryHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(ExamCategory.class)
					.buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ExamCategory transientInstance) {
		log.debug("persisting ExamCategory instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ExamCategory instance) {
		log.debug("attaching dirty ExamCategory instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExamCategory instance) {
		log.debug("attaching clean ExamCategory instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ExamCategory persistentInstance) {
		log.debug("deleting ExamCategory instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExamCategory merge(ExamCategory detachedInstance) {
		log.debug("merging ExamCategory instance");
		try {
			ExamCategory result = (ExamCategory) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExamCategory findById(java.lang.Integer id) {
		log.debug("getting ExamCategory instance with id: " + id);
		try {
			ExamCategory instance = (ExamCategory) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.ExamCategory", id);
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

	public List<ExamCategory> findByExample(ExamCategory instance) {
		log.debug("finding ExamCategory instance by example");
		try {
			List<ExamCategory> results = (List<ExamCategory>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.ExamCategory").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
