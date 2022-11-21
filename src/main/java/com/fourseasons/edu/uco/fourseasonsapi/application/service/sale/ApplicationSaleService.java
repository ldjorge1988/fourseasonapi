package com.fourseasons.edu.uco.fourseasonsapi.application.service.sale;

import org.springframework.stereotype.Service;

@Service
public class ApplicationSaleService {

    private static int idSale = 1 ;
    public int getIdSale (){
        return idSale++;
    }
}
