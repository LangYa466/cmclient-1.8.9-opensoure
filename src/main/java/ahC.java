import java.lang.Thread.UncaughtExceptionHandler;

public class ahc {
   public aha dwF;
   public static ahc dwG = null;
   public int dwH = 4361 & -30652;
   private Thread dwI;
   protected final aew dwJ;
   public int dwK = 453 & -31744;
   public int dwL = 8566 & 20608;
   protected cp dwu;
   public agZ dwM;
   public int dwN = -30207 & 20488;

   public void avM() {
      this.dwF.dwr = (boolean)(20529 & -29175);
   }

   public ahc(aew var1) {
      dwG = this;
      this.dwJ = var1;
      this.dwM = new agZ();
      this.dwu = new cp(this.dwM.dwq, new ahd());
      this.dwF = new aha(this);
      this.dwI = new Thread(this.dwF, e.q[-31914 & 3932 & 785 & -13419]);
      this.dwI.setUncaughtExceptionHandler((var1x, var2) -> {
         this.dwJ.atI().error(e.q[22483 & 4051 & -15599 & -23621], var2);
      });
      this.dwI.start();
   }
}
