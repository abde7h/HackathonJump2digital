package com.example.HackatonJum2digital.controllers;

import com.example.HackatonJum2digital.interfaces.SkinService;
import com.example.HackatonJum2digital.models.Skin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skins")
public class SkinController {
    private final SkinService skinService;

    @Autowired
    public SkinController(SkinService skinService) {
        this.skinService = skinService;
    }

    @GetMapping("/available")
    public List<Skin> getAvailableSkins() {
        // Obtiene la lista de skins disponibles llamando al servicio.
        List<Skin> availableSkins = skinService.getAvailableSkins();
        return availableSkins;
    }

    @PostMapping("/buy")
    public Skin buySkin(@RequestBody Skin skin) {
        // Compra una nueva skin y la guarda en la base de datos llamando al servicio.
        Skin purchasedSkin = skinService.buySkin(skin);
        return purchasedSkin;
    }

    @GetMapping("/myskins")
    public List<Skin> getMySkins() {
        // Obtiene la lista de skins del usuario autenticado llamando al servicio.
        List<Skin> mySkins = skinService.getMySkins();
        return mySkins;
    }

    @PutMapping("/color/{id}")
    public Skin updateSkinColor(@PathVariable long id, @RequestBody String newColor) {
        // Actualiza el color de una skin comprada llamando al servicio.
        Skin updatedSkin = skinService.updateSkinColor(id, newColor);
        return updatedSkin;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkin(@PathVariable long id) {
        // Elimina una skin comprada llamando al servicio.
        skinService.deleteSkin(id);
    }

    @GetMapping("/getskin/{id}")
    public Skin getSkinById(@PathVariable long id) {
        // Obtiene una skin por su ID llamando al servicio.
        Skin skin = skinService.getSkinById(id);
        return skin;
    }
}