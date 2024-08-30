import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

class aak extends kx {
   private ArrayList cRq;
   private long cRr = 0L;
   private int Hp;
   final aah cRs;

   public void alY() {
      this.cRq = net.optifine.shaders.F.akg();
      this.Hp = 0;
      int var1 = 0;

      for(int var2 = this.cRq.size(); var1 < var2; ++var1) {
         if (((String)this.cRq.get(var1)).equals(net.optifine.shaders.F.cJd)) {
            this.Hp = var1;
            break;
         }
      }

   }

   public aak(aah var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1.alX(), var2, var3, var4, var5, var6);
      this.cRs = var1;
      this.alY();
      this.OA = 0.0F;
      int var7 = this.Hp * var6;
      int var8 = (var5 - var4) / 2;
      if (var7 > var8) {
         this.aS(var7 - var8);
      }

   }

   private boolean q(net.optifine.shaders.d var1, int var2) {
      if (var1 == null) {
         return true;
      } else {
         InputStream var3 = var1.fm(u.q[13198 & -32329]);
         Properties var4 = net.optifine.util.H.e(var3, t.q[1008 & 25427]);
         if (var4 == null) {
            return true;
         } else {
            String var5 = i.q[-30515 & 205];
            String var6 = var4.getProperty(var5);
            if (var6 == null) {
               return true;
            } else {
               var6 = var6.trim();
               String var7 = i.q[16591 & 1262];
               int var8 = MV.h(var7, var6);
               if (var8 >= 0) {
                  return true;
               } else {
                  String var9 = (i.q[10447 & -32049] + var6).replace('_', ' ');
                  String var10 = uI.q(i.q[26864 & 1240], var9);
                  String var11 = uI.q(i.q[-32557 & 6869]);
                  aal var12 = new aal(this, var2);
                  kD var13 = new kD(var12, var10, var11, 0);
                  this.Ol.r(var13);
                  return false;
               }
            }
         }
      }
   }

   protected int bi() {
      return this.bh() * 18;
   }

   protected void bg() {
   }

   protected int bj() {
      return this.eo - 6;
   }

   protected void q(int var1, boolean var2, int var3, int var4) {
      if (var1 != this.Hp || this.Ox != this.cRr) {
         String var5 = (String)this.cRq.get(var1);
         net.optifine.shaders.d var6 = net.optifine.shaders.F.fK(var5);
         if (this.q(var6, var1)) {
            this.jw(var1);
         }
      }

   }

   // $FF: synthetic method
   static void q(aak var0, int var1) {
      var0.jw(var1);
   }

   public int alZ() {
      return this.Hp;
   }

   public int iC() {
      return this.eo - 20;
   }

   protected boolean x(int var1) {
      return var1 == this.Hp;
   }

   private void jw(int var1) {
      this.Hp = var1;
      this.cRr = this.Ox;
      net.optifine.shaders.F.fE((String)this.cRq.get(var1));
      net.optifine.shaders.F.ajW();
      this.cRs.jG();
   }

   protected int bh() {
      return this.cRq.size();
   }

   // $FF: synthetic method
   static hS q(aak var0) {
      return var0.Ol;
   }

   protected void w(int var1, int var2, int var3, int var4, int var5, int var6) {
      String var7 = (String)this.cRq.get(var1);
      if (var7.equals(q.q[23551 & 930])) {
         var7 = XH.eD(i.q[22994 & -24366]);
      } else if (var7.equals(u.q[-24111 & 1961])) {
         var7 = XH.eD(i.q[26871 & -28461]);
      }

      this.cRs.e(var7, this.eo / 2, var3 + 1, 14737632);
   }
}
