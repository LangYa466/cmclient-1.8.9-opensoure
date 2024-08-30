import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import java.io.Reader;

public final class aiy {
   private static final JsonParser dBf = new JsonParser();

   public static JsonElement iC(String var0) {
      return dBf.parse(var0);
   }

   public JsonElement q(JsonReader var1) {
      return dBf.parse(var1);
   }

   public static JsonElement e(Reader var0) {
      return dBf.parse(var0);
   }
}
