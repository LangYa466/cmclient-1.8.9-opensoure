import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Eb {
   private static boolean bkF = false;
   private static final Logger bkG = LogManager.getLogger();
   private static final PrintStream bkH = System.out;

   private static void GV() {
      System.setErr(new Pm(o.q[8607 & -13890], System.err));
      System.setOut(new Pm(o.q[20959 & -23137], bkH));
   }

   static void GW() {
      dr.oG.r(Et.bmV, new Ec());
      dr.oG.r(Et.blL, new Ek());
      dr.oG.r(Et.blS, new El());
      dr.oG.r(Et.bkZ, new Em());
      dr.oG.r(Et.bnp, new En());
      dr.oG.r(Et.bnv, new Ep());
      dr.oG.r(Et.blV, new Eq());
      dr.oG.r(Et.bnw, new Er());
      dr.oG.r(Et.bmc, new Es());
      Ed var0 = new Ed();
      dr.oG.r(Et.bnE, var0);
      dr.oG.r(Et.bou, var0);
      dr.oG.r(Et.bmP, new Ee());
      dr.oG.r(Et.bna, new Ef());
      dr.oG.r(Et.boc, new Eg());
      dr.oG.r(Fm.C(Ea.bjE), new Eh());
      dr.oG.r(Et.bll, new Ei());
      dr.oG.r(Fm.C(Ea.biV), new Ej());
   }

   public static boolean GX() {
      return bkF;
   }

   public static void GY() {
      if (!bkF) {
         bkF = true;
         if (bkG.isDebugEnabled()) {
            GV();
         }

         cv.cG();
         dO.init();
         Fm.rv();
         Nj.init();
         GW();
      }

   }

   public static void bu(String var0) {
      bkH.println(var0);
   }
}
