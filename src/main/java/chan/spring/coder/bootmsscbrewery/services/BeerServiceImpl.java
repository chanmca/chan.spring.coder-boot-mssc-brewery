package chan.spring.coder.bootmsscbrewery.services;

import chan.spring.coder.bootmsscbrewery.models.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID beerId) {
        return Beer.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
