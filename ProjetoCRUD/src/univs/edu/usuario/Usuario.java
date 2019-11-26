
package univs.edu.usuario;
import javax.persistence.Entity;
 import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private int idUsuario;
    @Column(length = 100, nullable = false)
    private String nomeUsuario;
    @Column(length = 100, nullable = false)
    private String login;
    @Column(length = 100, nullable = false)
    private String senha;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
