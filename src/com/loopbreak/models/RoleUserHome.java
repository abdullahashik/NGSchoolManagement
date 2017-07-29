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

import com.loopbreak.entities.RoleUser;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class RoleUser.
 * @see com.loopbreak.entities.RoleUser
 * @author Hibernate Tools
 */
public class RoleUserHome {

	private static final Log log = LogFactory.getLog(RoleUserHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(RoleUser.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(RoleUser transientInstance) {
		log.debug("persisting RoleUser instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RoleUser instance) {
		log.debug("attaching dirty RoleUser instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RoleUser instance) {
		log.debug("attaching clean RoleUser instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RoleUser persistentInstance) {
		log.debug("deleting RoleUser instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RoleUser merge(RoleUser detachedInstance) {
		log.debug("merging RoleUser instance");
		try {
			RoleUser result = (RoleUser) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RoleUser findById(java.lang.Integer id) {
		log.debug("getting RoleUser instance with id: " + id);
		try {
			RoleUser instance = (RoleUser) sessionFactory.getCurrentSession().get("com.loopbreak.entities.RoleUser",
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

	public List<RoleUser> findByExample(RoleUser instance) {
		log.debug("finding RoleUser instance by example");
		try {
			List<RoleUser> results = (List<RoleUser>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.RoleUser").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
