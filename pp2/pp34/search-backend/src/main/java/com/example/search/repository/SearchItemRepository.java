package com.example.search.repository;

import com.example.search.model.SearchItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchItemRepository extends JpaRepository<SearchItem, Long> {
    List<SearchItem> findByNameContainingIgnoreCase(String name);
}