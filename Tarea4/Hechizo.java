
public class Hechizo
{
    protected String nombre;
    protected int nivel;
    protected double tiempoDeLanzamiento;
    
    public Hechizo(String nombre, double tiemLanz){
      this.nombre = nombre;
      tiempoDeLanzamiento = tiemLanz;
      nivel = 1;
    }
    public String getNombre(){
      return nombre;
    }
    public int getNivel(){
      return nivel;
    }
    public void subirNivel(){
      nivel++;
    }
    public double getTiempoDeLanzamiento(){
      return tiempoDeLanzamiento;
    }
}
