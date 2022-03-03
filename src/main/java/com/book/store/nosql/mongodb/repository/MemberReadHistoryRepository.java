package com.book.store.nosql.mongodb.repository;

import com.book.store.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员商品浏览历史Repository
 *
 * @author nndmw
 * @date 2022/03/02
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {

    /**
     * 根据会员id按时间倒序获取浏览记录
     *
     * @param memberId 会员id
     * @return {@link List}<{@link MemberReadHistory}>
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
