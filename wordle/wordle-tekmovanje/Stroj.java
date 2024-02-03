import java.util.Set;
import java.util.List;


public interface Stroj {

	public abstract void inicializiraj(Set<String> besede);
	public abstract String poteza(List<Character> odziv);

}
