package com.vickikbt.cache.daos;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/vickikbt/cache/daos/VideosDao;", "", "deleteAllMovieVideos", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieVideo", "Lcom/vickikbt/cache/models/VideoEntity;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovieVideo", "videoEntity", "(Lcom/vickikbt/cache/models/VideoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cache_debug"})
public abstract interface VideosDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object saveMovieVideo(@org.jetbrains.annotations.NotNull
    com.vickikbt.cache.models.VideoEntity videoEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Videos_Table WHERE ID=:movieId")
    public abstract java.lang.Object getMovieVideo(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.vickikbt.cache.models.VideoEntity> p1);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM Videos_Table")
    public abstract java.lang.Object deleteAllMovieVideos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}