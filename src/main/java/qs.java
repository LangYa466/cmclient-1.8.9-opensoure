import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.Vector3f;

class qS implements JsonDeserializer {
   private static final Vector3f anF = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final Vector3f anG = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Vector3f anH = new Vector3f(0.0F, 0.0F, 0.0F);

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.u(var1, var2, var3);
   }

   public qR u(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      Vector3f var5 = this.q(var4, q.q[-32249 & 790], anH);
      Vector3f var6 = this.q(var4, u.q[10213 & 1005], anG);
      var6.scale(0.0625F);
      var6.x = Pq.n(var6.x, -1.5F, 1.5F);
      var6.y = Pq.n(var6.y, -1.5F, 1.5F);
      var6.z = Pq.n(var6.z, -1.5F, 1.5F);
      Vector3f var7 = this.q(var4, q.q[4217 & 16761], anF);
      var7.x = Pq.n(var7.x, -4.0F, 4.0F);
      var7.y = Pq.n(var7.y, -4.0F, 4.0F);
      var7.z = Pq.n(var7.z, -4.0F, 4.0F);
      return new qR(var5, var6, var7);
   }

   private Vector3f q(JsonObject var1, String var2, Vector3f var3) {
      if (!var1.has(var2)) {
         return var3;
      } else {
         JsonArray var4 = Pk.u(var1, var2);
         if (var4.size() != 3) {
            throw new JsonParseException(u.q[-19734 & 17642] + var2 + u.q[20219 & 239] + var4.size());
         } else {
            float[] var5 = new float[3];

            for(int var6 = 0; var6 < var5.length; ++var6) {
               var5[var6] = Pk.q(var4.get(var6), var2 + w.q[-24591 & 433] + var6 + q.q[-29794 & 5020]);
            }

            return new Vector3f(var5[0], var5[1], var5[2]);
         }
      }
   }
}
