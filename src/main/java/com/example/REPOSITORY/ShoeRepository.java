package com.example.REPOSITORY;



import com.example.MODEL.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoeRepository extends JpaRepository<Stock, Long> {
    @Query("SELECT DISTINCT s.categoria FROM Stock s")
    List<String> findDistinctCategories();

}
