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

import com.loopbreak.entities.StudentPayments;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class StudentPayments.
 * @see com.loopbreak.entities.StudentPayments
 * @author Hibernate Tools
 */
public class StudentPaymentsHome {

	private static final Log log = LogFactory.getLog(StudentPaymentsHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(StudentPayments.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StudentPayments transientInstance) {
		log.debug("persisting StudentPayments instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StudentPayments instance) {
		log.debug("attaching dirty StudentPayments instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StudentPayments instance) {
		log.debug("attaching clean StudentPayments instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StudentPayments persistentInstance) {
		log.debug("deleting StudentPayments instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StudentPayments merge(StudentPayments detachedInstance) {
		log.debug("merging StudentPayments instance");
		try {
			StudentPayments result = (StudentPayments) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentPayments findById(java.lang.Integer id) {
		log.debug("getting StudentPayments instance with id: " + id);
		try {
			StudentPayments instance = (StudentPayments) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.StudentPayments", id);
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

	public List<StudentPayments> findByExample(StudentPayments instance) {
		log.debug("finding StudentPayments instance by example");
		try {
			List<StudentPayments> results = (List<StudentPayments>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.StudentPayments").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
