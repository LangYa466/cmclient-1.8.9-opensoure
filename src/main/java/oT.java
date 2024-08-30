import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class Ot implements JsonDeserializer, JsonSerializer {
   public Or x(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if (var1.isJsonObject()) {
         Or var4 = new Or();
         JsonObject var5 = var1.getAsJsonObject();
         if (var5 == null) {
            return null;
         } else {
            if (var5.has(i.q[17302 & -27690])) {
               Or.w(var4, Boolean.valueOf(var5.get(i.q[18358 & 5023]).getAsBoolean()));
            }

            if (var5.has(i.q[983 & 17335])) {
               Or.r(var4, Boolean.valueOf(var5.get(i.q[919 & 18399]).getAsBoolean()));
            }

            if (var5.has(i.q[5016 & 927])) {
               Or.t(var4, Boolean.valueOf(var5.get(i.q[924 & 17305]).getAsBoolean()));
            }

            if (var5.has(i.q[3037 & -10343])) {
               Or.q(var4, Boolean.valueOf(var5.get(i.q[-7271 & 5019]).getAsBoolean()));
            }

            if (var5.has(i.q[-30758 & 15294])) {
               Or.e(var4, Boolean.valueOf(var5.get(i.q[9178 & 1946]).getAsBoolean()));
            }

            if (var5.has(q.q[27135 & -31841])) {
               Or.q(var4, (OJ)var3.deserialize(var5.get(q.q[4511 & -28769]), OJ.class));
            }

            if (var5.has(i.q[15259 & 991])) {
               Or.q(var4, var5.get(i.q[-22565 & 19355]).getAsString());
            }

            if (var5.has(i.q[-7203 & 6044])) {
               JsonObject var6 = var5.getAsJsonObject(i.q[-31812 & 924]);
               if (var6 != null) {
                  JsonPrimitive var7 = var6.getAsJsonPrimitive(u.q[495 & -28305]);
                  DX var8 = var7 == null ? null : DX.br(var7.getAsString());
                  JsonPrimitive var9 = var6.getAsJsonPrimitive(w.q[12207 & 21471]);
                  String var10 = var9 == null ? null : var9.getAsString();
                  if (var8 != null && var10 != null && var8.GR()) {
                     Or.q(var4, new DW(var8, var10));
                  }
               }
            }

            if (var5.has(i.q[18397 & 7071])) {
               JsonObject var11 = var5.getAsJsonObject(i.q[8127 & 925]);
               if (var11 != null) {
                  JsonPrimitive var12 = var11.getAsJsonPrimitive(u.q[367 & 3951]);
                  DZ var13 = var12 == null ? null : DZ.bs(var12.getAsString());
                  OX var14 = (OX)var3.deserialize(var11.get(w.q[17407 & 911]), OX.class);
                  if (var13 != null && var14 != null && var13.GR()) {
                     Or.q(var4, new DY(var13, var14));
                  }
               }
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.x(var1, var2, var3);
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.q((Or)var1, var2, var3);
   }

   public JsonElement q(Or var1, Type var2, JsonSerializationContext var3) {
      if (var1.isEmpty()) {
         return null;
      } else {
         JsonObject var4 = new JsonObject();
         if (Or.y(var1) != null) {
            var4.addProperty(i.q[25494 & 1942], Or.y(var1));
         }

         if (Or.a(var1) != null) {
            var4.addProperty(i.q[2999 & 17303], Or.a(var1));
         }

         if (Or.o(var1) != null) {
            var4.addProperty(i.q[24473 & 9148], Or.o(var1));
         }

         if (Or.e(var1) != null) {
            var4.addProperty(i.q[923 & 1977], Or.e(var1));
         }

         if (Or.r(var1) != null) {
            var4.addProperty(i.q[18426 & 922], Or.r(var1));
         }

         if (Or.w(var1) != null) {
            var4.add(q.q[4607 & 9119], var3.serialize(Or.w(var1)));
         }

         if (Or.i(var1) != null) {
            var4.add(i.q[959 & 3035], var3.serialize(Or.i(var1)));
         }

         if (Or.u(var1) != null) {
            JsonObject var5 = new JsonObject();
            var5.addProperty(u.q[5487 & -32273], Or.u(var1).GQ().GS());
            var5.addProperty(w.q[6063 & -31793], Or.u(var1).wx());
            var4.add(i.q[5020 & 991], var5);
         }

         if (Or.t(var1) != null) {
            JsonObject var6 = new JsonObject();
            var6.addProperty(u.q[367 & 7551], Or.t(var1).GT().GS());
            var6.add(w.q[2959 & -11313], var3.serialize(Or.t(var1).GU()));
            var4.add(i.q[2975 & 13213], var6);
         }

         return var4;
      }
   }
}
