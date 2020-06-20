package com.webapp.test.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webapp.test.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
