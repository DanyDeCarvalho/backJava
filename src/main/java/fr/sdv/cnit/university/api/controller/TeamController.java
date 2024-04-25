package fr.sdv.cnit.university.api.controller;

import fr.sdv.cnit.university.api.dto.TeamDto;
import org.springframework.web.bind.annotation.*;
import fr.sdv.cnit.university.api.service.TeamService;

@RestController
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping(value = "/getTeams", method = RequestMethod.GET)
    public Iterable<TeamDto> getTeams() {
        return teamService.getTeams();
    }

    @RequestMapping(value = "/getTeam/{id}", method = RequestMethod.GET)
    public TeamDto getTeam(
            @PathVariable("id") Long id
    ) {
        return teamService.getTeam(id);
    }



    @RequestMapping(value = "/createTeam", method = RequestMethod.POST)
    public TeamDto createTeam(
            @RequestBody TeamDto team
    ) {
        return teamService.createTeam(team);
    }



    @RequestMapping(value = "/editTeam/{id}", method = RequestMethod.PATCH)
    public TeamDto editTeam(
            @PathVariable("id") Long id,
            @RequestBody TeamDto team
    ) {
        return teamService.editTeam(id, team);
    }

    @RequestMapping(value = "/deleteTeam/{id}", method = RequestMethod.DELETE)
    public void deleteTeam(
            @PathVariable("id") Long id
    ) {
        teamService.deleteTeam(id);
    }
}