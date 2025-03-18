package edu.mongodb.nps.NationalParks.repository;

import edu.mongodb.nps.NationalParks.model.NP;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface NPRepository extends MongoRepository<NP, String> {//MongoRepository<NP, BigInteger> {

    /*
    @Query("{ 'Number': 0}")
    NP findByNumber(Integer number);
    */
}
