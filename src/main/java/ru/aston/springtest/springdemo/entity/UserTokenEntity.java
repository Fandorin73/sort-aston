package ru.aston.springtest.springdemo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.UUID;

/**
 * Entity токена для СББОЛ.
 *
 * @author Andrey
 */

@Entity
@Table(name = "dat_user_token")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTokenEntity implements IEntity {
    @Id
    @Column(name = "id")
    private Long userId;
    @Column(name = "uid_keycloak")
    private UUID keycloakId;
    @Column(name = "access_token")
    private String sberApiAccessToken;
    @Column(name = "refresh_token")
    private String sberApiRefreshToken;
    @Column(name = "refresh_time")
    private Instant refreshTime;
    @Column(name = "expire_time")
    private Instant expireTime;
}
