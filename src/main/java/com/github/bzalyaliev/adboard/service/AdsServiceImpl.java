package com.github.bzalyaliev.adboard.service;

import com.github.bzalyaliev.adboard.repository.AdsRepository;
import com.github.bzalyaliev.adboard.repository.entity.AdsEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdsServiceImpl implements AdsService {
    private final AdsRepository adsRepository;

    @Override
    public AdsEntity createAd(AdsEntity adsEntity) {
        return adsRepository.save(adsEntity);
    }

    @Override
    public Optional<AdsEntity> getAdById(Long adId) {
        return adsRepository.findById(adId);
    }

    @Override
    public Iterable<AdsEntity> getAdsByCategory(String category) {
        return adsRepository.findAllByCategory(category);
    }

    @Override
    public Iterable<AdsEntity> getAds() {
        return adsRepository.findAll();
    }

    @Override
    public void updateAd(Long adId, AdsEntity adsEntity) {
        adsRepository.findById(adId).get()
                .setTitle(adsEntity.getTitle())
                .setDescription(adsEntity.getDescription())
                .setContacts((adsEntity.getContacts()))
                .setPicture(adsEntity.getPicture())
                .setCategory(adsEntity.getCategory());
        adsRepository.save(adsEntity);
    }

    @Override
    public void deleteAdById(Long adId) {
        adsRepository.deleteById(adId);
    }

    @Override
    public void deleteAds() {
        adsRepository.deleteAll();
    }
}
