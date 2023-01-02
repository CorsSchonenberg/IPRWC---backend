package IPRWC.Webshop.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "User")
public class User {
    @Id
    private Integer id;
    private String email;
    private String password;

}
