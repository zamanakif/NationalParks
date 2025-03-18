package edu.mongodb.nps.NationalParks.model;

import lombok.*;
//import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.math.BigInteger;
import java.time.LocalDate;

@Document("NPs")
@AllArgsConstructor
@Data
@EqualsAndHashCode
//@Getter
//@Setter
@NoArgsConstructor
//@ToString
public class NP {

    @Id
    private String _id;

    @Field(name="state")
    private String state[];

    @Field(name="founded")
    private LocalDate founded;

    @Field(name="area(sqm)")
    private Float area;

    @Field(name="annual visitors")
    private Long annualVisitors;

    @Field(name="Name")
    private String name;

    @Field(name="Number")
    private Integer number;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String[] getState() {
        return state;
    }

    public void setState(String state[]) {
        this.state = state;
    }

    public LocalDate getFounded() {
        return founded;
    }

    public void setFounded(LocalDate founded) {
        this.founded = founded;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Long getAnnualVisitors() {
        return annualVisitors;
    }

    public void setAnnualVisitors(Long annualVisitors) {
        this.annualVisitors = annualVisitors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String toString() {
        return "{ \"_id\": \"" + this.get_id() + "\",\n" +
                "\"state\": [\"\"],\n" +
                "\"founded\": \"" + this.getFounded() + "\", " +
                "\"annual visitors\": " + this.getAnnualVisitors() + ",\n" +
                "\"Name\": \"" + this.getName() + "\"," +
                "\"Number\": " + this.getNumber() + "\n}";
    }

                /*

_id
67992fe5eab2aa41b47a8526

state
Array (1)
0
"CA"
founded
"1890-10-01"
area(sqm)
1169
annual visitors
3897070
Number
3
Name
"Yosemite National Park"

                */
}
