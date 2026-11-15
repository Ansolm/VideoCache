package com.ansolm.videocache.sourcestorage;

import com.ansolm.videocache.CacheInfo;
import com.ansolm.videocache.CachePatch;

import java.util.List;

/**
 * {@link Storage} that does nothing.
 *
 * @author Alexey Danilov (danikula@gmail.com).
 */
public class NoStorage implements Storage {

    @Override
    public CacheInfo getInfo(String url) {
        return null;
    }

    @Override
    public void putInfo(String url, CacheInfo cacheInfo) {
    }

    @Override
    public List<CachePatch> getPatch(String url) {
        return null;
    }

    @Override
    public void putPatch(String url, CachePatch patch) {

    }

    @Override
    public void clearPatch(String url) {

    }

    @Override
    public void release() {
    }
}
