package com.example.playlist.mapper;

import com.example.playlist.dto.PlaylistDto;
import com.example.playlist.model.Playlist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlaylistMapper {
    @Mapping(target = "nameDto", source = "name")
    @Mapping(target = "descriptionDto", source = "description")
    PlaylistDto toDto(Playlist playlist);

    @Mapping(target = "name", source = "nameDto")
    @Mapping(target = "description", source = "descriptionDto")
    Playlist toEntity(PlaylistDto playlistDto);

    List<PlaylistDto> toDtoList(List<Playlist> playlists);
}