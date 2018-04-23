package com.ys.api.shop.service.impl;

import java.util.function.Predicate;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ys.api.entity.RegisterEntity;
import com.ys.api.shop.mapper.RegisterDao;
import com.ys.api.shop.service.RegisterService;
@Service
public class RegisterServiceImpl implements RegisterService{
  @Autowired
  private RegisterDao registerDao;
  
  @Override
  public RegisterEntity save(){
	  System.out.println(registerDao.getByMessage().toString());
	  return registerDao.getByMessage();
  }
  
}
