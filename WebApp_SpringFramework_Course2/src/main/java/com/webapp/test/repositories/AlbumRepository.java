package com.webapp.test.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webapp.test.domain.Album;

public interface AlbumRepository extends CrudRepository<Album, Long>{

}
