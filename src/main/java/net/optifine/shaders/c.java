package net.optifine.shaders;

import com.google.common.base.Joiner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class C implements net.optifine.shaders.d {
   protected String cFq;
   protected ZipFile cFr;
   protected File cFp;

   public boolean fl(String var1) {
      try {
         if (this.cFr == null) {
            this.cFr = new ZipFile(this.cFp);
            this.cFq = this.q(this.cFr);
         }

         String var2 = net.optifine.util.J.Q(var1, .q.q[18527 & 607]);
         ZipEntry var3 = this.cFr.getEntry(this.cFq + var2);
         return var3 != null;
      } catch (IOException var4) {
         return false;
      }
   }

   public void close() {
      if (this.cFr != null) {
         try {
            this.cFr.close();
         } catch (Exception var2) {
            ;
         }

         this.cFr = null;
      }

   }

   public InputStream fm(String var1) {
      try {
         if (this.cFr == null) {
            this.cFr = new ZipFile(this.cFp);
            this.cFq = this.q(this.cFr);
         }

         String var2 = net.optifine.util.J.Q(var1, .q.q[1503 & 18527]);
         if (var2.contains(.p.q[3581 & 476])) {
            var2 = this.fw(var2);
         }

         ZipEntry var3 = this.cFr.getEntry(this.cFq + var2);
         return var3 == null ? null : this.cFr.getInputStream(var3);
      } catch (Exception var4) {
         return null;
      }
   }

   public C(String var1, File var2) {
      this.cFp = var2;
      this.cFr = null;
      this.cFq = .q.q[-32412 & 8208];
   }

   private String fw(String var1) {
      ArrayDeque var2 = new ArrayDeque();
      String[] var3 = .MV.f(var1, .q.q[-32545 & 11647]);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (var5.equals(.p.q[-21538 & 508])) {
            if (var2.isEmpty()) {
               return .q.q[-14206 & 16];
            }

            var2.removeLast();
         } else {
            var2.add(var5);
         }
      }

      String var6 = Joiner.on('/').join(var2);
      return var6;
   }

   private String q(ZipFile var1) {
      ZipEntry var2 = var1.getEntry(.u.q[5027 & -13854]);
      if (var2 != null && var2.isDirectory()) {
         return .q.q[-28375 & 3072];
      } else {
         Pattern var3 = Pattern.compile(.p.q[25055 & 1501]);
         Enumeration var4 = var1.entries();

         while(var4.hasMoreElements()) {
            ZipEntry var5 = (ZipEntry)var4.nextElement();
            String var6 = var5.getName();
            Matcher var7 = var3.matcher(var6);
            if (var7.matches()) {
               String var8 = var7.group(1);
               if (var8 != null) {
                  if (var8.equals(.u.q[931 & 10674])) {
                     return .q.q[9 & -20352];
                  }

                  return var8;
               }
            }
         }

         return .q.q[360 & 24581];
      }
   }

   public String bY() {
      return this.cFp.getName();
   }
}
