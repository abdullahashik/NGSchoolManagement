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

import com.loopbreak.entities.Staff;
import com.loopbreak.entities.Students;

/**
 * Home object for domain model class Staff.
 * 
 * @see com.loopbreak.entities.Staff
 * @author Hibernate Tools
 */
public class StaffHome {

	private static final Log log = LogFactory.getLog(StaffHome.class);

	private  SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Staff.class).buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Staff transientInstance) {
		log.debug("persisting Staff instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Staff instance) {
		log.debug("attaching dirty Staff instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Staff instance) {
		log.debug("attaching clean Staff instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Staff persistentInstance) {
		log.debug("deleting Staff instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Staff merge(Staff detachedInstance) {
		log.debug("merging Staff instance");
		try {
			Staff result = (Staff) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Staff findById(java.lang.Integer id) {
		log.debug("getting Staff instance with id: " + id);
		try {
			Staff instance = (Staff) sessionFactory.getCurrentSession().get("com.loopbreak.entities.Staff", id);
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

	public List<Staff> findByExample(Staff instance) {
		log.debug("finding Staff instance by example");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			@SuppressWarnings({ "deprecation", "unchecked" })
			List<Staff> results = (List<Staff>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Staff").add(create(instance)).list();
			sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/**
	 * Get All staff with designations
	 */
	@SuppressWarnings("unchecked")
	public List<Staff> getAllStaff() {
		/**
		 * Query: select staff.*, designations.title,designations.display_name
		 * from staff join staff_designation_rel on staff.id =
		 * staff_designation_rel.staff_id join designations on designations.id =
		 * staff_designation_rel.designation_id
		 */

		System.out.println("Getting all staffs");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			@SuppressWarnings("deprecation")
			List<Staff> results = (List<Staff>) sessionFactory.getCurrentSession()
					.createCriteria("com.loopbreak.entities.Staff").list();
			sessionFactory.getCurrentSession().getTransaction().commit();
			System.out.println("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			System.err.println("find by example failed: " + re.getLocalizedMessage());
			throw re;
		}
	}
}
