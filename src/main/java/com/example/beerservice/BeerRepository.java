package com.example.beerservice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface BeerRepository extends JpaRepository<Beer, Long> {
	Page<Beer> findByNameIgnoreCaseContaining(@Param("name") String name, Pageable pageable);
	Page<Beer> findByStyleIgnoreCaseContaining(@Param("style") String style, Pageable pageable);
	Page<Beer> findByHopsIgnoreCaseContaining(@Param("hops") String hops, Pageable pageable);
	Page<Beer> findByMaltIgnoreCaseContaining(@Param("malt") String malt, Pageable pageable);
	Page<Beer> findByYeastIgnoreCaseContaining(@Param("yeast") String yeast, Pageable pageable);
}
