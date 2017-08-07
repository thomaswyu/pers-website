package com.tyu.springweb;

public class PropertyLoadException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public PropertyLoadException(final String msg)
	{
		super(msg);
	}

	public PropertyLoadException(final String msg, final Exception e)
	{
		super(msg, e);
	}
}
