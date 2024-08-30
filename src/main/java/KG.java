public class Kg extends Kd {
   public void r(IG var1) {
      super.r(var1);
      var1.writeByte(this.byv);
      var1.writeByte(this.byt);
      var1.writeByte(this.byu);
      var1.writeByte(this.bxY);
      var1.writeByte(this.bxT);
      var1.writeBoolean(this.aNG);
   }

   public void e(IG var1) {
      super.e(var1);
      this.byv = var1.readByte();
      this.byt = var1.readByte();
      this.byu = var1.readByte();
      this.bxY = var1.readByte();
      this.bxT = var1.readByte();
      this.aNG = var1.readBoolean();
   }

   public Kg() {
      this.byw = true;
   }

   public Kg(int var1, byte var2, byte var3, byte var4, byte var5, byte var6, boolean var7) {
      super(var1);
      this.byv = var2;
      this.byt = var3;
      this.byu = var4;
      this.bxY = var5;
      this.bxT = var6;
      this.aNG = var7;
      this.byw = true;
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      super.q((Jb)var1);
   }
}
