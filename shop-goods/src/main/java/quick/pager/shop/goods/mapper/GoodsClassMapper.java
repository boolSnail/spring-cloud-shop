package quick.pager.shop.goods.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import quick.pager.shop.model.goods.GoodsClass;

public interface GoodsClassMapper {

    int insertSelective(GoodsClass record);

    GoodsClass selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsClass record);

    /**
     * 选择所有分类
     */
    List<GoodsClass> selectClassification(@Param("className") String className);
}