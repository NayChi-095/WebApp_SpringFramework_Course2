package com.webapp.test.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webapp.test.domain.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long>{

}
