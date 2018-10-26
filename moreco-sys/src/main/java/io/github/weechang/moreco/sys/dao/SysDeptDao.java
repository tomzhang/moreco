package io.github.weechang.moreco.sys.dao;

import io.github.weechang.weechang.moreco.query.dao.JapDao;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author zhangwei
 * date 2018/10/26
 * time 18:09
 */
@NoRepositoryBean
public interface SysDeptDao<SysDeptEntity, Long> extends JapDao {
}