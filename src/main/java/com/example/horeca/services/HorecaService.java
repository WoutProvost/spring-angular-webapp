package com.example.horeca.services;

import com.example.horeca.domain.Horeca;
import com.example.horeca.persistence.HorecaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HorecaService {
	
	@Autowired
	private HorecaRepository repository;

	public void save(Horeca horeca) {
        repository.save(horeca);
    }

	public Page<Horeca> getAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public void addScore(long id, byte score) {
		Optional<Horeca> oh = repository.findById(id);

		if(oh.isPresent()) {
			Horeca h = oh.get();

			h.addScore(score);
			repository.save(h);
		}
	}
}