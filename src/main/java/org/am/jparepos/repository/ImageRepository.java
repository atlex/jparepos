package org.am.jparepos.repository;

import org.am.jparepos.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface ImageRepository extends JpaRepository<Image, Integer> {

    @Query("select i from Image i where i.modelId = :modelId and i.imageTypeId = :imageTypeId")
    Stream<Image> findByModelIdAndImageTypeIdReturnStream(@Param("modelId") Integer modelId, @Param("imageTypeId") Integer imageTypeId);

    List<Image> findByModelIdAndImageTypeId(Integer modelId, Integer imageTypeId);
}
