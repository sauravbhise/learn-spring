package com.sauravbhise.photos.photos.clone;

import com.sauravbhise.photos.photos.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {
}
