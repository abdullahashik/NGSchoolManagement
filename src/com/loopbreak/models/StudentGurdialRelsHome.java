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

import com.loopbreak.entities.StudentGurdialRels;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class StudentGurdialRels.
 * 
 * @see com.loopbreak.entities.StudentGurdialRels
 * @author Hibernate Tools
 */
public class StudentGurdialRelsHome {

	private static final Log log = LogFactory.getLog(StudentGurdialRelsHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(StudentGurdialRels.class)
					.buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StudentGurdialRels transientInstance) {
		log.debug("persisting StudentGurdialRels instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StudentGurdialRels instance) {
		log.debug("attaching dirty StudentGurdialRels instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StudentGurdialRels instance) {
		log.debug("attaching clean StudentGurdialRels instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StudentGurdialRels persistentInstance) {
		log.debug("deleting StudentGurdialRels instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StudentGurdialRels merge(StudentGurdialRels detachedInstance) {
		log.debug("merging StudentGurdialRels instance");
		try {
			StudentGurdialRels result = (StudentGurdialRels) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentGurdialRels findById(java.lang.Integer id) {
		log.debug("getting StudentGurdialRels instance with id: " + id);
		try {
			StudentGurdialRels instance = (StudentGurdialRels) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.StudentGurdialRels", id);
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

	public List<StudentGurdialRels> findByExample(StudentGurdialRels instance) {
		log.debug("finding StudentGurdialRels instance by example");
		try {
			List<StudentGurdialRels> results = (List<StudentGurdialRels>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.StudentGurdialRels").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
