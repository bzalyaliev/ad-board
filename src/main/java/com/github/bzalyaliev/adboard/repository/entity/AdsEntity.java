package com.github.bzalyaliev.adboard.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "ads")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AdsEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "description", columnDefinition = "text", nullable = false)
    String description;

    @Column(name = "contacts", nullable = false)
    String contacts;

    @Column(name = "picture", nullable = false)
    String picture;

    @Column(name = "category")
    String category;

}
