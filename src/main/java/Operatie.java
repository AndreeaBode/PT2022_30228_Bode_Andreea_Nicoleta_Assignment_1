package models;

import java.util.Collections;

public class Operatie {
    public Polinom adunare(Polinom polinom1, Polinom polinom2){
        Monom monomulRezultat = null;
        Polinom p = new Polinom();
        boolean ok = false;

        for (Monom m1 : polinom1.getMonom()) {
            ok = false;
            for (Monom m2 : polinom2.getMonom()) {
                if (m1.getPutere() == m2.getPutere()) {
                    ok = true;
                    monomulRezultat = new Monom(m1.getCoeficient() + m2.getCoeficient(), m1.getPutere());
                    p.getMonom().add(monomulRezultat);
                }
            } if (ok == false)
                p.getMonom().add(m1);
        }
        for (Monom m2 : polinom2.getMonom()) {
            ok = false;
            for (Monom m1 : polinom1.getMonom()) {
                if (m2.getPutere() == m1.getPutere()) {
                    ok = true;
                }
            }
            if (ok == false)
                p.getMonom().add(m2);

        }
        Collections.sort(p.getMonom());
        return p;
    }
    public Polinom scadere(Polinom polinom1, Polinom polinom2) {
        Monom monomulRezultat = null;
        Polinom p = new Polinom();
        boolean ok = false;

        for (Monom m1 : polinom1.getMonom()) {
            ok = false;
            for (Monom m2 : polinom2.getMonom()) {
                if (m1.getPutere() == m2.getPutere()) {
                    ok = true;
                    monomulRezultat = new Monom(m1.getCoeficient()-m2.getCoeficient(), m1.getPutere());
                    p.getMonom().add(monomulRezultat);
                }
            } if (ok == false)
                p.getMonom().add(m1);
        }
        for (Monom m2 : polinom2.getMonom()) {
            ok = false;
            for (Monom m1 : polinom1.getMonom()) {
                if (m2.getPutere() == m1.getPutere()) {
                    ok = true;
                }
            }
            if (ok == false)
                p.addMonom(-m2.getCoeficient(),m2.getPutere());

        }
        Collections.sort(p.getMonom());
        return p;
    }
    public Polinom inmultire (Polinom polinom1, Polinom polinom2)
    {
        int[] numarElemente=new int[10]; int i=0;

        Polinom p = new Polinom();
        for( Monom m1: polinom1.getMonom())
        {
            for (Monom m2:polinom2.getMonom())
                p.getMonom().add(new Monom(m1.getCoeficient()*m2.getCoeficient(), m1.getPutere()+ m2.getPutere()));
        }
        for( Monom m1: p.getMonom())
        {
            for (Monom m2:p.getMonom()){
                if(m1.getPutere()==m2.getPutere())
                    numarElemente[i]++;
                if(numarElemente[i]>=2)
                    p.getMonom().add(new Monom(m1.getCoeficient()+ m2.getCoeficient(), m1.getPutere()));
                numarElemente[i]--;
            }i++;
        }
        Collections.sort(p.getMonom());
        return p;
    }
    public Polinom impartire(Polinom polinom1, Polinom polinom2)
    {
        Polinom p = new Polinom();
        for( Monom m1: polinom1.getMonom())
        {
            for (Monom m2:polinom2.getMonom())
                p.getMonom().add(new Monom(m1.getCoeficient()/m2.getCoeficient(), m1.getPutere()-m2.getPutere()));
        }
        Collections.sort(p.getMonom());
        return p;
    }
    public Polinom derivare(Polinom polinom)
    {
        Polinom p=new Polinom();
        for(Monom m1: polinom.getMonom())
        {
            int m=m1.getPutere()-1;
            p.getMonom().add(new Monom(m1.getPutere()*m1.getCoeficient(), m));
        }
        return p;
    }
    public Polinom integrare(Polinom polinom)
    {
        Polinom p=new Polinom();
        for(Monom m1: polinom.getMonom())
        {
            int m=m1.getPutere()+1;
            p.getMonom().add(new Monom(m1.getCoeficient()/(m1.getPutere()+1), m));
        }
        return p;
    }
}

