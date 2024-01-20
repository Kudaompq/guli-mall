package top.kudaompq.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.kudaompq.gulimall.product.entity.BrandEntity;
import top.kudaompq.gulimall.product.service.BrandService;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setName("xiaomi");
        // brandService.save(brandEntity);
        // System.out.println("save success" + brandEntity);

        List<BrandEntity> list = brandService.list(new LambdaQueryWrapper<BrandEntity>().eq(BrandEntity::getBrandId, 1L));
        list.forEach(System.out::println);
    }

}
