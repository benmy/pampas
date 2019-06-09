package com.github.pampas.core.filter;

import com.github.pampas.common.config.Configurable;
import com.github.pampas.common.exec.Filter;
import com.github.pampas.common.exec.FilterChain;
import com.github.pampas.common.exec.payload.PampasRequest;
import com.github.pampas.common.exec.payload.PampasResponse;
import com.github.pampas.common.extension.SpiMeta;
import com.github.pampas.common.route.Locator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * User: darrenfu
 * Date: 2018-12-06
 */
@SpiMeta(name = "filter-auth", desc = "鉴权过滤器", order = 10)
public class AuthFilter implements Filter, Configurable<AuthFilterConfig> {

    private static final Logger log = LoggerFactory.getLogger(AuthFilter.class);

    private AuthFilterConfig authFilterConfig;

    @Override
    public AuthFilterConfig getConfig() {
        return authFilterConfig;
    }

    @Override
    public Class<AuthFilterConfig> configClass() {
        return AuthFilterConfig.class;
    }

    @Override
    public Configurable setupWithConfig(AuthFilterConfig t) {
        this.authFilterConfig = t;
        return this;
    }


    @Override
    public void beforeRoute(PampasRequest req, FilterChain filterChain) {
        log.info("执行过滤器:{} before", getClass().getSimpleName());

    }

    @Override
    public void beforeCall(PampasRequest req, Locator locator, FilterChain filterChain) {
        log.info("执行过滤器:{} before", getClass().getSimpleName());

    }

    @Override
    public void onSuccess(PampasRequest req, Locator locator, PampasResponse resp, FilterChain filterChain) {
        log.info("执行过滤器:{} onSuccess", getClass().getSimpleName());
    }

    @Override
    public void onException(PampasRequest req, Locator locator, Throwable throwable, FilterChain filterChain) {
        log.info("执行过滤器:{} onException", getClass().getSimpleName());
    }
}
