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

import com.loopbreak.entities.NoticeFileRole;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class NoticeFileRole.
 * @see com.loopbreak.entities.NoticeFileRole
 * @author Hibernate Tools
 */
public class NoticeFileRoleHome {

	private static final Log log = LogFactory.getLog(NoticeFileRoleHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(NoticeFileRole.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(NoticeFileRole transientInstance) {
		log.debug("persisting NoticeFileRole instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(NoticeFileRole instance) {
		log.debug("attaching dirty NoticeFileRole instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NoticeFileRole instance) {
		log.debug("attaching clean NoticeFileRole instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(NoticeFileRole persistentInstance) {
		log.debug("deleting NoticeFileRole instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NoticeFileRole merge(NoticeFileRole detachedInstance) {
		log.debug("merging NoticeFileRole instance");
		try {
			NoticeFileRole result = (NoticeFileRole) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NoticeFileRole findById(java.lang.Integer id) {
		log.debug("getting NoticeFileRole instance with id: " + id);
		try {
			NoticeFileRole instance = (NoticeFileRole) sessionFactory.getCurrentSession()
					.get("com.loopbreak.entities.NoticeFileRole", id);
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

	public List<NoticeFileRole> findByExample(NoticeFileRole instance) {
		log.debug("finding NoticeFileRole instance by example");
		try {
			List<NoticeFileRole> results = (List<NoticeFileRole>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.NoticeFileRole").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
