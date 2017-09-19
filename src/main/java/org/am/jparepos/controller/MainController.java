package org.am.jparepos.controller;

import org.am.jparepos.entity.Image;
import org.am.jparepos.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The MainController class.
 *
 * @author Alexander Maximenya
 * @version 2017-09-19
 */
@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("/images")
//    @Transactional(readOnly = true)
    public List<Image> getImages(@RequestParam("modelId") Integer modelId,
                                 @RequestParam("imageTypeId") Integer imageTypeId) {
        return imageRepository.findByModelIdAndImageTypeId(modelId, imageTypeId);

//        try (Stream<Image> stream = imageRepository.findByModelIdAndImageTypeIdReturnStream(modelId, imageTypeId)) {
//            stream.forEach(x -> System.out.println(x));
//        }
//        return new ArrayList<>();

    }
}
