package br.com.animeapi.services;

import br.com.animeapi.domain.dto.request.AnimeRequestDto;
import br.com.animeapi.domain.dto.response.AnimeResponseDto;
import br.com.animeapi.domain.entitites.Anime;
import br.com.animeapi.repositories.AnimeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;
    @Autowired
    private ModelMapper modelMapper;


    public AnimeResponseDto createAnime(AnimeRequestDto anime) {
        Anime entity = modelMapper.map(anime, Anime.class);
        entity.setCreatedAt(LocalDateTime.now());
        animeRepository.save(entity);
        return modelMapper.map(entity, AnimeResponseDto.class);
    }

    public Page<AnimeResponseDto> getAnimes(Pageable page) {
        return animeRepository.findAll(page).map(anime -> modelMapper.map(anime, AnimeResponseDto.class));
    }
}