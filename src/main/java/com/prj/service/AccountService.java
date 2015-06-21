/**
 * 404 Studio
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.prj.service;

import com.prj.common.util.DataWrapper;
import com.prj.entity.Account;

/**
 * 
 * @author yiliang.gyl
 * @version $Id: AccountService.java, v 0.1 Jun 21, 2015 11:55:15 AM yiliang.gyl Exp $
 */
public interface AccountService extends BaseService<Account, Long> {

    DataWrapper findByAccount(String account);

    DataWrapper updatePassword(long id, String oldPassword, String newPassword);

    DataWrapper updatePasswordByAdmin(long id, String newPassword);

    boolean saveUserToken(long id, String token);
}
