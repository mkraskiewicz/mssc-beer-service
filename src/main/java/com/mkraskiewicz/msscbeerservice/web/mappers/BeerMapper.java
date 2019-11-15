package com.mkraskiewicz.msscbeerservice.web.mappers;

import com.mkraskiewicz.msscbeerservice.domain.Beer;
import com.mkraskiewicz.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Maciej on 24/10/2019
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}