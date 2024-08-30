public class KC implements IF {
   private float bzo;
   private float bzp;
   private boolean bzq;
   private OP bzr;
   private int[] bzs;
   private float bzt;
   private int bzu;
   private float bzv;
   private float bzw;
   private float bzx;
   private float bzy;

   public float Mf() {
      return this.bzo;
   }

   public void q(Jb var1) {
      var1.q(this);
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jb)var1);
   }

   public float Mg() {
      return this.bzy;
   }

   public float Mh() {
      return this.bzx;
   }

   public boolean Mi() {
      return this.bzq;
   }

   public int[] Mj() {
      return this.bzs;
   }

   public double Mk() {
      return (double)this.bzp;
   }

   public void e(IG var1) {
      this.bzr = OP.gF(var1.readInt());
      if (this.bzr == null) {
         this.bzr = OP.bRT;
      }

      this.bzq = var1.readBoolean();
      this.bzw = var1.readFloat();
      this.bzp = var1.readFloat();
      this.bzv = var1.readFloat();
      this.bzt = var1.readFloat();
      this.bzy = var1.readFloat();
      this.bzx = var1.readFloat();
      this.bzo = var1.readFloat();
      this.bzu = var1.readInt();
      int var2 = this.bzr.Xd();
      this.bzs = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.bzs[var3] = var1.Jk();
      }

   }

   public KC() {
   }

   public double Ml() {
      return (double)this.bzv;
   }

   public int Mm() {
      return this.bzu;
   }

   public void r(IG var1) {
      var1.writeInt(this.bzr.Xc());
      var1.writeBoolean(this.bzq);
      var1.writeFloat(this.bzw);
      var1.writeFloat(this.bzp);
      var1.writeFloat(this.bzv);
      var1.writeFloat(this.bzt);
      var1.writeFloat(this.bzy);
      var1.writeFloat(this.bzx);
      var1.writeFloat(this.bzo);
      var1.writeInt(this.bzu);
      int var2 = this.bzr.Xd();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.fC(this.bzs[var3]);
      }

   }

   public double Mn() {
      return (double)this.bzw;
   }

   public OP Dr() {
      return this.bzr;
   }

   public KC(OP var1, boolean var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int... var11) {
      this.bzr = var1;
      this.bzq = var2;
      this.bzw = var3;
      this.bzp = var4;
      this.bzv = var5;
      this.bzt = var6;
      this.bzy = var7;
      this.bzx = var8;
      this.bzo = var9;
      this.bzu = var10;
      this.bzs = var11;
   }

   public float Mo() {
      return this.bzt;
   }
}
