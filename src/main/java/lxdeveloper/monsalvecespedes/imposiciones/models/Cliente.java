package lxdeveloper.monsalvecespedes.imposiciones.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rut;
    private String nombre;
    private String giro;
    private String direccion;
    private String comuna;
    private String ciudad;
    private String rutRepresentante;
    private String nombreRepresentante;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String giro, String direccion, String comuna, String ciudad, String rutRepresentante, String nombreRepresentante) {
        this.rut = rut;
        this.nombre = nombre;
        this.giro = giro;
        this.direccion = direccion;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.rutRepresentante = rutRepresentante;
        this.nombreRepresentante = nombreRepresentante;
    }

    public Long getId() {
        return id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRutRepresentante() {
        return rutRepresentante;
    }

    public void setRutRepresentante(String rutRepresentante) {
        this.rutRepresentante = rutRepresentante;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }
}
