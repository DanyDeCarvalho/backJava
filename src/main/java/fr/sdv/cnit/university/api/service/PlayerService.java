package fr.sdv.cnit.university.api.service;
import fr.sdv.cnit.university.api.dto.PlayerDto;
import fr.sdv.cnit.university.api.entity.Player;
import fr.sdv.cnit.university.api.exception.TeamInvalidException;
import fr.sdv.cnit.university.api.mapper.PlayerMapper;
import fr.sdv.cnit.university.api.repository.PlayerRepository;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

        public PlayerService(
            PlayerRepository playerRepository
    ) {
        this.playerRepository = playerRepository;
    }

    public Iterable<PlayerDto> getAllPlayers() {
        return playerRepository.findAll()
                .stream()
                .map(PlayerMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public PlayerDto getPlayerById(Long id) { 
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pas trouve " + id));

        return PlayerMapper.mapToDto(player);
    }

    public PlayerDto savePlayer(PlayerDto playerDto) throws TeamInvalidException {

        Player player = playerRepository.save(PlayerMapper.mapToEntity(playerDto));

        return PlayerMapper.mapToDto(player);
    }

        public PlayerDto updatePlayer(Long id, PlayerDto playerDto) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("pAS TROUVER: " + id));

                player.setName(playerDto.getName());
                player.setNumero(playerDto.getNumero());
                player.setPosition(playerDto.getPosition());

        Player player2 = playerRepository.save(player);

        return PlayerMapper.mapToDto(player2);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}