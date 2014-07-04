package com.ibm.liquidinfoapp.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	public Serializable insertObj(T o);
	public void deleteObj(T o);
	public void updateObj(T o);
	public List<T> selectObjList(String hql);
	public List<T> selectObjList(String hql, Object[] param);
	public List<T> selectObjList(String hql, List<Object> param);
	public List<T> selectObjList(String hql, Object[] param, Integer page, Integer rows);
	public List<T> selectObjList(String hql, List<Object> param, Integer page, Integer rows);
	public T selectObj(Class<T> c, Serializable id);
	public T selectObj(String hql, Object[] param);
	public T selectObj(String hql, List<Object> param);
	public Long count(String hql);
	public Long count(String hql, Object[] param);
	public Long count(String hql, List<Object> param);
	public Integer executeHql(String hql);
	public Integer executeHql(String hql, Object[] param);
	public Integer executeHql(String hql, List<Object> param);
}
