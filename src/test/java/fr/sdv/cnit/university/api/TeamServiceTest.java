package fr.sdv.cnit.university.api;

import fr.sdv.cnit.university.api.entity.Team;
import fr.sdv.cnit.university.api.repository.TeamRepository;
import fr.sdv.cnit.university.api.service.TeamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class TeamServiceTest {

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamService teamService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnAllTeams() {
        // Given
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Team 1", "Slogan 1"));
        teams.add(new Team("Team 2", "Slogan 2"));
        when(teamRepository.findAll()).thenReturn(teams);

        // When
        List<Team> result = teamService.getAllTeams();

        // Then
        assertThat(result).isNotNull().hasSize(2);
        verify(teamRepository, times(1)).findAll();
    }

    @Test
    public void shouldReturnTheExpectedTeam_whenGetTeamByExistingId() {
        // Given
        Long id = 1L;
        Team team = new Team("Team 1", "Slogan 1");
        when(teamRepository.findById(id)).thenReturn(Optional.of(team));

        // When
        Optional<Team> result = teamService.getTeamById(id);

        // Then
        assertThat(result).isPresent().contains(team);
        verify(teamRepository, times(1)).findById(id);
    }

    // Add other test methods for other service methods
}
