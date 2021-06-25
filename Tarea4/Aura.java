
public class Aura extends Hechizo
{
    private String elemento;
    public Aura(String nombre, double tiemLanz, String elemento){
      super(nombre, tiemLanz);
      this.elemento = elemento;
    }
    public String getElemento(){
      return elemento;
    }
}