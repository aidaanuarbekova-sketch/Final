package com.example.playlist.mapper;

import com.example.playlist.dto.ArtistDto;
import com.example.playlist.model.Artist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArtistMapper {
    @Mapping(target = "nameDto", source = "name")
    @Mapping(target = "genreDto", source = "genre")
    ArtistDto toDto(Artist artist);

    @Mapping(target = "name", source = "nameDto")
    @Mapping(target = "genre", source = "genreDto")
    Artist toEntity(ArtistDto artistDto);

    List<ArtistDto> toDtoList(List<Artist> artists);
}