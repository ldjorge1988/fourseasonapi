package com.fourseasons.edu.uco.fourseasonsapi.application.service.discounttype;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationDiscountTypeMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.DiscountTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class DiscountTypeListService {
    private final DiscountTypeRepository discountTypeRepositoryrepository;

    private final ApplicationDiscountTypeMapper applicationDiscountTypeMapper;

    public GenericResponseDTO execute (){
        return GenericResponseDTO.builder().data(applicationDiscountTypeMapper.domainsToDtos(discountTypeRepositoryrepository.getAll()))
                .build();
    }
}
