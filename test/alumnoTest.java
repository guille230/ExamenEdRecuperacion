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
public class alumnoTest {
    
    public alumnoTest() {
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
    public void nota(){
        //Indicamos el resultado deseado
        System.out.println("INTRODUCIMOS UN 5 COMO LAS CUATRO NOTAS; EL RESULTADO POR LO TANTO DEBERIA SER UN 5");
        
        Alumno m1 = new Alumno(5, 5, 5, 5);
        
        System.out.println(m1.notaModulo());
    }
    
    @Test
    public void calificacion(){
        //Indicamos el resultado deseado
        System.out.println("AL RECOGER LA NOTA DEL MODULO, SIENDO UN 5 EN ESTE CASO DEBERIA DAR APROBADO");
        
        Alumno m2 = new Alumno(5, 5, 5, 5);
        
        System.out.println(m2.calificacionModulo());
    }
    
    @Test
    public void entrega(){
        //Indicamos el resultado deseado
        System.out.println("DEBERIA DARNOS NEGATIVO PUES LA PRACTICA 3 NO SE HA ENTREGADO");
        boolean flag = false;
         Alumno m3 = new Alumno(5, 5, 0, 5);
        
         
         System.out.println(m3.entregaPracticas());
         
         
       /* if (m3.getNotaPractica1() == 0 || m3.getNotaPractica2() == 0 || m3.getNotaPractica3() == 0) {
            System.out.println(flag);
        }else{flag = true; System.out.println(flag);}*/
    }
}
