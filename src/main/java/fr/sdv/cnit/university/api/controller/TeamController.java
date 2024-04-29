package fr.sdv.cnit.university.api.controller;

import fr.sdv.cnit.university.api.dto.TeamDto;
import org.springframework.web.bind.annotation.*;
import fr.sdv.cnit.university.api.service.TeamService;

@RestController
@RequestMapping("/api/teams")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<TeamDto> getTeams() {
        return teamService.getTeams();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TeamDto getTeam(
            @PathVariable("id") Long id
    ) {
        return teamService.getTeam(id);
    }



    @RequestMapping( method = RequestMethod.POST)
    public TeamDto createTeam(
            @RequestBody TeamDto team
    ) {
        return teamService.createTeam(team);
    }



    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public TeamDto editTeam(
            @PathVariable("id") Long id,
            @RequestBody TeamDto team
    ) {
        return teamService.editTeam(id, team);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTeam(
            @PathVariable("id") Long id
    ) {
        teamService.deleteTeam(id);
    }
}