package com.user.service.UserService.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="micro_users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @Column(name="ID")
    private String userId;

    @Column(name="NAME")
    private String name;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ABOUT")
    private String about;

    //transient - not saved in database
    @Transient
    private List<Rating> ratings= new ArrayList<>();

}
