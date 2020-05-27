package com.util.generic.dao;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.util.generic.configuration.Condition;
import com.util.generic.configuration.KeyValue;

public interface GenericDao<T, PK> {
	public PK persist(T paramT) throws Exception;

	public void update(T paramT) throws Exception;

	public void saveOrUpdate(T paramT);

	public void delete(T paramT) throws Exception;

	public void deleteAll() throws Exception;

	public T findById(PK paramPK) throws Exception;

	public T findByIdLock(PK paramPK, boolean paramBoolean) throws Exception;

	public T findByIdUnique(PK paramPK) throws Exception;

	public List<T> findAll() throws Exception;

	public List<T> findByExample(T paramT) throws Exception;

	public void flush() throws Exception;

	public void clear() throws Exception;

	public Date getSystemDate() throws Exception;

	public List<T> findByKeyValue(List<KeyValue> lstKeyValue) throws Exception;

	public List<T> findByExample(T exampleInstance, String orderByColumn, boolean ascendingOrder) throws Exception;

	public List<T> findByKeyValue(List<KeyValue> lstKeyValue, String orderByColumn, boolean ascendingOrder)
			throws Exception;

	public List<T> findAll(List<KeyValue> lstKeyValue, String[] arrOrderByColumn, boolean blnAscOrder,
			int intFirstItemIndex, int intMaxItems, boolean blnExactMatch) throws Exception;

	public PK countAll(List<KeyValue> lstKeyValue, boolean blnExactMatch) throws Exception;


}