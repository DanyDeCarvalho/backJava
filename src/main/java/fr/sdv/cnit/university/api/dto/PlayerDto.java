package fr.sdv.cnit.university.api.dto;
import fr.sdv.cnit.university.api.entity.Team;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PlayerDto {
    private Long id;
    private String name;
    private Integer numero;
    private String position;
    private Team teamId;

}
