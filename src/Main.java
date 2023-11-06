import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cirkel c1 = new Cirkel("Grøn", true ,5);
        Cirkel c2 = new Cirkel("Blå", false ,3);
        Rektangel r1 = new Rektangel("rød", true, 4, 5);
        Rektangel r2 = new Rektangel("Gul", true, 6.6, 3);

        ArrayList <GeometriFigur> g = new ArrayList<>();

        g.add(c1);
        g.add(c2);
        g.add(r1);
        g.add(r2);

        System.out.println(samletAreal(g));
    }

    public static double samletAreal(ArrayList<GeometriFigur> liste){
        double totalAreal = 0;
        for (int i = 0; i < liste.size(); i++){
            totalAreal += liste.get(i).getAreal();
        }
        return totalAreal;
    }
}