package com.tyu.springweb.html;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticHTMLController
{
//	private static final String DEFAULT_PAGE = "index.html";
//	private static final String NO_SPECIFIED_MAPPING = "/";
//	private static final String htmlFileSuffix = ".html";
//
//	@RequestMapping(produces = "text/html;charset=UTF-8")
//	public String serveRequestedPage(final HttpServletRequest request) throws IOException
//	{
//		final String mapping = request.getServletPath().trim();
//		final String mappingToServe = mapping.isEmpty() || mapping.equals(NO_SPECIFIED_MAPPING) ? DEFAULT_PAGE
//				: mapping.endsWith(htmlFileSuffix) ? mapping : mapping + htmlFileSuffix;
//
//		return StaticHTMLFileLoader.loadStaticTextFile(mappingToServe);
//	}
//
//	@RequestMapping(value = "/css/{cssFile}", produces = "text/css")
//	public String serveCSS(final HttpServletRequest request) throws IOException
//	{
//		final String mapping = request.getServletPath().trim();
//		return StaticHTMLFileLoader.loadStaticTextFile(mapping);
//	}
//
//	@RequestMapping(value = "/js/{jsFile}", produces = "image/javascript")
//	public String serveJS(final HttpServletRequest request) throws IOException
//	{
//		final String mapping = request.getServletPath().trim();
//		return StaticHTMLFileLoader.loadStaticTextFile(mapping);
//	}
//
//	@RequestMapping(value = "/images/{imageFile}")
//	public byte[] serveImage(final HttpServletRequest request) throws IOException
//	{
//		final String mapping = request.getServletPath().trim();
//		return StaticHTMLFileLoader.loadResource(mapping, request);
//	}
//	
//	@RequestMapping(value = "/sass/{sassFile}")
//	public byte[] serveSass(final HttpServletRequest request) throws IOException
//	{
//		final String mapping = request.getServletPath().trim();
//		return StaticHTMLFileLoader.loadResource(mapping, request);
//	}
//	
//	@RequestMapping(value = "/fonts/{fontFile}")
//	public byte[] serveFont(final HttpServletRequest request) throws IOException
//	{
//		final String mapping = request.getServletPath().trim();
//		return StaticHTMLFileLoader.loadResource(mapping, request);
//	}
//
//	@RequestMapping(value = "/error", produces = "text/html;charset=UTF-8")
//	public String serveError(final HttpServletRequest request)
//	{
//		return "error page";
//	}
}
