package com.yomigi.oauth2.server.repository;

import com.yomigi.oauth2.server.domain.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @email yom535@outlook.com
 * @author: 有民(yom535)
 * @date: 2020/5/4
 * @time: 14:05
 */
@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}
