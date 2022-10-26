package com.github.bzalyaliev.adboard.service;

import com.github.bzalyaliev.adboard.repository.entity.AdsEntity;

import java.util.Optional;

public interface AdsService {
    AdsEntity createAd(AdsEntity adsEntity);

    Optional<AdsEntity> getAdById(Long adId);

    Iterable<AdsEntity> getAdsByCategory(String category);

    Iterable<AdsEntity> getAds();

    void updateAd(Long adId, AdsEntity adsEntity);

    void deleteAdById(Long adId);

    void deleteAds();
}

