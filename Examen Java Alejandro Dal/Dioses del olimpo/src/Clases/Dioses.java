package Clases;

public class Dioses
{
    protected String nombre;
    protected int edad;
    protected int gradofuerza;

    public Dioses(String nombre, int edad, int gradofuerza)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.gradofuerza = gradofuerza;
    }

        public String getNombre()
        {
        return nombre;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public int getGradofuerza()
    {
        return gradofuerza;
    }
    
    public void stats()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("fuerza: " + gradofuerza);
    }
}