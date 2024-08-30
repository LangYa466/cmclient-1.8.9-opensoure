package net.optifine.shaders;

import java.nio.IntBuffer;
import java.util.Arrays;

public class j {
   private IntBuffer cEz;
   private int cEA;
   private int aq;
   private final int cEB;
   private .Zx cEC;
   private final Boolean[] cED = new Boolean[8];
   private .ZJ cEE;
   private final boolean[] cEF = new boolean[8];
   private String cEG;
   private final String cEH;
   private IntBuffer cEI;
   private int cEJ;
   private int cEK;
   private .Zw cEL;
   private final net.optifine.shaders.l cEM;
   private final net.optifine.shaders.j cEN;

   public void q(net.optifine.shaders.j var1) {
      this.aq = var1.B();
      this.cEL = var1.ahZ();
      this.cEC = var1.aik();
      this.cEE = var1.ahX();
      System.arraycopy(var1.ahY(), 0, this.cED, 0, this.cED.length);
      this.cEG = var1.ain();
      this.cEz = var1.aie();
      this.cEA = var1.aih();
      this.cEJ = var1.aif();
      System.arraycopy(var1.aib(), 0, this.cEF, 0, this.cEF.length);
   }

   public .ZJ ahX() {
      return this.cEE;
   }

   public void e(IntBuffer var1) {
      this.cEz = var1;
   }

   public Boolean[] ahY() {
      return this.cED;
   }

   public int tb() {
      return this.cEB;
   }

   public .Zw ahZ() {
      return this.cEL;
   }

   public j(int var1, String var2, net.optifine.shaders.l var3, boolean var4) {
      this.cEB = var1;
      this.cEH = var2;
      this.cEM = var3;
      this.cEN = var4 ? this : null;
   }

   public String bY() {
      return this.cEH;
   }

   public int aia() {
      return this.cEK;
   }

   public String toString() {
      return .i.q[-28105 & 28215] + this.cEH + .w.q[8851 & -13836] + this.aq + .u.q[6461 & 9533] + this.cEK + .i.q[1598 & -24008] + this.aig();
   }

   public void e(.Zw var1) {
      this.cEL = var1;
   }

   public void iU(int var1) {
      this.cEK = var1;
   }

   public boolean[] aib() {
      return this.cEF;
   }

   public IntBuffer aic() {
      return this.cEI;
   }

   public net.optifine.shaders.l aid() {
      return this.cEM;
   }

   public IntBuffer aie() {
      return this.cEz;
   }

   public int aif() {
      return this.cEJ;
   }

   public String aig() {
      if (this.aq == 0) {
         return .q.q[8470 & -30700];
      } else {
         net.optifine.shaders.j var1;
         for(var1 = this; var1.aia() != this.aq; var1 = var1.aim()) {
            if (var1.aim() == null || var1.aim() == var1) {
               return .q.q[10463 & -16139];
            }
         }

         return var1.bY();
      }
   }

   public int aih() {
      return this.cEA;
   }

   public void aii() {
      this.cEL = null;
      this.cEC = null;
      this.cEE = null;
      Arrays.fill(this.cED, (Object)null);
   }

   public void aij() {
      this.aq = 0;
      this.cEK = 0;
   }

   public void w(.Zx var1) {
      this.cEC = var1;
   }

   public void iV(int var1) {
      this.cEA = var1;
   }

   public .Zx aik() {
      return this.cEC;
   }

   public j(int var1, String var2, net.optifine.shaders.l var3, net.optifine.shaders.j var4) {
      this.cEB = var1;
      this.cEH = var2;
      this.cEM = var3;
      this.cEN = var4;
   }

   public void ail() {
      this.cEG = null;
      this.cEA = 0;
      this.cEJ = 0;
      if (this.cEI == null) {
         this.cEI = net.optifine.shaders.F.jg(8);
      }

   }

   public void iW(int var1) {
      this.aq = var1;
   }

   public net.optifine.shaders.j aim() {
      return this.cEN;
   }

   public String ain() {
      return this.cEG;
   }

   public void iX(int var1) {
      this.cEJ = var1;
   }

   public void q(.ZJ var1) {
      this.cEE = var1;
   }

   public void fn(String var1) {
      this.cEG = var1;
   }

   public int B() {
      return this.aq;
   }
}
