/**
 * MuleSoft Examples
 * Copyright 2014 MuleSoft, Inc.
 *
 * This product includes software developed at
 * MuleSoft, Inc. (http://www.mulesoft.com/).
 */

package org.mule.examples.leagues.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@JsonAutoDetect
@XmlRootElement(namespace = "http://mulesoft.com/schemas/soccer")
public class UpdateTeam {

    private String name;
    private String homeCity;
    private String stadium;

    @JsonProperty
    @XmlElement(required = false, namespace = "http://mulesoft.com/schemas/soccer")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    @XmlElement(required = false, namespace = "http://mulesoft.com/schemas/soccer")
    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    @JsonProperty
    @XmlElement(required = false, namespace = "http://mulesoft.com/schemas/soccer")
    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

}
