import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class iy implements Pf, uM {
   private final uL Eh;
   public static final iM Ei = new iM(new PJ(a.q[-15188 & 41]), 0.0D, 0.0D, false);
   private final iN Ej = new iN();
   private static final ParameterizedType Ek = new iz();
   public final iG El;
   private static final Logger Em = LogManager.getLogger();
   private static final Gson En = (new GsonBuilder()).registerTypeAdapter(iC.class, new iF()).create();

   public void gI() {
      this.El.gY();
   }

   public ix q(iv... var1) {
      ArrayList var2 = Lists.newArrayList();

      for(PJ var4 : this.Ej.Xx()) {
         ix var5 = (ix)this.Ej.k(var4);
         if (ArrayUtils.contains(var1, var5.gH())) {
            var2.add(var5);
         }
      }

      if (var2.isEmpty()) {
         return null;
      } else {
         return (ix)var2.get((new Random()).nextInt(var2.size()));
      }
   }

   private void q(PJ var1, iC var2) {
      // $FF: Couldn't be decompiled
   }

   public void gJ() {
      this.El.gZ();
   }

   public iy(uL var1, vL var2) {
      this.Eh = var1;
      this.El = new iG(this, var2);
   }

   public void aW() {
      this.El.gW();
   }

   public void gK() {
      this.El.gU();
   }

   public void gL() {
      this.El.gV();
   }

   public void q(DD var1, float var2) {
      this.El.q(var1, var2);
   }

   public ix r(PJ var1) {
      return (ix)this.Ej.k(var1);
   }

   protected Map e(InputStream var1) {
      Map var2;
      try {
         var2 = (Map)En.fromJson(new InputStreamReader(var1), Ek);
      } finally {
         IOUtils.closeQuietly(var1);
      }

      return var2;
   }

   public boolean q(ik var1) {
      return this.El.q(var1);
   }

   public void q(uL var1) {
      this.El.gX();
      this.Ej.hh();

      for(String var3 : var1.aR()) {
         try {
            for(uK var5 : var1.q(new PJ(var3, a.q[4639 & 2335]))) {
               try {
                  Map var6 = this.e(var5.getInputStream());

                  for(Entry var8 : var6.entrySet()) {
                     this.q(new PJ(var3, (String)var8.getKey()), (iC)var8.getValue());
                  }
               } catch (RuntimeException var9) {
                  Em.warn(a.q[3683 & -28360], var9);
               }
            }
         } catch (IOException var10) {
            ;
         }
      }

   }

   public void q(ik var1, int var2) {
      this.El.q(var1, var2);
   }

   // $FF: synthetic method
   static iN q(iy var0) {
      return var0.Ej;
   }

   public void w(ik var1) {
      this.El.w(var1);
   }

   public void e(ik var1) {
      this.El.e(var1);
   }

   public void q(iv var1, float var2) {
      if (var1 == iv.DL && var2 <= 0.0F) {
         this.gL();
      }

      this.El.w(var1, var2);
   }
}
