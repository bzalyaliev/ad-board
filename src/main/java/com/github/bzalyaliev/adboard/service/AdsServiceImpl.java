package com.github.bzalyaliev.adboard.service;

import com.github.bzalyaliev.adboard.exception.NotFoundException;
import com.github.bzalyaliev.adboard.repository.AdsRepository;
import com.github.bzalyaliev.adboard.repository.entity.AdsEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdsServiceImpl implements AdsService {
    private final AdsRepository adsRepository;

    @Override
    public AdsEntity createAd(AdsEntity adsEntity) {
        return adsRepository.save(adsEntity);
    }

    @Override
    public AdsEntity getAdById(Long adId) {
        return adsRepository.findById(adId).orElseThrow(() -> new NotFoundException(String.format("No ad with id %s is available", adId)));
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
        AdsEntity existingAd = adsRepository.findById(adId).orElseThrow(() -> new NotFoundException(String.format("No ad with id %s is available", adId)));
                existingAd.setTitle(adsEntity.getTitle());
                existingAd.setDescription(adsEntity.getDescription());
                existingAd.setContacts((adsEntity.getContacts()));
                existingAd.setPicture(adsEntity.getPicture());
                existingAd.setCategory(adsEntity.getCategory());
        adsRepository.save(existingAd);
    }

    @Override
    public void deleteAdById(Long adId) {
        adsRepository.findById(adId).orElseThrow(() -> new NotFoundException(String.format("No ad with id %s is available", adId)));
        adsRepository.deleteById(adId);
    }

    @Override
    public void deleteAds() {
        adsRepository.deleteAll();
    }
}
