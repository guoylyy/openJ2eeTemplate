/**
 * 404 Studio
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.prj.service;

import com.prj.common.util.DataWrapper;

import java.io.Serializable;

/**
 * 
 * @author yiliang.gyl
 * @version $Id: BaseService.java, v 0.1 Jun 21, 2015 11:55:24 AM yiliang.gyl Exp $
 */
public interface BaseService<T, PK extends Serializable> {

	DataWrapper create(T entity);

	DataWrapper read(PK id);

	DataWrapper update(PK id, T o);

	DataWrapper delete(PK id);

	DataWrapper update(PK id, String propertyName, Object value);

	DataWrapper getall();
}
