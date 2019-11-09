/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Service.AnnonceService;

/**
 *
 * @author Jawadoo
 */
public class AnnonceTest {
     public static void main(String[] args) {
        // TODO code application logic here
        AnnonceService a= new AnnonceService();
        a.creeAnnonce(null, "12:00", "azeli", null, null);
    }
    
}
