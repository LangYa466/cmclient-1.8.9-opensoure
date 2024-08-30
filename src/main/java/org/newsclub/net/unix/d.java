package org.newsclub.net.unix;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

final class d extends org.newsclub.net.unix.f {
   private final String dlT;
   private final String dlU;
   private final InputStream dlV;

   d(String var1, String var2, String var3, InputStream var4) {
      super(var2);
      this.dlT = var1;
      this.dlU = var3;
      this.dlV = var4;
   }

   public void close() {
      try {
         this.dlV.close();
      } catch (IOException var2) {
         ;
      }

   }

   synchronized String atu() {
      if (this.dlW == null) {
         return null;
      } else {
         File var1 = org.newsclub.net.unix.s.Y(.w.q[-7203 & -5388 & 4862 & 22270], System.mapLibraryName(this.dlW));

         try {
            FileOutputStream var2 = new FileOutputStream(var1);
            Throwable var3 = null;

            try {
               byte[] var4 = new byte[-27568 & 22784];

               int var5;
               while((var5 = this.dlV.read(var4)) >= 0) {
                  var2.write(var4, 24592 & -28671, var5);
               }
            } catch (Throwable var20) {
               var3 = var20;
               throw var20;
            } finally {
               if (var2 != null) {
                  if (var3 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var19) {
                        var3.addSuppressed(var19);
                     }
                  } else {
                     var2.close();
                  }
               }

            }
         } finally {
            this.dlV.close();
         }

         System.load(var1.getAbsolutePath());
         if (!var1.delete()) {
            var1.deleteOnExit();
         }

         return this.dlT + .q.q[10623 & 22655 & -28321 & 22911] + this.dlW;
      }
   }

   public String toString() {
      return super.toString() + .w.q[6811 & 13851 & 27291 & -6945] + this.dlT + .w.q[-24710 & -4998 & 14838 & -24202] + this.dlU + .w.q[-9699 & -17249 & 3391 & 29981];
   }
}
