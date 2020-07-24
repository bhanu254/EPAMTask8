package com.task8.EpamHTask8;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

class First2CharsRemoveTest 
{
	/*TO-DO LIST for my future
	 * 1."ABCD"->"BCD"-success
	 * 2."BACD"->"BCD"-success
	 * 3."AACD"->"CD"-success
	 * 4."BBAA"->"BBAA"-success
	 * 5."AABBAA"->"BBAA"-success
	 */
	First2CharsRemove removechars;
	@Before
	void initialize()
	{
		removechars=new First2CharsRemove();
	}
	
	@Test
	void Remove1stchar() 
	{
		assertEquals("BCD",removechars.delete("ABCD"));
		assertEquals("SAABYHM",removechars.delete("ASAABYHM"));
	}
	
	@Test
	void Remove2ndchar()
	{
		assertEquals("BCD",removechars.delete("ABCD"));
		assertEquals("TAPWQ",removechars.delete("TAAPWQ"));
	}
	
	@Test
	void Removefirst2chars()
	{
		assertEquals("CD",removechars.delete("AACD"));
		assertEquals("BBAA",removechars.delete("AABBAA"));
	}
	
	@Test
	void Removenochar()
	{
		assertEquals("BBAA",removechars.delete("BBAA"));	
		assertEquals("CDBE",removechars.delete("CDBE"));
	}
}
