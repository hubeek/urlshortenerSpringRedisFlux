package nl.appall.urlshortener;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class LinkService {
    Mono<String> shortenLink (String link){
        String randomKey = RandomStringUtils.randomAlphabetic(6);
// save to db
        return Mono.just(randomKey);
    }
}
