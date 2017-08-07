package com.tyu.springweb;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

public final class ResourcePathfinder
{
	private static final Logger logger = Logger.getLogger(ResourcePathfinder.class);

	private static final String SITE_PROPERTIES_SPEC_KEY = "propertyFile";

	public static final void loadProperties()
	{
		final String propertyFileToLoad = System.getProperty(SITE_PROPERTIES_SPEC_KEY);
		final Path pathToPropertyFile = Paths.get(propertyFileToLoad);

		try (final InputStream inputStream = Files.newInputStream(pathToPropertyFile))
		{
			System.getProperties().load(inputStream);
		}
		catch (Exception e)
		{
			final String message = "Check property file and settings";
			logger.error(message, e);
			throw new PropertyLoadException(message);
		}
	}

}
