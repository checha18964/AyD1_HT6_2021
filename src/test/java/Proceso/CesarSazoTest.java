/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author cesa_
 */
public class CesarSazoTest {
  //MOKITO 1=======================
    @Mock
    private AsignarHorario asig;
    
   
   @BeforeEach
   public void setUp(){
      MockitoAnnotations.initMocks(this);   
       
   }
   
   @Test
   public void VerificarllamadaMock() throws Exception{
       when(asig.Traslape()).thenReturn(true);
       boolean chequeo = asig.Traslape();
       assertEquals(true,chequeo);
   }
   
   
    //MOKITO 2=======================
    @Mock
    private AsignarHorario asig2;
    
   
   @BeforeEach
   public void setUp2(){
      MockitoAnnotations.initMocks(this);   
       
   }
   
   @Test
   public void VerificarllamadaMock2() throws Exception{
       when(asig2.VerDescripcion()).thenReturn("");
       String chequeo = asig2.VerDescripcion();
       assertEquals("",chequeo);
   }  
}
