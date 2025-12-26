package com.example.playlist.service.serviceImpl;

import com.example.playlist.dto.PlaylistDto;
import com.example.playlist.mapper.PlaylistMapper;
import com.example.playlist.model.Playlist;
import com.example.playlist.repository.PlaylistRepository;
import com.example.playlist.service.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl implements PlaylistService {
    private final PlaylistMapper playlistMapper;
    private final PlaylistRepository playlistRepository;

    @Override
    public List<PlaylistDto> getAll() {
        return playlistMapper.toDtoList(playlistRepository.findAll());
    }

    @Override
    public PlaylistDto getById(Long id) {
        return playlistMapper.toDto(playlistRepository.findById(id).orElse(null));
    }

    @Override
    public PlaylistDto add(PlaylistDto playlistDto) {
        return playlistMapper.toDto(playlistRepository.save(playlistMapper.toEntity(playlistDto)));
    }

    @Override
    public PlaylistDto update(Long id, PlaylistDto playlistDto) {
        Playlist dto = playlistMapper.toEntity(playlistDto);
        Playlist ent = playlistRepository.findById(id).orElse(null);
        ent.setName(dto.getName());
        ent.setDescription(dto.getDescription());
        return playlistMapper.toDto(playlistRepository.save(ent));
    }

    @Override
    public Boolean delete(Long id) {
        playlistRepository.deleteById(id);
        Playlist playlist = playlistRepository.findById(id).orElse(null);
        if(Objects.isNull(playlist)){
            return true;
        }
        return false;
    }
}