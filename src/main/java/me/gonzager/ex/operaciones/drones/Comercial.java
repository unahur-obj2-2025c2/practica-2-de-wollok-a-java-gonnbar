package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.*;
public class Comercial extends Dron {
  public Comercial(Integer autonomia, Integer procesamiento, Mision mision) {
    super(autonomia,procesamiento,mision); 
  }
  
  @Override
  protected Boolean esAvanzadoSegunTipo(){
    return false; 
  }

  @Override
  public Integer eficienciaOperativa() {
    return super.eficienciaOperativa() + 15; 
  }


}
