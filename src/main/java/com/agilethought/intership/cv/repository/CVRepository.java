package com.agilethought.intership.cv.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.agilethought.intership.cv.model.CV;

@Repository
public interface CVRepository extends MongoRepository<CV, String> {

}
