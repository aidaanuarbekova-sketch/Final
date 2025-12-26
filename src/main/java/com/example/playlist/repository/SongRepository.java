package com.example.playlist.repository;

import com.example.playlist.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository  extends JpaRepository<Song, Long> {
}