package nl.appall.urlshortener;

import lombok.Value;

@Value
public class Link {
    String originalLink;
    String key;
}
