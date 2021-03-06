package edu.umss.fcyt.tourismapp.paquete_turistico;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Itinerario implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String nombre;
    
    @NotNull
    private Date fechaInicio;
    
    @NotNull
    private Date fechaFin;
    
    @NotNull
    private Time horaInicio;
    
    @NotNull
    private Time horaFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
