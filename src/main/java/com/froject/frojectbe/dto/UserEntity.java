package com.froject.frojectbe.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "user_entity")
public class UserEntity {
    @Id
    String userId;
    String token;
    String username;
    String password;
    String name;
    String univ;
    String major;
}
