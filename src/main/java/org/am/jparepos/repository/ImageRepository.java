package org.am.jparepos.repository;

import org.am.jparepos.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The ImageRepository class.
 *
 * @author Alexander Maximenya
 * @version 2017-09-19
 */
public interface ImageRepository extends JpaRepository<Image, Integer> {

//    @Query("select i from Image i where i.modelId = :modelId and i.imageTypeId = :imageTypeId")
//    Stream<Image> findByModelIdAndImageTypeIdReturnStream(@Param("modelId") Integer modelId, @Param("imageTypeId") Integer imageTypeId);

    List<Image> findByModelIdAndImageTypeId(Integer modelId, Integer imageTypeId);
}
