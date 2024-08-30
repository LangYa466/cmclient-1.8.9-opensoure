public enum aaF {
   cTr,
   cTs,
   cTt,
   cTu,
   cTv,
   cTw;

   public aaB gK(String var1) {
      // $FF: Couldn't be decompiled
   }

   public void q(net.optifine.expr.d var1, aaB var2) {
      // $FF: Couldn't be decompiled
   }

   private void q(net.optifine.expr.f var1, aav var2) {
      boolean var3 = var1.agj();
      int var4 = var3 ? 1 : 0;
      var2.ju(var4);
   }

   private void q(net.optifine.expr.h var1, aav var2) {
      int var3 = (int)var1.agg();
      var2.ju(var3);
   }

   private void q(net.optifine.expr.h var1, aau var2) {
      float var3 = var1.agg();
      var2.bK(var3);
   }

   private void q(net.optifine.expr.j var1, aaw var2) {
      float[] var3 = var1.agi();
      if (var3.length != 2) {
         throw new RuntimeException(p.q[1594 & -32210] + var3.length);
      } else {
         var2.B(var3[0], var3[1]);
      }
   }

   private void q(net.optifine.expr.j var1, aay var2) {
      float[] var3 = var1.agi();
      if (var3.length != 3) {
         throw new RuntimeException(p.q[-30165 & 4783] + var3.length);
      } else {
         var2.D(var3[0], var3[1], var3[2]);
      }
   }

   private void q(net.optifine.expr.j var1, aaz var2) {
      float[] var3 = var1.agi();
      if (var3.length != 4) {
         throw new RuntimeException(p.q[25516 & 5678] + var3.length);
      } else {
         var2.j(var3[0], var3[1], var3[2], var3[3]);
      }
   }

   public boolean q(net.optifine.expr.y var1) {
      // $FF: Couldn't be decompiled
   }

   public static aaF gL(String var0) {
      aaF[] var1 = values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         aaF var3 = var1[var2];
         if (var3.name().toLowerCase().equals(var0)) {
            return var3;
         }
      }

      return null;
   }
}
