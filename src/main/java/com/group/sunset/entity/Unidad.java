/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.util.Date;




public class Unidad {


   private int    numSolicitud = 0;
   private int    iClub = 0;
   private String sUnidad = "";
   private int    iCantidad = 0;
   private String sTipoSemana = "";
   private String sConfirmacion = "";
   private Date   dCheckin = null;
   private Date   dCheckout = null;
   private String sConfirmacion2 = "";

  public Unidad() {
  }
   public int getnumSolicitud(){
          return numSolicitud;
   }

   public void setnumSolicitud(int anumSolicitud){
          numSolicitud = anumSolicitud;
   }

   public int getClub(){
          return iClub;
   }

   public void setClub(int aClub){
          iClub = aClub;
   }

   public String getUnidad(){
      return sUnidad;
   }

   public void setUnidad(String aUnidad){
      sUnidad = aUnidad;
   }

   public int getCantidad(){
      return iCantidad;
   }

   public void setCantidad(int aCantidad){
     iCantidad = aCantidad;
   }

   public String getTipoSemana(){
      return sTipoSemana;
   }

   public void setTipoSemana(String aTipoSemana){
      sTipoSemana = aTipoSemana;
   }



   public String getConfirmacion(){
      return sConfirmacion;
   }
   public void setConfirmacion(String aConfirmacion){
      sConfirmacion = aConfirmacion;
   }

     public Date getCheckin()
   {
      return dCheckin;
   }
   public void setCheckin(Date aCheckin)
   {
      dCheckin = aCheckin;
   }

   public Date getCheckout()
   {
      return dCheckout;
   }
   public void setCheckout(Date aCheckout)
   {
      dCheckout = aCheckout;
   }
   public String getConfirmacion2(){
      return sConfirmacion2;
   }
   public void setConfirmacion2(String aConfirmacion2){
      sConfirmacion2 = aConfirmacion2;
   }

}