package com.ahmed.miniprojet1.repos;

import com.ahmed.miniprojet1.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
