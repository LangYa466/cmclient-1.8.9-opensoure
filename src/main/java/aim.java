import java.util.ArrayList;
import java.util.List;

public class aim extends Thread {
   private List dAq;
   private int dAr;
   public boolean dAs;
   private final aew dAt;
   private double dAu;
   public aio dAv;
   private static final aeM dAw = new aeM();

   public void x() {
      this.dAq = new ArrayList();
      this.dAq.add(new aeP(this.dAt.dma, w.q[-19459 & -31747 & 20334 & 4078], aeQ.DOUBLE, q.q[19260 & 17269 & 6388 & 26046], w.q[18301 & -8337 & 19325 & 3053]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[-30866 & 1919 & -22674 & -29825], aeQ.FLOAT, q.q[-26442 & -27202 & -20866 & 9342], w.q[32767 & 20479 & -21649 & -23697]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[-22671 & 9202 & 24445 & 3957], aeQ.FLOAT, q.q[-8901 & -26565 & 11259 & 25599], w.q[-14339 & 26495 & 2941 & -7311]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[4082 & 1010 & -2182 & -12422], aeQ.DOUBLE, q.q[22335 & -3521 & -27521 & 383], w.q[-3085 & -13445 & -27649 & 8191]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[-22658 & -20482 & 3061 & 6135], aeQ.DOUBLE, q.q[5247 & -11779 & 2679 & -10691], w.q[-23689 & 2933 & -11393 & -10251]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[2046 & 4086 & 30582 & 13182], aeQ.FLOAT, q.q[-27977 & 19575 & -23561 & 11127], w.q[-3073 & 26615 & 8183 & 22391]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[-31875 & 11256 & 2938 & -31878], aeQ.FLOAT, q.q[13500 & -6600 & -16323 & -4036], w.q[3963 & -24709 & -31879 & -31879]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[8063 & 2943 & -27654 & -2182], aeQ.FLOAT, q.q[3262 & 7678 & -20033 & -30661], w.q[29563 & -3205 & -11269 & -30725]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[10236 & 27646 & -14465 & 1916], aeQ.LONG, q.q[-4740 & 7036 & 3327 & 21567], w.q[20349 & 20477 & -31747 & -20611]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[3071 & 2943 & 4990 & -13314], aeQ.DOUBLE, q.q[-28418 & -25346 & 11327 & -4546], w.q[3967 & 8063 & 7039 & 5119]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[28561 & 20417 & -19544 & 9203], aeQ.FLOAT, q.q[4543 & 5437 & -11137 & -6785], w.q[14313 & 29621 & 19333 & -14347]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[-30845 & -21613 & 30710 & -1037], aeQ.FLOAT, q.q[14329 & -19397 & 8573 & 21887], w.q[17287 & -89 & 1947 & 9115]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[-6260 & -22641 & 23463 & 20356], aeQ.DOUBLE, q.q[19953 & 11726 & -28435 & -28547], w.q[-10267 & -11 & 973 & -10355]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[-26682 & 6062 & -5242 & -21617], aeQ.FLOAT, q.q[4191 & -32183 & 7405 & -13069], w.q[19455 & 21455 & -41 & 16287]));
      this.dAq.add(new aeP(this.dAt.dma, w.q[21420 & 6046 & 26552 & 29611], aeQ.DOUBLE, q.q[2295 & 3182 & 22339 & 887], w.q[31663 & 11177 & -8241 & -15477]));
   }

   public void close() {
      this.dAs = (boolean)(23296 & -32627);
      this.interrupt();
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   public aim(aew var1) {
      super(w.q[879 & 1919 & 28667 & 27643]);
      this.dAt = var1;
      this.dAs = (boolean)(-16331 & 10243);
      this.x();
   }

   public void w(PB var1) {
      this.dAu = var1.bwj.h(this.dAt.dma.gj().av(1.0F));
   }

   public boolean J() {
      return (boolean)(!this.isInterrupted() && this.isAlive() && this.dAt.atS().bm.af() ? -31737 & 8617 : -20436 & 704);
   }
}
