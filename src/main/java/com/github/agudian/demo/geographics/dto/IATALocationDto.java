package com.github.agudian.demo.geographics.dto;

import com.github.agudian.demo.base.dto.BaseDto;
import com.github.agudian.demo.base.dto.Reference;

/**
 * @author Andreas Gudian
 *
 */
public class IATALocationDto extends BaseDto {
    private String code;
    private String name;

    private String headOfficePhoneNumber;

    private Reference country;

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
    public Reference getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Reference country) {
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
