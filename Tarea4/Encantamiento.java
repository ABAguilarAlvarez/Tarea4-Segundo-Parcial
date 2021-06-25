
public class Encantamiento extends Hechizo
{
    private double duracion;
    
    public Encantamiento(String nombre, double tiemLanz, int duracion){
      super(nombre, tiemLanz);
      this.duracion = duracion;
    }
    public double getDuracion(){
      return duracion;
    }
}
