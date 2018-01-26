package co.ceiba.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import co.ceiba.entity.VehiculoEntity;

public interface RepositorioVehiculo extends JpaRepository<VehiculoEntity, Serializable> {

}
