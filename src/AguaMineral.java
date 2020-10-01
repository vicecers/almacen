/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vicec
 */
public class AguaMineral extends Bebida {

    private String manantial;

    public AguaMineral(String manantial, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public String toString() {
        return "AguaMineral{" + "manantial=" + manantial + '}';
    }

}
