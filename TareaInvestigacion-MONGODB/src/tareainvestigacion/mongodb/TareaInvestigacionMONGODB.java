/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareainvestigacion.mongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marisol CH
 * prueba
 */
public class TareaInvestigacionMONGODB {
    DB db;
    DBCollection tabla;
    /**
     * @param args the command line arguments
     */
    public void conexion(){
        try {
            Mongo mongo  = new Mongo("localhost", 27017);
            db = mongo.getDB("practInvestigacion");
            tabla = db.getCollection("producto");
        } catch (UnknownHostException ex) {
            Logger.getLogger(TareaInvestigacionMONGODB.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
