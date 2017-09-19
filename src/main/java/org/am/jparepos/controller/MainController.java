package org.am.jparepos.controller;

import org.am.jparepos.entity.Image;
import org.am.jparepos.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("/images")
    public List<Image> getImages(@RequestParam("modelId") Integer modelId,
                                 @RequestParam("imageTypeId") Integer imageTypeId) {
        return imageRepository.findByModelIdAndImageTypeId(modelId, imageTypeId);
    }
}
