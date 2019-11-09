/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Service;
import Bean.Technicien;

/**
 *
 * @author Jawadoo
 */
public class ServiceService extends AbstractFacade<Service>{
    
    public ServiceService() {
        super(Service.class);
    }
     public Service creeService(String nomService ) {
        Service s = new Service();
        s.setNomService(nomService);
        create(s);
        return s;
    }
}
