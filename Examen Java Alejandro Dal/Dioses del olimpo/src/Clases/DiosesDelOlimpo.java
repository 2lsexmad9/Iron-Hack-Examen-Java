package Clases;

public class DiosesDelOlimpo extends Dioses
{
    private String poder;

    public DiosesDelOlimpo(String nombre, int edad, int gradofuerza, String poder)
    {
        super(nombre, edad, gradofuerza);
        this.poder = poder;
    }

    public String getpoder()
    {
        return poder;
    }

    @Override
    public void stats()
    {
        super.stats();
        System.out.println("Poder: " + poder);
    }
}