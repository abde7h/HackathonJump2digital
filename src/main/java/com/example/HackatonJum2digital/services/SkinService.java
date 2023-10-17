package com.example.HackatonJum2digital.services;

import com.example.HackatonJum2digital.models.Skin;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SkinService {
    public List<Skin> leerSkinsDesdeJSON(String archivoJSON) {
        List<Skin> skins = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            skins = objectMapper.readValue(new File(archivoJSON), new TypeReference<List<Skin>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return skins;
    }
}
