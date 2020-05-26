package chan.spring.coder.bootmsscbrewery.services;

import chan.spring.coder.bootmsscbrewery.models.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID beerId);
}
