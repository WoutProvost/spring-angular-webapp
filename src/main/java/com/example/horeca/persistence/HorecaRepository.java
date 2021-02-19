package com.example.horeca.persistence;

import com.example.horeca.domain.Horeca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HorecaRepository extends PagingAndSortingRepository<Horeca, Long> {

	Page<Horeca> findByNaamContainingIgnoreCase(String naam, Pageable pageable);
	Page<Horeca> findByBrancheContainingIgnoreCase(String branche, Pageable pageable);
	Page<Horeca> findByWinkelgebiedContainingIgnoreCase(String winkelgebied, Pageable pageable);
}