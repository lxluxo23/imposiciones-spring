package lxdeveloper.monsalvecespedes.imposiciones.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double monto;
    private LocalDateTime fecha_pago;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Pago(Double monto, LocalDateTime fecha_pago, Cliente cliente) {
        this.monto = monto;
        this.fecha_pago = fecha_pago;
        this.cliente = cliente;
    }

    public Pago() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDateTime fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
