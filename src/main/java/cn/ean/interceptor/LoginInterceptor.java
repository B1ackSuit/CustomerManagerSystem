package cn.ean.interceptor;

import cn.ean.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * FileName:LoginInterceptor
 * Author:ean
 * Date:2021/8/7 10:56 上午
 **/
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        //获取请求的URL
        String url = request.getRequestURI();
        //URL:除了登录请求外，其他的URL都进行拦截
        if (url.indexOf("/login.action") >= 0){
            return true;
        }
        //获取Session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("USER_SESSION");
        //判断Session中是否有用户数据
        if (user != null){
            return true;
        }
        request.setAttribute("msg", "请先登录");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}






