import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TableTest
{
	
	TableBijective<Character, Integer> tbfr;

	@Before
	public void setUp () throws Exception
	{
		tbfr = new TableBijective<>();
	}

	@After
	public void tearDown () throws Exception
	{
	}

	@Test
	public void test1 () throws Exception
	{
		int code = 1234 * 1000 + 5678;
		tbfr.ajouter(null, code);
		assertEquals ((int) tbfr.image(null), code);
		assertEquals ((Object) tbfr.antecedent(code), null);
	}
	
	@Test
	public void test2 () throws Exception
	{
		int code = 0;
		tbfr.ajouter(' ', code);
		assertEquals ((int) tbfr.image(' '), code);
		assertEquals ((char) tbfr.antecedent(code), ' ');
	}
	
	@Test
	public void test3 () throws Exception
	{
		int code = 235;
		tbfr.ajouter('!', code);
		assertEquals ((int) tbfr.image('!'), code);
		assertEquals ((char) tbfr.antecedent(code), '!');
	}
	
	@Test
	public void test4 () throws Exception
	{
		int code = 16;
		tbfr.ajouter('1', code);
		assertEquals ((int) tbfr.image('1'), code);
		assertEquals ((char) tbfr.antecedent(code), '1');
	}
	
	@Test
	public void test5 () throws Exception
	{
		int code = 1247;
		tbfr.ajouter('F', code);
		assertEquals ((int) tbfr.image('F'), code);
		assertEquals ((char) tbfr.antecedent(code), 'F');
	}
	
	@Test
	public void test6 () throws Exception
	{
		int code = 10 * 1000 + 2345;
		tbfr.ajouter('q', code);
		assertEquals ((int) tbfr.image('q'), code);
		assertEquals ((char) tbfr.antecedent(code), 'q');
	}

}
