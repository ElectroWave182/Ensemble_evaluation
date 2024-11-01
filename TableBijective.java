import java.util.HashMap;

public class TableBijective<E, F>
{

	HashMap<E, F> images;
	HashMap<F, E> antecedents;
	
	public TableBijective()
	{
		images = new HashMap<>();
		antecedents = new HashMap<>();
	}
	
	public void ajouter(E e, F f) throws Exception
	{
		if (images.containsKey(e) || antecedents.containsKey(f))
		{
			throw new Exception("Association déjà présente dans le dictionnaire");
		}
		else
		{
			images.put(e, f);
			antecedents.put(f, e);
		}
	}
	
	public F image(E e)
	{
		return images.get(e);
	}
	
	public E antecedent(F f)
	{
		return antecedents.get(f);
	}
	
	
}
