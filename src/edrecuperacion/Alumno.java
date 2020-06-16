/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edrecuperacion;

/**
 *
 * @author EDD-1DAW 19/20 
 */
public class Alumno {

    //Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private String modulo;
    private double notaPractica1 = 0;
    private double notaPractica2 = 0;
    private double notaPractica3 = 0;
    private double notaExamen = 0;

    /**
     * Constructor por defecto
     */
    public Alumno() {
    }

    /**
     * Constructor sobrecargado con solo los atributos Validos
     *
     * @param notaPractica1 double
     * @param notaPractica2 double
     * @param notaPractica3 double
     * @param notaExamen double
     */
    public Alumno(double notaPractica1, double notaPractica2, double notaPractica3, double notaExamen) {
        this.notaPractica1 = notaPractica1;
        this.notaPractica2 = notaPractica2;
        this.notaPractica3 = notaPractica3;
        this.notaExamen = notaExamen;
    }

    /**
     * Constructor sobrecargado con todos los atributos
     *
     * @param nombre String
     * @param apellidos String
     * @param dni String
     * @param modulo String
     * @param notaPractica1 double
     * @param notaPractica2 double
     * @param notaPractica3 double
     * @param notaExamen double
     */
    public Alumno(String nombre, String apellidos, String dni, String modulo, double notaPractica1, double notaPractica2, double notaPractica3, double notaExamen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.modulo = modulo;
        this.notaPractica1 = notaPractica1;
        this.notaPractica2 = notaPractica2;
        this.notaPractica3 = notaPractica3;
        this.notaExamen = notaExamen;
    }

    //Metodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public double getNotaPractica1() {
        return notaPractica1;
    }

    public void setNotaPractica1(double notaPractica1) {
        this.notaPractica1 = notaPractica1;
    }

    public double getNotaPractica2() {
        return notaPractica2;
    }

    public void setNotaPractica2(double notaPractica2) {
        this.notaPractica2 = notaPractica2;
    }

    public double getNotaPractica3() {
        return notaPractica3;
    }

    public void setNotaPractica3(double notaPractica3) {
        this.notaPractica3 = notaPractica3;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    //Otros Metodos
    /**
     * Devuelve la nota media final del módulo. Se calcula como nota ponderada:
     * 40% de la nota media de prácticas y 60% de la del examen.
     *
     * Para que un alumno pueda aprobar debe tener tanto la media de las
     * prácticas como la nota de examen mayor que 3. En ese caso suspenderá con
     * un 4 aunque esté aprobado.
     *
     * @return double
     */
    public double notaModulo() {
        double notaPonderada = (this.notaPractica1 + this.notaPractica2 + this.notaPractica3) / 3;
        if (notaPonderada > 3 && this.notaExamen > 3) {
            double notaFinal = (notaPonderada * 0.4) + (this.notaExamen * 0.6);
            return notaFinal;
        } else {
            return 4;
        }
    }

    /**
     * Devuelve la calificación Suspenso Nota Media = [0-4]<br>
     * Aprobado: Nota Media = 5<br>
     * Bien Nota Media = 6<br>
     * Notable Nota Media = [7-9)<br>
     * Sobresaliente Nota Media = [9-10]<br>
     * según la nota media del alumno.
     *
     * @return String
     */
    public String calificacionModulo() {
        String calificacion;
        if (notaModulo() < 5) {//Suspenso
            calificacion = "Suspenso";
            return calificacion;

        } else if (notaModulo() >= 5 && notaModulo() < 6) {//Aprobado
            calificacion = "Aprobado";
            return calificacion;

        } else if (notaModulo() >= 6 && notaModulo() < 7) {//Bien
            calificacion = "Bien";
            return calificacion;

        } else if (notaModulo() >= 7 && notaModulo() < 9) {//Notable
            calificacion = "Notable";
            return calificacion;

        } else {//Sobresaliente
            calificacion = "Sobresaliente";
            return calificacion;
        }
    }

    /**
     * Devuelve <code>true</code> si el alumno ha entregado las 3 prácticas.
     *
     * Devuelve <code>false</code> si el alumno no ha entregado alguna de las
     * prácticas ( alguna de las notas de las prácticas es 0)
     *
     * @return boolean
     */
    public boolean entregaPracticas() {
        return (this.notaPractica1 != 0)
                && (this.notaPractica2 != 0)
                && (this.notaPractica3 != 0);
    }

}
