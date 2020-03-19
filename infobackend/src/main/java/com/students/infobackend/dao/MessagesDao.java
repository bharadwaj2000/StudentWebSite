package com.students.infobackend.dao;

import com.students.infobackend.models.Messages;
import org.springframework.data.repository.CrudRepository;

public interface MessagesDao extends CrudRepository<Messages,Integer> {

}
