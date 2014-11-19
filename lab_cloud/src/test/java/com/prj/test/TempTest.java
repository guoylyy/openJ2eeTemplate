package com.prj.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.prj.dao.AccountDao;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("/proj-test.xml") 
@Transactional() 
public class TempTest {
	@Resource(name = "AccountDaoImpl")
	private AccountDao dao;
	
	@Test
	public void testAccount() {
//		Account2 a = dao.getAccount2();
//		System.out.println(a.getAccountName());
		String s = "-----------------------------633119332551420391206797616 Content-Disposition: form-data; name=\"token\" asdasd -----------------------------633119332551420391206797616 Content-Disposition: form-data; name=\"file\"; filename=\"1.txt\" Content-Type: text/plain 123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123 -----------------------------633119332551420391206797616--";
		System.out.println(s.length());
	}
	
	
}