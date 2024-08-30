import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class XH {
   private static final Splitter cuB = Splitter.on('=').limit(2);
   private static final Pattern cuC = Pattern.compile(y.q[10660 & 1030]);

   public static String afD() {
      return uI.q(y.q[-8189 & 419]);
   }

   public static void afE() {
      Map var0 = uI.tm();
      ArrayList var1 = new ArrayList();
      String var2 = t.q[-24578 & 1023];
      String var3 = r.q[-7488 & 2508];
      String var4 = t.q[9215 & 21503];
      var1.add(var2 + var3 + var4);
      if (!MV.SL().aDL.equals(var3)) {
         var1.add(var2 + MV.SL().aDL + var4);
      }

      String[] var5 = (String[])var1.toArray(new String[var1.size()]);
      q(MV.SS(), var5, var0);
      uN[] var6 = MV.Rv();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         uN var8 = var6[var7];
         q(var8, var5, var0);
      }

   }

   private static void q(uN var0, String[] var1, Map var2) {
      try {
         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            PJ var5 = new PJ(var4);
            if (var0.v(var5)) {
               InputStream var6 = var0.c(var5);
               if (var6 != null) {
                  q(var6, var2);
               }
            }
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }

   }

   public static String afF() {
      return uI.q(e.q[24057 & 471]);
   }

   public static String eD(String var0) {
      return uI.q(var0);
   }

   public static String afG() {
      return uI.q(y.q[705 & 8505]);
   }

   public static String q(String var0, String var1, Object... var2) {
      String var3 = uI.q(var0, var2);
      return var3 != null && !var3.equals(var0) ? var3 : var1;
   }

   public static String c(String var0, String var1) {
      String var2 = uI.q(var0);
      return var2 != null && !var2.equals(var0) ? var2 : var1;
   }

   public static String afH() {
      return uI.q(e.q[-15884 & 976]);
   }

   public static String afI() {
      return uI.q(y.q[10242 & 691]);
   }

   public static void q(InputStream var0, Map var1) {
      Iterator var2 = IOUtils.readLines(var0, Charsets.UTF_8).iterator();
      var0.close();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         if (!var3.isEmpty() && var3.charAt(0) != '#') {
            String[] var4 = (String[])Iterables.toArray(cuB.split(var3), String.class);
            if (var4 != null && var4.length == 2) {
               String var5 = var4[0];
               String var6 = cuC.matcher(var4[1]).replaceAll(y.q[17536 & 4896]);
               var1.put(var5, var6);
            }
         }
      }

   }
}
