package com.ibm.liquidinfoapp.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.liquidinfoapp.dao.BaseDao;

@Repository("baseDao")
@SuppressWarnings("all")
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private static Logger logger = Logger.getLogger(BaseDaoImpl.class);
	private SessionFactory sessionFactory;
	  
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }  

    @Autowired  
    public void setSessionFactory(SessionFactory sessionFactory) { 
    	this.sessionFactory = sessionFactory;  
    }
    
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
	@Override
	public Serializable insertObj(T o) {
		logger.info("BaseDaoImpl:insertObj");
		return this.getCurrentSession().save(o); 
	}

	@Override
	public void deleteObj(T o) {
		this.getCurrentSession().delete(o);
	}

	@Override
	public void updateObj(T o) {
		this.getCurrentSession().saveOrUpdate(o);
	}

	@Override
	public List<T> selectObjList(String hql) {
		return this.getCurrentSession().createQuery(hql).list();
	}

	@Override
	public List<T> selectObjList(String hql, Object[] param) {
		Query q = this.getCurrentSession().createQuery(hql);
        if (param != null && param.length > 0) {
            for (int i = 0; i < param.length; i++) {
                q.setParameter(i, param[i]);
            }
        }
        return q.list();
	}

	@Override
	public List<T> selectObjList(String hql, List<Object> param) {  
        Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.size() > 0) {  
            for (int i = 0; i < param.size(); i++) {  
                q.setParameter(i, param.get(i));  
            }  
        }  
        return q.list();  
    }  
	
	@Override
	public List<T> selectObjList(String hql, Object[] param, Integer page, Integer rows) {
		if (page == null || page < 1) {  
            page = 1;  
        }  
        if (rows == null || rows < 1) {  
            rows = 10;  
        }  
        Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.length > 0) {  
            for (int i = 0; i < param.length; i++) {  
                q.setParameter(i, param[i]);  
            }  
        }  
        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
	}

	@Override
	public List<T> selectObjList(String hql, List<Object> param, Integer page, Integer rows) {  
        if (page == null || page < 1) {  
            page = 1;  
        }  
        if (rows == null || rows < 1) {  
            rows = 10;  
        }  
        Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.size() > 0) {  
            for (int i = 0; i < param.size(); i++) {  
                q.setParameter(i, param.get(i));  
            }  
        }  
        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();  
    }
	
	@Override
	public T selectObj(Class<T> c, Serializable id) {
        return (T) this.getCurrentSession().get(c, id);  
    }
	
	@Override
	public T selectObj(String hql, Object[] param) {
		List<T> l = this.selectObjList(hql, param);  
        if (l != null && l.size() > 0) {  
            return l.get(0);  
        } else {  
            return null;  
        }
	}

	@Override
	public T selectObj(String hql, List<Object> param) {  
        List<T> l = this.selectObjList(hql, param);  
        if (l != null && l.size() > 0) {  
            return l.get(0);  
        } else {  
            return null;  
        }  
    }
	
	@Override
	public Long count(String hql) {
		return (Long) this.getCurrentSession().createQuery(hql).uniqueResult();
	}

	@Override
	public Long count(String hql, Object[] param) {
		Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.length > 0) {  
            for (int i = 0; i < param.length; i++) {  
                q.setParameter(i, param[i]);  
            }  
        }  
        return (Long) q.uniqueResult();
	}

	@Override
	public Long count(String hql, List<Object> param) {  
        Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.size() > 0) {  
            for (int i = 0; i < param.size(); i++) {  
                q.setParameter(i, param.get(i));  
            }  
        }  
        return (Long) q.uniqueResult();  
    }
	
	@Override
	public Integer executeHql(String hql) {
		return this.getCurrentSession().createQuery(hql).executeUpdate();
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {  
        Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.length > 0) {  
            for (int i = 0; i < param.length; i++) {  
                q.setParameter(i, param[i]);  
            }  
        }  
        return q.executeUpdate();  
    }
	
	@Override
	public Integer executeHql(String hql, List<Object> param) {  
        Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.size() > 0) {  
            for (int i = 0; i < param.size(); i++) {  
                q.setParameter(i, param.get(i));  
            }  
        }  
        return q.executeUpdate();  
    }
	
}
