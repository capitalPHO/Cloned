package com.adansoft.great21.dataaccess.home;

// Generated Mar 10, 2015 10:57:37 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.adansoft.great21.dataaccess.entities.GamejoinRequest;

/**
 * Home object for domain model class GamejoinRequest.
 * @see com.adansoft.great21.dataaccess.home.GamejoinRequest
 * @author Hibernate Tools
 */
public class GamejoinRequestHome {

	private static final Log log = LogFactory.getLog(GamejoinRequestHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(GamejoinRequest transientInstance) {
		log.debug("persisting GamejoinRequest instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GamejoinRequest instance) {
		log.debug("attaching dirty GamejoinRequest instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GamejoinRequest instance) {
		log.debug("attaching clean GamejoinRequest instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GamejoinRequest persistentInstance) {
		log.debug("deleting GamejoinRequest instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GamejoinRequest merge(GamejoinRequest detachedInstance) {
		log.debug("merging GamejoinRequest instance");
		try {
			GamejoinRequest result = (GamejoinRequest) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GamejoinRequest findById(long id) {
		log.debug("getting GamejoinRequest instance with id: " + id);
		try {
			GamejoinRequest instance = (GamejoinRequest) sessionFactory
					.getCurrentSession()
					.get("com.adansoft.great21.dataaccess.home.GamejoinRequest",
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

	public List findByExample(GamejoinRequest instance) {
		log.debug("finding GamejoinRequest instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.adansoft.great21.dataaccess.home.GamejoinRequest")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
