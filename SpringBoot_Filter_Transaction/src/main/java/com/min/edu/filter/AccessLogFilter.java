package com.min.edu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//TODO 12 Filter 클래스 작성

//TODO 12_01 @WebFilter를 통해서 필요시 세밀하게 적용
//@WebFilter(urlPatterns = "/*", filterName = "AccessLogFilter")

//TODO 12_02 @Component을 통한 전체 Filter 적용
@Component
@Slf4j
public class AccessLogFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = StringUtils.defaultString(req.getRemoteAddr(),"-");
		String url = StringUtils.defaultIfEmpty(req.getRequestURI().toString(), "-");
		String queryString = StringUtils.defaultIfEmpty(req.getQueryString(), "-");
		
		String fullUrl = url;
		fullUrl += StringUtils.isNotEmpty(queryString)?"?"+queryString:"";
		
		StringBuffer sb = new StringBuffer();
		sb.append(remoteAddr).append(":").append(fullUrl);
		
		log.info("%%%%%%%%%%%%%%%%%%%%%%%% 요청된 Client 정보 : {}", sb.toString());
		
		chain.doFilter(request, response);
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Filter 접속");
	}
	
	@Override
	public void destroy() {
		log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Filter 종료");
	}
	
}
