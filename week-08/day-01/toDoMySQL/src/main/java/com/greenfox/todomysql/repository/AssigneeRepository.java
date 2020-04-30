package com.greenfox.todomysql.repository;

import com.greenfox.todomysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository <Assignee, Long> {

}
