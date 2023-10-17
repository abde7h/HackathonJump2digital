package com.example.HackatonJum2digital.controllers;

import com.example.HackatonJum2digital.interfaces.SkinService;
import com.example.HackatonJum2digital.models.Skin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
        return skinService.getAvailableSkins();
    }
}
