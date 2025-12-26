package com.example.playlist.service;

import com.example.playlist.dto.PlaylistDto;
import com.example.playlist.model.Playlist;

import java.util.List;

public interface PlaylistService {
    List<PlaylistDto> getAll();
    PlaylistDto getById(Long id);
    PlaylistDto add(PlaylistDto playlistDto);
    PlaylistDto update(Long id, PlaylistDto playlistDto);
    Boolean delete(Long id);
}