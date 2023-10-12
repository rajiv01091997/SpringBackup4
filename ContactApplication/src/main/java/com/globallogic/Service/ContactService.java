package com.globallogic.Service;

import com.globallogic.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
  @Autowired
  private Repo repo;

}
