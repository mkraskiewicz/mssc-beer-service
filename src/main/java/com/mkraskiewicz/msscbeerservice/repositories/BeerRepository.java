package com.mkraskiewicz.msscbeerservice.repositories;

import com.mkraskiewicz.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by Maciej on 20/10/2019
 */
@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
