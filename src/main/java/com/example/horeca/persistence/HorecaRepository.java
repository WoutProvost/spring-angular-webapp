package com.example.horeca.persistence;

import com.example.horeca.domain.Horeca;
import org.springframework.data.repository.CrudRepository;

public interface HorecaRepository extends CrudRepository<Horeca, Long> {
}