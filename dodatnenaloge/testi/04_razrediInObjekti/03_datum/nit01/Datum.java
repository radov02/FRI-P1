public class Datum {
    int dan;
    int mesec; 
    int leto;

    public Datum(int dan, int mesec, int leto){
        this.dan = dan;
        this.mesec = mesec;
        this.leto = leto;
    }

    public static Datum ustvari(int dan, int mesec, int leto){
        if(leto > 2999 || leto < 1583) return null;

        boolean prestopno = false;
        if(leto >= 1583 && leto < 3000 && prestopno(leto)){
            prestopno = true;
        }

        switch(mesec){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                if(dan < 1 || dan > 31){
                    return null;
                }; break;
            case 4: case 6: case 9: case 11:
                if(dan < 1 || dan > 30){
                    return null;
                }; break;
            case 2:
                if(prestopno){
                    if(dan < 1 || dan > 29){
                        return null;
                    };
                }
                else{
                    if(dan < 1 || dan > 28){
                        return null;
                    };
                }; break;
            default: return null;
        }

        return new Datum(dan, mesec, leto);
    }

    public String toString(){
        if(this == null) return "";
        return ((this.dan < 10 ? "0"+this.dan : this.dan) + "." + (this.mesec < 10 ? "0"+this.mesec : this.mesec) + "." + this.leto);
    }

    public boolean jeEnakKot(Datum datum){
        return (this.dan == datum.dan && this.mesec == datum.mesec && this.leto == datum.leto);
    }

    public boolean jePred(Datum datum){
        return (this.leto < datum.leto || this.leto == datum.leto && this.mesec < datum.mesec || this.leto == datum.leto && this.mesec == datum.mesec && this.dan < datum.dan);
    }

    public Datum naslednik(){
        if(this.dan == 31 && this.mesec == 12 && this.leto == 2999){
            return null;
        }
        int dan = this.dan + 1, mesec = this.mesec, leto = this.leto;
        int dniVMesecu = dniVMesecu(this.mesec, this.leto);
        if(this.dan == dniVMesecu){
            if(this.mesec == 12){
                leto++;
                mesec = 1;
                dan = 1;
            }
            else{
                mesec++;
                dan = 1;
            }
        }

        return new Datum(dan, mesec, leto);
    }

    public Datum predhodnik(){
        if(this.dan == 1 && this.mesec == 1 && this.leto == 1583) {
            return null;
        }
        int dan = this.dan - 1, mesec = this.mesec, leto = this.leto;
        
        if(this.dan == 1){
            if(this.mesec == 1){
                leto--;
                mesec = 12;
                dan = 31;
            }
            else if(this.mesec == 3){
                mesec--;
                if(prestopno(this.leto)){
                    dan = 29;
                }
                else{
                    dan = 28;
                }
            }
            else{
                mesec--;
                dan = 31;
            }
        }

        return new Datum(dan, mesec, leto);
    }

    public Datum cez(int stDni){
        int dniVMesecu = dniVMesecu(this.mesec, this.leto);
        return null;
    }

    public int razlika(Datum datum){
        return -1;
    }

    public static int dniVMesecu(int mesec, int leto){
        switch(mesec){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(prestopno(leto)){
                    return 29;
                }
                else{
                    return 28;
                }
            default: return -1;
        }
    }

    public static boolean prestopno(int leto){
        return (leto % 400 == 0 || leto % 4 == 0 && leto % 100 != 0);
    }



    public static void main(String[] args){

    }
}
