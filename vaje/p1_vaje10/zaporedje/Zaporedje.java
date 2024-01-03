
public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Interval minMax(Interval interval) {
        int spodnjaMeja = interval.vrniZacetek();
        int zgornjaMeja = interval.vrniKonec();
        Integer min = this.y(spodnjaMeja), max = this.y(spodnjaMeja);

        for(int i = spodnjaMeja + 1; i <= zgornjaMeja; i++){
            Integer vrednost = this.y(i);
            if(min == null){
                min = this.y(i);
            }
            if(max == null){
                max = this.y(i);
            }
            if(vrednost != null && vrednost < min){
                min = vrednost;
            }
            if(vrednost != null && vrednost > max){
                max = vrednost;
            }
        }
        return new Interval(min, max);
    }

    public boolean jeMonotono(Interval interval) {
        return (this.jeMonotono(interval, 0) || this.jeMonotono(interval, 1));
    }

    private boolean jeMonotono(Interval interval, int smer){    // 0 - narasca, 1 pada
        int spodnjaMeja = interval.vrniZacetek();
        int zgornjaMeja = interval.vrniKonec();

        for(int i = spodnjaMeja; i < zgornjaMeja; i++){
            Integer a = this.y(i);

            //System.out.println("[" + i + "," + a + "]");

            if(a == null) continue;

            for(int j = i + 1; j <= zgornjaMeja; j++){
                Integer b = this.y(j);

                if(b == null) continue;

                if(smer == 0 && b <= a){
                    return false;
                }
                else if(smer == 1 && a <= b){
                    return false;
                }
            }
        }
        return true;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        return new Vsota(this, drugo);
    }

    public Interval inverz(Interval interval) {
        return jeMonotono(interval) ? new Interval(this, interval) : null;
    }
}

class Vsota extends Zaporedje{
    private Zaporedje prvo;
    private Zaporedje drugo;
    
    public Vsota(Zaporedje prvo, Zaporedje drugo){
        this.prvo = prvo;
        this.drugo = drugo;
    }

    @Override
    public Integer y(int x) {
        if(prvo.y(x) == null || drugo.y(x) == null)
            return null;
        return prvo.y(x) + drugo.y(x);
    }
}

class Inverz extends Zaporedje{
    private Zaporedje zap;
    private Interval interval;

    public Inverz(Zaporedje zap, Interval interval){
        this.zap = zap;
        this.interval = new Interval(zap.y(interval.vrniZacetek()), zap.y(interval.vrniKonec()));
    }

    @Override
    public Integer y(int x) {



        
        if(zap.y(x) == null)
            return null;
        return ;
    }
}