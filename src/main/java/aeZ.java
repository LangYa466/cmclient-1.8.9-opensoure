import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class aez {
   private static final ArrayList dmT = new ArrayList();
   private static final File dmU;
   private static final Gson dmV = (new GsonBuilder()).setPrettyPrinting().create();
   private static final hS dmW = hS.eV();

   public static void cm(int var0, int var1) {
      Collections.swap(dmT, var0, var1);
   }

   public static aeA kO(int var0) {
      return (aeA)dmT.get(var0);
   }

   public static int size() {
      return dmT.size();
   }

   public static void x() {
      dmT.clear();

      try {
         JsonElement var0 = aiy.e(new BufferedReader(new FileReader(dmU)));
         if (var0 instanceof JsonArray) {
            for(JsonElement var3 : var0.getAsJsonArray()) {
               JsonObject var4 = var3.getAsJsonObject();
               dmT.add(new aeA((String)Optional.ofNullable(var4.get(p.q[-13354 & 17406 & 10199 & 4058])).map(JsonElement::getAsString).orElse(q.q[17767 & 1051 & 16861 & 18428]), (String)Optional.ofNullable(var4.get(p.q[-26128 & -3600 & -22410 & 374])).map(JsonElement::getAsString).orElse(q.q[547 & 23174 & 3809 & 10633]), (String)Optional.ofNullable(var4.get(e.q[8399 & -5953 & -25145 & -18434])).map(JsonElement::getAsString).orElse(q.q[2568 & 2798 & 800 & -30559]), ((Long)Optional.ofNullable(var4.get(p.q[22491 & -14341 & -27657 & 2039])).map(JsonElement::getAsLong).orElse(Long.valueOf(System.currentTimeMillis()))).longValue()));
            }
         }
      } catch (FileNotFoundException var5) {
         dmW.Bn.atI().error(p.q[11253 & 3060 & 10204 & 11262], var5);
      }

   }

   public static void kP(int var0) {
      dmT.remove(var0);
   }

   static {
      dmU = new File(dmW.Ci, p.q[9215 & 11230 & 22519 & 30687]);
   }

   public static void aa() {
      try {
         JsonArray var0 = new JsonArray();
         dmT.forEach((var1x) -> {
            JsonObject var2 = new JsonObject();
            var2.addProperty(p.q[15350 & 31730 & -28710 & -7206], var1x.atV());
            var2.addProperty(p.q[9588 & 9714 & -30094 & -29707], var1x.atT());
            var2.addProperty(e.q[23695 & 6279 & -14913 & -11282], var1x.XD());
            var2.addProperty(p.q[18399 & 18395 & -3105 & -23565], Long.valueOf(var1x.atU()));
            var0.add(var2);
         });
         PrintWriter var1 = new PrintWriter(new FileWriter(dmU));
         var1.println(dmV.toJson(var0));
         var1.close();
      } catch (IOException var2) {
         dmW.Bn.atI().error(p.q[1023 & -3107 & 10231 & 6111], var2);
      }

   }

   public static void init() {
      if (!dmU.exists()) {
         try {
            if ((dmU.getParentFile().exists() || dmU.getParentFile().mkdirs()) && dmU.createNewFile()) {
               dmW.Bn.atI().info(p.q[20444 & 12252 & -16419 & -15408]);
            }
         } catch (IOException var1) {
            dmW.Bn.atI().error(p.q[-11305 & 18427 & 1009 & 19409], var1);
         }
      }

   }

   public static void q(aeA var0) {
      dmT.add(var0);
   }
}
