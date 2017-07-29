package com.loopbreak.models;
// Generated Jun 11, 2017 10:04:12 PM by Hibernate Tools 5.2.1.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.loopbreak.entities.Students;

/**
 * Home object for domain model class Students.
 * 
 * @see com.loopbreak.entities.Students
 * @author Hibernate Tools
 */
public class StudentsHome {

	private static final Log log = LogFactory.getLog(StudentsHome.class);

	// private final SessionFactory sessionFactory = getSessionFactory();
	private SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Students.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Students transientInstance) {
		log.debug("persisting Students instance");
		try {
			if (sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().persist(transientInstance);
				sessionFactory.getCurrentSession().getTransaction().commit();
			} else {
				sessionFactory.getCurrentSession().beginTransaction();
				sessionFactory.getCurrentSession().persist(transientInstance);
				sessionFactory.getCurrentSession().getTransaction().commit();
			}

			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		} finally {
			sessionFactory.getCurrentSession().close();
		}
	}

	public void attachDirty(Students instance) {
		log.debug("attaching dirty Students instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Students instance) {
		log.debug("attaching clean Students instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Students persistentInstance) {
		log.debug("deleting Students instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Students merge(Students detachedInstance) {
		log.debug("merging Students instance");
		try {
			Students result = (Students) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Students findById(java.lang.Integer id) {
		log.debug("getting Students instance with id: " + id);
		try {
			Students instance = (Students) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Students",
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

	public List<Students> findByExample(Students instance) {
		log.debug("finding Students instance by example");
		try {
			@SuppressWarnings({ "deprecation", "unchecked" })
			List<Students> results = (List<Students>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Students").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	// get all students
	public List<Students> getAllStudents() {
		System.out.println("finding all students instance by");
		try {
			if (sessionFactory.getCurrentSession().getTransaction().isActive()) {
				@SuppressWarnings({ "deprecation", "unchecked" })
				List<Students> results = (List<Students>) sessionFactory.getCurrentSession()
						.createCriteria(Students.class).list();
				sessionFactory.getCurrentSession().getTransaction().commit();
				System.out.println("find by example successful, result size: " + results.size());
				return results;
			} else {
				sessionFactory.getCurrentSession().beginTransaction();
				@SuppressWarnings({ "deprecation", "unchecked" })
				List<Students> results = (List<Students>) sessionFactory.getCurrentSession()
						.createCriteria(Students.class).list();
				sessionFactory.getCurrentSession().getTransaction().commit();
				System.out.println("find by example successful, result size: " + results.size());
				return results;
			}

		} catch (RuntimeException re) {
			System.err.println("find by example failed: " + re.getLocalizedMessage());
			throw re;
		}
	}

	// get limited students
	public List<Students> getAllStudentsLimited(Integer take, Integer skip) {
		System.out.println("recieved to limit by " + take + " and " + skip);
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			@SuppressWarnings({ "deprecation", "unchecked" })
			Criteria cr = sessionFactory.getCurrentSession().createCriteria(Students.class);
			cr.setFirstResult(0);
			cr.setMaxResults(12);
			List<Students> results = (List<Students>) cr.list();
			sessionFactory.getCurrentSession().getTransaction().commit();
			System.out.println("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			System.err.println("find by example failed: " + re.getLocalizedMessage());
			throw re;
		}
	}
}
