package lxdeveloper.monsalvecespedes.imposiciones.dtos;

import lombok.Getter;
import lombok.Setter;
import lxdeveloper.monsalvecespedes.imposiciones.models.Cliente;


public class ClienteDTO {
    private Long id;
    private String rut;
    private String nombre;
    private String giro;
    private String direccion;
    private String comuna;
    private String ciudad;
    private String rutRepresentante;
    private String nombreRepresentante;

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.rut = cliente.getRut();
        this.nombre = cliente.getNombre();
        this.giro = cliente.getGiro();
        this.direccion = cliente.getDireccion();
        this.comuna = cliente.getComuna();
        this.ciudad = cliente.getCiudad();
        this.rutRepresentante = cliente.getRutRepresentante();
        this.nombreRepresentante = cliente.getNombreRepresentante();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
