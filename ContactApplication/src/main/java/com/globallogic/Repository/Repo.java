package com.globallogic.Repository;

import com.globallogic.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Contact,Integer> {
}
