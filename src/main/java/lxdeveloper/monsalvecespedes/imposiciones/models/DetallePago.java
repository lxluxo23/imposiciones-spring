package lxdeveloper.monsalvecespedes.imposiciones.models;

import jakarta.persistence.*;

@Entity
public class DetallePago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;
    @ManyToOne
    @JoinColumn(name = "imposicion_id")
    private Imposicion imposicion;
    private int monto;


    public DetallePago(Pago pago, Imposicion imposicion, int monto) {
        this.pago = pago;
        this.imposicion = imposicion;
        this.monto = monto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Imposicion getImposicion() {
        return imposicion;
    }

    public void setImposicion(Imposicion imposicion) {
        this.imposicion = imposicion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
