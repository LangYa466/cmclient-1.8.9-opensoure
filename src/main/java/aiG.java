import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.TimerTask;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.Logger;

public class aig extends TimerTask {
   private final String dzS;
   private String dzT;
   public static final int dzU = 850;
   private final aew dzV;
   private final Gson dzW;
   private static final String dzX = "https://telemetry.cmclient.pl";
   private final Logger dzY;

   public aig(aew var1) {
      this.dzV = var1;
      this.dzY = var1.atI();
      var1.getClass();
      this.dzS = q.q[14259 & -22537 & 25843 & 4851];
      this.dzW = new Gson();
   }

   private String awT() {
      String var1 = System.getProperty(q.q[-27179 & 18647 & -8198 & -24582]);
      int var3 = -1 & -1;
      switch(var1.hashCode()) {
      case -1221096139:
         if (var1.equals(p.q[18413 & 27645 & 5117 & 7151])) {
            var3 = 519 & 26691;
         }
         break;
      case -806050265:
         if (var1.equals(p.q[9215 & 16363 & 20459 & 20475])) {
            var3 = 16410 & 1952;
         }
         break;
      case 117110:
         if (var1.equals(q.q[-17186 & -16386 & 6357 & 8916])) {
            var3 = -28670 & 10758;
         }
         break;
      case 92926582:
         if (var1.equals(p.q[-2052 & -6164 & 5100 & -28692])) {
            var3 = 20555 & -32719;
         }
      }

      switch(var3) {
      case 0:
      case 1:
         return p.q[-10242 & -14354 & 11246 & 11246];
      case 2:
         return p.q[22511 & -15377 & -31761 & -15361];
      case 3:
         return p.q[-24592 & 14321 & 13307 & 2043];
      default:
         Logger var10000 = this.dzY;
         String var10001 = p.q[5109 & 1017 & -5121 & 29695];
         Object[] var10002 = new Object[-12031 & 2119];
         var10002[15124 & -15359] = var1;
         var10000.warn(var10001, var10002);
         return q.q[-26115 & 2555 & -28423 & 249];
      }
   }

   public void awU() {
      try {
         CloseableHttpClient var1 = HttpClients.createDefault();
         Throwable var2 = null;

         try {
            String var3 = this.awV();
            String var4 = this.awT();
            String var5 = p.q[-23558 & 31742 & 6135 & 30707] + URLEncoder.encode(var3, u.q[-14913 & -15361 & 6527 & -28225]) + p.q[-5 & -4105 & 21503 & -27657] + URLEncoder.encode(var4, u.q[24895 & 27455 & 32575 & -26177]) + p.q[-21516 & -24579 & 17406 & 2038] + URLEncoder.encode(this.dzS, u.q[20799 & -14849 & 11199 & 3391]);
            if (this.dzV.dmH != null) {
               var5 = var5 + p.q[-7171 & 4085 & 29685 & -11275] + URLEncoder.encode(this.dzV.dmH.Zd.toLowerCase(), u.q[-17089 & 8639 & 23487 & 17279]);
            }

            if (this.dzT != null) {
               var5 = var5 + p.q[11263 & -5122 & -10250 & -2] + URLEncoder.encode(this.dzT, u.q[26943 & -18561 & -14913 & -30785]);
            }

            HttpPost var6 = new HttpPost(p.q[7159 & 15359 & 18423 & 24567]);
            var6.setHeader(u.q[8955 & 11258 & -30721 & -26881], u.q[-6405 & 4863 & -32001 & -22785]);
            var6.setHeader(w.q[32714 & 4058 & -11286 & -1077], o.q[18167 & 9207 & -17409 & -14465]);
            var6.setEntity(new StringEntity(var5, StandardCharsets.UTF_8));
            CloseableHttpResponse var7 = var1.execute(var6);
            Throwable var8 = null;

            try {
               int var9 = var7.getStatusLine().getStatusCode();
               if (var9 == (20680 & -32280)) {
                  HttpEntity var48 = var7.getEntity();
                  String var49 = EntityUtils.toString(var48, StandardCharsets.UTF_8);
                  JsonObject var12 = (JsonObject)this.dzW.fromJson(var49, JsonObject.class);
                  if (var12.has(o.q[-6165 & -7437 & -31761 & 5099])) {
                     Logger var51 = this.dzY;
                     String var53 = p.q[-13317 & -19461 & 19453 & -29701];
                     Object[] var55 = new Object[24647 & -32607];
                     var55[8320 & 6660] = var12.get(o.q[-9481 & -8201 & 26355 & 16099]).getAsString();
                     var51.error(var53, var55);
                     return;
                  }

                  this.dzT = var12.get(e.q[-16737 & -28995 & 28901 & 15581]).getAsString();
                  Logger var50 = this.dzY;
                  String var52 = p.q[-28678 & -24581 & 29695 & 25598];
                  Object[] var54 = new Object[-11967 & 1205];
                  var54[896 & 0] = this.dzT;
                  var50.info(var52, var54);
                  return;
               }

               HttpEntity var10 = var7.getEntity();
               String var11 = EntityUtils.toString(var10, StandardCharsets.UTF_8);
               this.dzY.info(var11);
               Logger var10000 = this.dzY;
               String var10001 = p.q[-28678 & -22536 & -19460 & 32765];
               Object[] var10002 = new Object[16949 & 3083];
               var10002[16388 & 1602] = var9;
               var10000.error(var10001, var10002);
            } catch (Throwable var43) {
               var8 = var43;
               throw var43;
            } finally {
               if (var7 != null) {
                  if (var8 != null) {
                     try {
                        var7.close();
                     } catch (Throwable var42) {
                        var8.addSuppressed(var42);
                     }
                  } else {
                     var7.close();
                  }
               }

            }
         } catch (Throwable var45) {
            var2 = var45;
            throw var45;
         } finally {
            if (var1 != null) {
               if (var2 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var41) {
                     var2.addSuppressed(var41);
                  }
               } else {
                  var1.close();
               }
            }

         }

      } catch (Exception var47) {
         this.dzY.error(p.q[27643 & -12293 & 10235 & 32767], var47);
      }
   }

   private String awV() {
      return System.getProperty(q.q[8955 & 8434 & 17115 & 17630]);
   }

   public void run() {
      try {
         this.awU();
      } catch (Exception var2) {
         this.dzY.error(p.q[1006 & 6126 & -23557 & -22533], var2);
      }

   }
}
