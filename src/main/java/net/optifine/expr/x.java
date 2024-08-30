package net.optifine.expr;

import java.util.ArrayList;
import java.util.Arrays;

public class x implements net.optifine.expr.l {
   private final net.optifine.expr.y[] cyn;
   private final net.optifine.expr.y[] cyo;
   private final net.optifine.expr.y[] cyp;
   private int cyq;
   private static final net.optifine.expr.y[] cyr = new net.optifine.expr.y[0];

   public x() {
      this((net.optifine.expr.y[])null, (net.optifine.expr.y[])null, (net.optifine.expr.y[])null);
   }

   public x(net.optifine.expr.y[] var1, net.optifine.expr.y[] var2, net.optifine.expr.y[] var3, int var4) {
      this.cyq = Integer.MAX_VALUE;
      this.cyn = e(var1);
      this.cyp = e(var2);
      this.cyo = e(var3);
      this.cyq = var4;
   }

   public net.optifine.expr.x q(net.optifine.expr.y... var1) {
      return new net.optifine.expr.x(var1, this.cyp, this.cyo);
   }

   public net.optifine.expr.x iD(int var1) {
      return new net.optifine.expr.x(this.cyn, this.cyp, this.cyo, var1);
   }

   public x(net.optifine.expr.y[] var1, net.optifine.expr.y[] var2, net.optifine.expr.y[] var3) {
      this(var1, var2, var3, Integer.MAX_VALUE);
   }

   public net.optifine.expr.x w(net.optifine.expr.y... var1) {
      return new net.optifine.expr.x(this.cyn, var1, this.cyo);
   }

   public net.optifine.expr.y[] agm() {
      return this.cyp;
   }

   public net.optifine.expr.y[] agn() {
      return this.cyn;
   }

   public net.optifine.expr.y[] ago() {
      return this.cyo;
   }

   public net.optifine.expr.y[] w(net.optifine.expr.d[] var1) {
      int var2 = this.cyn.length + this.cyo.length;
      int var3 = var1.length - var2;
      int var4 = 0;

      for(int var5 = 0; var5 + this.cyp.length <= var3 && var2 + var5 + this.cyp.length <= this.cyq; var5 += this.cyp.length) {
         ++var4;
      }

      ArrayList var7 = new ArrayList();
      var7.addAll(Arrays.asList(this.cyn));

      for(int var6 = 0; var6 < var4; ++var6) {
         var7.addAll(Arrays.asList(this.cyp));
      }

      var7.addAll(Arrays.asList(this.cyo));
      net.optifine.expr.y[] var8 = (net.optifine.expr.y[])var7.toArray(new net.optifine.expr.y[var7.size()]);
      return var8;
   }

   private static net.optifine.expr.y[] e(net.optifine.expr.y[] var0) {
      return var0 == null ? cyr : var0;
   }

   public int agp() {
      return this.cyn == null ? 0 : this.cyn.length;
   }

   public net.optifine.expr.x r(net.optifine.expr.y... var1) {
      return new net.optifine.expr.x(this.cyn, this.cyp, var1);
   }
}
