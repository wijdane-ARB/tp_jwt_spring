package ma.enset.security.tp_jwt_spring.dto;

public record LoginRequest(
        String email,
        String password
) {
}
