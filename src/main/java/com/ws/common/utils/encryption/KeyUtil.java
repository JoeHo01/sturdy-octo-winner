package com.ws.common.utils.encryption;

import javax.servlet.http.HttpServletRequest;

/**
 * 密钥生成
 * Created by Jo on 2017/7/27.
 */
public class KeyUtil {
    public static String requestKey(HttpServletRequest request){
        String remoteAddress = request.getRemoteAddr();
        String remoteUser = request.getRemoteUser();
        String authType = request.getAuthType();
        String header = request.getHeader("/");
        long dateHeader = request.getDateHeader("");
        String method = request.getMethod();
        String pathInfo = request.getPathInfo();
        String pathTranslated = request.getPathTranslated();
        String protocol = request.getProtocol();
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        String scheme = request.getScheme();
        String serverName = request.getServerName();
        int serverPort = request.getServerPort();

        System.out.println(remoteAddress+"#"+remotePort);


        return SingleEnUtil.MD5(remoteAddress);
    }
}
