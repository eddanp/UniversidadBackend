package com.eddanp.universidad.modelo.entidades.enumeradores;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Carrera implements Serializable {
    private Integer id;
    private String nombre;
    private Integer cantidadMaterias;
    private Integer canidadAnios;
    private LocalDateTime fechaAlta;
    private LocalDateTime fechaModificacion;

    public Carrera() {
    }

    public Carrera(Integer id, String nombre, Integer cantidadMaterias, Integer canidadAnios) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadMaterias = cantidadMaterias;
        this.canidadAnios = canidadAnios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(Integer cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public Integer getCanidadAnios() {
        return canidadAnios;
    }

    public void setCanidadAnios(Integer canidadAnios) {
        this.canidadAnios = canidadAnios;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidadMaterias=" + cantidadMaterias +
                ", canidadAnios=" + canidadAnios +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrera carrera = (Carrera) o;
        return id.equals(carrera.id) && nombre.equals(carrera.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
