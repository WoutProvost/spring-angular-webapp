package com.example.horeca.persistence;

import com.example.horeca.domain.Horeca;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HorecaRepository extends PagingAndSortingRepository<Horeca, Long> {
}