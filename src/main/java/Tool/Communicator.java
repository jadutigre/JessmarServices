/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tool;

/**
 *
 * @author mrivero
 * 
 * Esta clase espera leer un archivo de configuracion que se debera colocar en el directorio conf de Tomcat.
 * 
 */

 

import com.group.sunset.groupsunsetpmsproxyservice.GuestService;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreProtocolPNames;

public class Communicator {

    public String executeHttpGet(String URL) throws Exception
    {
        BufferedReader in = null;
        try
        {
            HttpClient client = new DefaultHttpClient();
            client.getParams().setParameter(CoreProtocolPNames.USER_AGENT, "android");
            HttpGet request = new HttpGet();
            request.setHeader("Content-Type", "text/plain; charset=utf-8");
            request.setURI(new URI(URL));
            HttpResponse response = client.execute(request);
            in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            StringBuffer sb = new StringBuffer("");
            String line = "";

            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null)
            {
                sb.append(line + NL);
            }
            in.close();
            String page = sb.toString();

            return page;
        }
        finally
        {
            if (in != null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    System.out.println(e.toString());
                }
            }
        }
    }


    public String executeHttpPost(String URL,   HashMap losParams) throws Exception
    {
        
        BufferedReader in = null;
        try
        {
            HttpClient client = new DefaultHttpClient();
            client.getParams().setParameter(CoreProtocolPNames.USER_AGENT, "android");
            HttpPost request = new HttpPost(URL);
            request.setHeader("User-Agent", "Mozilla/5.0");
            request.setURI(new URI(URL));

            //defino los parametros.
            List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

            Set<String> keySet = losParams.keySet();
            Iterator<String> it = keySet.iterator();
            //System.out.println("Parametros numero: " + losParams.size() );
            while (it.hasNext()){
                String llave =     it.next();
                String valor =      losParams.get(llave).toString();
                urlParameters.add(new BasicNameValuePair(llave, valor));
            }

            request.setEntity(new UrlEncodedFormEntity(urlParameters));

            HttpResponse response = client.execute(request);



            in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            StringBuffer sb = new StringBuffer("");
            String line = "";

            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null)
            {
                sb.append(line + NL);
            }
            in.close();
            String page = sb.toString();

            return page;
        }
        finally
        {
            if (in != null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    System.out.println(e.toString());
                }
            }
        }
    }

    /***
     *   Metodo que regresa una cadena con el Url del servicio local a llamar
     * @param noHotel    Numero del club done se redireccionara la llamada
     * @return La cadena con el url inicial del servico
     * @       o regreso 100 cuando no pude leer el archivo de propiedades
     *         o regreso 200 cuando no encontre el url en la lista
	 
     */
    public String getLocalService(Integer noHotel)  {
        Properties prop = new Properties();    
        FileInputStream input = null;
        
        String elUrl;
        try {
                String base=System.getProperty("catalina.base");
                input = new FileInputStream(base+"/conf/groupSunsetProxyService.properties"); // Directorio conf de tomcat
               //load a properties file  		
              //  prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("groupSunsetProxyService.properties"));
                prop.load(input);
    	} catch (Exception ex) {
                 Logger.getLogger(GuestService.class.getName()).log(Level.SEVERE, null, ex);
                  elUrl = "100" ; // Error 100
    		 return elUrl;
        }
                 
  
        String clubes = prop.getProperty("aybServiceListClubs");
        String servicios = prop.getProperty("aybServicesList");
        List<String> clublist = Arrays.asList(clubes.split(","));
        List<String> servicioslist = Arrays.asList(servicios.split(","));
        Map<String,String> mapaServicios = new LinkedHashMap<String,String>();
        
        for (int i=0; i<clublist.size(); i++) {
            mapaServicios.put(clublist.get(i), servicioslist.get(i));    
        }
        
        // mapaServicios contiene la relacion de el club vs su url del servico

        elUrl = mapaServicios.get(noHotel.toString());
        if(elUrl == null ){
                    elUrl = "200" ; // Error 200
                    return elUrl;
        }
        
        elUrl = prop.getProperty(elUrl); // Busco la variable en las propiedades
        if(elUrl == null ){
                    elUrl = "200" ; // Error 200
                    return elUrl;
        }
        return elUrl;
    }
    
