public abstract class Seznam{

    public int glava(){
        if(this instanceof Neprazen){
            Neprazen n = (Neprazen)this;
            return n.glava;
        }
        else{
            throw new java.util.NoSuchElementException();
        }
    }
    public Seznam rep(){
        if(this instanceof Neprazen){
            Neprazen n = (Neprazen)this;
            return n.rep;
        }
        else{
            throw new java.util.NoSuchElementException();
        }
    }
    public boolean jePrazen(){
        return (this instanceof Prazen);
    }
    public Seznam dodajZ(int element){
        return new Neprazen(element, this);
    }
    public Seznam dodajK(int element){
        if(this.jePrazen()){
            return this.dodajZ(element);
        }
        return new Neprazen(this, new Neprazen(element, new Prazen())); // ??
    }
    public Seznam dodajU(int element){
        if(this.jePrazen()){
            return this.dodajZ(element);
        }
        else if(element <= this.glava()){
            return this.dodajZ(element);
        }
        else{   // dodamo element na ustrezno mesto po urejenosti
            Seznam tr = this;
            while(tr.rep instanceof Neprazen){
                if(tr.rep.glava >= element){
                    tr.rep.dodajZ(element);
                    break;
                }
                tr = tr.rep;
            }
            if(tr.rep.rep.jePrazen() && tr.rep.glava >= element){
                tr.rep.dodajZ(element);
            }
            else{
                tr.rep.dodajK(element);
            }
        }
    }
    public boolean vsebuje(int element){
        Seznam trenutni = this;
        while(trenutni.rep instanceof Neprazen){
            if(trenutni.glava == element) return true;
            trenutni = trenutni.rep;
        }
        if(trenutni.rep.jePrazen() && trenutni.glava == element){
            return true;
        }
        return false;
    }
    public Seznam odstrani(int element){
        Seznam predhodni = this;
        Seznam trenutni = this;
        while(trenutni.rep instanceof Neprazen){
            if(trenutni.glava == element){
                predhodni.rep = trenutni.rep;
            }
            predhodni = trenutni;
            trenutni = trenutni.rep;
        }
        if(trenutni.rep.jePrazen() && trenutni.glava == element){
            predhodni.rep = new Prazen();
        }
        return this;
    }
    public Seznam uredi(){  // narascujoce
        if(this.jePrazen()) return this;
        Seznam predhodni = this;
        Seznam trenutni = this;
        while(trenutni.rep instanceof Neprazen){
            if(trenutni.glava < predhodni.glava){
                int tmp = predhodni.glava;
                predhodni.glava = trenutni.glava;
                trenutni.glava = tmp;
            }
            predhodni = trenutni;
            trenutni = trenutni.rep;
        }
        if(trenutni.rep.jePrazen() && trenutni.glava < predhodni.glava){
            int tmp = predhodni.glava;
            predhodni.glava = trenutni.glava;
            trenutni.glava = tmp;
        }
        return this;
    }
    public Seznam odstraniDuplikate(){
        return null;
    }
    public String toString(){
        String s = "[";
        Seznam sez = this;
        while(sez.rep instanceof Neprazen){
            s += (sez.glava + ", ");
        }
        if(sez.rep.jePrazen()){
            s += (sez.glava + "]");
        }
        return s;
    }
}