import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

public class aid implements JsonDeserializer {
   public aic A(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String var4 = var1.getAsString();
      return aic.iv(var4);
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.A(var1, var2, var3);
   }
}
