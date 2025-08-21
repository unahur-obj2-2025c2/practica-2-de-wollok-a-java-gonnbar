package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.*;

/**
 * Seguridad
 */
public class Seguridad extends Dron {
  
  public Seguridad(Integer autonomia, Integer procesamiento, Mision mision) {
    super(autonomia,procesamiento,mision);
  }
  
  @Override
  protected Boolean esAvanzadoSegunTipo() {
    return false;
  }

  //@Override
  //protected Boolean esAvanzadoSegunMision(Dron dron) {
    //return dron.getAutonomia() > 50;
  //}
  
}