public String getPmsService(Integer noHotel)  {
        Properties prop = new Properties();    
        FileInputStream input = null;
        
//        System.out.println("NoHotel:"+noHotel);
        
        String elUrl;
        try {
              String base=System.getProperty("catalina.base");
              input = new FileInputStream(base+"/conf/groupSunsetProxyService.properties"); // Directorio conf de tomcat
               //load a properties file  		
              //  prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("groupSunsetProxyService.properties"));
                prop.load(input);
    	} catch (Exception ex) {
                 Logger.getLogger(GuestService.class.getName()).log(Level.SEVERE, null, ex);
                 elUrl = "100" ; // Error 100
    		 return elUrl;
        }
                 
        String clubes = prop.getProperty("pmsServiceListClubs");
        String servicios = prop.getProperty("pmsServicesList");
        List<String> clublist = Arrays.asList(clubes.split(","));
        List<String> servicioslist = Arrays.asList(servicios.split(","));
        Map<String,String> mapaServicios = new LinkedHashMap<String,String>();
        
        for (int i=0; i<clublist.size(); i++) {
//            System.out.println("Mapa :"+clublist.get(i)+" "+servicioslist.get(i));
            mapaServicios.put(clublist.get(i), servicioslist.get(i));    
        }
        
        // mapaServicios contiene la relacion de el club vs su url del servico

        elUrl = mapaServicios.get(noHotel.toString());
//        System.out.println("elUrl :"+elUrl);
        if(elUrl == null ){
                    elUrl = "200" ; // Error 200
                    return elUrl;
        }
        
        elUrl = prop.getProperty(elUrl); // Busco la variable en las propiedades
        if(elUrl == null ){
                    elUrl = "200" ; // Error 200
                    return elUrl;
        }
        return elUrl;
    }    
    
    /***
     *   Metodo que regresa una cadena con el Url del servicio local a llamar
     * @param noHotel    Numero del club done se redireccionara la llamada
     * @return La cadena con el url inicial del servico
     * @       o Devuelve 100 cuando no se puede leer el archivo de propiedades
     *         o Devuelve 200 cuando no se encuentra el url en la lista
     */
    public String getSISService(Integer noHotel)  {
        Properties prop = new Properties();    
        FileInputStream input = null;
        
        String elUrl;
        try {
            String base=System.getProperty("catalina.base");
            input = new FileInputStream(base+"/conf/groupSunsetProxyService.properties"); // Directorio conf de tomcat
               //load a properties file  		
              //  prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("groupSunsetProxyService.properties"));
                prop.load(input);
    	} catch (Exception ex) {
                 Logger.getLogger(GuestService.class.getName()).log(Level.SEVERE, null, ex);
                  elUrl = "100" ; // Error 100
    		 return elUrl;
        }
        String clubes = prop.getProperty("sisServiceListClubs");
        String servicios = prop.getProperty("sisServiceList");
        List<String> clublist = Arrays.asList(clubes.split(","));
        List<String> servicioslist = Arrays.asList(servicios.split(","));
        Map<String,String> mapaServicios = new LinkedHashMap<String,String>();
        
        for (int i=0; i<clublist.size(); i++) {
            mapaServicios.put(clublist.get(i), servicioslist.get(i));    
        }
        
        // mapaServicios contiene la relacion de el club vs su url del servico

        elUrl = mapaServicios.get(noHotel.toString());
        if(elUrl == null ){
                    elUrl = "200" ; // Error 200
                    return elUrl;
        }
        
        elUrl = prop.getProperty(elUrl); // Busco la variable en las propiedades
        if(elUrl == null ){
                    elUrl = "200" ; // Error 200
                    return elUrl;
        }
        return elUrl;
    }    
    
    

}