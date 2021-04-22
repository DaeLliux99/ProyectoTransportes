

package modelos;

import java.io.Serializable;


public class Usuario implements Comparable<Usuario>, Serializable{
    private String username;
    private String password;
    private boolean managent;

    public Usuario(String username, String password, boolean managent) {
        this.username = username;
        this.password = password;
        this.managent = managent;
    }

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

    public boolean isManagent() {
        return managent;
    }

    public void setManagent(boolean managent) {
        this.managent = managent;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", password=" + password + ", managent=" + managent + '}';
    }

    @Override
    public int compareTo(Usuario o) {
        if (this.username.equals(o.username)) {
            return 0;
        }
        return -1;
    }
  
}
