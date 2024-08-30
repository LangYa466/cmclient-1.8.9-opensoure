public class KA implements IF {
   private NW bzi;
   private int bzj;
   private int bzk;
   private boolean bzl;

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jb)var1);
   }

   public void e(IG var1) {
      this.bzj = var1.readInt();
      this.bzi = var1.Jf();
      this.bzk = var1.readInt();
      this.bzl = var1.readBoolean();
   }

   public boolean Ma() {
      return this.bzl;
   }

   public int Mb() {
      return this.bzj;
   }

   public void q(Jb var1) {
      var1.q(this);
   }

   public NW Mc() {
      return this.bzi;
   }

   public int Md() {
      return this.bzk;
   }

   public KA(int var1, NW var2, int var3, boolean var4) {
      this.bzj = var1;
      this.bzi = var2;
      this.bzk = var3;
      this.bzl = var4;
   }

   public KA() {
   }

   public void r(IG var1) {
      var1.writeInt(this.bzj);
      var1.N(this.bzi);
      var1.writeInt(this.bzk);
      var1.writeBoolean(this.bzl);
   }
}
