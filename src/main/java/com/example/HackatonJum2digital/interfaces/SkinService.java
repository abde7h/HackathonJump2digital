package com.example.HackatonJum2digital.interfaces;

import com.example.HackatonJum2digital.models.Skin;

import java.util.List;

public interface SkinService {
    List<Skin> getAllSkins();
    List<Skin> getAvailableSkins();
    Skin buySkin(Skin skin);
    List<Skin> getMySkins();
    Skin updateSkinColor(long id, String newColor);
    void deleteSkin(long id);
    Skin getSkinById(long id);
}
