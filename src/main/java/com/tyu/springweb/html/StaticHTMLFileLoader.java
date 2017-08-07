package com.tyu.springweb.html;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

public class StaticHTMLFileLoader
{
	public static String loadStaticTextFile(final String file) throws IOException
	{
		final Path pathToText = Paths.get(StaticHTMLProperties.STATIC_HTML_DIR, file);
		return new String(Files.readAllBytes(pathToText));
	}

	public static byte[] loadResource(final String file, final HttpServletRequest request) throws IOException
	{
		final Path pathToIndex = Paths.get(StaticHTMLProperties.STATIC_HTML_DIR, file);
		return Files.readAllBytes(pathToIndex);
	}
}
