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
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeImovel;
    private boolean disponibilidade;
    private String cidade;
    private TipoImovel tipoImovel;
    private float precoDiaria;
    private String locatario;

    public boolean isDisponibilidade() {
        return disponibilidade;
    }
}
