/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tool;

/**
 *
 * @author Adez
 */
public class HuespedReserve {
    Integer id;
    Integer idcontrato;
    String numconfirmacion;
    String checkin;
    String checkout;
    String membresia;
    Integer numeroclub;
    String nomhuesped;
    Integer numadultos;
    Integer numninios;
    String idstatus;
    Long numhabitacion;
    String idhuesped;
    String idvip;
    String descvip;
    boolean have10dayscheckin;
    boolean totalhave10dayscheckin;
    boolean probabilityinhouse;

    public HuespedReserve() {
        this.id = 0;
        this.idcontrato = 0;
        this.numconfirmacion = "";
        this.checkin = "";
        this.checkout = "";
        this.membresia = "";
        this.numeroclub = 0;
        this.nomhuesped = "";
        this.numadultos = 0;
        this.numninios = 0;
        this.idstatus = "";
        this.numhabitacion = (long)0.0;
        this.idhuesped = "";
        this.idvip="";
        this.descvip="";
        this.have10dayscheckin = false;
        this.totalhave10dayscheckin = false;
        this.probabilityinhouse = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getNumconfirmacion() {
        return numconfirmacion;
    }

    public void setNumconfirmacion(String numconfirmacion) {
        this.numconfirmacion = numconfirmacion;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public Integer getNumeroclub() {
        return numeroclub;
    }

    public void setNumeroclub(Integer numeroclub) {
        this.numeroclub = numeroclub;
    }

    public String getNomhuesped() {
        return nomhuesped;
    }

    public void setNomhuesped(String nomhuesped) {
        this.nomhuesped = nomhuesped;
    }

    public Integer getNumadultos() {
        return numadultos;
    }

    public void setNumadultos(Integer numadultos) {
        this.numadultos = numadultos;
    }

    public Integer getNumninios() {
        return numninios;
    }

    public void setNumninios(Integer numninios) {
        this.numninios = numninios;
    }

    public String getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(String idstatus) {
        this.idstatus = idstatus;
    }

    public Long getNumhabitacion() {
        return numhabitacion;
    }

    public void setNumhabitacion(Long numhabitacion) {
        this.numhabitacion = numhabitacion;
    }

    public String getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(String idhuesped) {
        this.idhuesped = idhuesped;
    }

    public boolean isHave10dayscheckin() {
        return have10dayscheckin;
    }

    public void setHave10dayscheckin(boolean have10dayscheckin) {
        this.have10dayscheckin = have10dayscheckin;
    }

    public boolean isTotalhave10dayscheckin() {
        return totalhave10dayscheckin;
    }

    public void setTotalhave10dayscheckin(boolean totalhave10dayscheckin) {
        this.totalhave10dayscheckin = totalhave10dayscheckin;
    }

    public boolean isProbabilityinhouse() {
        return probabilityinhouse;
    }

    public void setProbabilityinhouse(boolean probabilityinhouse) {
        this.probabilityinhouse = probabilityinhouse;
    }

    public String getIdvip() {
        return idvip;
    }

    public void setIdvip(String idvip) {
        this.idvip = idvip;
    }

    public String getDescvip() {
        return descvip;
    }

    public void setDescvip(String descvip) {
        this.descvip = descvip;
    }

    
    
    
}