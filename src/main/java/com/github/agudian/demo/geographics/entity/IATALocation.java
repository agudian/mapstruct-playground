package com.github.agudian.demo.geographics.entity;

import com.github.agudian.demo.base.entity.BaseAuditedEntity;

/**
 * @author Andreas Gudian
 *
 */
public class IATALocation extends BaseAuditedEntity {
    private String code;
    private String name;

    private String headOfficePhoneNumber;

    private Country country;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the headOfficePhoneNumber
     */
    public String getHeadOfficePhoneNumber() {
        return headOfficePhoneNumber;
    }

    /**
     * @param headOfficePhoneNumber the headOfficePhoneNumber to set
     */
    public void setHeadOfficePhoneNumber(String headOfficePhoneNumber) {
        this.headOfficePhoneNumber = headOfficePhoneNumber;
    }
}
