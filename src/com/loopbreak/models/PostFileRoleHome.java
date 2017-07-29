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

import com.loopbreak.entities.PostFileRole;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class PostFileRole.
 * @see com.loopbreak.entities.PostFileRole
 * @author Hibernate Tools
 */
public class PostFileRoleHome {

	private static final Log log = LogFactory.getLog(PostFileRoleHome.class);

	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(PostFileRole.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(PostFileRole transientInstance) {
		log.debug("persisting PostFileRole instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PostFileRole instance) {
		log.debug("attaching dirty PostFileRole instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PostFileRole instance) {
		log.debug("attaching clean PostFileRole instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PostFileRole persistentInstance) {
		log.debug("deleting PostFileRole instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PostFileRole merge(PostFileRole detachedInstance) {
		log.debug("merging PostFileRole instance");
		try {
			PostFileRole result = (PostFileRole) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PostFileRole findById(java.lang.Integer id) {
		log.debug("getting PostFileRole instance with id: " + id);
		try {
			PostFileRole instance = (PostFileRole) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.PostFileRole", id);
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

	public List<PostFileRole> findByExample(PostFileRole instance) {
		log.debug("finding PostFileRole instance by example");
		try {
			List<PostFileRole> results = (List<PostFileRole>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.PostFileRole").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
