import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.util.vector.Vector3f;

class qB implements JsonDeserializer {
   private OK al(String var1) {
      OK var2 = OK.dg(var1);
      if (var2 == null) {
         throw new JsonParseException(u.q[231 & 17127] + var1);
      } else {
         return var2;
      }
   }

   private qE e(JsonObject var1) {
      qE var2 = null;
      if (var1.has(q.q[566 & 12878])) {
         JsonObject var3 = Pk.o(var1, q.q[4910 & 18119]);
         Vector3f var4 = this.q(var3, u.q[9700 & -32544]);
         var4.scale(0.0625F);
         OM var5 = this.u(var3);
         float var6 = this.y(var3);
         boolean var7 = Pk.q(var3, u.q[-1567 & 761], false);
         var2 = new qE(var4, var5, var6, var7);
      }

      return var2;
   }

   public qz r(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      Vector3f var5 = this.t(var4);
      Vector3f var6 = this.r(var4);
      qE var7 = this.e(var4);
      Map var8 = this.w(var3, var4);
      if (var4.has(u.q[9438 & -32545]) && !Pk.w(var4, u.q[13566 & -15906])) {
         throw new JsonParseException(u.q[-30497 & 17631]);
      } else {
         boolean var9 = Pk.q(var4, u.q[734 & 20702], true);
         return new qz(var5, var6, var8, var7, var9);
      }
   }

   private Map q(JsonDeserializationContext var1, JsonObject var2) {
      EnumMap var3 = Maps.newEnumMap(OK.class);
      JsonObject var4 = Pk.o(var2, q.q[309 & 17405]);

      for(Entry var6 : var4.entrySet()) {
         OK var7 = this.al((String)var6.getKey());
         var3.put(var7, (qC)var1.deserialize((JsonElement)var6.getValue(), qC.class));
      }

      return var3;
   }

   private Vector3f r(JsonObject var1) {
      Vector3f var2 = this.q(var1, e.q[25257 & -30279]);
      if (var2.x >= -16.0F && var2.y >= -16.0F && var2.z >= -16.0F && var2.x <= 32.0F && var2.y <= 32.0F && var2.z <= 32.0F) {
         return var2;
      } else {
         throw new JsonParseException(u.q[16616 & -27922] + var2);
      }
   }

   private Map w(JsonDeserializationContext var1, JsonObject var2) {
      Map var3 = this.q(var1, var2);
      if (var3.isEmpty()) {
         throw new JsonParseException(u.q[238 & 10983]);
      } else {
         return var3;
      }
   }

   private Vector3f t(JsonObject var1) {
      Vector3f var2 = this.q(var1, e.q[684 & -32327]);
      if (var2.x >= -16.0F && var2.y >= -16.0F && var2.z >= -16.0F && var2.x <= 32.0F && var2.y <= 32.0F && var2.z <= 32.0F) {
         return var2;
      } else {
         throw new JsonParseException(u.q[249 & -7445] + var2);
      }
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.r(var1, var2, var3);
   }

   private float y(JsonObject var1) {
      float var2 = Pk.s(var1, u.q[-32286 & 13542]);
      if (var2 != 0.0F && Pq.bj(var2) != 22.5F && Pq.bj(var2) != 45.0F) {
         throw new JsonParseException(u.q[13283 & 2283] + var2 + u.q[244 & 29422]);
      } else {
         return var2;
      }
   }

   private OM u(JsonObject var1) {
      String var2 = Pk.a(var1, w.q[26091 & 105]);
      OM var3 = OM.dh(var2.toLowerCase());
      if (var3 == null) {
         throw new JsonParseException(u.q[-23067 & 2797] + var2);
      } else {
         return var3;
      }
   }

   private Vector3f q(JsonObject var1, String var2) {
      JsonArray var3 = Pk.u(var1, var2);
      if (var3.size() != 3) {
         throw new JsonParseException(u.q[234 & 6123] + var2 + u.q[1259 & 491] + var3.size());
      } else {
         float[] var4 = new float[3];

         for(int var5 = 0; var5 < var4.length; ++var5) {
            var4[var5] = Pk.q(var3.get(var5), var2 + w.q[-31299 & 8625] + var5 + q.q[5020 & -31844]);
         }

         return new Vector3f(var4[0], var4[1], var4[2]);
      }
   }
}
