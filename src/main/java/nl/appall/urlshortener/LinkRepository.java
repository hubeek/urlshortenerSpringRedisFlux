package nl.appall.urlshortener;

import reactor.core.publisher.Mono;

public interface LinkRepository {
    Mono<Link> save(Link link);

    Mono<Link> findByKey(String key);
}
