package net.optifine.shaders;

public class t implements net.optifine.shaders.s {
   private int cDG = -1;
   private final .PJ cDH;
   public static final int cDI = 2;
   private .tF cDF;
   private int cDJ = 0;
   public static final int cDK = 1;
   public static final int cDL = 0;

   public int ahR() {
      .tF var1 = this.ahT();
      if (this.cDJ != 0 && var1 instanceof .tC) {
         .tC var2 = (.tC)var1;
         net.optifine.shaders.h var3 = var2.aul;
         if (var3 != null) {
            if (this.cDJ == 1) {
               return var3.cEx;
            }

            if (this.cDJ == 2) {
               return var3.cEw;
            }
         }
      }

      return var1.pv();
   }

   public String toString() {
      return .r.q[2236 & 29116] + this.cDG + .y.q[251 & -16391] + this.cDH + .r.q[13503 & 445] + (this.cDF != null ? this.cDF.pv() : .q.q[5313 & 2834]);
   }

   public int ahQ() {
      return this.cDG;
   }

   public void ahS() {
   }

   public t(int var1, .PJ var2, int var3) {
      this.cDG = var1;
      this.cDH = var2;
      this.cDJ = var3;
   }

   public int ahP() {
      return 3553;
   }

   public .tF ahT() {
      if (this.cDF == null) {
         .tS var1 = .hS.eV().fJ();
         this.cDF = var1.f(this.cDH);
         if (this.cDF == null) {
            this.cDF = new .tK(this.cDH);
            var1.q(this.cDH, this.cDF);
            this.cDF = var1.f(this.cDH);
         }
      }

      return this.cDF;
   }
}
