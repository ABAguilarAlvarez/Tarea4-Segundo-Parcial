import java.util.ArrayList;
public class Grimorio
{
    private ArrayList<Hechizo> grim;
    public Grimorio(){
      grim = new ArrayList<Hechizo>();
    }
    public void agregarHechizo(Hechizo nuevo){
      grim.add(nuevo);
    }
    
}
