public class DT extends DU {
   protected void q(PB var1) {
      if (var1.bTG != null) {
         byte var2 = 0;
         if (var1.bTG instanceof BS) {
            var2 = 3;
         }

         var1.bTG.q(Oz.w(this, this.GO()), (float)var2);
      }

      for(int var3 = 0; var3 < 8; ++var3) {
         this.vR.q(OP.bRP, this.aNZ, this.aNK, this.aOt, 0.0D, 0.0D, 0.0D);
      }

      if (!this.vR.bXF) {
         this.yo();
      }

   }

   public DT(QI var1) {
      super(var1);
   }

   public DT(QI var1, zz var2) {
      super(var1, var2);
   }

   public DT(QI var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }
}
