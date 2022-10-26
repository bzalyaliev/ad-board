package com.github.bzalyaliev.adboard.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Ad {
    String title;
    String description;
    String contacts;
    String picture;
    String category;

}
