public class sI extends sv {
   private static final PJ asc = new PJ(o.q[-28399 & 1012]);
   private static final PJ asd = new PJ(o.q[22975 & 279]);
   private static final PJ ase = new PJ(o.q[307 & 14806]);
   private static final PJ asf = new PJ(o.q[8657 & 1301]);
   private static final PJ asg = new PJ(o.q[405 & 8503]);
   private static final PJ ash = new PJ(o.q[16799 & -30922]);
   private static final PJ asi = new PJ(o.q[-14028 & 10134]);
   private static final PJ asj = new PJ(o.q[6487 & 8603]);

   protected PJ q(Dd var1) {
      String var2 = OJ.de(var1.bY());
      if (var2 != null && var2.equals(o.q[4895 & 8495])) {
         return ash;
      } else {
         switch(var1.EQ()) {
         case 0:
         default:
            return asc;
         case 1:
            return asf;
         case 2:
            return ase;
         case 3:
            return asg;
         case 4:
            return asj;
         case 5:
            return asi;
         case 99:
            return asd;
         }
      }
   }

   public sI(sx var1, lJ var2, float var3) {
      super(var1, var2, var3);
   }

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.q((Dd)var1);
   }
}
