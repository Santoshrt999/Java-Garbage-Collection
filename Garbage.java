/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbage;

/**
 *
 * @author Santosh Goteti
 */
public class Garbage {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garbage gcc = new Garbage();
        
        gcc = null; //keep the garbage value as null.
                
         GcReady gc = new GcReady();
         gc.m1();
         gc.m2();
   
       gc = null;  
    System.gc();
    
} 
    @Override
       protected void finalize(){ //It is used to perform clean up processing just before object is garbage collected.
             
          System.out.println("REMOVED IT");
    }
}
    class GcReady{
        private int x = 10;
        private String gh = "asd";
        
        public void m1(){
            System.out.println("Hello");
        }
       public  void m2(){
            System.out.println("What's up?");
        }
    }
    

