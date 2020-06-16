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
public class notaModuloTestPara {
    
    public notaModuloTestPara() {
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
    public void nota1(){
        //Indicamos el resultado deseado
        System.out.println("INTRODUCIMOS UN 5 COMO LAS CUATRO NOTAS; EL RESULTADO POR LO TANTO DEBERIA SER UN 5");
        
        Alumno m1 = new Alumno(5, 5, 5, 5);
        
        System.out.println(m1.notaModulo());
    }
    
    @Test
    public void nota2(){
        //Indicamos el resultado deseado
        System.out.println("INTRODUCIMOS UN 10 COMO LAS CUATRO NOTAS; EL RESULTADO POR LO TANTO DEBERIA SER UN 10");
        
        Alumno m2 = new Alumno(10, 10, 10, 10);
        
        System.out.println(m2.notaModulo());
    }
    
    @Test
    public void nota3(){
        //Indicamos el resultado deseado
        System.out.println("INTRODUCIMOS DOS 5 EN LAS DOS PRIMERAS PRACTICAS, UN 2 EN LA TERCERA Y UN 5 EN EL EXAME EL RESULTADO POR LO TANTO DEBERIA SER UN 5");
        
        Alumno m3 = new Alumno(5, 5, 2, 5);
        
        System.out.println(m3.notaModulo());
    }
    
    @Test
    public void nota4(){
        //Indicamos el resultado deseado
        System.out.println("INTRODUCIMOS UN 5 EN TODAS LAS PRACTICAS Y UN 2 EN EL EXAMEN");
        
        Alumno m4 = new Alumno(5, 5, 5, 2);
        
        System.out.println(m4.notaModulo());
    }
    
    @Test
    public void nota5(){
        //Indicamos el resultado deseado
        System.out.println("INTRODUCIMOS LOS SIGUIENTES EN ORDEN 4, 5, 6, 7");
        
        Alumno m5 = new Alumno(4, 5, 6, 7);
        
        System.out.println(m5.notaModulo());
    }
}
