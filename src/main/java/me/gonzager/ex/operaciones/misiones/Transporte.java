package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

/**
 * Transporte
 */
public class Transporte implements Mision {
  private static Transporte instance = new Transporte();

  public static Transporte getInstance(){
    return instance;
  }

  @Override
  public Integer extraEficienciaOperativa() {
    return 100; 
  }
  
  @Override
  public Boolean esAvanzadoSegunMision(Dron dron) {
    return dron.getAutonomia() > 50;
  }
}
