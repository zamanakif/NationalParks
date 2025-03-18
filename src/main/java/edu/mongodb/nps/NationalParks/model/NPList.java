package edu.mongodb.nps.NationalParks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class NPList {

    private List<NP> listOfNPs;

    private String stateCode;

    private Integer countOfNPs;

    public void addAll(List<NP> npList) {
        if (this.listOfNPs == null)
            this.listOfNPs = new ArrayList<NP>();
        this.listOfNPs.addAll(npList);
    }

    public String getStateCode() {
        return this.stateCode ;
    }

    public void setStateCode(String stateCd) {
        this.stateCode = stateCd;
    }

    public Integer getCountOfNPs() {
        return this.countOfNPs;
    }

    public void setCountOfNPs(Integer count) {
        this.countOfNPs = count;
    }

    public List getListOfNPs() {
        return this.listOfNPs;
    }

    public void setListOfNPs(List<NP> npList) {
        this.listOfNPs = npList;
    }


    public String toString() {
        return "{ \"stateCode\": \"" + this.getStateCode() + "\",\n" +
                "\"countOfNPs\": " + this.getCountOfNPs() + ",\n" +
                "\"listOfNPs\": [" + this.getListOfNPs() + "\n]\n}";
    }


}
