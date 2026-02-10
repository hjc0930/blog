package com.hjc.blog.service;

import com.hjc.blog.dto.LoginRequest;
import com.hjc.blog.dto.RegisterRequest;
import com.hjc.blog.vo.LoginResponse;

/**
 * 认证服务接口
 */
public interface AuthService {

    /**
     * 用户登录
     *
     * @param request 登录请求
     * @param ip      客户端IP
     * @return 登录响应（包含Token）
     */
    LoginResponse login(LoginRequest request, String ip);

    /**
     * 用户注册
     *
     * @param request 注册请求
     * @return 登录响应（注册成功后自动登录）
     */
    LoginResponse register(RegisterRequest request);
}
