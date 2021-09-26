package com.digital.innovation.one.beerstock.mapper;
import com.digital.innovation.one.beerstock.dto.BeerDTO;
import com.digital.innovation.one.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}