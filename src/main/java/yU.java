import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class YU {
   public static final String cAu = "http://optifine.net";
   public static final String cAv = "http://s.optifine.net";
   private static String cAw = null;

   public static String q(String var0, Map var1, byte[] var2) {
      HttpURLConnection var3 = null;

      String var4;
      try {
         URL var5 = new URL(var0);
         var3 = (HttpURLConnection)var5.openConnection(hS.eV().gf());
         var3.setRequestMethod(u.q[1019 & 765]);
         if (var1 != null) {
            for(Object var7 : var1.keySet()) {
               String var8 = q.q[4162 & 10240] + var1.get(var7);
               var3.setRequestProperty((String)var7, var8);
            }
         }

         var3.setRequestProperty(u.q[762 & 12286], p.q[10185 & -28197]);
         var3.setRequestProperty(r.q[11103 & 830], q.q[1128 & 16528] + var2.length);
         var3.setRequestProperty(u.q[3068 & 21245], u.q[21245 & 9213]);
         var3.setUseCaches(false);
         var3.setDoInput(true);
         var3.setDoOutput(true);
         OutputStream var15 = var3.getOutputStream();
         var15.write(var2);
         var15.flush();
         var15.close();
         InputStream var16 = var3.getInputStream();
         InputStreamReader var17 = new InputStreamReader(var16, StandardCharsets.US_ASCII);
         BufferedReader var9 = new BufferedReader(var17);
         StringBuffer var10 = new StringBuffer();

         String var11;
         while((var11 = var9.readLine()) != null) {
            var10.append(var11);
            var10.append('\r');
         }

         var9.close();
         var4 = var10.toString();
      } finally {
         if (var3 != null) {
            var3.disconnect();
         }

      }

      return var4;
   }

   public static byte[] fe(String var0) {
      HttpURLConnection var1 = null;

      byte[] var2;
      try {
         URL var3 = new URL(var0);
         var1 = (HttpURLConnection)var3.openConnection(hS.eV().gf());
         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();
         if (var1.getResponseCode() / 100 != 2) {
            if (var1.getErrorStream() != null) {
               MV.p(var1.getErrorStream());
            }

            throw new IOException(w.q[7126 & -15374] + var1.getResponseCode());
         }

         InputStream var4 = var1.getInputStream();
         byte[] var5 = new byte[var1.getContentLength()];
         int var6 = 0;

         while(true) {
            int var7 = var4.read(var5, var6, var5.length - var6);
            if (var7 < 0) {
               throw new IOException(p.q[-32312 & 488] + var0);
            }

            var6 += var7;
            if (var6 >= var5.length) {
               break;
            }
         }

         var2 = var5;
      } finally {
         if (var1 != null) {
            var1.disconnect();
         }

      }

      return var2;
   }

   public static synchronized String agQ() {
      if (cAw == null) {
         try {
            boolean var0 = MV.d(System.getProperty(p.q[-28214 & 17354]), false);
            if (var0) {
               File var1 = hS.eV().Ci;
               File var2 = new File(var1, p.q[459 & 491]);
               cAw = var2.toURI().toURL().toExternalForm();
            }
         } catch (Exception var3) {
            MV.cJ(var3.getClass().getName() + q.q[-30076 & 21421] + var3.getMessage());
         }

         if (cAw == null) {
            cAw = p.q[-29746 & 1532];
         }
      }

      return cAw;
   }
}
