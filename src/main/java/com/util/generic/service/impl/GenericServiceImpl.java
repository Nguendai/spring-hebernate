package com.util.generic.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.util.generic.configuration.KeyValue;
import com.util.generic.dao.GenericDao;
import com.util.generic.service.GenericService;

@Service
public abstract class GenericServiceImpl<T, PK> implements GenericService<T, PK> {

	private GenericDao<T, PK> genericDao;

	public GenericServiceImpl() {
	}

	public GenericServiceImpl(GenericDao<T, PK> genericDao) {
		this.genericDao = genericDao;
	}

	public void printMemory() {
		Double totalMemory = Double.valueOf(Runtime.getRuntime().totalMemory());
		Double freeMemory = Double.valueOf(Runtime.getRuntime().freeMemory());

		System.out.println(
				"*****---booooooooooo-----------------------------------------------------------------**********");
		System.out.println("totalMemory:" + totalMemory.doubleValue() / 1048576.0D);
		System.out.println("freeMemory:" + freeMemory.doubleValue() / 1048576.0D);
		System.out.println("user Memory:" + (totalMemory.doubleValue() - freeMemory.doubleValue()) / 1048576.0D);
		System.out.println("%freeMemory:" + 100.0D * freeMemory.doubleValue() / totalMemory.doubleValue() + "%");
		System.out.println("maxMemory:" + Double.valueOf(Runtime.getRuntime().maxMemory() / 1048576L));
		System.out.println(
				"*****----booooooooooo----------------------------------------------------------------**********");
	}

	public void delete(T persistentObject) throws Exception {
		genericDao.delete(persistentObject);
	}

	public void deleteAll() throws Exception {
		genericDao.deleteAll();
	}


	public List<T> findAll() throws Exception {
		return genericDao.findAll();
	}

	public List<T> findByExample(T exampleInstance) throws Exception {
		return genericDao.findByExample(exampleInstance);
	}

	public T findById(PK id) throws Exception {
		return genericDao.findById(id);
	}

	public T findByIdUnique(PK id) throws Exception {
		return genericDao.findByIdUnique(id);
	}

	public PK persist(T newInstance) throws Exception {
		return genericDao.persist(newInstance);
	}


	public void update(T transientObject) throws Exception {
		genericDao.update(transientObject);
	}

	public void saveOrUpdate(T transientObject) throws Exception {
		genericDao.saveOrUpdate(transientObject);
	}

	public Date getSystemDate() throws Exception {
		return genericDao.getSystemDate();
	}

	public T findByIdLock(PK id, boolean lock) throws Exception {
		return genericDao.findByIdLock(id, lock);
	}

	public List<T> findByKeyValue(List<KeyValue> lstKeyValue) throws Exception {
		return genericDao.findByKeyValue(lstKeyValue);
	}

	public List<T> findByExample(T exampleInstance, String orderByColumn, boolean ascendingOrder) throws Exception {
		return genericDao.findByExample(exampleInstance, orderByColumn, ascendingOrder);
	}

	public List<T> findByKeyValue(List<KeyValue> lstKeyValue, String orderByColumn, boolean ascendingOrder)
			throws Exception {
		return genericDao.findByKeyValue(lstKeyValue, orderByColumn, ascendingOrder);
	}

	public List<T> findAll(List<KeyValue> lstKeyValue, String[] arrOrderByColumn, boolean blnAscOrder,
			int intFirstItemIndex, int intMaxItems, boolean blnExactMatch) throws Exception {
		return genericDao.findAll(lstKeyValue, arrOrderByColumn, blnAscOrder, intFirstItemIndex, intMaxItems,
				blnExactMatch);
	}

	public PK countAll(List<KeyValue> lstKeyValue, boolean blnExactMatch) throws Exception {
		return genericDao.countAll(lstKeyValue, blnExactMatch);
	}
}
