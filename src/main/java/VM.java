import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class vm extends vk {
   public vl s(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      float[] var5 = new float[256];
      float[] var6 = new float[256];
      float[] var7 = new float[256];
      float var8 = 1.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      if (var4.has(o.q[20854 & 2909])) {
         if (!var4.get(o.q[2518 & 1365]).isJsonObject()) {
            throw new JsonParseException(o.q[-27811 & 501] + var4.get(o.q[-32300 & 4950]));
         }

         JsonObject var11 = var4.getAsJsonObject(o.q[13661 & -32426]);
         if (var11.has(q.q[-31453 & 21453])) {
            if (!var11.get(q.q[-24205 & 1281]).isJsonObject()) {
               throw new JsonParseException(o.q[14711 & 16726] + var11.get(q.q[22793 & -31471]));
            }

            JsonObject var12 = var11.getAsJsonObject(q.q[-31999 & 6433]);
            var8 = Pk.q(var12, q.q[-28354 & 2876], var8);
            Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var8, o.q[-18081 & 16855]);
            var9 = Pk.q(var12, t.q[6525 & 1663], var9);
            Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var9, o.q[-7848 & 1373]);
            var10 = Pk.q(var12, o.q[6489 & -15493], var9);
            Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var10, o.q[2906 & -31398]);
         }

         for(int var18 = 0; var18 < 256; ++var18) {
            JsonElement var13 = var11.get(Integer.toString(var18));
            float var14 = var8;
            float var15 = var9;
            float var16 = var10;
            if (var13 != null) {
               JsonObject var17 = Pk.w(var13, o.q[-2725 & 379] + var18 + q.q[12222 & 21468]);
               var14 = Pk.q(var17, q.q[2428 & 16828], var8);
               Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var14, u.q[301 & 29565]);
               var15 = Pk.q(var17, t.q[17149 & 2429], var9);
               Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var15, o.q[-31396 & 25053]);
               var16 = Pk.q(var17, o.q[-30887 & 12633], var10);
               Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var16, o.q[25469 & 479]);
            }

            var5[var18] = var14;
            var6[var18] = var15;
            var7[var18] = var16;
         }
      }

      return new vl(var5, var7, var6);
   }

   public String tS() {
      return o.q[4574 & -13986];
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.s(var1, var2, var3);
   }
}
