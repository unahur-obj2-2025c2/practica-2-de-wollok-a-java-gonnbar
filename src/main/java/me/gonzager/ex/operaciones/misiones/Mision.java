package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.*;
/**
 * Mision
 */
public interface Mision {

  Integer extraEficienciaOperativa();
  Boolean esAvanzadoSegunMision(Dron dron);
}
