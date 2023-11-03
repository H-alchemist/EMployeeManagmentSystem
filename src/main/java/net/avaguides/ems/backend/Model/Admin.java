package net.avaguides.ems.backend.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Admin")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {


    @Id
    @Column(name="email")
    private Long email;


    @Column (name = "password")
    private  String password;




}
