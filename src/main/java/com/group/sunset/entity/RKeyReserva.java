/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.util.ArrayList;

/**
 *
 * @author jdelgado
 */
public class RKeyReserva {
       String nohotel;
       String email;
       ArrayList<KeyReserva> keyreserva;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public ArrayList<KeyReserva> getKeyreserva() {
        return keyreserva;
    }

    public void setKeyreserva(ArrayList<KeyReserva> keyreserva) {
        this.keyreserva = keyreserva;
    }

    public String getNohotel() {
        return nohotel;
    }

    public void setNohotel(String nohotel) {
        this.nohotel = nohotel;
    }


       
       
      
    
}
