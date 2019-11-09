/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Annonce;
import Bean.Service;
import Bean.User;
import java.util.Date;

/**
 *
 * @author Jawadoo
 */
public class AnnonceService  extends AbstractFacade<Annonce>{
    
    public AnnonceService() {
        super(Annonce.class);
    }

   
     public Annonce creeAnnonce(Date dateService,String heureService,String zoneGeographique,Service service,User user ) {
        Annonce at = new Annonce();
        at.setDateService(dateService);
        at.setHeureService(heureService);
        at.setZoneGeographique(zoneGeographique);
        at.setService(service);
        at.setUser(user);
        create(at);
        return at;
    }
    
}
