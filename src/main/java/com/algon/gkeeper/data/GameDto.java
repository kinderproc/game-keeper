package com.algon.gkeeper.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

public record GameDto(
        UUID gameId,
        String name,
        String genre,
        List<Platform> platforms,
        List<GameMode> gameModes,
        Boolean isOnline,
        Long downloadSizeMB) {

}
