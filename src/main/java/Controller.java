package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view;
    private Operatie operatii;

    public Controller() {
    }

    public Controller(View view, Operatie operatii) {
        this.view = view;
        this.operatii = operatii;
        this.view.addAdunareListener(new Controller.AdunareListener());
        this.view.addScadereListener(new Controller.ScadereListener());
        this.view.addInmultireListener(new Controller.InmultireListener());
        this.view.addImpartireListener(new Controller.ImpartireListener());
        this.view.addDerivareListener(new Controller.DerivareListener());
        this.view.addIntegrareListener(new Controller.IntegrareListener());
        this.view.addDeleteAllListener(new Controller.DeleteListener());
    }

    class AdunareListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Polinom p=new Polinom();
            String p1 = "", p2 = "";
            try {
                p1 = pol1();
                p2 = pol2();
                Polinom polinom1 = p.create(p1);
                Polinom polinom2 = p.create(p2);
                Polinom rezultat = operatii.adunare(polinom1, polinom2);
                System.out.println("Rezultat" + rezultat.toString());
                view.setRezultatArea(rezultat.toString(rezultat));
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Bad input");
            }
        }
    }
    class ScadereListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Polinom p=new Polinom();
            String p1 = "", p2 = "";
            try {
                p1 = pol1();
                p2 = pol2();
                Polinom polinom1 = p.create(p1);
                Polinom polinom2 = p.create(p2);
                Polinom rezultat = operatii.scadere(polinom1, polinom2);
                System.out.println("Rezultat" + rezultat.toString());
                view.setRezultatArea(rezultat.toString(rezultat));
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Bad input");
            }
        }
    }

    class InmultireListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Polinom p=new Polinom();
            String p1 = "", p2=" ";
            try {
                p1 = pol1();
                p2= pol2();
                Polinom polinom1 = p.create(p1);
                Polinom polinom2 = p.create(p2);
                Polinom rezultat = operatii.inmultire(polinom1, polinom2);
                System.out.println("Rezultat" + rezultat.toString());
                view.setRezultatArea(rezultat.toString(rezultat));
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Bad input");
            }
        }
    }
    class ImpartireListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Polinom p=new Polinom();
            String p1 = "", p2=" ";
            try {
                p1 = pol1();
                p2= pol2();
                Polinom polinom1 = p.create(p1);
                Polinom polinom2 = p.create(p2);
                Polinom rezultat = operatii.impartire(polinom1, polinom2);
                System.out.println("RezultatImpartire" + rezultat.toString2(rezultat));
                view.setRezultatArea(rezultat.toString2(rezultat));
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Bad input");
            }
        }
    }
    class DerivareListener implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            Polinom p=new Polinom();
            String p1 = "";
            try {
                p1 = pol1();
                Polinom polinom1 = p.create(p1);
                Polinom rezultat = operatii.derivare(polinom1);
                System.out.println("Rezultat" + rezultat.toString());
                view.setRezultatArea(rezultat.toString(rezultat));
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Bad input");
            }
        }

        }

    class IntegrareListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Polinom p=new Polinom();
            String p1 = "";
            try {
                p1 = pol1();
                Polinom polinom1 = p.create(p1);
                Polinom rezultat = operatii.integrare(polinom1);
                System.out.println("Rezultat" + rezultat.toString2(rezultat));
                view.setRezultatArea(rezultat.toString2(rezultat));
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Bad input");
            }
        }

    }
    class DeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                view.setPolinom1Field(null);
                view.setPolinom2Field(null);
                view.setRezultatArea("");

            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Deletion failed");
            }
        }
    }

    public String pol1() {
        String p1 = "";
        p1 = view.getPolinom1Field();
        p1 = p1.replace("-", "+-");
        return p1;
    }

    public String pol2() {
        String p2 = "";
        p2 = view.getPolinom2Field();
        p2 = p2.replace("-", "+-");
        return p2;
    }
}
