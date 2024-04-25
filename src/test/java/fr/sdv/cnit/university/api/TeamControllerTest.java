import fr.sdv.cnit.university.api.controller.TeamController;
import fr.sdv.cnit.university.api.dto.TeamDto;
import fr.sdv.cnit.university.api.service.TeamService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

public class TeamControllerTest {

    private TeamController TeamController;

    @Mock
    private TeamService TeamService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        TeamController = new TeamController(TeamService);
        RestAssuredMockMvc.standaloneSetup(TeamController);
    }

    @Test
    public void testGetAllTeams() {
        given()
            .when()
            .get("/teams")
            .then()
            .statusCode(200);
    }

    @Test
    public void testGetTeamById() {
        long id = 1L;
        given()
            .when()
            .get("/teams/{id}", id)
            .then()
            .statusCode(200);
    }

    @Test
    public void testCreateTeam() {
        TeamDto teamDto = new TeamDto(1L, "Team", "Slogan");
        given()
            .contentType("application/json")
            .body(teamDto)
            .when()
            .post("/teams")
            .then()
            .statusCode(200);
    }

    @Test
    public void testUpdateTeam() {
        long id = 1L;
        TeamDto teamDto = new TeamDto(1L, "Team", "Slogan");
        given()
            .contentType("application/json")
            .body(teamDto)
            .when()
            .put("/teams/{id}", id)
            .then()
            .statusCode(200);
    }

    @Test
    public void testDeleteTeam() {
        long id = 1L;
        given()
            .when()
            .delete("/teams/{id}", id)
            .then()
            .statusCode(200);
    }

    @Test
    public void testCreateTeamInvalidSlogan() {
        // Mocking the service to throw TeamInvalidException
        doThrow(new TeamInvalidException("Invalid Slogan")).when(teamService).addTeam(any());

        TeamDto teamDto = new TeamDto(1L, "Team", ""); // Empty slogan
        given()
            .contentType("application/json")
            .body(teamDto)
            .when()
            .post("/teams")
            .then()
            .statusCode(400);
    }
}
