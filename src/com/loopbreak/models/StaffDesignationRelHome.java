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

import com.loopbreak.entities.StaffDesignationRel;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class StaffDesignationRel.
 * @see com.loopbreak.entities.StaffDesignationRel
 * @author Hibernate Tools
 */
public class StaffDesignationRelHome {

	private static final Log log = LogFactory.getLog(StaffDesignationRelHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(StaffDesignationRel.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StaffDesignationRel transientInstance) {
		log.debug("persisting StaffDesignationRel instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StaffDesignationRel instance) {
		log.debug("attaching dirty StaffDesignationRel instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StaffDesignationRel instance) {
		log.debug("attaching clean StaffDesignationRel instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StaffDesignationRel persistentInstance) {
		log.debug("deleting StaffDesignationRel instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StaffDesignationRel merge(StaffDesignationRel detachedInstance) {
		log.debug("merging StaffDesignationRel instance");
		try {
			StaffDesignationRel result = (StaffDesignationRel) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StaffDesignationRel findById(java.lang.Integer id) {
		log.debug("getting StaffDesignationRel instance with id: " + id);
		try {
			StaffDesignationRel instance = (StaffDesignationRel) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.StaffDesignationRel", id);
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

	public List<StaffDesignationRel> findByExample(StaffDesignationRel instance) {
		log.debug("finding StaffDesignationRel instance by example");
		try {
			List<StaffDesignationRel> results = (List<StaffDesignationRel>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.StaffDesignationRel").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
