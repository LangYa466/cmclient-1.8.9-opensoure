import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class aie implements JsonSerializer {
   public JsonElement q(aic var1, Type var2, JsonSerializationContext var3) {
      return var3.serialize(var1.bY());
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.q((aic)var1, var2, var3);
   }
}
