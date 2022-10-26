package com.github.bzalyaliev.adboard.controller;

import com.github.bzalyaliev.adboard.repository.entity.AdsEntity;
import com.github.bzalyaliev.adboard.service.AdsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AdsController {

    private final AdsServiceImpl adsService;

    @GetMapping("/ads")
    public Iterable<AdsEntity> getAllAds() {
        return adsService.getAds();
    }

    @GetMapping("/ad/{id}")
    public Optional<AdsEntity> getAdById(@PathVariable("id") long adId) {
        return adsService.getAdById(adId);
    }

    @GetMapping("/ads/category/{name}")
    public Iterable<AdsEntity> getAdsByCategory(@PathVariable("name") String category) {
        return adsService.getAdsByCategory(category);
    }

    @PostMapping("/ad")
    @ResponseStatus(HttpStatus.CREATED)
    public AdsEntity createAd(@RequestBody AdsEntity adsEntity) {
        return adsService.createAd(adsEntity);
    }

    @PatchMapping("/ad/{id}")
    public void updateAd(@PathVariable("id") Long adId, @RequestBody AdsEntity adsEntity) {
        adsService.updateAd(adId, adsEntity);
    }

    @DeleteMapping("/ad/{id}")
    void deleteAdById(@PathVariable("id") Long adId) {
        adsService.deleteAdById(adId);
    }

    @DeleteMapping("/ads")
    void deleteAds() {
        adsService.deleteAds();
    }

}

