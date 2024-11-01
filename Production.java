public class Production implements Comparable<Production>
{
	
	String pays;
	int superficie;
	
	public Production (String p, int s)
	{
		pays = p;
		superficie = s;
	}
	
	public int compareTo (Production prod)
	{
		return this.superficie - prod.superficie;
	}
	
	public String toString ()
	{
		return pays + " " + superficie;
	}

}
