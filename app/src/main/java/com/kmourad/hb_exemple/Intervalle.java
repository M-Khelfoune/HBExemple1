package com.kmourad.hb_exemple;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Intervalle {
    // Attributes
    private int inf;
    private int sup;
    // Operations
    public Intervalle(int inf, int sup) throws IOExceptionIntervalle {
        try {
            this.inf = inf;
            this.sup = sup;
            if (inf > sup) {
//            this.inf = sup;
//            this.sup = inf;
                throw new IOExceptionIntervalle("try / inf doit etre < sup");
            }
        } catch (IOExceptionIntervalle e) {
            throw new IOExceptionIntervalle("catch / inf doit etre < sup", e);
        }
    }

    public int getBorneInf(){
        return this.inf;
    }

    public  int getBorneSup(){
        return this.sup;
    }

    public boolean contient(int x){
        return (x>=inf) && (x<=sup);
    }

    public boolean contient(Intervalle i){
        return (this.inf<=i.inf) && (this.sup>=i.sup);
    }

    public boolean estDisjointDe(Intervalle i){
        return !(this.contient(i.inf) || this.contient(i.sup)) ||
               !(i.contient(this.inf) || i.contient(this.sup));
    }

    public boolean intersecte(Intervalle i){
        return !estDisjointDe(i);
    }

    public Intervalle intersection(Intervalle i){
        try {
            Intervalle j = new Intervalle(0, 0);
            if (intersecte(i)) {
                if (i.inf <= this.inf) {
                    j.inf = this.inf;
                } else {
                    j.inf = i.inf;
                }

                if (i.sup >= this.sup) {
                    j.sup = this.sup;
                } else{
                    j.sup = this.sup;
                }

            } else {
                return null;
            }
            return j;
        } catch (IOExceptionIntervalle e){

        } finally {
            return null;
        }
    }

    public Intervalle union(Intervalle i){
        int inf = i.inf;
        int sup = i.sup;
        if (this.inf<i.inf) { inf = this.inf;}
        if (this.inf>i.sup) { sup = this.sup;}
        i.inf = inf;
        i.sup = sup;
        return i;
    }

    public boolean equals(Intervalle i){
        return (this.inf==i.inf) && (this.sup==i.sup);
    }

    public String toString(){
        return "("+this.inf+", "+this.sup+")";
    }

}
