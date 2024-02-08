import java.util.*;

public class OvojnikTabele implements Iterable{
    private Object[] tabela;
    protected int indeks = 0;

    public OvojnikTabele(Object[] tabela) {
        this.tabela = tabela;
    }

    @Override
    public Iterator<Object> iterator(){
        return new Iterator<Object>() {

            @Override
            public boolean hasNext(){
                return (indeks < tabela.length);
            }

            @Override
            public Object next(){
                if(this.hasNext()){
                    return tabela[indeks++];
                }
                else{
                    return null;
                }
            }
        };
    }
}