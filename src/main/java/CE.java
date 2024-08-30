import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.time.OffsetDateTime;

public class ce {
   private final int lx;
   private final int ly;
   private final boolean lz;
   private final String lA;
   private final String lB;
   private final String lC;
   private final OffsetDateTime lD;
   private final String lE;
   private final String lF;
   private final String lG;
   private final String lH;
   private final String lI;
   private final String lJ;
   private final OffsetDateTime lK;
   private final String lL;

   public ce(String var1, String var2, OffsetDateTime var3, OffsetDateTime var4, String var5, String var6, String var7, String var8, String var9, int var10, int var11, String var12, String var13, String var14, boolean var15) {
      this.lB = var1;
      this.lE = var2;
      this.lK = var3;
      this.lD = var4;
      this.lA = var5;
      this.lG = var6;
      this.lI = var7;
      this.lF = var8;
      this.lL = var9;
      this.lx = var10;
      this.ly = var11;
      this.lH = var12;
      this.lJ = var13;
      this.lC = var14;
      this.lz = var15;
   }

   public JsonObject bO() {
      JsonObject var1 = new JsonObject();
      if (this.lK != null) {
         var1.addProperty(r.q[-26053 & -12501 & -14415 & 4065], Long.valueOf(this.lK.toEpochSecond()));
      }

      if (this.lD != null) {
         var1.addProperty(r.q[-31186 & -26070 & 18214 & 20263], Long.valueOf(this.lD.toEpochSecond()));
      }

      JsonObject var2 = new JsonObject();
      if (this.lA != null) {
         var2.addProperty(r.q[-7509 & -7513 & 2943 & 11263], this.lA);
      }

      if (this.lG != null) {
         var2.addProperty(r.q[5052 & 16941 & 13094 & 17383], this.lG);
      }

      if (this.lI != null) {
         var2.addProperty(r.q[17191 & 1847 & -32203 & -15811], this.lI);
      }

      if (this.lF != null) {
         var2.addProperty(r.q[-24026 & -5338 & 22398 & 2039], this.lF);
      }

      JsonObject var3 = null;
      if (this.lL != null) {
         var3 = new JsonObject();
         var3.addProperty(w.q[-29443 & -21315 & 21375 & 20989], this.lL);
         JsonArray var4 = new JsonArray();
         var4.add(new JsonPrimitive(this.lx));
         var4.add(new JsonPrimitive(this.ly));
         var3.add(w.q[-23137 & -21605 & -25249 & 6431], var4);
      }

      JsonObject var6 = new JsonObject();
      if (this.lJ != null) {
         var6.addProperty(e.q[902 & -24954 & -2417 & 30639], this.lJ);
      }

      if (this.lC != null) {
         var6.addProperty(r.q[695 & 17407 & 2599 & 2791], this.lC);
      }

      if (this.lH != null) {
         var6.addProperty(r.q[-10561 & 26283 & 6974 & -25748], this.lH);
      }

      JsonObject var5 = new JsonObject();
      if (this.lB != null) {
         var5.addProperty(r.q[5755 & 4987 & 19119 & 7917], this.lB);
      }

      if (this.lE != null) {
         var5.addProperty(r.q[18990 & 19050 & -31110 & -15746], this.lE);
      }

      var5.add(r.q[-32149 & -15505 & 7727 & -18881], var1);
      var5.add(r.q[9212 & -31891 & -9602 & -9410], var2);
      if (var3 != null) {
         var5.add(r.q[11837 & 7807 & -32081 & -30995], var3);
      }

      var5.add(r.q[5039 & -32210 & -7250 & -23810], var6);
      var5.addProperty(r.q[30383 & 623 & -31057 & 6719], Boolean.valueOf(this.lz));
      return var5;
   }
}
