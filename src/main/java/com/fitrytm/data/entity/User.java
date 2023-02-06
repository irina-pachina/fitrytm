package com.fitrytm.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fitrytm.data.Role;
import org.hibernate.annotations.Type;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @NotEmpty
    private String username;

    @NotEmpty
    @JsonIgnore
    private String password;

    @NotEmpty
    @Email
    private String email;

    @Enumerated(EnumType.STRING)
    //@ElementCollection(fetch = FetchType.EAGER)
    private Role role;

    @Lob
    @Type(type = "org.hibernate.type.ImageType")
    @Column(length = 1000000)
    private byte[] profilePicture;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public byte[] getProfilePicture() {
        return profilePicture;
    }
    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

}
