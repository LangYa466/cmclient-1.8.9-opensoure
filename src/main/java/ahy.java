import com.mojang.authlib.GameProfile;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ahY extends Thread {
   private static final String dzA = "session.cmclient.pl";
   private aba dzB;
   private static final int dzC = 8001;
   private final Set dzD;
   private final aew dzE;
   private final Logger dzF;
   private static final String dzG = "ws://";
   private Integer dzH;
   private final Set dzI;
   private String dzJ;
   public static final ScheduledExecutorService dzK = Executors.newScheduledThreadPool(MV.St());

   public Set awI() {
      return this.dzI;
   }

   public void q(aib var1) {
      if (this.isOpen()) {
         this.dzB.gT(var1.toString());
      }
   }

   public Integer awJ() {
      return this.dzH;
   }

   public String awK() {
      return this.dzJ;
   }

   static {
      dzK.scheduleAtFixedRate(new aig(aew.atw()), 1090540062L & 705997855L, -3202060215260249134L & 43715410L, TimeUnit.SECONDS);
   }

   public void k(GameProfile var1) {
      if (var1 != null && this.isOpen()) {
         if (!var1.getId().equals(this.dzE.dma.CM.ym())) {
            String var2 = this.dzE.hD(var1.getName());
            if (aiA.iD(var2) && !this.dzI.contains(var2)) {
               this.dzI.add(var2);
            }
         }
      }
   }

   public void e(Integer var1) {
      this.dzH = var1;
   }

   public void l(GameProfile var1) {
      if (var1 != null && this.isOpen()) {
         String var2 = this.dzE.hD(var1.getName());
         if (aiA.iD(var2) && !this.dzD.contains(var2)) {
            this.dzD.add(var2);
         }
      }
   }

   public void awL() {
      this.close();
      this.dzI.clear();
      this.dzD.clear();
      this.dzB = new ahZ(this.dzE, this, i.q[-17377 & -7202 & -6309 & 18303]);
      this.dzB.anP();
   }

   public void ip(String var1) {
      this.dzJ = var1;
   }

   public boolean isOpen() {
      return (boolean)(this.dzB != null && this.dzB.isOpen() ? 19841 & 8225 : -29422 & 24584);
   }

   public void run() {
      try {
         this.awL();
      } catch (Exception var4) {
         this.dzF.error(i.q[-11233 & -11745 & 2207 & 10651], var4);
      }

      while(true) {
         try {
            Thread.sleep(1082161052L & -8071545134136678543L);
         } catch (InterruptedException var2) {
            ;
         }

         if (this.dzB == null || !this.dzB.isOpen()) {
            try {
               this.awL();
            } catch (Exception var3) {
               Logger var10000 = this.dzF;
               String var10001 = i.q[22782 & 2300 & -15843 & -15588];
               Object[] var10002 = new Object[-7999 & 6697];
               var10002[1584 & -30520] = var3.getMessage();
               var10000.error(var10001, var10002);
            }
         }
      }
   }

   public void close() {
      if (this.isOpen()) {
         this.dzB.close();
         this.dzB = null;
      }
   }

   public ahY(aew var1) {
      super(r.q[-14409 & 8127 & -13321 & 25591]);
      this.dzE = var1;
      this.dzF = LogManager.getLogger(this.getClass().getName());
      this.dzI = new HashSet();
      this.dzD = new HashSet();
   }

   public Set awM() {
      return this.dzD;
   }

   public Logger atI() {
      return this.dzF;
   }
}
