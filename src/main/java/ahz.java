import java.net.URI;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ahZ extends aba {
   private ScheduledFuture dzL;
   private final aew dzM;
   private final ahY dzN;
   private final ab dzO;

   public void r(Exception var1) {
   }

   public void q(abS var1) {
      Thread.currentThread().setName(r.q[9151 & 1015 & 18367 & -28737]);
      this.dzM.atI().info(r.q[24568 & 27644 & 6074 & -70]);
      aib var10001 = (new aib(aic.HELLO)).iq(this.dzM.dma.fD().XD());
      this.dzM.getClass();
      var10001 = var10001.iu(q.q[-22341 & -4617 & -11585 & 6839]);
      this.dzM.getClass();
      this.gT(var10001.it(q.q[-10250 & -10826 & 26550 & 12478]).toString());
      this.dzL = ahY.dzK.scheduleAtFixedRate(new aif(this.dzM), -595638642076538789L & 595638641498542721L, -8704861726638784255L & 672281107L, TimeUnit.SECONDS);
   }

   public void gV(String var1) {
      // $FF: Couldn't be decompiled
   }

   public ahZ(aew var1, ahY var2, String var3) {
      super(URI.create(var3));
      this.dzM = var1;
      this.dzO = (ab)var1.h(ab.class);
      this.dzN = var2;
   }

   public void r(int var1, String var2, boolean var3) {
      Thread.currentThread().setName(r.q[28599 & 951 & 28607 & -24641]);
      if (this.dzL != null) {
         this.dzL.cancel((boolean)(-28151 & 24833));
         this.dzL = null;
      }

      StringBuilder var4 = new StringBuilder(r.q[32763 & -15429 & -18499 & -23621] + (var3 ? r.q[-19526 & -26693 & -31810 & 28666] : r.q[-1093 & 9151 & 24571 & 27643]) + w.q[61 & -20419 & -12065 & 10719]);
      if (var2 != null) {
         var4.append(r.q[-11332 & 30716 & 1020 & 5117]).append(var2);
      }

      if (var1 != 0) {
         var4.append(q.q[21326 & 2543 & 8170 & -12310]).append(var1).append((char)('贾' & '.'));
      }

      String var5 = var4.toString();
      int var6 = var2 != null && var2.equals(this.dzN.awK()) || this.dzN.awJ() != null && this.dzN.awJ().intValue() == var1 ? 17300 & 1090 : 12293 & 2401;
      if (var3 || var6 != 0) {
         this.dzN.ip(var2);
         this.dzN.e(Integer.valueOf(var1));
         this.dzM.atI().info(var5);
      }

   }
}
