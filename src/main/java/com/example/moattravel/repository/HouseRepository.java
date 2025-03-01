package com.example.moattravel.repository;

import com.example.moattravel.entity.House;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Integer> {
    public Page<House> findByNameLike(String keyword, Pageable pageable);
}
