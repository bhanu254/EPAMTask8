package com.task8.EpamHTask8;
public class First2CharsRemove 
{

	public String delete(String str) 
	{
		StringBuilder sb=new StringBuilder(str);
		String finalstring;
		if(str.charAt(0)=='A'&&str.charAt(1)=='A')
			sb=sb.delete(0, 2);
		else if(str.charAt(0)=='A'||str.charAt(1)=='A')
			sb=sb.deleteCharAt(str.indexOf('A'));
		finalstring=sb.toString();
		return finalstring;
	}

}
