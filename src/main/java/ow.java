import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

final class OW implements Runnable {
   // $FF: synthetic field
   final File bSz;
   // $FF: synthetic field
   final String bSA;
   // $FF: synthetic field
   final Map bSB;
   // $FF: synthetic field
   final Pb bSC;
   // $FF: synthetic field
   final int bSD;
   // $FF: synthetic field
   final Proxy bSE;

   OW(Pb var1, String var2, Proxy var3, Map var4, File var5, int var6) {
      this.bSC = var1;
      this.bSA = var2;
      this.bSE = var3;
      this.bSB = var4;
      this.bSz = var5;
      this.bSD = var6;
   }

   public void run() {
      HttpURLConnection var1 = null;
      InputStream var2 = null;
      DataOutputStream var3 = null;
      if (this.bSC != null) {
         this.bSC.m(t.q[12740 & -16084]);
         this.bSC.v(t.q[-16019 & 5381]);
      }

      try {
         byte[] var4 = new byte[4096];
         URL var19 = new URL(this.bSA);
         var1 = (HttpURLConnection)var19.openConnection(this.bSE);
         float var6 = 0.0F;
         float var7 = (float)this.bSB.entrySet().size();

         for(Entry var9 : this.bSB.entrySet()) {
            var1.setRequestProperty((String)var9.getKey(), (String)var9.getValue());
            if (this.bSC != null) {
               this.bSC.as((int)(++var6 / var7 * 100.0F));
            }
         }

         var2 = var1.getInputStream();
         var7 = (float)var1.getContentLength();
         int var21 = var1.getContentLength();
         if (this.bSC != null) {
            this.bSC.v(String.format(t.q[2894 & -28409], var7 / 1000.0F / 1000.0F));
         }

         if (this.bSz.exists()) {
            long var22 = this.bSz.length();
            if (var22 == (long)var21) {
               if (this.bSC != null) {
                  this.bSC.eU();
               }

               return;
            }

            OV.hc().warn(t.q[-15961 & 2391] + this.bSz + t.q[3354 & 4361] + var21 + t.q[12571 & -28791] + var22 + t.q[2411 & 8458]);
            FileUtils.deleteQuietly(this.bSz);
         } else if (this.bSz.getParentFile() != null) {
            this.bSz.getParentFile().mkdirs();
         }

         var3 = new DataOutputStream(new FileOutputStream(this.bSz));
         if (this.bSD > 0 && var7 > (float)this.bSD) {
            if (this.bSC != null) {
               this.bSC.eU();
            }

            throw new IOException(t.q[9531 & 17355] + var6 + t.q[24877 & 1308] + this.bSD + w.q[-32483 & 21151]);
         } else {
            int var23 = 0;

            while((var23 = var2.read(var4)) >= 0) {
               var6 += (float)var23;
               if (this.bSC != null) {
                  this.bSC.as((int)(var6 / var7 * 100.0F));
               }

               if (this.bSD > 0 && var6 > (float)this.bSD) {
                  if (this.bSC != null) {
                     this.bSC.eU();
                  }

                  throw new IOException(t.q[3471 & 4957] + var6 + t.q[-26322 & 927] + this.bSD + w.q[-7907 & 4125]);
               }

               if (Thread.interrupted()) {
                  OV.hc().error(t.q[-21713 & 1423]);
                  if (this.bSC != null) {
                     this.bSC.eU();
                  }

                  return;
               }

               var3.write(var4, 0, var23);
            }

            if (this.bSC != null) {
               this.bSC.eU();
            }
         }
      } catch (Throwable var16) {
         var16.printStackTrace();
         if (var1 != null) {
            InputStream var5 = var1.getErrorStream();

            try {
               OV.hc().error(IOUtils.toString(var5));
            } catch (IOException var15) {
               var15.printStackTrace();
            }
         }

         if (this.bSC != null) {
            this.bSC.eU();
         }
      } finally {
         IOUtils.closeQuietly(var2);
         IOUtils.closeQuietly(var3);
      }
   }
}
