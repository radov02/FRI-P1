public class Fibonacci {
    private int prejsnjiClen;
    private int trenutniClen;

    public Fibonacci(int prejsnjiClen, int trenutniClen){
        this.prejsnjiClen = prejsnjiClen;
        this.trenutniClen = trenutniClen;
    }

    public int naslednji(){
        int naslednjiClen = this.trenutniClen;
        this.trenutniClen = this.prejsnjiClen + this.trenutniClen;
        this.prejsnjiClen = naslednjiClen;
        return this.trenutniClen;
    }
}
