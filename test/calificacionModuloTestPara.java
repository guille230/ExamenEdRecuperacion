/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edrecuperacion.Alumno;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guille230
 */
public class calificacionModuloTestPara {
    
    public calificacionModuloTestPara() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void calificacion1(){
        //Indicamos el resultado deseado
        System.out.println("AL RECOGER LA NOTA DEL MODULO, SIENDO UN 5 EN ESTE CASO DEBERIA DAR APROBADO");
        
        Alumno m2 = new Alumno(5, 5, 5, 5);
        
        System.out.println(m2.calificacionModulo());
    }
    
    @Test
    public void calificacion2(){
        //Indicamos el resultado deseado
        System.out.println("AL RECOGER LA NOTA DEL MODULO, SIENDO UN 7 EN ESTE CASO DEBERIA DAR BIEN");
        
        Alumno m2 = new Alumno(6, 6, 6, 6);
        
        System.out.println(m2.calificacionModulo());
    }
    
    @Test
    public void calificacion3(){
        //Indicamos el resultado deseado
        System.out.println("AL RECOGER LA NOTA DEL MODULO, SIENDO UN 5 EN ESTE CASO DEBERIA DAR NOTABLE");
        
        Alumno m2 = new Alumno(8, 8, 8, 8);
        
        System.out.println(m2.calificacionModulo());
    }
    
    @Test
    public void calificacion4(){
        //Indicamos el resultado deseado
        System.out.println("AL RECOGER LA NOTA DEL MODULO, SIENDO UN 5 EN ESTE CASO DEBERIA DAR SOBRESALIENTE");
        
        Alumno m2 = new Alumno(10, 10, 10, 10);
        
        System.out.println(m2.calificacionModulo());
    }
    
    @Test
    public void calificacion5(){
        //Indicamos el resultado deseado
        System.out.println("AL RECOGER LA NOTA DEL MODULO, SIENDO UN 5 EN ESTE CASO DEBERIA DAR SUSPENSO");
        
        Alumno m2 = new Alumno(1, 1, 1, 1);
        
        System.out.println(m2.calificacionModulo());
    }
}
