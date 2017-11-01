/**
 * Created by Alumnos on 24/10/2017.
 */
public class Contacto {
    private String nombre;
    private String direccion;
    private long telefono;


    public Contacto (String nom, String dir, long tel)
    {
        if(nom.isEmpty())
        {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if(nom.charAt(0)>= 'a' && nom.charAt(0)<= 'z' ||nom.charAt(0)>= 'A' && nom.charAt(0)<= 'Z')
        {
            this.nombre = nom;
        }
        else
        {
            RuntimeException ex = new IllegalArgumentException("El nombre debe iniciar con una letra");
            throw ex;
            //throw new IllegalArgumentException();

        }
        dir= dir.trim(); // Trim Le quita los espacios y regresa una copia
        if(dir.isEmpty())
        {
            throw new IllegalArgumentException("La dirección no debe estar vacia");
        }
        else
        {
            this.direccion = dir;
        }
       // String cadTel = (String)tel; No se puede hacer cast de primitivo a
        String cadTel = Long.toString(tel);
        if(cadTel.length() ==   10)
        {
            this.telefono = tel;
        }
        else
        {
            throw new IllegalArgumentException("El telefono debe tener 10 digitos");
        }
    }

    @Override
    public String toString()
    {
        return  nombre +","+direccion+","+telefono;
    }

    public long dimeTel()
    {
        return telefono;
    }
}
