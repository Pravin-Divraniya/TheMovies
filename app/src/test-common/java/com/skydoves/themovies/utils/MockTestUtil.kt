package com.skydoves.themovies.utils

import com.skydoves.themovies.models.entity.Movie
import com.skydoves.themovies.models.entity.Person
import com.skydoves.themovies.models.entity.Tv

/**
 * Developed by skydoves on 2018-08-10.
 * Copyright (c) 2018 skydoves rights reserved.
 */

class MockTestUtil {
    companion object {
        fun mockMovie() = Movie(1, emptyList(), emptyList(), emptyList(), "", false, "", "", ArrayList(), 123, "", "", "", "", 0f, 0, false, 0f)
        fun mockTv() = Tv(1, emptyList(), emptyList(), emptyList(), "", 0f, 123, "", 0f, "", "", ArrayList(), ArrayList(), "", 1, "", "")
        fun mockPerson() = Person(1, "", false, 123, "", 0f)
    }
}
