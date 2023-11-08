public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String genero;

    private int id;

    public Persona(int id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String genero){
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidoPaterno(){
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno){

        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno(){

        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){

        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getId() {return id;}

    public void setId (int id){
        this.id = id;
    }

}
