package com.greenfox.todomysql.service;

import com.greenfox.todomysql.model.Assignee;
import com.greenfox.todomysql.repository.AssigneeRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {

  private AssigneeRepository repository;

  @Autowired
  public AssigneeService(AssigneeRepository repository) {
    this.repository = repository;
  }

  public Iterable<Assignee> getAllAssignees() {
    return repository.findAll();
  }

  public void addAssignee(Assignee assignee) {
    repository.save(assignee);
  }

  public void deleteAssignee(long id) {
    repository.deleteById(id);
  }

  public Optional<Assignee> findByID(long id) {
    return repository.findById(id);
  }
}
