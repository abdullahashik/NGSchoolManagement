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

import com.loopbreak.entities.StudentStatus;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class StudentStatus.
 * @see com.loopbreak.entities.StudentStatus
 * @author Hibernate Tools
 */
public class StudentStatusHome {

	private static final Log log = LogFactory.getLog(StudentStatusHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(StudentStatus.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StudentStatus transientInstance) {
		log.debug("persisting StudentStatus instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StudentStatus instance) {
		log.debug("attaching dirty StudentStatus instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StudentStatus instance) {
		log.debug("attaching clean StudentStatus instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StudentStatus persistentInstance) {
		log.debug("deleting StudentStatus instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StudentStatus merge(StudentStatus detachedInstance) {
		log.debug("merging StudentStatus instance");
		try {
			StudentStatus result = (StudentStatus) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentStatus findById(java.lang.Integer id) {
		log.debug("getting StudentStatus instance with id: " + id);
		try {
			StudentStatus instance = (StudentStatus) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.StudentStatus", id);
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

	public List<StudentStatus> findByExample(StudentStatus instance) {
		log.debug("finding StudentStatus instance by example");
		try {
			List<StudentStatus> results = (List<StudentStatus>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.StudentStatus").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
