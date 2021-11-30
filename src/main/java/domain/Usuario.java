package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user;
    private String senha;
    private TipoUsuario tipoUsuario;

    public Usuario() {}

    public Usuario(String user, String senha, TipoUsuario tipoUsuario) {
        this.user = user;
        this.senha = senha;
    }
}
