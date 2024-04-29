package fr.sdv.cnit.university.api.mapper;
import fr.sdv.cnit.university.api.dto.PlayerDto;
import fr.sdv.cnit.university.api.entity.Player;

public class PlayerMapper {
    public static PlayerDto mapToDto(Player player){
        return PlayerDto.builder()
                .id(player.getId())
                .name(player.getName())
                .numero(player.getNumero())
                .position(player.getPosition())
                .teamId(player.getTeam())
                .build();
    }

    public static Player mapToEntity(PlayerDto playerDto) {
        return Player.builder()
                .id(playerDto.getId())
                .name(playerDto.getName())
                .numero(playerDto.getNumero())
                .position(playerDto.getPosition())
                .team(playerDto.getTeamId())
                .build();
    }
}