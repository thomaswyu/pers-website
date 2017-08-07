package com.tyu.springweb.html;

import com.tyu.springweb.PropertyLoadException;

public class StaticHTMLProperties
{
	public static final String STATIC_HTML_DIR = System.getProperty("directory.statichtml");

	static
	{
		validate();
	}

	private static void validate()
	{
		if (STATIC_HTML_DIR == null)
		{
			throw new PropertyLoadException("Could not find value for property key: " + STATIC_HTML_DIR);
		}
	}
}
