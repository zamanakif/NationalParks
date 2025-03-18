package edu.mongodb.nps.NationalParks.service;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import edu.mongodb.nps.NationalParks.model.NP;
import edu.mongodb.nps.NationalParks.model.NPList;
import edu.mongodb.nps.NationalParks.repository.NPRepository;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.management.Query;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NPService {

    @Autowired
    NPRepository npRepository;

    public List<NP> getAllNPs() {
        return npRepository.findAll();
    }

    public NP getNPWithId(String id) {
        Optional<NP> optionalNP = npRepository.findById(id);
        return optionalNP.orElse(null);
    }

    public NP createNewNP(NP newNP) {
        return npRepository.save(newNP);
    }

    public NPList getNPsInState(String stateCd) {
        List<NP> allNPs = npRepository.findAll();
        List<NP> stateNP = new ArrayList<NP>();
        stateNP = allNPs.stream().filter(x -> getStatesWithCondition(x.getState(), stateCd)).collect(Collectors.toList());
        NPList npList = new NPList();
        npList.addAll(   stateNP   );

        npList.setStateCode(stateCd);
        npList.setCountOfNPs(stateNP.size());
        return npList;
    }

    private boolean getStatesWithCondition(String[] stateAry, String state) {
        List<String> stateList = Arrays.stream(stateAry).toList();
        if (stateList.contains(state))
            return true;
        else
            return false;
    }

    /*
    public List<NP> getAllNPsInState(String stateCode) {
        return npRepository.fin
    }
    */

    //public NP getNPsByNumber(Integer number) {
        //System.out.println("Service level, number passed is "  + number);
        //return npRepository.findByNumber(number);
        /*
        MongoDatabase database = mongoCl
        Bson filter = Filters.and(Filters.eq("Number", number));
        collections
        Query query = new Query();
        query.addCriteria(Criteria.where("Number").equals(number));
        return npRepository.findBy()

         */
    //}

}
