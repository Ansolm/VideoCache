package com.ansolm.videocache.sourcestorage;

import com.ansolm.videocache.CacheInfo;
import com.ansolm.videocache.CachePatch;

import java.util.List;

/**
 * Storage for {@link CacheInfo}.
 *
 * @author Alexey Danilov (danikula@gmail.com).
 */
public interface Storage {


    CacheInfo getInfo(String url);

    void putInfo(String url, CacheInfo cacheInfo);

    List<CachePatch> getPatch(String url);

    void putPatch(String url, CachePatch patch);

    void clearPatch(String url);

    void release();

}
