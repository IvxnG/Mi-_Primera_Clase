public class Entrenador{
    //Nombre y primer apellido del entrenador
    private String nombre;
    //Sueldo que cobra por entrenar
    private int sueldo;
    //Pertenece actualmente a un club 
    private boolean tieneEquipo;
    
    public Entrenador(String nombreApellido, int sueldoMes) {
        nombre = nombreApellido;
        sueldo = sueldoMes;
        tieneEquipo = false;
    }
    
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;   
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
    
    public void fichaPorEquipo(){
        if(tieneEquipo == true){
            tieneEquipo = false;
        }
        else{
            tieneEquipo = true;    
        }
    }
    
    public void imprimirDatos(){
        String entrenaEquipo;
        if(tieneEquipo == true){
            entrenaEquipo = "Sí entrena.";
        }
        else{
            entrenaEquipo = "No entrena.";
        }
        System.out.println(nombre + "|" + sueldo + "€" + "|" +  "Entrena algun equipo = " + entrenaEquipo);
    }
    
    public String obtenerDetalles(){
        String entrenaEquipo;
        if(tieneEquipo == true){
            entrenaEquipo = "Sí entrena.";
        }
        else{
            entrenaEquipo = "No entrena.";
        }
        return nombre + "|" + sueldo + "€" + "|" +  "Entrena algun equipo = " + entrenaEquipo; 
    }
}