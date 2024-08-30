package net.optifine.shaders;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class A implements net.optifine.shaders.d {
   protected File cFp;

   public String bY() {
      return this.cFp.getName();
   }

   public A(String var1, File var2) {
      this.cFp = var2;
   }

   public InputStream fm(String var1) {
      try {
         String var2 = net.optifine.util.J.t(var1, .q.q[27871 & 4191], .q.q[3423 & 12895]);
         File var3 = new File(this.cFp, var2);
         return !var3.exists() ? null : new BufferedInputStream(new FileInputStream(var3));
      } catch (Exception var4) {
         return null;
      }
   }

   public void close() {
   }

   public boolean fl(String var1) {
      File var2 = new File(this.cFp, var1.substring(1));
      return var2.exists() && var2.isDirectory();
   }
}
