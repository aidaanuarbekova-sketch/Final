package com.example.playlist.service;

import com.example.playlist.dto.SongDto;
import com.example.playlist.model.Song;

import java.util.List;

public interface SongService {
    List<SongDto> getAll();
    SongDto getById(Long id);
    SongDto add(SongDto songDto);
    SongDto update(Long id, SongDto songDto);
    Boolean delete(Long id);
}