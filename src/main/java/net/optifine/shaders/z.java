package net.optifine.shaders;

import java.util.ArrayList;
import java.util.List;

public class z {
   private final net.optifine.shaders.j cEW = this.q(.q.q[3088 & 8580], net.optifine.shaders.l.cEP, true);
   private final List cEX = new ArrayList();

   public net.optifine.shaders.j fo(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < this.cEX.size(); ++var2) {
            net.optifine.shaders.j var3 = (net.optifine.shaders.j)this.cEX.get(var2);
            String var4 = var3.bY();
            if (var4.equals(var1)) {
               return var3;
            }
         }

         return null;
      }
   }

   public net.optifine.shaders.j[] m(String var1, int var2) {
      net.optifine.shaders.j[] var3 = new net.optifine.shaders.j[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         String var5 = var4 == 0 ? var1 : var1 + var4;
         var3[var4] = this.fr(var5);
      }

      return var3;
   }

   public int afk() {
      return this.cEX.size();
   }

   public net.optifine.shaders.j[] aip() {
      net.optifine.shaders.j[] var1 = (net.optifine.shaders.j[])this.cEX.toArray(new net.optifine.shaders.j[this.cEX.size()]);
      return var1;
   }

   public net.optifine.shaders.j fp(String var1) {
      return this.q(var1, net.optifine.shaders.l.cEP, true);
   }

   private net.optifine.shaders.j q(String var1, net.optifine.shaders.l var2, boolean var3) {
      int var4 = this.cEX.size();
      net.optifine.shaders.j var5 = new net.optifine.shaders.j(var4, var1, var2, var3);
      this.cEX.add(var5);
      return var5;
   }

   public net.optifine.shaders.j aiq() {
      return this.cEW;
   }

   public String toString() {
      return this.cEX.toString();
   }

   public net.optifine.shaders.j fq(String var1) {
      return this.q(var1, net.optifine.shaders.l.cET, this.cEW);
   }

   public net.optifine.shaders.j fr(String var1) {
      return this.q(var1, net.optifine.shaders.l.cES, this.cEW);
   }

   public net.optifine.shaders.j q(String var1, net.optifine.shaders.l var2, net.optifine.shaders.j var3) {
      int var4 = this.cEX.size();
      net.optifine.shaders.j var5 = new net.optifine.shaders.j(var4, var1, var2, var3);
      this.cEX.add(var5);
      return var5;
   }

   public net.optifine.shaders.j[] q(net.optifine.shaders.j var1, net.optifine.shaders.j var2) {
      int var3 = var1.tb();
      int var4 = var2.tb();
      if (var3 > var4) {
         int var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      net.optifine.shaders.j[] var7 = new net.optifine.shaders.j[var4 - var3 + 1];

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = (net.optifine.shaders.j)this.cEX.get(var3 + var6);
      }

      return var7;
   }

   public String[] air() {
      String[] var1 = new String[this.cEX.size()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = ((net.optifine.shaders.j)this.cEX.get(var2)).bY();
      }

      return var1;
   }

   public net.optifine.shaders.j q(String var1, net.optifine.shaders.j var2) {
      return this.q(var1, net.optifine.shaders.l.cER, var2);
   }

   public net.optifine.shaders.j[] A(String var1, int var2) {
      net.optifine.shaders.j[] var3 = new net.optifine.shaders.j[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         String var5 = var4 == 0 ? var1 : var1 + var4;
         var3[var4] = this.fq(var5);
      }

      return var3;
   }

   public net.optifine.shaders.j w(String var1, net.optifine.shaders.j var2) {
      return this.q(var1, net.optifine.shaders.l.cEQ, var2);
   }
}
