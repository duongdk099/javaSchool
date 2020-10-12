import java.awt.*;
public class F_C {
    public static void main(String[] args) {
        /*Feuille f= new Feuille(600, 400, "String"); // Arrow
        Crayon c = new Crayon();
        c.setColor(Color.blue);
        c.deplacer(0, 100);
        c.poser(f);
        c.deplacer(200, 0);
        c.setColor(Color.green);
        c.deplacer(-(45), (45));
        c.deplacer(45, -45);
        c.setColor(Color.red);
        c.deplacer(-45, -45);
        */
        Feuille f = new Feuille(600,400,"String"); // Rectangle
        Crayon c1 = new Crayon();
        c1.setColor(Color.RED);
        c1.deplacer(50, 10);
        c1.poser(f);
        c1.deplacer(0,100);
        c1.setColor(Color.BLUE);
        c1.deplacer(100, 0);
        c1.setColor(Color.GREEN);
        c1.deplacer(0, -100);
        c1.setColor(Color.DARK_GRAY);
        c1.deplacer(-100, 0);
    }
}
