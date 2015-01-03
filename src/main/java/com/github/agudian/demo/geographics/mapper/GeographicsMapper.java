package com.github.agudian.demo.geographics.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.github.agudian.demo.base.mapper.GeneralEntityDtoMappingConfiguration;
import com.github.agudian.demo.geographics.dto.CountryDto;
import com.github.agudian.demo.geographics.dto.IATALocationDto;
import com.github.agudian.demo.geographics.entity.Country;
import com.github.agudian.demo.geographics.entity.IATALocation;

/**
 * Mapper for all main entities of this component "geographic"
 */
@Mapper( config = GeneralEntityDtoMappingConfiguration.class )
public interface GeographicsMapper {
    // mapping methods for country

    Country toCountry(CountryDto dto);

    Country intoCountry(CountryDto dto, @MappingTarget Country entity);

    CountryDto toCountryDto(Country entity);

    // mapping methods for IATALocation

    IATALocation toIATALocation(IATALocationDto dto);

    IATALocation intoIATALocation(IATALocationDto dto, @MappingTarget IATALocation entity);

    IATALocationDto toIATALocationDto(IATALocation entity);
}
