package fr.sdv.cnit.university.api.dto;
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
    private Long teamId;

}
