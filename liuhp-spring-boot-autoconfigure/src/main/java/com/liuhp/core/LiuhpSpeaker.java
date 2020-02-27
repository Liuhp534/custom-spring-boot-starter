package com.liuhp.core;

import com.liuhp.config.LiuhpProperites;

/**
 * @description: liuhp说话器
 * @author: liuhp534
 * @create: 2020-02-27 15:34
 */

public class LiuhpSpeaker {


    private LiuhpProperites liuhpProperites;

    public String speak() {
        return liuhpProperites.getMsg();
    }



    public LiuhpProperites getLiuhpProperites() {
        return liuhpProperites;
    }

    public void setLiuhpProperites(LiuhpProperites liuhpProperites) {
        this.liuhpProperites = liuhpProperites;
    }
}
