package org.magnum.mobilecloud.video.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * A repository for storing Video objects.
 */
@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

    /**
     * Finds a video by the given name.
     * @param name name of the video.
     * @return the Video if found.
     */
    List<Video> findByName(String name);

    List<Video> findByDurationLessThan(long duration);
}
