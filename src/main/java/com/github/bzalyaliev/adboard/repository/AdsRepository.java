package com.github.bzalyaliev.adboard.repository;

import com.github.bzalyaliev.adboard.repository.entity.AdsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdsRepository extends JpaRepository<AdsEntity, Long> {
    Iterable<AdsEntity> findAllByCategory(String category);

    Iterable<AdsEntity> findAllByTitle(String title);
}
