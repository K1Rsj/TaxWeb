package my.app.controller.filters;

import my.app.GlobalConstants;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType(GlobalConstants.CONTENT_TYPE_TEXT_HTML);
        servletResponse.setCharacterEncoding(GlobalConstants.UTF8);
        servletRequest.setCharacterEncoding(GlobalConstants.UTF8);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
    }
}
