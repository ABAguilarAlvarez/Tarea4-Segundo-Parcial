
public class Maleficio extends Hechizo
{
    private String efecto;
    public Maleficio(String nombre, double tiemLanz, String efecto){
      super(nombre, tiemLanz);
      this.efecto = efecto;
    }
    public String getEfecto(){
      return efecto;
    }
}
