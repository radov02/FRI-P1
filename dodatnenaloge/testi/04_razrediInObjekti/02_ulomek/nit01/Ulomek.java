public class Ulomek{
    int stevec;
    int imenovalec;

    public Ulomek(int a, int b){
        this.stevec = a;
        this.imenovalec = b;
        this.okrajsaj();
    }

    public void okrajsaj(){
        int gcd = najvecjiSkupniDelitelj(this.stevec, this.imenovalec);
        while(gcd != 1){
            this.stevec /= gcd;
            this.imenovalec /= gcd;
            gcd = najvecjiSkupniDelitelj(this.stevec, this.imenovalec);
        }

        if(this.imenovalec < 0){
            this.imenovalec = Math.abs(this.imenovalec);
            this.stevec = -this.stevec;
        }
    }

    public int najvecjiSkupniDelitelj(int a, int b)
    {
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public String toString() {
        return (this.stevec + "/" + this.imenovalec);
    }

    public boolean jeEnakKot(Ulomek u){
        return (this.stevec * u.imenovalec == this.imenovalec * u.stevec);
    }

    public Ulomek negacija(){
        return new Ulomek(-this.stevec, this.imenovalec);
    }

    public Ulomek obrat(){
        return new Ulomek(this.imenovalec, this.stevec);
    }

    public Ulomek vsota(Ulomek u){
        return new Ulomek(this.stevec * u.imenovalec + this.imenovalec * u.stevec, this.imenovalec * u.imenovalec);
    }

    public Ulomek razlika(Ulomek u){
        return new Ulomek(this.stevec * u.imenovalec - this.imenovalec * u.stevec, this.imenovalec * u.imenovalec);
    }

    public Ulomek zmnozek(Ulomek u){
        return new Ulomek(this.stevec * u.stevec, this.imenovalec * u.imenovalec);
    }

    public Ulomek kolicnik(Ulomek u){
        return new Ulomek(this.stevec * u.imenovalec, this.imenovalec * u.stevec);
    }

    public Ulomek potenca(int eksponent){
        if(eksponent == 0){
            return new Ulomek(1, 1);
        }
        else if(eksponent > 0){
            return new Ulomek((int)Math.pow(this.stevec, eksponent), (int)Math.pow(this.imenovalec, eksponent));
        }
        else{
            return new Ulomek((int)Math.pow(this.imenovalec, Math.abs(eksponent)), (int)Math.pow(this.stevec, Math.abs(eksponent)));
        }
    }

    public boolean jeManjsiOd(Ulomek u){
        int predznak = this.stevec * this.imenovalec;
        int predznak2 = u.stevec * u.imenovalec;
        if(predznak * predznak2 < 0){
            if(predznak < predznak2) return true;
            else return false;
        }
        return (this.stevec * u.imenovalec < this.imenovalec * u.stevec);
    }

}
