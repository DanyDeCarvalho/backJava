package fr.sdv.cnit.university.api.controller;

import fr.sdv.cnit.university.api.dto.PlayerDto;
import org.springframework.web.bind.annotation.*;
import fr.sdv.cnit.university.api.service.PlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(value = "/getPlayers", method = RequestMethod.GET)
    public Iterable<PlayerDto> getPlayers() {
        return playerService.getAllPlayers();
    }

    @RequestMapping(value = "/getPlayer/{id}", method = RequestMethod.GET)
    public PlayerDto getPlayer(
            @PathVariable("id") Long id
    ) {
        return playerService.getPlayerById(id);
    }



    @RequestMapping(value = "/createPlayer", method = RequestMethod.POST)
    public PlayerDto createPlayer(
            @RequestBody PlayerDto player
    ) {
        return playerService.savePlayer(player);
    }



    @RequestMapping(value = "/editPlayer/{id}", method = RequestMethod.PATCH)
    public PlayerDto editPlayer(
            @PathVariable("id") Long id,
            @RequestBody PlayerDto player
    ) {
        return playerService.updatePlayer(id, player);
    }

    @RequestMapping(value = "/deletePlayer/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(
            @PathVariable("id") Long id
    ) {
        playerService.deletePlayer(id);
    }
}