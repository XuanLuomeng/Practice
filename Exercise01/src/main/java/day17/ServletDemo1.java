package day17;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo1 implements Servlet {
    /**
     * Servlet被创建仅执行一次，仅执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    /**
     * Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次Servlet被创建执行一次，可多次执行
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello Servlet");
    }

    /**
     * 获取版本或作者等信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 服务器正常关闭执行一次
     */
    @Override
    public void destroy() {

    }
}
