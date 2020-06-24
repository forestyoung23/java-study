package com.forest.concurrency;

import java.util.List;

import lombok.Data;

/**
 * @author Forest
 * @date 2020年06月24日 09:07
 */
@Data
public class Car {
    private String type;
    private Size size;
    @Data
    public class Size {
        private Integer length;
        private Integer width;
        private List<Nmd> nmd;
        @Data
        public class Nmd {
            private String name;
        }
    }
}
