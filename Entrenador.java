public class Entrenador{
    //Nombre y primer apellido del entrenador
    private String nombre;
    //Sueldo que cobra por entrenar
    private int sueldo;
    //Pertenece actualmente a un club sí(true) o no(false)
    private boolean tieneEquipo;
    
    public Entrenador(String nombreApellido, int sueldoMes) {
        nombre = nombreApellido;
        sueldo = sueldoMes;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    public boolean getEquipo(){
        return tieneEquipo;
    }
    
    public void mejoraSueldo(){
        sueldo = sueldo + 200;
    }
    
    public void fichaPorEquipo(boolean equipo){
        tieneEquipo = equipo;    
    }
    
    public void imprimirDatos(){
        System.out.println(nombre + "|" + sueldo + "€" + "|" +  "Tiene equipo =" + tieneEquipo );
    }
    
    public String obtenerdetalles(){
        return nombre + "|" + sueldo + "€" + "|" +  "Tiene equipo =" + tieneEquipo;  
    }
}