package Clases;

import java.util.Scanner;


public class DiosesModernos extends Dioses
{
    private String profesion;

    public DiosesModernos(String nombre, int edad, int gradofuerza, String profesion)
    {
        super(nombre, edad, gradofuerza);
        this.profesion = profesion;
    }

    public String getprofesion()
    {
        return profesion;
    }

    @Override
    public void stats()
    {
        super.stats();
        System.out.println("Profesion: " + profesion);
    }
}