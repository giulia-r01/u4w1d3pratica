package Esercizio3;

import java.time.LocalDate;

public class Cliente {
    private String codCliente;
    private String nomeCognome;
    private String email;
    private LocalDate data;

    public Cliente(String codCliente, String nomeCognome, String email, LocalDate data) {
        this.codCliente = codCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.data = data;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente='" + codCliente + '\'' +
                ", nomeCognome='" + nomeCognome + '\'' +
                ", email='" + email + '\'' +
                ", data=" + data +
                '}';
    }
}
