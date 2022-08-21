package com.lichen.dabaitutu.common.authentication;

import com.lichen.dabaitutu.system.entity.User;
import com.lichen.dabaitutu.system.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

/**
 * @author lichen
 * @version 1.0.0
 * @className ShiroRealm.java
 * @Description TODO
 * @createTime 2022年08月20日 22:00:00
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ShiroRealm extends AuthorizingRealm {
    private final IUserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user= (User) principalCollection.getPrimaryPrincipal();
        userService.doGetUserAuthorizationInfo(user);
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
