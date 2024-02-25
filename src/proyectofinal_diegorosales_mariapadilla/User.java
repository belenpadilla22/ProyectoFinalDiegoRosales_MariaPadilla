
package proyectofinal_diegorosales_mariapadilla;

public class User {// segunda clase
    private String usuario,password;
    private int cofres,cartas;
    
    // constructores

    public User() {
    }

    public User(String usuario, String password, int cofres, int cartas) {
        this.usuario = usuario;
        this.password = password;
        this.cofres = cofres;
        this.cartas = cartas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCofres() {
        return cofres;
    }

    public void setCofres(int cofres) {
        this.cofres = cofres;
    }

    public int getCartas() {
        return cartas;
    }

    public void setCartas(int cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "User{" + "usuario=" + usuario + ", password=" + password + ", cofres=" + cofres + ", cartas=" + cartas + '}';
    }
    
    
    
    
}
