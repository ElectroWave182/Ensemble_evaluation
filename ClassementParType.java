import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ClassementParType
{
	
	TreeMap<String, TreeSet<Production>> classement;
	
	public ClassementParType ()
	{
		classement = new TreeMap<>();
		TreeSet<Production> productions;
		
		productions = new TreeSet<>();
		productions.add(new Production("Italie", 195053));
		productions.add(new Production("France", 133994));
		productions.add(new Production("Turquie", 114253));
		productions.add(new Production("Roumanie", 69684));
		classement.put("Blé", productions);
		
		productions = new TreeSet<>();
		productions.add(new Production("Italie", 27326));
		productions.add(new Production("France", 21388));
		productions.add(new Production("Turquie", 20608));
		productions.add(new Production("Pologne", 12054));
		classement.put("Fruits", productions);
		
		productions = new TreeSet<>();
		productions.add(new Production("Italie", 60732));
		productions.add(new Production("Pologne", 29841));
		productions.add(new Production("France", 26363));
		productions.add(new Production("Espagne", 22105));
		classement.put("Légumes frais", productions);
		
		productions = new TreeSet<>();
		productions.add(new Production("France", 115599));
		productions.add(new Production("Italie", 50477));
		productions.add(new Production("Allemagne", 40092));
		productions.add(new Production("Espagne", 34463));
		productions.add(new Production("Lituanie", 29755));
		productions.add(new Production("Grèce", 21247));
		productions.add(new Production("Finlande", 19777));
		classement.put("Légumes secs", productions);
		
		productions = new TreeSet<>();
		productions.add(new Production("France", 50559));
		productions.add(new Production("Roumanie", 26745));
		classement.put("Maïs", productions);
		
		productions = new TreeSet<>();
		productions.add(new Production("Italie", 17832));
		productions.add(new Production("France", 2531));
		productions.add(new Production("Roumanie", 2326));
		productions.add(new Production("Grèce", 1745));
		productions.add(new Production("Espagne", 1360));
		classement.put("Riz", productions);

	}
	
	public String toString ()
	{
		String sortie = "";
		
		TreeSet<Production> ens;
		Production prod;
		for (Entry<String, TreeSet<Production>> membres: classement.entrySet())
		{
			sortie += membres.getKey() + "\n";
			ens = membres.getValue();
			
			while (! ens.isEmpty())
			{
				prod = ens.pollLast();
				sortie += "  " + prod + "\n";
			}
		}
		
		return sortie;
	}
	
	public static void main (String[] args)
	{
		
		System.out.print(new ClassementParType());

	}
	
}
