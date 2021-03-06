/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tool;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.springframework.stereotype.Component;

/**
 * Used to serialize Java.util.Date, which is not a common JSON
 * type, so we have to create a custom serialize method;.
 *
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */

@Component

public class JsonDateSerializer extends JsonSerializer<Date>{

private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.Z");


@Override

public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)

throws IOException, JsonProcessingException {

    TimeZone time_zone  = TimeZone.getTimeZone("America/Cancun"); 
    // Modifying the time zone 
    dateFormat.setTimeZone(time_zone); 

    //dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    
    String formattedDate = dateFormat.format(date);

    gen.writeString(formattedDate);

}

}