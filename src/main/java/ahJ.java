import org.lwjgl.opengl.Display;

public class ahj {
   private float aNN;
   private boolean dxf = (boolean)(9232 & 3048);
   private float aOn;
   public final ar dxg;
   private boolean dxh = (boolean)(4359 & 17544);
   private final hS dxi;
   private int dxj;

   public boolean J() {
      return this.dxh;
   }

   public ahj(hS var1) {
      this.dxi = var1;
      this.dxg = (ar)var1.Bn.h(ar.class);
   }

   public boolean avO() {
      if (this.dxh && this.dxi.Br.aCr != 0) {
         if (this.dxi.Bi && Display.isActive()) {
            this.dxi.BT.Xt();
            float var1 = this.dxi.Br.aDV * 7.2000003F * 0.083333336F + 0.030588236F * 6.5384617F;
            float var2 = var1 * var1 * var1 * 18.588236F * 0.43037975F;
            float var3 = (float)this.dxi.BT.bTA * var2;
            float var4 = -((float)this.dxi.BT.bTB) * var2;
            this.aOn += var3 * 0.21153848F * 0.7090909F * (float)(this.dxg.ex.af() ? -1 & -1 : -26421 & 513);
            this.aNN += var4 * 0.067894734F * 2.2093024F * (float)(this.dxg.ew.af() ? -1 & -1 : 9505 & -16171);
            if (this.aNN > 240.96774F * 0.37349397F) {
               this.aNN = 1.7857143F * 50.4F;
            }

            if (this.aNN < 0.12244898F * -735.0F) {
               this.aNN = 6.375F * -14.117647F;
            }

            this.dxi.Cv.aku = (boolean)(2089 & -31743);
         }

         return (boolean)(-22007 & 16548);
      } else {
         return this.dxi.Bi;
      }
   }

   public void avP() {
      if (this.dxg.J()) {
         boolean var1 = this.dxi.Br.aCn.bC();
         if (this.dxg.ev.af()) {
            if (var1) {
               if (!this.dxf) {
                  this.dxf = (boolean)(8201 & -32491);
                  if (!this.dxh) {
                     this.aOn = this.dxi.CM.aOn;
                     this.aNN = this.dxi.CM.aNN;
                     this.dxj = this.dxi.Br.aCr;
                     this.dxi.Br.aCr = this.dxj == 0 ? 8739 & 16769 : this.dxj;
                  } else {
                     this.dxi.Br.aCr = this.dxj;
                     this.dxi.Cv.aku = (boolean)(1205 & -22269);
                  }

                  this.dxh = (boolean)(!this.dxh ? 16409 & 2247 : 4 & 21376);
               }
            } else if (this.dxf) {
               this.dxf = (boolean)(-28477 & 9748);
            }

         } else {
            if (var1) {
               if (!this.dxf) {
                  this.dxf = (boolean)(4533 & 26123);
                  this.aOn = this.dxi.CM.aOn;
                  this.aNN = this.dxi.CM.aNN;
                  this.dxj = this.dxi.Br.aCr;
                  this.dxi.Br.aCr = this.dxj == 0 ? 5669 & -22461 : this.dxj;
               }
            } else if (this.dxf) {
               this.dxf = (boolean)(147 & 10540);
               this.dxi.Br.aCr = this.dxj;
               this.dxi.Cv.aku = (boolean)(10383 & -11471);
            }

            this.dxh = var1;
            if (this.dxh && this.dxi.Br.aCr == 0) {
               this.dxh = (boolean)(9285 & 4386);
            }

         }
      }
   }

   public float cw(float var1) {
      return this.dxh ? this.aOn : var1;
   }

   public float cx(float var1) {
      return this.dxh ? this.aNN : var1;
   }
}
