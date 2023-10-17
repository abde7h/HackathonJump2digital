package com.example.HackatonJum2digital.interfaces;


import com.example.HackatonJum2digital.models.Skin;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SkinRepository extends JpaRepository<Skin, Long> {
    List<Skin> findByDisponibilidadTrue();
}
