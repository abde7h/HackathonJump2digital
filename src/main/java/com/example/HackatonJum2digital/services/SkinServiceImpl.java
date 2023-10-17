package com.example.HackatonJum2digital.services;

import com.example.HackatonJum2digital.interfaces.SkinRepository;
import com.example.HackatonJum2digital.interfaces.SkinService;
import com.example.HackatonJum2digital.models.Skin;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SkinServiceImpl implements SkinService {

    private final SkinRepository skinRepository;

    public SkinServiceImpl(SkinRepository skinRepository) {
        this.skinRepository = skinRepository;
    }

    /**
     * Obtiene una lista de todas las skins disponibles para comprar.
     *
     * @return Una lista de skins disponibles.
     */
    @Override
    public List<Skin> getAvailableSkins() {
        return skinRepository.findByDisponibilidadTrue();
    }

    /**
     * Obtiene una lista de todas las skins.
     *
     * @return Una lista de todas las skins.
     */
    @Override
    public List<Skin> getAllSkins() {
        return skinRepository.findAll();
    }
}