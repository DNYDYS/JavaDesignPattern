package com.dnydys.criteriaService;

import com.dnydys.model.Persion;
import java.util.List;

/**
 * @Classname Cirteria
 * @Description 创建标准接口
 * @Date 2022/1/1 14:32
 * @Created by hasee
 */
public interface Cirteria {
    public List<Persion> meetCirteria(List<Persion> persions);
}
