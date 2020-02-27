package com.liuhp;

import com.liuhp.config.LiuhpProperites;
import com.liuhp.core.LiuhpSpeaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: liuhp自动配置
 * @author: liuhp534
 * @create: 2020-02-27 15:28
 */
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(LiuhpProperites.class)
public class LiuhpAutoConfiguration {

    private Logger logger = LoggerFactory.getLogger(LiuhpSpeaker.class);

    {
        logger.info("===自动配置liuhp");
    }

    /*
    * 创建liuhp说话器
    * */
    @Bean
    public LiuhpSpeaker liuhpSpeaker(LiuhpProperites liuhpProperites) {
        LiuhpSpeaker liuhpSpeaker = new LiuhpSpeaker();
        liuhpSpeaker.setLiuhpProperites(liuhpProperites);
        return liuhpSpeaker;
    }

}
